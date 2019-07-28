package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/race", JSImport.Namespace)
@js.native
object operatorRaceMod extends js.Object {
  def race[T](`this`: Observable[T], observables: (Observable[T] | js.Array[Observable[T]])*): Observable[T] = js.native
  def race[T](`this`: Observable[T], observables: js.Array[Observable[T]]): Observable[T] = js.native
  @JSName("race")
  def race_TR[T, R](`this`: Observable[T], observables: (Observable[_] | js.Array[Observable[_]])*): Observable[R] = js.native
  @JSName("race")
  def race_TR[T, R](`this`: Observable[T], observables: js.Array[Observable[T]]): Observable[R] = js.native
}

