package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/race", JSImport.Namespace)
@js.native
object operatorRaceMod extends js.Object {
  def race[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    observables: (rxjsLib.rxjsMod.Observable[T] | js.Array[rxjsLib.rxjsMod.Observable[T]])*
  ): rxjsLib.rxjsMod.Observable[T] = js.native
  def race[T](`this`: rxjsLib.rxjsMod.Observable[T], observables: js.Array[rxjsLib.rxjsMod.Observable[T]]): rxjsLib.rxjsMod.Observable[T] = js.native
  @JSName("race")
  def race_TR[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    observables: (rxjsLib.rxjsMod.Observable[_] | js.Array[rxjsLib.rxjsMod.Observable[_]])*
  ): rxjsLib.rxjsMod.Observable[R] = js.native
  @JSName("race")
  def race_TR[T, R](`this`: rxjsLib.rxjsMod.Observable[T], observables: js.Array[rxjsLib.rxjsMod.Observable[T]]): rxjsLib.rxjsMod.Observable[R] = js.native
}

