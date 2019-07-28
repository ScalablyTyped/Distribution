package typings.randomDashJs.randomDashJsMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.randomDashJs.Anon_BrowserCrypto
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomConstructor
  extends Instantiable0[Random]
     with Instantiable1[/* engine */ Engine, Random] {
  var engines: Anon_BrowserCrypto = js.native
  def apply(): Random = js.native
  def apply(engine: Engine): Random = js.native
  def Engine(): Double = js.native
  def MT19937(): Double = js.native
  def bool(): js.Function1[/* engine */ Engine, Boolean] = js.native
   // tslint:disable-line unified-signatures
  def bool(numerator: Double, denominator: Double): js.Function1[/* engine */ Engine, Boolean] = js.native
  def bool(percentage: Double): js.Function1[/* engine */ Engine, Boolean] = js.native
  def date(start: Date, end: Date): js.Function1[/* engine */ Engine, Date] = js.native
  def dice(sideCount: Double, dieCount: Double): js.Function1[/* engine */ Engine, js.Array[Double]] = js.native
  def die(sideCount: Double): js.Function1[/* engine */ Engine, Double] = js.native
  def hex(): js.Function2[/* engine */ Engine, /* length */ js.UndefOr[Double], String] = js.native
  def hex(upperCase: Boolean): js.Function2[/* engine */ Engine, /* length */ js.UndefOr[Double], String] = js.native
  def integer(min: Double, max: Double): js.Function1[/* engine */ Engine, Double] = js.native
   // tslint:disable-line unified-signatures
  def pick[T](engine: Engine, array: js.Array[T]): T = js.native
  def pick[T](engine: Engine, array: js.Array[T], begin: Double): T = js.native
  def pick[T](engine: Engine, array: js.Array[T], begin: Double, end: Double): T = js.native
  def picker[T](array: js.Array[T]): js.Function1[/* engine */ Engine, T] = js.native
  def picker[T](array: js.Array[T], begin: Double): js.Function1[/* engine */ Engine, T] = js.native
  def picker[T](array: js.Array[T], begin: Double, end: Double): js.Function1[/* engine */ Engine, T] = js.native
  def real(min: Double, max: Double): js.Function1[/* engine */ Engine, Double] = js.native
  def real(min: Double, max: Double, inclusive: Boolean): js.Function1[/* engine */ Engine, Double] = js.native
  def sample[T](engine: Engine, population: js.Array[T], sampleSize: Double): js.Array[T] = js.native
  def shuffle[T](engine: Engine, array: js.Array[T]): js.Array[T] = js.native
  def string(): js.Function2[/* engine */ Engine, /* length */ js.UndefOr[Double], String] = js.native
  def string(engine: Engine, length: Double): String = js.native
  def string(pool: String): js.Function2[/* engine */ Engine, /* length */ js.UndefOr[Double], String] = js.native
  def uuid4(engine: Engine): String = js.native
}

