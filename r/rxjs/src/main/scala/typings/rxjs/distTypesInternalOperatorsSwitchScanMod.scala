package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.ObservedValueOf
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalOperatorsSwitchScanMod {
  
  @JSImport("rxjs/dist/types/internal/operators/switchScan", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def switchScan[T, R, O /* <: ObservableInput[Any] */](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, O], seed: R): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchScan")(accumulator.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
}
