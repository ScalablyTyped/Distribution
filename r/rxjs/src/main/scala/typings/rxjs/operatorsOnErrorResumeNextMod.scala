package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsOnErrorResumeNextMod {
  
  @JSImport("rxjs/internal/operators/onErrorResumeNext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def onErrorResumeNext[T](): OperatorFunction[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")().asInstanceOf[OperatorFunction[T, T]]
  @scala.inline
  def onErrorResumeNext[T, R](array: js.Array[ObservableInput[js.Any]]): OperatorFunction[T, T | R] = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(array.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | R]]
  @scala.inline
  def onErrorResumeNext[T, R](observables: ObservableInput[js.Any]*): OperatorFunction[T, T | R] = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(observables.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | R]]
  @scala.inline
  def onErrorResumeNext[T, T2](v: ObservableInput[T2]): OperatorFunction[T, T | T2] = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | T2]]
  @scala.inline
  def onErrorResumeNext[T, T2, T3](v: ObservableInput[T2], v2: ObservableInput[T3]): OperatorFunction[T, T | T2 | T3] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3]]
  @scala.inline
  def onErrorResumeNext[T, T2, T3, T4](v: ObservableInput[T2], v2: ObservableInput[T3], v3: ObservableInput[T4]): OperatorFunction[T, T | T2 | T3 | T4] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4]]
  @scala.inline
  def onErrorResumeNext[T, T2, T3, T4, T5](v: ObservableInput[T2], v2: ObservableInput[T3], v3: ObservableInput[T4], v4: ObservableInput[T5]): OperatorFunction[T, T | T2 | T3 | T4 | T5] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5]]
  @scala.inline
  def onErrorResumeNext[T, T2, T3, T4, T5, T6](
    v: ObservableInput[T2],
    v2: ObservableInput[T3],
    v3: ObservableInput[T4],
    v4: ObservableInput[T5],
    v5: ObservableInput[T6]
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6]]
  @scala.inline
  def onErrorResumeNext[T, T2, T3, T4, T5, T6, T7](
    v: ObservableInput[T2],
    v2: ObservableInput[T3],
    v3: ObservableInput[T4],
    v4: ObservableInput[T5],
    v5: ObservableInput[T6],
    v6: ObservableInput[T7]
  ): OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6 | T7] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | T2 | T3 | T4 | T5 | T6 | T7]]
  
  @scala.inline
  def onErrorResumeNextStatic[R](array: js.Array[ObservableInput[js.Any]]): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNextStatic")(array.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
  @scala.inline
  def onErrorResumeNextStatic[R](observables: (ObservableInput[js.Any] | (js.Function1[/* repeated */ js.Any, R]))*): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNextStatic")(observables.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
  @scala.inline
  def onErrorResumeNextStatic[R](v: ObservableInput[R]): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNextStatic")(v.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
  @scala.inline
  def onErrorResumeNextStatic[T2, T3, R](v2: ObservableInput[T2], v3: ObservableInput[T3]): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNextStatic")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def onErrorResumeNextStatic[T2, T3, T4, R](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNextStatic")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def onErrorResumeNextStatic[T2, T3, T4, T5, R](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNextStatic")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def onErrorResumeNextStatic[T2, T3, T4, T5, T6, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNextStatic")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
}
