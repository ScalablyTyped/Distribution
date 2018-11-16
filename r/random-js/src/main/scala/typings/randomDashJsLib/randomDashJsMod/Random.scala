package typings
package randomDashJsLib.randomDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Random extends js.Object {
  def bool(): scala.Boolean = js.native
   // tslint:disable-line unified-signatures
  def bool(numerator: scala.Double, denominator: scala.Double): scala.Boolean = js.native
  def bool(percentage: scala.Double): scala.Boolean = js.native
  def date(start: stdLib.Date, end: stdLib.Date): stdLib.Date = js.native
  def dice(sideCount: scala.Double, dieCount: scala.Double): js.Array[scala.Double] = js.native
  def die(sideCount: scala.Double): scala.Double = js.native
  def hex(): java.lang.String = js.native
  def hex(length: scala.Double): java.lang.String = js.native
  def hex(length: scala.Double, upperCase: scala.Boolean): java.lang.String = js.native
  def integer(min: scala.Double, max: scala.Double): scala.Double = js.native
   // tslint:disable-line unified-signatures
  def pick[T](array: js.Array[T]): T = js.native
   // tslint:disable-line unified-signatures
  def pick[T](array: js.Array[T], begin: scala.Double): T = js.native
   // tslint:disable-line unified-signatures
  def pick[T](array: js.Array[T], begin: scala.Double, end: scala.Double): T = js.native
  def real(min: scala.Double, max: scala.Double): scala.Double = js.native
  def real(min: scala.Double, max: scala.Double, inclusive: scala.Boolean): scala.Double = js.native
  def sample[T](population: js.Array[T], sampleSize: scala.Double): js.Array[T] = js.native
  def shuffle[T](array: js.Array[T]): js.Array[T] = js.native
  def string(): java.lang.String = js.native
  def string(engine: randomDashJsLib.randomDashJsMod.RandomNs.Engine, length: scala.Double): java.lang.String = js.native
  def string(length: scala.Double): java.lang.String = js.native
  def string(length: scala.Double, pool: java.lang.String): java.lang.String = js.native
  def uuid4(): java.lang.String = js.native
  def uuid4(engine: randomDashJsLib.randomDashJsMod.RandomNs.Engine): java.lang.String = js.native
}

