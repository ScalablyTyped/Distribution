package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorMergeMapToMod {
  
  @JSImport("rxjs-compat/operator/mergeMapTo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeMapTo[T, R](innerObservable: ObservableInput[R]): Observable_[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any]).asInstanceOf[Observable_[R]]
  inline def mergeMapTo[T, R](innerObservable: ObservableInput[R], concurrent: Double): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMapTo")(innerObservable.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
}
