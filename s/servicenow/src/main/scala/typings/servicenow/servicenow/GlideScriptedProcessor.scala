package typings.servicenow.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlideScriptedProcessor extends js.Object {
  
  def redirect(url: String): Unit = js.native
  
  def writeJSON(o: js.Object): Unit = js.native
  
  def writeOutput(contentType: String): Unit = js.native
  def writeOutput(contentType: String, s: String): Unit = js.native
}
