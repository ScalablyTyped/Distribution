package typings
package roslibLib.roslibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roslib", "Transform")
@js.native
class Transform protected ()
  extends roslibLib.roslibMod.ROSLIBNs.Transform {
  /**
    * A Transform in 3-space. Values are copied into this object.
    *
    * @constructor
    * @param options - object with following keys:
    *   * translation - the Vector3 describing the translation
    *   * rotation - the ROSLIB.Quaternion describing the rotation
    */
  def this(options: roslibLib.Anon_Rotation) = this()
  /* CompleteClass */
  override var rotation: roslibLib.roslibMod.ROSLIBNs.Quaternion = js.native
  // getters
  /* CompleteClass */
  override var translation: roslibLib.roslibMod.ROSLIBNs.Vector3 = js.native
}

