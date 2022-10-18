package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.ObservedValueOf
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsExpandMod {
  
  @JSImport("rxjs-compat/operators/expand", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def expand[T, O /* <: ObservableInput[Any] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def expand[T, O /* <: ObservableInput[Any] */](project: js.Function2[/* value */ T, /* index */ Double, O], concurrent: Double): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def expand[T, O /* <: ObservableInput[Any] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    concurrent: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def expand[T, O /* <: ObservableInput[Any] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    concurrent: Unit,
    scheduler: SchedulerLike
  ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(project.asInstanceOf[js.Any], concurrent.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
}
