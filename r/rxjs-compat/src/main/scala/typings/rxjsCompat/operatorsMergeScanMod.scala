package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsMergeScanMod {
  
  @JSImport("rxjs-compat/operators/mergeScan", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeScan[T, R](
    accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, ObservableInput[R]],
    seed: R
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeScan")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  inline def mergeScan[T, R](
    accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, ObservableInput[R]],
    seed: R,
    concurrent: Double
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeScan")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
}
