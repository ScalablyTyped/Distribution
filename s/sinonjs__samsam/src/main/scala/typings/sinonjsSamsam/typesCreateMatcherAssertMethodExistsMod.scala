package typings.sinonjsSamsam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateMatcherAssertMethodExistsMod {
  
  /**
    * Throws a TypeError when expected method doesn't exist
    *
    * @private
    * @param {*} value A value to examine
    * @param {string} method The name of the method to look for
    * @param {name} name A name to use for the error message
    * @param {string} methodPath The name of the method to use for error messages
    * @throws {TypeError} When the method doesn't exist
    */
  inline def apply(value: Any, method: String, name: scala.Nothing, methodPath: String): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], method.asInstanceOf[js.Any], name.asInstanceOf[js.Any], methodPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@sinonjs/samsam/types/create-matcher/assert-method-exists", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
