package typings.rfdc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Really Fast Deep Clone
    *
    * ### Types
    *
    * `rdfc` clones all JSON types:
    *
    * * `Object`
    * * `Array`
    * * `Number`
    * * `String`
    * * `null`
    *
    * With additional support for:
    *
    * * `Date` (copied)
    * * `undefined` (copied)
    * * `Function` (referenced)
    * * `AsyncFunction` (referenced)
    * * `GeneratorFunction` (referenced)
    * * `arguments` (copied to a normal object)
    *
    * All other types have output values that match the output
    * of `JSON.parse(JSON.stringify(o))`.
    *
    * For instance:
    *
    * ```js
    * const rdfc = require('rdfc')()
    * const err = Error()
    * err.code = 1
    * JSON.parse(JSON.stringify(e)) // {code: 1}
    * rdfc(e) // {code: 1}
    *
    * JSON.parse(JSON.stringify(new Uint8Array([1, 2, 3]))) //  {'0': 1, '1': 2, '2': 3 }
    * rdfc(new Uint8Array([1, 2, 3])) //  {'0': 1, '1': 2, '2': 3 }
    *
    * JSON.parse(JSON.stringify({rx: /foo/})) // {rx: {}}
    * rdfc({rx: /foo/}) // {rx: {}}
    * ```
    */
  @scala.inline
  def apply(): js.Function1[/* obj */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Function1[/* obj */ js.Any, js.Any]]
  @scala.inline
  def apply(opts: Options): js.Function1[/* obj */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ js.Any, js.Any]]
  
  @JSImport("rfdc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * Keeping track of circular references will slow down performance with
      * an additional 25% overhead. Even if an object doesn't have any
      * circular references, the tracking overhead is the cost. By default if
      * an object with a circular reference is passed to `rfdc`, it will
      * throw (similar to how `JSON.stringify` would throw).
      *
      * Use the `circles` option to detect and preserve circular references
      * in the object. If performance is important, try removing the circular
      * reference from the object (set to `undefined`) and then add it back
      * manually after cloning instead of using this option.
      */
    var circles: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Copy prototype properties as well as own properties into the new
      * object.
      *
      * It's marginally faster to allow enumerable properties on the
      * prototype to be copied into the cloned object (not onto it's
      * prototype, directly onto the object).
      *
      * To explain by way of code:
      *
      * ```js
      * require('rfdc')({ proto: false })(Object.create({a: 1})) // => {}
      * require('rfdc')({ proto: true })(Object.create({a: 1})) // => {a: 1}
      * ```
      *
      * Setting `proto` to `true` will provide an additional 2% performance
      * boost.
      */
    var proto: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCircles(value: Boolean): Self = StObject.set(x, "circles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCirclesUndefined: Self = StObject.set(x, "circles", js.undefined)
      
      @scala.inline
      def setProto(value: Boolean): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtoUndefined: Self = StObject.set(x, "proto", js.undefined)
    }
  }
}
