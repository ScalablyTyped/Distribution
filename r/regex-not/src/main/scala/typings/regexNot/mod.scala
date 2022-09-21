package typings.regexNot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a javascript regular expression for matching everything except for the given string.
    *
    * ### Strict matching ###
    * By default, the returned regex is for strictly (not) matching the exact given pattern
    * (in other words, "match this string if it does NOT exactly equal `foo`").
    *
    * @example
    * import not = require('regex-not');
    *
    * console.log(not('foo'));         //=> /^(?:(?!^(?:foo)$).)+$/
    * console.log(re.test('foo'));     //=> false
    * console.log(re.test('bar'));     //=> true
    * console.log(re.test('foobar'));  //=> true
    * console.log(re.test('barfoo'));  //=> true
    */
  inline def apply(str: String): js.RegExp = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  inline def apply(str: String, options: Options): js.RegExp = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
  
  @JSImport("regex-not", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @returns A string to allow you to create your own regex.
    *
    * @example
    * import not = require('regex-not');
    *
    * console.log(not.create('foo'));
    * //=> '^(?:(?!^(?:foo)$).)+$'
    */
  inline def create(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def create(str: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    /**
      * You can relax strict matching by setting `contains` to `true` (in other words,
      * "match this string if it does NOT contain `foo`").
      *
      * @default false
      *
      * @example
      * import not = require('regex-not');
      *
      * const re = not('foo', {contains: true});
      * console.log(re.test('foo'));     //=> false
      * console.log(re.test('bar'));     //=> true
      * console.log(re.test('foobar'));  //=> false
      * console.log(re.test('barfoo'));  //=> false
      */
    var contains: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls the outermost repetition modifier in the generated RegExp.
      *
      * @default '+'
      *
      * @example
      * import not = require('regex-not');
      *
      * const re = not('foo');                  // => '^(?:(?!^(?:foo)$).)+$'
      * const re = not('foo', {endChar: '*'});  // => '^(?:(?!^(?:foo)$).)*$'
      */
    var endChar: js.UndefOr[String] = js.undefined
    
    /**
      * Throw an error when a potentially catastrophic exponential-time regular expression is detected.
      * See [strict-regex](https://github.com/davisjam/safe-regex) for more details and potential implications.
      *
      * @default false
      */
    var safe: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls whether the end of input anchor (`$`) should be generated for the pattern.
      *
      * @default true
      *
      * @example
      * import not = require('regex-not');
      *
      * const re = not('foo');                      // => '^(?:(?!^(?:foo)$).)+$'
      * const re = not('foo', {strictClose: '*'});  // => '^(?:(?!^(?:foo)$).)+'
      */
    var strictClose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls whether the start of input anchor (`^`) should be generated for the pattern.
      *
      * @default true
      *
      * @example
      * import not = require('regex-not');
      *
      * const re = not('foo');                     // => '^(?:(?!^(?:foo)$).)+$'
      * const re = not('foo', {strictOpen: '*'});  // => '(?:(?!^(?:foo)$).)+$'
      */
    var strictOpen: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setContains(value: Boolean): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      inline def setEndChar(value: String): Self = StObject.set(x, "endChar", value.asInstanceOf[js.Any])
      
      inline def setEndCharUndefined: Self = StObject.set(x, "endChar", js.undefined)
      
      inline def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
      
      inline def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
      
      inline def setStrictClose(value: Boolean): Self = StObject.set(x, "strictClose", value.asInstanceOf[js.Any])
      
      inline def setStrictCloseUndefined: Self = StObject.set(x, "strictClose", js.undefined)
      
      inline def setStrictOpen(value: Boolean): Self = StObject.set(x, "strictOpen", value.asInstanceOf[js.Any])
      
      inline def setStrictOpenUndefined: Self = StObject.set(x, "strictOpen", js.undefined)
    }
  }
}
