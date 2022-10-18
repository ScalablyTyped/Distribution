package typings.rxjsCompat

import typings.rxjs.anon.With
import typings.rxjs.distTypesInternalOperatorsTimeoutMod.TimeoutConfig
import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.ObservedValueOf
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjsCompat.rxjsCompatStrings.`with`
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsTimeoutMod {
  
  @JSImport("rxjs-compat/operators/timeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def timeout[T](each: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(each.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def timeout[T](each: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(each.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def timeout[T](first: js.Date): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(first.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def timeout[T](first: js.Date, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(first.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def timeout[T, O /* <: ObservableInput[Any] */, M](config: (TimeoutConfig[T, O, M]) & (With[T, M, O])): OperatorFunction[T, T | ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(config.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | ObservedValueOf[O]]]
  
  inline def timeout_with[T, M](config: Omit[TimeoutConfig[T, Any, M], `with`]): OperatorFunction[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(config.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T]]
}
