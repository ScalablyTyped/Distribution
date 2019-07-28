package typings.roslib.roslibMod

import typings.roslib.Anon_W
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
  def this(options: Anon_W) = this()
  var w: Double = js.native
  // getters
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  /**
    * Perform a conjugation on this quaternion.
    */
  def conjugate(): Unit = js.native
  /**
    * Convert this quaternion into its inverse.
    */
  def invert(): Unit = js.native
  /**
    * Set the values of this quaternion to the product of itself and the given quaternion.
    * @param q - the quaternion to multiply with
    */
  def multiply(q: Quaternion): Unit = js.native
  /**
    * Return the norm of this quaternion.
    */
  def norm(): Double = js.native
  /**
    * Perform a normalization on this quaternion.
    */
  def normalize(): Unit = js.native
}

