package typings.remixRunRouter.distUtilsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@remix-run/router/dist/utils", "ErrorResponse")
@js.native
open class ErrorResponse protected () extends StObject {
  def this(status: Double, statusText: String, data: Any) = this()
  def this(status: Double, statusText: Unit, data: Any) = this()
  def this(status: Double, statusText: String, data: Any, internal: Boolean) = this()
  def this(status: Double, statusText: Unit, data: Any, internal: Boolean) = this()
  
  var data: Any = js.native
  
  var error: js.UndefOr[js.Error] = js.native
  
  var internal: Boolean = js.native
  
  var status: Double = js.native
  
  var statusText: String = js.native
}
