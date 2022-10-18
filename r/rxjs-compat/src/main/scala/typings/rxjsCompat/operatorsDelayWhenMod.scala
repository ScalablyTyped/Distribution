package typings.rxjsCompat

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsDelayWhenMod {
  
  @JSImport("rxjs-compat/operators/delayWhen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def delayWhen[T](delayDurationSelector: js.Function2[/* value */ T, /* index */ Double, Observable[Any]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("delayWhen")(delayDurationSelector.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def delayWhen[T](
    delayDurationSelector: js.Function2[/* value */ T, /* index */ Double, Observable[Any]],
    subscriptionDelay: Observable[Any]
  ): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("delayWhen")(delayDurationSelector.asInstanceOf[js.Any], subscriptionDelay.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
}
