package typings.roslib

import typings.roslib.mod.Ros
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRos extends js.Object {
  var name: String
  var ros: Ros
  var serviceType: String
}

object AnonRos {
  @scala.inline
  def apply(name: String, ros: Ros, serviceType: String): AnonRos = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ros = ros.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRos]
  }
}

