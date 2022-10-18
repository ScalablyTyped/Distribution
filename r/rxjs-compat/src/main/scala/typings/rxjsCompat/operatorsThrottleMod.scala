package typings.rxjsCompat

import typings.rxjs.distTypesInternalOperatorsThrottleMod.ThrottleConfig
import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsThrottleMod {
  
  @JSImport("rxjs-compat/operators/throttle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def throttle[T](durationSelector: js.Function1[/* value */ T, ObservableInput[Any]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(durationSelector.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def throttle[T](durationSelector: js.Function1[/* value */ T, ObservableInput[Any]], config: ThrottleConfig): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(durationSelector.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
}
