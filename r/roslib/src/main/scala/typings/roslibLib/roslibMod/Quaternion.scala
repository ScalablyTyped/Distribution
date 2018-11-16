package typings
package roslibLib.roslibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roslib", "Quaternion")
@js.native
class Quaternion ()
  extends roslibLib.roslibMod.ROSLIBNs.Quaternion {
  /**
           * A Quaternion.
           *
           * @constructor
           * @param options - object with following keys:
           *   * x - the x value
           *   * y - the y value
           *   * z - the z value
           *   * w - the w value
           */
  def this(options: roslibLib.Anon_W) = this()
  /* CompleteClass */
  override var w: scala.Double = js.native
  // getters
  /* CompleteClass */
  override var x: scala.Double = js.native
  /* CompleteClass */
  override var y: scala.Double = js.native
  /* CompleteClass */
  override var z: scala.Double = js.native
  /**
           * Perform a conjugation on this quaternion.
           */
  /* CompleteClass */
  override def conjugate(): scala.Unit = js.native
  /**
           * Convert this quaternion into its inverse.
           */
  /* CompleteClass */
  override def invert(): scala.Unit = js.native
  /**
           * Set the values of this quaternion to the product of itself and the given quaternion.
           * @param q - the quaternion to multiply with
           */
  /* CompleteClass */
  override def multiply(q: roslibLib.roslibMod.ROSLIBNs.Quaternion): scala.Unit = js.native
  /**
           * Return the norm of this quaternion.
           */
  /* CompleteClass */
  override def norm(): scala.Double = js.native
  /**
           * Perform a normalization on this quaternion.
           */
  /* CompleteClass */
  override def normalize(): scala.Unit = js.native
}

