package typings.roslib.mod

import typings.roslib.anon.Orientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("roslib", "Pose")
@js.native
/**
  * A Pose in 3D space. Values are copied into this object.
  *
  *  @constructor
  *  @param options - object with following keys:
  *   * position - the Vector3 describing the position
  *   * orientation - the ROSLIB.Quaternion describing the orientation
  */
class Pose () extends js.Object {
  def this(options: Orientation) = this()
  
  /**
    * Apply a transform against this pose.
    *
    * @param tf the transform
    */
  def applyTransform(tf: Transform): Unit = js.native
  
  var orientation: Quaternion = js.native
  
  var position: Vector3 = js.native
}
