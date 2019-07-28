package typings.roslib.roslibMod

import typings.roslib.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roslib", "Vector3")
@js.native
class Vector3 protected () extends js.Object {
  /**
    * A 3D vector.
    *
    * @constructor
    * @param options - object with following keys:
    *   * x - the x value
    *   * y - the y value
    *   * z - the z value
    */
  def this(options: Anon_X) = this()
  // getters
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  /**
    * Set the values of this vector to the sum of itself and the given vector.
    *
    * @param v - the vector to add with
    */
  def add(v: Vector3): Unit = js.native
  /**
    * Multiply the given Quaternion with this vector.
    * @param q - the quaternion to multiply with
    */
  def multiplyQuaternion(q: Quaternion): Unit = js.native
  /**
    * Set the values of this vector to the difference of itself and the given vector.
    *
    * @param v - the vector to subtract with
    */
  def subtract(v: Vector3): Unit = js.native
}

