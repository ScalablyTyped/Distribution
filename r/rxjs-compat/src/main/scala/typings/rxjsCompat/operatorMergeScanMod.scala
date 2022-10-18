package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorMergeScanMod {
  
  @JSImport("rxjs-compat/operator/mergeScan", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeScan[T, R](accumulator: js.Function2[/* acc */ R, /* value */ T, ObservableInput[R]], seed: R): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeScan")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
  inline def mergeScan[T, R](
    accumulator: js.Function2[/* acc */ R, /* value */ T, ObservableInput[R]],
    seed: R,
    concurrent: Double
  ): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeScan")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
}
