package typings.roslib

import typings.roslib.roslibMod.Ros
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameRos extends js.Object {
  var name: String
  var ros: Ros
  var serviceType: String
}

object Anon_NameRos {
  @scala.inline
  def apply(name: String, ros: Ros, serviceType: String): Anon_NameRos = {
    val __obj = js.Dynamic.literal(name = name, ros = ros, serviceType = serviceType)
  
    __obj.asInstanceOf[Anon_NameRos]
  }
}

