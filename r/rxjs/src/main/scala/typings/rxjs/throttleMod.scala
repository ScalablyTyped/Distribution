package typings.rxjs

import typings.rxjs.typesMod.MonoTypeOperatorFunction
import typings.rxjs.typesMod.SubscribableOrPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object throttleMod {
  
  @JSImport("rxjs/internal/operators/throttle", "defaultThrottleConfig")
  @js.native
  val defaultThrottleConfig: ThrottleConfig = js.native
  
  @JSImport("rxjs/internal/operators/throttle", "throttle")
  @js.native
  def throttle[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[_]]): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/throttle", "throttle")
  @js.native
  def throttle[T](durationSelector: js.Function1[/* value */ T, SubscribableOrPromise[_]], config: ThrottleConfig): MonoTypeOperatorFunction[T] = js.native
  
  @js.native
  trait ThrottleConfig extends StObject {
    
    var leading: js.UndefOr[Boolean] = js.native
    
    var trailing: js.UndefOr[Boolean] = js.native
  }
  object ThrottleConfig {
    
    @scala.inline
    def apply(): ThrottleConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThrottleConfig]
    }
    
    @scala.inline
    implicit class ThrottleConfigMutableBuilder[Self <: ThrottleConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      @scala.inline
      def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
}
