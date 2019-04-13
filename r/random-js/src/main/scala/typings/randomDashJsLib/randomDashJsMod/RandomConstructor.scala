package typings
package randomDashJsLib.randomDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomConstructor
  extends org.scalablytyped.runtime.Instantiable0[Random]
     with org.scalablytyped.runtime.Instantiable1[/* engine */ Engine, Random] {
  var engines: randomDashJsLib.Anon_BrowserCrypto = js.native
  def apply(): Random = js.native
  def apply(engine: Engine): Random = js.native
  def Engine(): scala.Double = js.native
  def MT19937(): scala.Double = js.native
  def bool(): js.Function1[/* engine */ Engine, scala.Boolean] = js.native
   // tslint:disable-line unified-signatures
  def bool(numerator: scala.Double, denominator: scala.Double): js.Function1[/* engine */ Engine, scala.Boolean] = js.native
  def bool(percentage: scala.Double): js.Function1[/* engine */ Engine, scala.Boolean] = js.native
  def date(start: stdLib.Date, end: stdLib.Date): js.Function1[/* engine */ Engine, stdLib.Date] = js.native
  def dice(sideCount: scala.Double, dieCount: scala.Double): js.Function1[/* engine */ Engine, js.Array[scala.Double]] = js.native
  def die(sideCount: scala.Double): js.Function1[/* engine */ Engine, scala.Double] = js.native
  def hex(): js.Function2[/* engine */ Engine, /* length */ js.UndefOr[scala.Double], java.lang.String] = js.native
  def hex(upperCase: scala.Boolean): js.Function2[/* engine */ Engine, /* length */ js.UndefOr[scala.Double], java.lang.String] = js.native
  def integer(min: scala.Double, max: scala.Double): js.Function1[/* engine */ Engine, scala.Double] = js.native
   // tslint:disable-line unified-signatures
  def pick[T](engine: Engine, array: js.Array[T]): T = js.native
  def pick[T](engine: Engine, array: js.Array[T], begin: scala.Double): T = js.native
  def pick[T](engine: Engine, array: js.Array[T], begin: scala.Double, end: scala.Double): T = js.native
  def picker[T](array: js.Array[T]): js.Function1[/* engine */ Engine, T] = js.native
  def picker[T](array: js.Array[T], begin: scala.Double): js.Function1[/* engine */ Engine, T] = js.native
  def picker[T](array: js.Array[T], begin: scala.Double, end: scala.Double): js.Function1[/* engine */ Engine, T] = js.native
  def real(min: scala.Double, max: scala.Double): js.Function1[/* engine */ Engine, scala.Double] = js.native
  def real(min: scala.Double, max: scala.Double, inclusive: scala.Boolean): js.Function1[/* engine */ Engine, scala.Double] = js.native
  def sample[T](engine: Engine, population: js.Array[T], sampleSize: scala.Double): js.Array[T] = js.native
  def shuffle[T](engine: Engine, array: js.Array[T]): js.Array[T] = js.native
  def string(): js.Function2[/* engine */ Engine, /* length */ js.UndefOr[scala.Double], java.lang.String] = js.native
  def string(engine: Engine, length: scala.Double): java.lang.String = js.native
  def string(pool: java.lang.String): js.Function2[/* engine */ Engine, /* length */ js.UndefOr[scala.Double], java.lang.String] = js.native
  def uuid4(engine: Engine): java.lang.String = js.native
}

