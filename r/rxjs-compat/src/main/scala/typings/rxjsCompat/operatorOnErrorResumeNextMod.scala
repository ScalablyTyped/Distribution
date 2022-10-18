package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorOnErrorResumeNextMod {
  
  @JSImport("rxjs-compat/operator/onErrorResumeNext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def onErrorResumeNext[T](): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")().asInstanceOf[Observable_[T]]
  inline def onErrorResumeNext[T, R](array: js.Array[ObservableInput[Any]]): Observable_[T | R] = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(array.asInstanceOf[js.Any]).asInstanceOf[Observable_[T | R]]
  inline def onErrorResumeNext[T, R](observables: ObservableInput[Any]*): Observable_[T | R] = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(observables.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Observable_[T | R]]
  inline def onErrorResumeNext[T, R](v: ObservableInput[R]): Observable_[T | R] = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v.asInstanceOf[js.Any]).asInstanceOf[Observable_[T | R]]
  inline def onErrorResumeNext[T, T2, T3, R](v2: ObservableInput[T2], v3: ObservableInput[T3]): Observable_[T | T2 | T3 | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3 | R]]
  inline def onErrorResumeNext[T, T2, T3, T4, R](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): Observable_[T | T2 | T3 | T4 | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3 | T4 | R]]
  inline def onErrorResumeNext[T, T2, T3, T4, T5, R](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): Observable_[T | T2 | T3 | T4 | T5 | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3 | T4 | T5 | R]]
  inline def onErrorResumeNext[T, T2, T3, T4, T5, T6, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): Observable_[T | T2 | T3 | T4 | T5 | T6 | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v2.asInstanceOf[js.Any], v3.asInstanceOf[js.Any], v4.asInstanceOf[js.Any], v5.asInstanceOf[js.Any], v6.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | T2 | T3 | T4 | T5 | T6 | R]]
  
  inline def onErrorResumeNext_TT2R[T, T2, R](v: ObservableInput[T2]): Observable_[T | T2 | R] = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(v.asInstanceOf[js.Any]).asInstanceOf[Observable_[T | T2 | R]]
}
