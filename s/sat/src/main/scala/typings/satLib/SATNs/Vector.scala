package typings
package satLib.SATNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SAT.Vector")
@js.native
class Vector () extends js.Object {
  /**
  		 * @class Vector has two properties
  		 * @param {number} x The x-coordinate of the Vector.
  		 * @param {number} y The y-coordinate of the Vector.
  		 */
  def this(x: scala.Double) = this()
  /**
  		 * @class Vector has two properties
  		 * @param {number} x The x-coordinate of the Vector.
  		 * @param {number} y The y-coordinate of the Vector.
  		 */
  def this(x: scala.Double, y: scala.Double) = this()
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def add(other: Vector): Vector = js.native
  def copy(other: Vector): Vector = js.native
  def dot(other: Vector): scala.Double = js.native
  def len(): scala.Double = js.native
  def len2(): scala.Double = js.native
  def normalize(): Vector = js.native
  def perp(): Vector = js.native
  def project(other: Vector): Vector = js.native
  def projectN(other: Vector): Vector = js.native
  def reflect(axis: Vector): Vector = js.native
  def reflectN(axis: Vector): Vector = js.native
  def reverse(): Vector = js.native
  def rotate(angle: scala.Double): Vector = js.native
  def scale(x: scala.Double): Vector = js.native
  def scale(x: scala.Double, y: scala.Double): Vector = js.native
  def sub(other: Vector): Vector = js.native
}

