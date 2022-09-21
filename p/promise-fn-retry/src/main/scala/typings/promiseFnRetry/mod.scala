package typings.promiseFnRetry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promise-fn-retry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](requestFn: js.Function0[js.Promise[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(requestFn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def default[T](requestFn: js.Function0[js.Promise[T]], options: RetryOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(requestFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  trait RetryControlOptions
    extends StObject
       with RetryOptions {
    
    var currentDelay: js.UndefOr[Double] = js.undefined
    
    var retained: Double
  }
  object RetryControlOptions {
    
    inline def apply(retained: Double): RetryControlOptions = {
      val __obj = js.Dynamic.literal(retained = retained.asInstanceOf[js.Any])
      __obj.asInstanceOf[RetryControlOptions]
    }
    
    extension [Self <: RetryControlOptions](x: Self) {
      
      inline def setCurrentDelay(value: Double): Self = StObject.set(x, "currentDelay", value.asInstanceOf[js.Any])
      
      inline def setCurrentDelayUndefined: Self = StObject.set(x, "currentDelay", js.undefined)
      
      inline def setRetained(value: Double): Self = StObject.set(x, "retained", value.asInstanceOf[js.Any])
    }
  }
  
  trait RetryOptions extends StObject {
    
    var initialDelayTime: js.UndefOr[Double] = js.undefined
    
    var onRetry: js.UndefOr[js.Function2[/* err */ Any, /* optionsParsed */ RetryControlOptions, Unit]] = js.undefined
    
    var shouldRetry: js.UndefOr[js.Function1[/* err */ Any, Boolean]] = js.undefined
    
    var times: js.UndefOr[Double] = js.undefined
  }
  object RetryOptions {
    
    inline def apply(): RetryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RetryOptions]
    }
    
    extension [Self <: RetryOptions](x: Self) {
      
      inline def setInitialDelayTime(value: Double): Self = StObject.set(x, "initialDelayTime", value.asInstanceOf[js.Any])
      
      inline def setInitialDelayTimeUndefined: Self = StObject.set(x, "initialDelayTime", js.undefined)
      
      inline def setOnRetry(value: (/* err */ Any, /* optionsParsed */ RetryControlOptions) => Unit): Self = StObject.set(x, "onRetry", js.Any.fromFunction2(value))
      
      inline def setOnRetryUndefined: Self = StObject.set(x, "onRetry", js.undefined)
      
      inline def setShouldRetry(value: /* err */ Any => Boolean): Self = StObject.set(x, "shouldRetry", js.Any.fromFunction1(value))
      
      inline def setShouldRetryUndefined: Self = StObject.set(x, "shouldRetry", js.undefined)
      
      inline def setTimes(value: Double): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
      
      inline def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
    }
  }
}
