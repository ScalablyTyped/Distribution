package typings.rxjsCompat.anon

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.ObservedValueOf
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofflatMap extends StObject {
  
  def apply[T, O /* <: ObservableInput[Any] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = js.native
  def apply[T, O /* <: ObservableInput[Any] */](project: js.Function2[/* value */ T, /* index */ Double, O], concurrent: Double): OperatorFunction[T, ObservedValueOf[O]] = js.native
  def apply[T, O /* <: ObservableInput[Any] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: Unit,
    concurrent: Double
  ): OperatorFunction[T, ObservedValueOf[O]] = js.native
  def apply[T, R, O /* <: ObservableInput[Any] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = js.native
  def apply[T, R, O /* <: ObservableInput[Any] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ],
    concurrent: Double
  ): OperatorFunction[T, R] = js.native
}
