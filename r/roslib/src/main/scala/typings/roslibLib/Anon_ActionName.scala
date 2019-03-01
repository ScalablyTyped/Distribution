package typings
package roslibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionName extends js.Object {
  var actionName: java.lang.String
  var ros: roslibLib.roslibMod.ROSLIBNs.Ros
  var serverName: java.lang.String
  var timeout: scala.Double
}

object Anon_ActionName {
  @scala.inline
  def apply(
    actionName: java.lang.String,
    ros: roslibLib.roslibMod.ROSLIBNs.Ros,
    serverName: java.lang.String,
    timeout: scala.Double
  ): Anon_ActionName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("actionName")(actionName)
    __obj.updateDynamic("ros")(ros)
    __obj.updateDynamic("serverName")(serverName)
    __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[Anon_ActionName]
  }
}

