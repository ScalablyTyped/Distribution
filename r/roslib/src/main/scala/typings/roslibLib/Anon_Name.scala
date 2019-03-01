package typings
package roslibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: java.lang.String
  var ros: roslibLib.roslibMod.ROSLIBNs.Ros
}

object Anon_Name {
  @scala.inline
  def apply(name: java.lang.String, ros: roslibLib.roslibMod.ROSLIBNs.Ros): Anon_Name = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("ros")(ros)
    __obj.asInstanceOf[Anon_Name]
  }
}

