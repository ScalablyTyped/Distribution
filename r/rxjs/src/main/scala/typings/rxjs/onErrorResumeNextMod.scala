package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.ObservableInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onErrorResumeNextMod {
  
  @JSImport("rxjs/internal/observable/onErrorResumeNext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def onErrorResumeNext[R](array: js.Array[ObservableInput[js.Any]]): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(array.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
  @scala.inline
  def onErrorResumeNext[R](observables: (ObservableInput[js.Any] | (js.Function1[/* repeated */ js.Any, R]))*): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(observables.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
  @scala.inline
  def onErrorResumeNext[R](v: ObservableInput[R]): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
  @scala.inline
  def onErrorResumeNext[T2, T3, R](v2: ObservableInput[T2], v3: ObservableInput[T3]): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def onErrorResumeNext[T2, T3, T4, R](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def onErrorResumeNext[T2, T3, T4, T5, R](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  @scala.inline
  def onErrorResumeNext[T2, T3, T4, T5, T6, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
}
