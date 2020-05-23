package typings.roslib.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionName extends js.Object {
  var actionName: String
  var ros: typings.roslib.mod.Ros
  var serverName: String
  var timeout: Double
}

object ActionName {
  @scala.inline
  def apply(actionName: String, ros: typings.roslib.mod.Ros, serverName: String, timeout: Double): ActionName = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any], ros = ros.asInstanceOf[js.Any], serverName = serverName.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionName]
  }
}

