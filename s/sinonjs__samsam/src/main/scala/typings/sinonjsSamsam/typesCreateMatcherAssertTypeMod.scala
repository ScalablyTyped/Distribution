package typings.sinonjsSamsam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateMatcherAssertTypeMod {
  
  /**
    * Ensures that value is of type
    *
    * @private
    * @param {*} value A value to examine
    * @param {string} type A basic JavaScript type to compare to, e.g. "object", "string"
    * @param {string} name A string to use for the error message
    * @throws {TypeError} If value is not of the expected type
    * @returns {undefined}
    */
  inline def apply(value: Any, `type`: String, name: String): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@sinonjs/samsam/types/create-matcher/assert-type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
