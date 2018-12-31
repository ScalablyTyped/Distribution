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

