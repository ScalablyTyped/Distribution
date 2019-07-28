package typings.roslib.roslibMod

import typings.roslib.Anon_Rotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roslib", "Transform")
@js.native
class Transform protected () extends js.Object {
  /**
    * A Transform in 3-space. Values are copied into this object.
    *
    * @constructor
    * @param options - object with following keys:
    *   * translation - the Vector3 describing the translation
    *   * rotation - the ROSLIB.Quaternion describing the rotation
    */
  def this(options: Anon_Rotation) = this()
  var rotation: Quaternion = js.native
  // getters
  var translation: Vector3 = js.native
}

