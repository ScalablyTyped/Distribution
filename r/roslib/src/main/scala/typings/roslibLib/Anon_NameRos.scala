package typings
package roslibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameRos extends js.Object {
  var name: java.lang.String
  var ros: roslibLib.roslibMod.Ros
  var serviceType: java.lang.String
}

object Anon_NameRos {
  @scala.inline
  def apply(name: java.lang.String, ros: roslibLib.roslibMod.Ros, serviceType: java.lang.String): Anon_NameRos = {
    val __obj = js.Dynamic.literal(name = name, ros = ros, serviceType = serviceType)
  
    __obj.asInstanceOf[Anon_NameRos]
  }
}

