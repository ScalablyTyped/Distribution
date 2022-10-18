package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.ObservedValueOf
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalOperatorsExhaustMod {
  
  @JSImport("rxjs/dist/types/internal/operators/exhaust", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exhaust[O /* <: ObservableInput[Any] */](): OperatorFunction[O, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("exhaust")().asInstanceOf[OperatorFunction[O, ObservedValueOf[O]]]
}
