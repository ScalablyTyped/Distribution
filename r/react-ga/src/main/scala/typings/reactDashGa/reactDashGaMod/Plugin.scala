package typings.reactDashGa.reactDashGaMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin extends js.Object {
  def execute(pluginName: String, action: String, actionTypeOrPayload: String): Unit = js.native
  def execute(pluginName: String, action: String, actionTypeOrPayload: String, payload: js.Any): Unit = js.native
  def execute(pluginName: String, action: String, actionTypeOrPayload: js.Any): Unit = js.native
  def execute(pluginName: String, action: String, actionTypeOrPayload: js.Any, payload: js.Any): Unit = js.native
  def require(name: String): Unit = js.native
  def require(name: String, options: js.Any): Unit = js.native
  def require(name: String, options: js.Any, trackerName: String): Unit = js.native
}

@JSImport("react-ga", "plugin")
@js.native
object plugin extends TopLevel[Plugin]

