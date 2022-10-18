package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.ObservedValueOf
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsMergeAllMod {
  
  @JSImport("rxjs-compat/operators/mergeAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeAll[O /* <: ObservableInput[Any] */](): OperatorFunction[O, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeAll")().asInstanceOf[OperatorFunction[O, ObservedValueOf[O]]]
  inline def mergeAll[O /* <: ObservableInput[Any] */](concurrent: Double): OperatorFunction[O, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeAll")(concurrent.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[O, ObservedValueOf[O]]]
}
