package typings.randomDashJs.randomDashJsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Random extends js.Object {
  def bool(): Boolean = js.native
   // tslint:disable-line unified-signatures
  def bool(numerator: Double, denominator: Double): Boolean = js.native
  def bool(percentage: Double): Boolean = js.native
  def date(start: Date, end: Date): Date = js.native
  def dice(sideCount: Double, dieCount: Double): js.Array[Double] = js.native
  def die(sideCount: Double): Double = js.native
  def hex(): String = js.native
  def hex(length: Double): String = js.native
  def hex(length: Double, upperCase: Boolean): String = js.native
  def integer(min: Double, max: Double): Double = js.native
   // tslint:disable-line unified-signatures
  def pick[T](array: js.Array[T]): T = js.native
  def pick[T](array: js.Array[T], begin: Double): T = js.native
  def pick[T](array: js.Array[T], begin: Double, end: Double): T = js.native
  def real(min: Double, max: Double): Double = js.native
  def real(min: Double, max: Double, inclusive: Boolean): Double = js.native
  def sample[T](population: js.Array[T], sampleSize: Double): js.Array[T] = js.native
  def shuffle[T](array: js.Array[T]): js.Array[T] = js.native
  def string(): String = js.native
  def string(engine: Engine, length: Double): String = js.native
  def string(length: Double): String = js.native
  def string(length: Double, pool: String): String = js.native
  def uuid4(): String = js.native
  def uuid4(engine: Engine): String = js.native
}

