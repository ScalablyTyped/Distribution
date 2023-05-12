package typings.sinonjsSamsam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sinonjs/samsam", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object createMatcher {
    
    /**
      * Creates a matcher object for the passed expectation
      *
      * @alias module:samsam.createMatcher
      * @param {*} expectation An expecttation
      * @param {string} message A message for the expectation
      * @returns {object} A matcher object
      */
    inline def apply(expectation: Any, message: String, args: Any*): js.Object = (^.asInstanceOf[js.Dynamic].apply((scala.List(expectation.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Object]
    
    @JSImport("@sinonjs/samsam", "createMatcher")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _in(arrayOfExpectations: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_in")(arrayOfExpectations.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("@sinonjs/samsam", "createMatcher.any")
    @js.native
    val any: Any = js.native
    
    @JSImport("@sinonjs/samsam", "createMatcher.array")
    @js.native
    val array: Any = js.native
    
    @JSImport("@sinonjs/samsam", "createMatcher.bool")
    @js.native
    val bool: Any = js.native
    
    @JSImport("@sinonjs/samsam", "createMatcher.date")
    @js.native
    val date: Any = js.native
    
    @JSImport("@sinonjs/samsam", "createMatcher.defined")
    @js.native
    val defined: Any = js.native
    
    inline def every(predicate: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("@sinonjs/samsam", "createMatcher.falsy")
    @js.native
    val falsy: Any = js.native
    
    @JSImport("@sinonjs/samsam", "createMatcher.func")
    @js.native
    val func: Any = js.native
    
    @JSImport("@sinonjs/samsam", "createMatcher.has")
    @js.native
    val has: Any = js.native
    
    inline def hasNested(property: Any, value: Any, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("hasNested")((scala.List(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
    
    @JSImport("@sinonjs/samsam", "createMatcher.hasOwn")
    @js.native
    val hasOwn: Any = js.native
    
    inline def in(arrayOfExpectations: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("in")(arrayOfExpectations.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def instanceOf(`type`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("instanceOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /**
      * Returns `true` when `object` is a matcher
      *
      * @private
      * @param {*} object A value to examine
      * @returns {boolean} Returns `true` when `object` is a matcher
      */
    inline def isMatcher(`object`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMatcher")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def json(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("@sinonjs/samsam", "createMatcher.map")
    @js.native
    val map: Any = js.native
    
    @JSImport("@sinonjs/samsam", "createMatcher.number")
    @js.native
    val number: Any = js.native
    
    @JSImport("@sinonjs/samsam", "createMatcher.object")
    @js.native
    val `object`: Any = js.native
    
    @JSImport("@sinonjs/samsam", "createMatcher.regexp")
    @js.native
    val regexp: Any = js.native
    
    inline def same(expectation: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("same")(expectation.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("@sinonjs/samsam", "createMatcher.set")
    @js.native
    val set: Any = js.native
    
    inline def some(predicate: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(predicate.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("@sinonjs/samsam", "createMatcher.string")
    @js.native
    val string: Any = js.native
    
    @JSImport("@sinonjs/samsam", "createMatcher.symbol")
    @js.native
    val symbol: Any = js.native
    
    @JSImport("@sinonjs/samsam", "createMatcher.truthy")
    @js.native
    val truthy: Any = js.native
    
    inline def typeOf(`type`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("typeOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  @JSImport("@sinonjs/samsam", "deepEqual")
  @js.native
  def deepEqual: js.Function2[/* a */ Any, /* b */ Any, Boolean] = js.native
  inline def deepEqual_=(x: js.Function2[/* a */ Any, /* b */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deepEqual")(x.asInstanceOf[js.Any])
  
  /**
    * Strict equality check according to EcmaScript Harmony's `egal`.
    *
    * **From the Harmony wiki:**
    * > An `egal` function simply makes available the internal `SameValue` function
    * > from section 9.12 of the ES5 spec. If two values are egal, then they are not
    * > observably distinguishable.
    *
    * `identical` returns `true` when `===` is `true`, except for `-0` and
    * `+0`, where it returns `false`. Additionally, it returns `true` when
    * `NaN` is compared to itself.
    *
    * @alias module:samsam.identical
    * @param {*} obj1 The first value to compare
    * @param {*} obj2 The second value to compare
    * @returns {boolean} Returns `true` when the objects are *egal*, `false` otherwise
    */
  inline def identical(obj1: Any, obj2: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("identical")(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Returns `true` when `object` is an `arguments` object, `false` otherwise
    *
    * @alias module:samsam.isArguments
    * @param  {*}  object - The object to examine
    * @returns {boolean} `true` when `object` is an `arguments` object
    */
  inline def isArguments(`object`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArguments")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns `true` when `object` is a DOM element node.
    *
    * Unlike Underscore.js/lodash, this function will return `false` if `object`
    * is an *element-like* object, i.e. a regular object with a `nodeType`
    * property that holds the value `1`.
    *
    * @alias module:samsam.isElement
    * @param {object} object The object to examine
    * @returns {boolean} Returns `true` for DOM element nodes
    */
  inline def isElement(`object`: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns `true` when `value` is a Map
    *
    * @param {*} value A value to examine
    * @returns {boolean} `true` when `value` is an instance of `Map`, `false` otherwise
    * @private
    */
  inline def isMap(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMap")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns `true` when `value` is `-0`
    *
    * @alias module:samsam.isNegZero
    * @param {*} value A value to examine
    * @returns {boolean} Returns `true` when `value` is `-0`
    */
  inline def isNegZero(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNegZero")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns `true` when the argument is an instance of Set, `false` otherwise
    *
    * @alias module:samsam.isSet
    * @param  {*}  val - A value to examine
    * @returns {boolean} Returns `true` when the argument is an instance of Set, `false` otherwise
    */
  inline def isSet(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSet")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Matches an object with a matcher (or value)
    *
    * @alias module:samsam.match
    * @param {object} object The object candidate to match
    * @param {object} matcherOrValue A matcher or value to match against
    * @returns {boolean} true when `object` matches `matcherOrValue`
    */
  inline def `match`(`object`: js.Object, matcherOrValue: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(`object`.asInstanceOf[js.Any], matcherOrValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
