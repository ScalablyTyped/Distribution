package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.ObservedValueOf
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalOperatorsExhaustAllMod {
  
  @JSImport("rxjs/dist/types/internal/operators/exhaustAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exhaustAll[O /* <: ObservableInput[Any] */](): OperatorFunction[O, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("exhaustAll")().asInstanceOf[OperatorFunction[O, ObservedValueOf[O]]]
}
