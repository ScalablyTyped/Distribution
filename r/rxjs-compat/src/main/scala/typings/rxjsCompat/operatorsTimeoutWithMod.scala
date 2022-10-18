package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsTimeoutWithMod {
  
  @JSImport("rxjs-compat/operators/timeoutWith", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def timeoutWith[T, R](dueBy: js.Date, switchTo: ObservableInput[R]): OperatorFunction[T, T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(dueBy.asInstanceOf[js.Any], switchTo.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | R]]
  inline def timeoutWith[T, R](dueBy: js.Date, switchTo: ObservableInput[R], scheduler: SchedulerLike): OperatorFunction[T, T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(dueBy.asInstanceOf[js.Any], switchTo.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | R]]
  inline def timeoutWith[T, R](waitFor: Double, switchTo: ObservableInput[R]): OperatorFunction[T, T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(waitFor.asInstanceOf[js.Any], switchTo.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | R]]
  inline def timeoutWith[T, R](waitFor: Double, switchTo: ObservableInput[R], scheduler: SchedulerLike): OperatorFunction[T, T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(waitFor.asInstanceOf[js.Any], switchTo.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | R]]
}
