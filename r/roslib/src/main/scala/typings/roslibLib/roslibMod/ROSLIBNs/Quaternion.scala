package typings
package roslibLib.roslibMod.ROSLIBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Quaternion extends js.Object {
  var w: scala.Double
  // getters
  var x: scala.Double
  var y: scala.Double
  var z: scala.Double
  /**
    * Perform a conjugation on this quaternion.
    */
  def conjugate(): scala.Unit
  /**
    * Convert this quaternion into its inverse.
    */
  def invert(): scala.Unit
  /**
    * Set the values of this quaternion to the product of itself and the given quaternion.
    * @param q - the quaternion to multiply with
    */
  def multiply(q: Quaternion): scala.Unit
  /**
    * Return the norm of this quaternion.
    */
  def norm(): scala.Double
  /**
    * Perform a normalization on this quaternion.
    */
  def normalize(): scala.Unit
}

object Quaternion {
  @scala.inline
  def apply(
    clone: js.Function0[Quaternion],
    conjugate: js.Function0[scala.Unit],
    invert: js.Function0[scala.Unit],
    multiply: js.Function1[Quaternion, scala.Unit],
    norm: js.Function0[scala.Double],
    normalize: js.Function0[scala.Unit],
    w: scala.Double,
    x: scala.Double,
    y: scala.Double,
    z: scala.Double
  ): Quaternion = {
    val __obj = js.Dynamic.literal(clone = clone, conjugate = conjugate, invert = invert, multiply = multiply, norm = norm, normalize = normalize, w = w, x = x, y = y, z = z)
  
    __obj.asInstanceOf[Quaternion]
  }
}

