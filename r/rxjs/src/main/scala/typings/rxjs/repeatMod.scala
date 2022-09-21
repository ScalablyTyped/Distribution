package typings.rxjs

import typings.rxjs.internalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.internalTypesMod.ObservableInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repeatMod {
  
  @JSImport("rxjs/dist/types/internal/operators/repeat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def repeat[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")().asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def repeat[T](countOrConfig: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(countOrConfig.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def repeat[T](countOrConfig: RepeatConfig): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(countOrConfig.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  trait RepeatConfig extends StObject {
    
    /**
      * The number of times to repeat the source. Defaults to `Infinity`.
      */
    var count: js.UndefOr[Double] = js.undefined
    
    /**
      * If a `number`, will delay the repeat of the source by that number of milliseconds.
      * If a function, it will provide the number of times the source has been subscribed to,
      * and the return value should be a valid observable input that will notify when the source
      * should be repeated. If the notifier observable is empty, the result will complete.
      */
    var delay: js.UndefOr[Double | (js.Function1[/* count */ Double, ObservableInput[Any]])] = js.undefined
  }
  object RepeatConfig {
    
    inline def apply(): RepeatConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RepeatConfig]
    }
    
    extension [Self <: RepeatConfig](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setDelay(value: Double | (js.Function1[/* count */ Double, ObservableInput[Any]])): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayFunction1(value: /* count */ Double => ObservableInput[Any]): Self = StObject.set(x, "delay", js.Any.fromFunction1(value))
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    }
  }
}
