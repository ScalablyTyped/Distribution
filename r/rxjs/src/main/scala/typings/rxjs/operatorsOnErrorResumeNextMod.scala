package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsOnErrorResumeNextMod {
  
  @JSImport("rxjs/internal/operators/onErrorResumeNext", "onErrorResumeNext")
  @js.native
  def onErrorResumeNext[T](): OperatorFunction[T, T] = js.native
  @JSImport("rxjs/internal/operators/onErrorResumeNext", "onErrorResumeNext")
  @js.native
  def onErrorResumeNext[T, R](array: js.Array[ObservableInput[_]]): OperatorFunction[T, T | R] = js.native
  @JSImport("rxjs/internal/operators/onErrorResumeNext", "onErrorResumeNext")
  @js.native
  def onErrorResumeNext[T, R](observables: ObservableInput[_]*): OperatorFunction[T, T | R] = js.native
  @JSImport("rxjs/internal/operators/onErrorResumeNext", "onErrorResumeNext")
  @js.native
  def onErrorResumeNext[T, T2](v: ObservableInput[T2]): OperatorFunction[T, T | T2] = js.native
  @JSImport("rxjs/internal/operators/onErrorResumeNext", "onErrorResumeNext")
  @js.native
  def onErrorResumeNext[T, T2, T3](v: ObservableInput[T2], v2: ObservableInput[T3]): OperatorFunction[T, T | T2 | T3] = js.native
  @JSImport("rxjs/internal/operators/onErrorResumeNext", "onErrorResumeNext")
  @js.native
  def onErrorResumeNext[T, T2, T3, T4](v: ObservableInput[T2], v2: ObservableInput[T3], v3: ObservableInput[T4]): OperatorFunction[T, T | T2 | T3 | T4] = js.native
  @JSImport("rxjs/internal/operators/onErrorResumeNext", "onErrorResumeNext")
  @js.native
  def onErrorResumeNext[T, T2, T3, T4, T5](v: ObservableInput[T2], v2: ObservableInput[T3], v3: ObservableInput[T4], v4: ObservableInput[T5]): OperatorFunction[T, T | T2 | T3 | T4 | T5] = js.native
  @JSImport("rxjs/internal/operators/onErrorResumeNext", "onErrorResumeNext")
  @js.native
  def onErrorResumeNext[T, T2, T3, T4, T5, T6](
    v: ObservableInput[T2],
    v2: ObservableInput[T3],
    v3: ObservableInput[T4],
    v4: ObservableInput[T5],
    v5: ObservableInput[T6]
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = js.native
  @JSImport("rxjs/internal/operators/onErrorResumeNext", "onErrorResumeNext")
  @js.native
  def onErrorResumeNext[T, T2, T3, T4, T5, T6, T7](
    v: ObservableInput[T2],
    v2: ObservableInput[T3],
    v3: ObservableInput[T4],
    v4: ObservableInput[T5],
    v5: ObservableInput[T6],
    v6: ObservableInput[T7]
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6 | T7] = js.native
  
  @JSImport("rxjs/internal/operators/onErrorResumeNext", "onErrorResumeNextStatic")
  @js.native
  def onErrorResumeNextStatic[R](array: js.Array[ObservableInput[_]]): Observable[R] = js.native
  @JSImport("rxjs/internal/operators/onErrorResumeNext", "onErrorResumeNextStatic")
  @js.native
  def onErrorResumeNextStatic[R](observables: (ObservableInput[_] | (js.Function1[/* repeated */ js.Any, R]))*): Observable[R] = js.native
  @JSImport("rxjs/internal/operators/onErrorResumeNext", "onErrorResumeNextStatic")
  @js.native
  def onErrorResumeNextStatic[R](v: ObservableInput[R]): Observable[R] = js.native
  @JSImport("rxjs/internal/operators/onErrorResumeNext", "onErrorResumeNextStatic")
  @js.native
  def onErrorResumeNextStatic[T2, T3, R](v2: ObservableInput[T2], v3: ObservableInput[T3]): Observable[R] = js.native
  @JSImport("rxjs/internal/operators/onErrorResumeNext", "onErrorResumeNextStatic")
  @js.native
  def onErrorResumeNextStatic[T2, T3, T4, R](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): Observable[R] = js.native
  @JSImport("rxjs/internal/operators/onErrorResumeNext", "onErrorResumeNextStatic")
  @js.native
  def onErrorResumeNextStatic[T2, T3, T4, T5, R](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): Observable[R] = js.native
  @JSImport("rxjs/internal/operators/onErrorResumeNext", "onErrorResumeNextStatic")
  @js.native
  def onErrorResumeNextStatic[T2, T3, T4, T5, T6, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): Observable[R] = js.native
}
