package typings.rxjs

import typings.rxjs.typesMod.MonoTypeOperatorFunction
import typings.rxjs.typesMod.SubscribableOrPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object throttleMod {
  
  @JSImport("rxjs/internal/operators/throttle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/internal/operators/throttle", "defaultThrottleConfig")
  @js.native
  val defaultThrottleConfig: ThrottleConfig = js.native
  
  inline def throttle[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[js.Any]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(durationSelector.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def throttle[T](
    durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[js.Any]],
    config: ThrottleConfig
  ): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(durationSelector.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  trait ThrottleConfig extends StObject {
    
    var leading: js.UndefOr[Boolean] = js.undefined
    
    var trailing: js.UndefOr[Boolean] = js.undefined
  }
  object ThrottleConfig {
    
    inline def apply(): ThrottleConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThrottleConfig]
    }
    
    extension [Self <: ThrottleConfig](x: Self) {
      
      inline def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      inline def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      inline def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
}
