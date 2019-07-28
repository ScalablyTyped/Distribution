package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/onErrorResumeNext", JSImport.Namespace)
@js.native
object operatorOnErrorResumeNextMod extends js.Object {
  def onErrorResumeNext[T](): Observable[T] = js.native
  def onErrorResumeNext[T, R](`this`: Observable[T], array: js.Array[ObservableInput[_]]): Observable[T | R] = js.native
  def onErrorResumeNext[T, R](`this`: Observable[T], observables: ObservableInput[_]*): Observable[T | R] = js.native
  def onErrorResumeNext[T, R](`this`: Observable[T], v: ObservableInput[R]): Observable[T | R] = js.native
  def onErrorResumeNext[T, T2, T3, R](`this`: Observable[T], v2: ObservableInput[T2], v3: ObservableInput[T3]): Observable[T | T2 | T3 | R] = js.native
  def onErrorResumeNext[T, T2, T3, T4, R](`this`: Observable[T], v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): Observable[T | T2 | T3 | T4 | R] = js.native
  def onErrorResumeNext[T, T2, T3, T4, T5, R](
    `this`: Observable[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5]
  ): Observable[T | T2 | T3 | T4 | T5 | R] = js.native
  def onErrorResumeNext[T, T2, T3, T4, T5, T6, R](
    `this`: Observable[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): Observable[T | T2 | T3 | T4 | T5 | T6 | R] = js.native
  @JSName("onErrorResumeNext")
  def onErrorResumeNext_TT2R[T, T2, R](`this`: Observable[T], v: ObservableInput[T2]): Observable[T | T2 | R] = js.native
}

