package typings.roslib

import typings.roslib.mod.Ros
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  var ros: Ros
}

object AnonName {
  @scala.inline
  def apply(name: String, ros: Ros): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ros = ros.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonName]
  }
}

