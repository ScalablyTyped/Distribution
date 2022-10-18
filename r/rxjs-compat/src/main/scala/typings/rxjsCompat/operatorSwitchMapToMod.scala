package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorSwitchMapToMod {
  
  @JSImport("rxjs-compat/operator/switchMapTo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def switchMapTo[T, R](observable: ObservableInput[R]): Observable_[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any]).asInstanceOf[Observable_[R]]
  inline def switchMapTo[T, I, R](
    observable: ObservableInput[I],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ I, 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMapTo")(observable.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
}
