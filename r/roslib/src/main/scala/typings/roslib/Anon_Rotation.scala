package typings.roslib

import typings.roslib.roslibMod.Quaternion
import typings.roslib.roslibMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rotation extends js.Object {
  var rotation: Quaternion
  var translation: Vector3
}

object Anon_Rotation {
  @scala.inline
  def apply(rotation: Quaternion, translation: Vector3): Anon_Rotation = {
    val __obj = js.Dynamic.literal(rotation = rotation, translation = translation)
  
    __obj.asInstanceOf[Anon_Rotation]
  }
}

