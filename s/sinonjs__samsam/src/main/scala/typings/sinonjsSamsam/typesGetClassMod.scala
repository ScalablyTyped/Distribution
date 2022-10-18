package typings.sinonjsSamsam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetClassMod {
  
  /**
    * Returns the internal `Class` by calling `Object.prototype.toString`
    * with the provided value as `this`. Return value is a `String`, naming the
    * internal class, e.g. "Array"
    *
    * @private
    * @param  {*} value - Any value
    * @returns {string} - A string representation of the `Class` of `value`
    */
  inline def apply(value: Any): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@sinonjs/samsam/types/get-class", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
