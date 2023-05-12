package typings.retryAsPromised

import typings.retryAsPromised.anon.Current
import typings.std.Error
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("retry-as-promised", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](callback: RetryCallback[T], optionsInput: Double): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any], optionsInput.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def default[T](callback: RetryCallback[T], optionsInput: CoercedOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any], optionsInput.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def default[T](callback: RetryCallback[T], optionsInput: Options): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any], optionsInput.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  @JSImport("retry-as-promised", "TimeoutError")
  @js.native
  open class TimeoutError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: String, previousError: js.Error) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var previous: js.UndefOr[js.Error] = js.native
  }
  
  inline def retryAsPromised[T](callback: RetryCallback[T], optionsInput: Double): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("retryAsPromised")(callback.asInstanceOf[js.Any], optionsInput.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def retryAsPromised[T](callback: RetryCallback[T], optionsInput: CoercedOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("retryAsPromised")(callback.asInstanceOf[js.Any], optionsInput.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def retryAsPromised[T](callback: RetryCallback[T], optionsInput: Options): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("retryAsPromised")(callback.asInstanceOf[js.Any], optionsInput.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  trait CoercedOptions extends StObject {
    
    @JSName("$current")
    var $current: Double
    
    var backoffBase: Double
    
    var backoffExponent: Double
    
    var `match`: js.Array[MatchOption]
    
    var max: Double
    
    var name: js.UndefOr[String] = js.undefined
    
    var report: js.UndefOr[
        js.Function3[/* message */ String, /* obj */ CoercedOptions, /* err */ js.UndefOr[Any], Unit]
      ] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object CoercedOptions {
    
    inline def apply(
      $current: Double,
      backoffBase: Double,
      backoffExponent: Double,
      `match`: js.Array[MatchOption],
      max: Double
    ): CoercedOptions = {
      val __obj = js.Dynamic.literal($current = $current.asInstanceOf[js.Any], backoffBase = backoffBase.asInstanceOf[js.Any], backoffExponent = backoffExponent.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoercedOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CoercedOptions] (val x: Self) extends AnyVal {
      
      inline def set$current(value: Double): Self = StObject.set(x, "$current", value.asInstanceOf[js.Any])
      
      inline def setBackoffBase(value: Double): Self = StObject.set(x, "backoffBase", value.asInstanceOf[js.Any])
      
      inline def setBackoffExponent(value: Double): Self = StObject.set(x, "backoffExponent", value.asInstanceOf[js.Any])
      
      inline def setMatch(value: js.Array[MatchOption]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchVarargs(value: MatchOption*): Self = StObject.set(x, "match", js.Array(value*))
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setReport(value: (/* message */ String, /* obj */ CoercedOptions, /* err */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "report", js.Any.fromFunction3(value))
      
      inline def setReportUndefined: Self = StObject.set(x, "report", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type MatchOption = String | js.RegExp | js.Error | js.Function
  
  type MaybePromise[T] = PromiseLike[T] | T
  
  trait Options extends StObject {
    
    var backoffBase: js.UndefOr[Double] = js.undefined
    
    var backoffExponent: js.UndefOr[Double] = js.undefined
    
    var `match`: js.UndefOr[js.Array[MatchOption] | MatchOption] = js.undefined
    
    var max: Double
    
    var name: js.UndefOr[String] = js.undefined
    
    var report: js.UndefOr[
        js.Function3[/* message */ String, /* obj */ CoercedOptions, /* err */ js.UndefOr[Any], Unit]
      ] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(max: Double): Options = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBackoffBase(value: Double): Self = StObject.set(x, "backoffBase", value.asInstanceOf[js.Any])
      
      inline def setBackoffBaseUndefined: Self = StObject.set(x, "backoffBase", js.undefined)
      
      inline def setBackoffExponent(value: Double): Self = StObject.set(x, "backoffExponent", value.asInstanceOf[js.Any])
      
      inline def setBackoffExponentUndefined: Self = StObject.set(x, "backoffExponent", js.undefined)
      
      inline def setMatch(value: js.Array[MatchOption] | MatchOption): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setMatchVarargs(value: MatchOption*): Self = StObject.set(x, "match", js.Array(value*))
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setReport(value: (/* message */ String, /* obj */ CoercedOptions, /* err */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "report", js.Any.fromFunction3(value))
      
      inline def setReportUndefined: Self = StObject.set(x, "report", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type RetryCallback[T] = js.Function1[/* param0 */ Current, MaybePromise[T]]
}
