package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/combineAll", JSImport.Namespace)
@js.native
object operatorCombineAllMod extends js.Object {
  def combineAll[T](`this`: rxjsLib.rxjsMod.Observable[rxjsLib.internalTypesMod.ObservableInput[T]]): rxjsLib.rxjsMod.Observable[js.Array[T]] = js.native
  def combineAll[R](`this`: rxjsLib.rxjsMod.Observable[_], project: js.Function1[/* repeated */js.Any, R]): rxjsLib.rxjsMod.Observable[R] = js.native
  @JSName("combineAll")
  def combineAll_TR[T, R](`this`: rxjsLib.rxjsMod.Observable[T]): rxjsLib.rxjsMod.Observable[js.Array[R]] = js.native
  @JSName("combineAll")
  def combineAll_TR[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T | rxjsLib.internalTypesMod.ObservableInput[T]],
    project: js.Function1[/* repeated */T, R]
  ): rxjsLib.rxjsMod.Observable[R] = js.native
}

