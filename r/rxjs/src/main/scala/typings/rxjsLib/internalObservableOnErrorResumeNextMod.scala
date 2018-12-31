package typings
package rxjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/onErrorResumeNext", JSImport.Namespace)
@js.native
object internalObservableOnErrorResumeNextMod extends js.Object {
  def onErrorResumeNext[R](array: js.Array[rxjsLib.internalTypesMod.ObservableInput[_]]): rxjsLib.internalObservableMod.Observable[R] = js.native
  def onErrorResumeNext[R](
    observables: (rxjsLib.internalTypesMod.ObservableInput[_] | (js.Function1[/* repeated */ js.Any, R]))*
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def onErrorResumeNext[R](v: rxjsLib.internalTypesMod.ObservableInput[R]): rxjsLib.internalObservableMod.Observable[R] = js.native
  def onErrorResumeNext[T2, T3, R](v2: rxjsLib.internalTypesMod.ObservableInput[T2], v3: rxjsLib.internalTypesMod.ObservableInput[T3]): rxjsLib.internalObservableMod.Observable[R] = js.native
  def onErrorResumeNext[T2, T3, T4, R](
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def onErrorResumeNext[T2, T3, T4, T5, R](
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
  def onErrorResumeNext[T2, T3, T4, T5, T6, R](
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    v6: rxjsLib.internalTypesMod.ObservableInput[T6]
  ): rxjsLib.internalObservableMod.Observable[R] = js.native
}

