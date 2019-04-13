package typings
package roslibLib.roslibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roslib", "Quaternion")
@js.native
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
class Quaternion () extends js.Object {
  def this(options: roslibLib.Anon_W) = this()
  var w: scala.Double = js.native
  // getters
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  var z: scala.Double = js.native
  /**
    * Perform a conjugation on this quaternion.
    */
  def conjugate(): scala.Unit = js.native
  /**
    * Convert this quaternion into its inverse.
    */
  def invert(): scala.Unit = js.native
  /**
    * Set the values of this quaternion to the product of itself and the given quaternion.
    * @param q - the quaternion to multiply with
    */
  def multiply(q: Quaternion): scala.Unit = js.native
  /**
    * Return the norm of this quaternion.
    */
  def norm(): scala.Double = js.native
  /**
    * Perform a normalization on this quaternion.
    */
  def normalize(): scala.Unit = js.native
}

