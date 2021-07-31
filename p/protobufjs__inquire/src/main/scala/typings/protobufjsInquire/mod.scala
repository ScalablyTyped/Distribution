package typings.protobufjsInquire

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Requires a module only if available.
    * @memberof util
    * @param {string} moduleName Module to require
    * @returns {?Object} Required module if available and not empty, otherwise `null`
    */
  @scala.inline
  def apply(moduleName: String): js.Object = ^.asInstanceOf[js.Dynamic].apply(moduleName.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  @JSImport("@protobufjs/inquire", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
