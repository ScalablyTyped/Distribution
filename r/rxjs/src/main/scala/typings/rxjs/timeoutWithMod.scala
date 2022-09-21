package typings.rxjs

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.internalTypesMod.OperatorFunction
import typings.rxjs.internalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeoutWithMod {
  
  @JSImport("rxjs/dist/types/internal/operators/timeoutWith", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def timeoutWith[T, R](dueBy: js.Date, switchTo: ObservableInput[R]): OperatorFunction[T, T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(dueBy.asInstanceOf[js.Any], switchTo.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | R]]
  inline def timeoutWith[T, R](dueBy: js.Date, switchTo: ObservableInput[R], scheduler: SchedulerLike): OperatorFunction[T, T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(dueBy.asInstanceOf[js.Any], switchTo.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | R]]
  inline def timeoutWith[T, R](waitFor: Double, switchTo: ObservableInput[R]): OperatorFunction[T, T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(waitFor.asInstanceOf[js.Any], switchTo.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | R]]
  inline def timeoutWith[T, R](waitFor: Double, switchTo: ObservableInput[R], scheduler: SchedulerLike): OperatorFunction[T, T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(waitFor.asInstanceOf[js.Any], switchTo.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | R]]
}
