package typings.roslib

import typings.roslib.mod.Ros
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameRos extends js.Object {
  var name: String
  var ros: Ros
  var serviceType: String
}

object AnonNameRos {
  @scala.inline
  def apply(name: String, ros: Ros, serviceType: String): AnonNameRos = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ros = ros.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNameRos]
  }
}

