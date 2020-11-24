package typings.roslib.mod

import typings.roslib.anon.Rotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("roslib", "Transform")
@js.native
/**
  * A Transform in 3-space. Values are copied into this object.
  *
  * @constructor
  * @param options - object with following keys:
  *   * translation - the Vector3 describing the translation
  *   * rotation - the ROSLIB.Quaternion describing the rotation
  */
class Transform () extends js.Object {
  def this(options: Rotation) = this()
  
  var rotation: Quaternion = js.native
  
  // getters
  var translation: Vector3 = js.native
}
