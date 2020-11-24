package typings.roslib.mod

import typings.roslib.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("roslib", "Vector3")
@js.native
/**
  * A 3D vector.
  *
  * @constructor
  * @param options - object with following keys:
  *   * x - the x value
  *   * y - the y value
  *   * z - the z value
  */
class Vector3 () extends Vector3Like {
  def this(options: X) = this()
  
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
  
  // getters
  @JSName("x")
  var x_Vector3: Double = js.native
  
  @JSName("y")
  var y_Vector3: Double = js.native
  
  @JSName("z")
  var z_Vector3: Double = js.native
}
