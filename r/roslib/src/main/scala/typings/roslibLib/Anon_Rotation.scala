package typings
package roslibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rotation extends js.Object {
  var rotation: roslibLib.roslibMod.Quaternion
  var translation: roslibLib.roslibMod.Vector3
}

object Anon_Rotation {
  @scala.inline
  def apply(rotation: roslibLib.roslibMod.Quaternion, translation: roslibLib.roslibMod.Vector3): Anon_Rotation = {
    val __obj = js.Dynamic.literal(rotation = rotation, translation = translation)
  
    __obj.asInstanceOf[Anon_Rotation]
  }
}

