package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalOperatorsThrottleMod {
  
  @JSImport("rxjs/dist/types/internal/operators/throttle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def throttle[T](durationSelector: js.Function1[/* value */ T, ObservableInput[Any]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(durationSelector.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def throttle[T](durationSelector: js.Function1[/* value */ T, ObservableInput[Any]], config: ThrottleConfig): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(durationSelector.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  trait ThrottleConfig extends StObject {
    
    /**
      * If `true`, the resulting Observable will emit the first value from the source
      * Observable at the **start** of the "throttling" process (when starting an
      * internal timer that prevents other emissions from the source to pass through).
      * If `false`, it will not emit the first value from the source Observable at the
      * start of the "throttling" process.
      *
      * If not provided, defaults to: `true`.
      */
    var leading: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the resulting Observable will emit the last value from the source
      * Observable at the **end** of the "throttling" process (when ending an internal
      * timer that prevents other emissions from the source to pass through).
      * If `false`, it will not emit the last value from the source Observable at the
      * end of the "throttling" process.
      *
      * If not provided, defaults to: `false`.
      */
    var trailing: js.UndefOr[Boolean] = js.undefined
  }
  object ThrottleConfig {
    
    inline def apply(): ThrottleConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThrottleConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThrottleConfig] (val x: Self) extends AnyVal {
      
      inline def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      inline def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      inline def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
}
