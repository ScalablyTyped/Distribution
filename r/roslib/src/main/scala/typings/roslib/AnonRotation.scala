package typings.roslib

import typings.roslib.mod.Quaternion
import typings.roslib.mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRotation extends js.Object {
  var rotation: Quaternion
  var translation: Vector3
}

object AnonRotation {
  @scala.inline
  def apply(rotation: Quaternion, translation: Vector3): AnonRotation = {
    val __obj = js.Dynamic.literal(rotation = rotation.asInstanceOf[js.Any], translation = translation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRotation]
  }
}

