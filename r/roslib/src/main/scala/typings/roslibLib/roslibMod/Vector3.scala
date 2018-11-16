package typings
package roslibLib.roslibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roslib", "Vector3")
@js.native
class Vector3 protected ()
  extends roslibLib.roslibMod.ROSLIBNs.Vector3 {
  /**
           * A 3D vector.
           *
           * @constructor
           * @param options - object with following keys:
           *   * x - the x value
           *   * y - the y value
           *   * z - the z value
           */
  def this(options: roslibLib.Anon_Z) = this()
  // getters
  /* CompleteClass */
  override var x: scala.Double = js.native
  /* CompleteClass */
  override var y: scala.Double = js.native
  /* CompleteClass */
  override var z: scala.Double = js.native
  /**
           * Set the values of this vector to the sum of itself and the given vector.
           *
           * @param v - the vector to add with
           */
  /* CompleteClass */
  override def add(v: roslibLib.roslibMod.ROSLIBNs.Vector3): scala.Unit = js.native
  /**
           * Multiply the given Quaternion with this vector.
           * @param q - the quaternion to multiply with
           */
  /* CompleteClass */
  override def multiplyQuaternion(q: roslibLib.roslibMod.ROSLIBNs.Quaternion): scala.Unit = js.native
  /**
           * Set the values of this vector to the difference of itself and the given vector.
           *
           * @param v - the vector to subtract with
           */
  /* CompleteClass */
  override def subtract(v: roslibLib.roslibMod.ROSLIBNs.Vector3): scala.Unit = js.native
}

