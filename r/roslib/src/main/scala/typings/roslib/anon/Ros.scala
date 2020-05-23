package typings.roslib.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ros extends js.Object {
  var name: String
  var ros: typings.roslib.mod.Ros
  var serviceType: String
}

object Ros {
  @scala.inline
  def apply(name: String, ros: typings.roslib.mod.Ros, serviceType: String): Ros = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ros = ros.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ros]
  }
}

