package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.ObservedValueOf
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalOperatorsConcatAllMod {
  
  @JSImport("rxjs/dist/types/internal/operators/concatAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concatAll[O /* <: ObservableInput[Any] */](): OperatorFunction[O, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatAll")().asInstanceOf[OperatorFunction[O, ObservedValueOf[O]]]
}
