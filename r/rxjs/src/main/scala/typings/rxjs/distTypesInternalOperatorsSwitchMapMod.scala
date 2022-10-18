package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.ObservedValueOf
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalOperatorsSwitchMapMod {
  
  @JSImport("rxjs/dist/types/internal/operators/switchMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def switchMap[T, O /* <: ObservableInput[Any] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchMap")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def switchMap[T, O /* <: ObservableInput[Any] */](project: js.Function2[/* value */ T, /* index */ Double, O], resultSelector: Unit): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def switchMap[T, R, O /* <: ObservableInput[Any] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("switchMap")(project.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
}
