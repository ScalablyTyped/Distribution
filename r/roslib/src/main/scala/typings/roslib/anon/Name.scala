package typings.roslib.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String
  var ros: typings.roslib.mod.Ros
}

object Name {
  @scala.inline
  def apply(name: String, ros: typings.roslib.mod.Ros): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ros = ros.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

