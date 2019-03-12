package typings
package regressionLib.regressionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("regression", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def _round(number: scala.Double, precision: scala.Double): scala.Double = js.native
  def exponential(data: js.Array[DataPoint]): Result = js.native
  def exponential(data: js.Array[DataPoint], options: Options): Result = js.native
  def linear(data: js.Array[DataPoint]): Result = js.native
  def linear(data: js.Array[DataPoint], options: Options): Result = js.native
  def logarithmic(data: js.Array[DataPoint]): Result = js.native
  def logarithmic(data: js.Array[DataPoint], options: Options): Result = js.native
  def polynomial(data: js.Array[DataPoint]): Result = js.native
  def polynomial(data: js.Array[DataPoint], options: Options): Result = js.native
  def power(data: js.Array[DataPoint]): Result = js.native
  def power(data: js.Array[DataPoint], options: Options): Result = js.native
}

