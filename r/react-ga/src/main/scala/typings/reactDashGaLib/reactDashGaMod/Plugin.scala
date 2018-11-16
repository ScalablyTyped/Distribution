package typings
package reactDashGaLib.reactDashGaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin extends js.Object {
  def execute(pluginName: java.lang.String, action: java.lang.String, actionTypeOrPayload: java.lang.String): scala.Unit = js.native
  def execute(
    pluginName: java.lang.String,
    action: java.lang.String,
    actionTypeOrPayload: java.lang.String,
    payload: js.Any
  ): scala.Unit = js.native
  def execute(pluginName: java.lang.String, action: java.lang.String, actionTypeOrPayload: js.Any): scala.Unit = js.native
  def execute(
    pluginName: java.lang.String,
    action: java.lang.String,
    actionTypeOrPayload: js.Any,
    payload: js.Any
  ): scala.Unit = js.native
  def require(name: java.lang.String): scala.Unit = js.native
  def require(name: java.lang.String, options: js.Any): scala.Unit = js.native
}

