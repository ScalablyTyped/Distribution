package typings.roslib

import typings.roslib.roslibMod.Ros
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: String
  var ros: Ros
}

object Anon_Name {
  @scala.inline
  def apply(name: String, ros: Ros): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ros = ros.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Name]
  }
}

