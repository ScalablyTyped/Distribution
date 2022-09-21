package typings.retry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("retry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTimeout(attempt: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("createTimeout")(attempt.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def createTimeout(attempt: Double, options: CreateTimeoutOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("createTimeout")(attempt.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def operation(): RetryOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("operation")().asInstanceOf[RetryOperation]
  inline def operation(options: OperationOptions): RetryOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("operation")(options.asInstanceOf[js.Any]).asInstanceOf[RetryOperation]
  
  inline def timeouts(): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeouts")().asInstanceOf[js.Array[Double]]
  inline def timeouts(options: TimeoutsOptions): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeouts")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def wrap(`object`: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def wrap(`object`: js.Object, methods: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(`object`.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def wrap(`object`: js.Object, options: Unit, methods: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def wrap(`object`: js.Object, options: WrapOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def wrap(`object`: js.Object, options: WrapOptions, methods: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait AttemptTimeoutOptions extends StObject {
    
    /**
      * Callback to execute when the operation takes longer than the timeout.
      */
    var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * A timeout in milliseconds.
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object AttemptTimeoutOptions {
    
    inline def apply(): AttemptTimeoutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttemptTimeoutOptions]
    }
    
    extension [Self <: AttemptTimeoutOptions](x: Self) {
      
      inline def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait CreateTimeoutOptions extends StObject {
    
    /**
      * The exponential factor to use.
      * @default 2
      */
    var factor: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of milliseconds between two retries.
      * @default Infinity
      */
    var maxTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of milliseconds before starting the first retry.
      * @default 1000
      */
    var minTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Randomizes the timeouts by multiplying a factor between 1-2.
      * @default false
      */
    var randomize: js.UndefOr[Boolean] = js.undefined
  }
  object CreateTimeoutOptions {
    
    inline def apply(): CreateTimeoutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateTimeoutOptions]
    }
    
    extension [Self <: CreateTimeoutOptions](x: Self) {
      
      inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
      
      inline def setMaxTimeout(value: Double): Self = StObject.set(x, "maxTimeout", value.asInstanceOf[js.Any])
      
      inline def setMaxTimeoutUndefined: Self = StObject.set(x, "maxTimeout", js.undefined)
      
      inline def setMinTimeout(value: Double): Self = StObject.set(x, "minTimeout", value.asInstanceOf[js.Any])
      
      inline def setMinTimeoutUndefined: Self = StObject.set(x, "minTimeout", js.undefined)
      
      inline def setRandomize(value: Boolean): Self = StObject.set(x, "randomize", value.asInstanceOf[js.Any])
      
      inline def setRandomizeUndefined: Self = StObject.set(x, "randomize", js.undefined)
    }
  }
  
  type OperationOptions = WrapOptions | js.Array[Double]
  
  @js.native
  trait RetryOperation extends StObject {
    
    /**
      * Defines the function that is to be retried and executes it for the first time right away.
      *
      * @param fn The function that is to be retried. `currentAttempt` represents the number of attempts
      * callback has been executed so far.
      * @param [timeoutOps.timeout] A timeout in milliseconds.
      * @param [timeoutOps.callback] Callback to execute when the operation takes longer than the timeout.
      */
    def attempt(fn: js.Function1[/* currentAttempt */ Double, Unit]): Unit = js.native
    def attempt(fn: js.Function1[/* currentAttempt */ Double, Unit], timeoutOps: AttemptTimeoutOptions): Unit = js.native
    
    /**
      * Returns an int representing the number of attempts it took to call `fn` before it was successful.
      */
    def attempts(): Double = js.native
    
    /**
      * Returns an array of all errors that have been passed to `retryOperation.retry()` so far.
      * The returning array has the errors ordered chronologically based on when they were passed to
      * `retryOperation.retry()`, which means the first passed error is at index zero and the last is at the last index.
      */
    def errors(): js.Array[js.Error] = js.native
    
    /**
      * A reference to the error object that occured most frequently.
      * Errors are compared using the `error.message` property.
      * If multiple error messages occured the same amount of time, the last error object with that message is returned.
      *
      * @return If no errors occured so far the value will be `null`.
      */
    def mainError(): js.Error | Null = js.native
    
    /**
      * Resets the internal state of the operation object, so that you can call `attempt()` again as if
      * this was a new operation object.
      */
    def reset(): Unit = js.native
    
    /**
      * Returns `false` when no `error` value is given, or the maximum amount of retries has been reached.
      * Otherwise it returns `true`, and retries the operation after the timeout for the current attempt number.
      */
    def retry(): Boolean = js.native
    def retry(err: js.Error): Boolean = js.native
    
    /**
      * Stops the operation being retried. Useful for aborting the operation on a fatal error etc.
      */
    def stop(): Unit = js.native
  }
  
  trait TimeoutsOptions
    extends StObject
       with CreateTimeoutOptions {
    
    /**
      * The maximum amount of times to retry the operation.
      * @default 10
      */
    var retries: js.UndefOr[Double] = js.undefined
  }
  object TimeoutsOptions {
    
    inline def apply(): TimeoutsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeoutsOptions]
    }
    
    extension [Self <: TimeoutsOptions](x: Self) {
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    }
  }
  
  trait WrapOptions
    extends StObject
       with TimeoutsOptions {
    
    /**
      * Whether to retry forever.
      * @default false
      */
    var forever: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The maximum time (in milliseconds) that the retried operation is allowed to run.
      * @default Infinity
      */
    var maxRetryTime: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to [unref](https://nodejs.org/api/timers.html#timers_unref) the setTimeout's.
      * @default false
      */
    var unref: js.UndefOr[Boolean] = js.undefined
  }
  object WrapOptions {
    
    inline def apply(): WrapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WrapOptions]
    }
    
    extension [Self <: WrapOptions](x: Self) {
      
      inline def setForever(value: Boolean): Self = StObject.set(x, "forever", value.asInstanceOf[js.Any])
      
      inline def setForeverUndefined: Self = StObject.set(x, "forever", js.undefined)
      
      inline def setMaxRetryTime(value: Double): Self = StObject.set(x, "maxRetryTime", value.asInstanceOf[js.Any])
      
      inline def setMaxRetryTimeUndefined: Self = StObject.set(x, "maxRetryTime", js.undefined)
      
      inline def setUnref(value: Boolean): Self = StObject.set(x, "unref", value.asInstanceOf[js.Any])
      
      inline def setUnrefUndefined: Self = StObject.set(x, "unref", js.undefined)
    }
  }
}
