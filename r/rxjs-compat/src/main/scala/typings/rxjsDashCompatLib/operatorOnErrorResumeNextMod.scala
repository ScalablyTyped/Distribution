package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/onErrorResumeNext", JSImport.Namespace)
@js.native
object operatorOnErrorResumeNextMod extends js.Object {
  def onErrorResumeNext[T](): rxjsLib.rxjsMod.Observable[T] = js.native
  def onErrorResumeNext[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    array: js.Array[rxjsLib.internalTypesMod.ObservableInput[_]]
  ): rxjsLib.rxjsMod.Observable[T | R] = js.native
  def onErrorResumeNext[T, R](`this`: rxjsLib.rxjsMod.Observable[T], observables: rxjsLib.internalTypesMod.ObservableInput[_]*): rxjsLib.rxjsMod.Observable[T | R] = js.native
  def onErrorResumeNext[T, R](`this`: rxjsLib.rxjsMod.Observable[T], v: rxjsLib.internalTypesMod.ObservableInput[R]): rxjsLib.rxjsMod.Observable[T | R] = js.native
  def onErrorResumeNext[T, T2, T3, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3]
  ): rxjsLib.rxjsMod.Observable[T | T2 | T3 | R] = js.native
  def onErrorResumeNext[T, T2, T3, T4, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4]
  ): rxjsLib.rxjsMod.Observable[T | T2 | T3 | T4 | R] = js.native
  def onErrorResumeNext[T, T2, T3, T4, T5, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5]
  ): rxjsLib.rxjsMod.Observable[T | T2 | T3 | T4 | T5 | R] = js.native
  def onErrorResumeNext[T, T2, T3, T4, T5, T6, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    v2: rxjsLib.internalTypesMod.ObservableInput[T2],
    v3: rxjsLib.internalTypesMod.ObservableInput[T3],
    v4: rxjsLib.internalTypesMod.ObservableInput[T4],
    v5: rxjsLib.internalTypesMod.ObservableInput[T5],
    v6: rxjsLib.internalTypesMod.ObservableInput[T6]
  ): rxjsLib.rxjsMod.Observable[T | T2 | T3 | T4 | T5 | T6 | R] = js.native
  @JSName("onErrorResumeNext")
  def onErrorResumeNext_TT2R[T, T2, R](`this`: rxjsLib.rxjsMod.Observable[T], v: rxjsLib.internalTypesMod.ObservableInput[T2]): rxjsLib.rxjsMod.Observable[T | T2 | R] = js.native
}

