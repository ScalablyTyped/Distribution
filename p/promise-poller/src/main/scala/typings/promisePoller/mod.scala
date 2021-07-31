package typings.promisePoller

import typings.promisePoller.promisePollerStrings.`exponential-backoff`
import typings.promisePoller.promisePollerStrings.`fixed-interval`
import typings.promisePoller.promisePollerStrings.`linear-backoff`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promise-poller", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](options: PromisePollerOptions[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  trait PromisePollerOptions[T] extends StObject {
    
    /**
      * `strategy: 'linear-backoff'` --
      * The amount to increase the interval by on each poll attempt.
      */
    var increment: js.UndefOr[Double] = js.undefined
    
    /**
      * `strategy: 'fixed-interval'` --
      * Time to wait ms until taskFn runs again.
      * @default 1000
      */
    var interval: js.UndefOr[Double] = js.undefined
    
    /**
      * Timeout in ms to reject taskFn's promise regardless of retries -- A
      * timeout for the entire master polling operation.
      */
    var masterTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * `strategy: 'exponential-backoff'` --
      * The maximum interval amount to use
      * @default 30000
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /**
      * `strategy: 'exponential-backoff'` --
      * The minimum interval amount to use
      * @default 1000
      */
    var min: js.UndefOr[Double] = js.undefined
    
    /**
      * ## Debugging
      * `promise-poller` uses the [debug](https://www.npmjs.com/package/debug)
      * library. The debug name is `promisePoller`. To run your program with
      * debug output for the `promise-poller`, set the `DEBUG` environment
      * variable accordingly:
      *
      * `% DEBUG=promisePoller node path/to/app.js`
      *
      * If you have more than one poller active at a time, and you need to
      * differentiate between them in debug output, you can give the
      * `promisePoller` options a `name` property.
      *
      * When this poller prints debug messages, the poller name will be included:
      * ```text
      * promisePoller (App Server Poller) Poll failed. 1 retries remaining. +504ms
      * ```
      * @example 'App Server Poller'
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * ## Progress notification
      * You can also specify a progress callback function. Each time the task
      * fails, the progress callback will be called with the number of retries
      * remaining and the error that occurred (the value that the task promise
      * was rejected with)
      */
    var progressCallback: js.UndefOr[js.Function2[/* retriesRemaining */ Double, /* error */ js.Any, Unit]] = js.undefined
    
    /**
      * Number of times to attempt taskFn.
      * @default 5
      */
    var retries: js.UndefOr[Double] = js.undefined
    
    /**
      * If the poll attempt failed, and you want to abort further polling, return
      * `false` from this function. On the other hand, if your poll resolved to a
      * value but you want to keep polling, return `true` from this function.
      *
      * @param reason a rejection reason when a poll fails
      * @param value the resolved value when a poll succeeds
      * @default err => !!err
      */
    var shouldContinue: js.UndefOr[js.Function2[/* reason */ js.Any, /* value */ js.UndefOr[T], Boolean]] = js.undefined
    
    /**
      * `strategy: 'linear-backoff'` --
      * The starting value to use for the polling interval
      * @default 1000
      */
    var start: js.UndefOr[Double] = js.undefined
    
    /**
      * ## Select polling strategy
      * By default, `promise-poller` will use a fixed interval between each poll
      * attempt. For example, with an `interval` option of 500, the poller will
      * poll approximately every 500 milliseconds. This is the `fixed-interval`
      * strategy. There are two other strategies available that may better suit
      * your use case. To select a polling strategy, specify the `strategy`
      * option, e.g.:
      *
      *     promisePoller({
      *       taskFn: myTask,
      *       strategy: 'linear-backoff'
      *     });
      *
      * ### Linear backoff (`linear-backoff`)
      * Options: `start`, `increment`
      *
      * Linear backoff will increase the interval linearly by some constant
      * amount for each poll attempt. For example, using the default options, the
      * first retry will wait 1000 milliseconds. Each successive retry will wait
      * an additional 1000 milliseconds: 1000, 2000, 3000, 4000, etc.
      *
      * ### Exponential backoff with jitter (`exponential-backoff`)
      * Options: `min`, `max`
      *
      * Exponential backoff increases the poll interval by a power of two for
      * each poll attempt. `promise-poller` uses exponential backoff with jitter.
      * Jitter takes a random value between `min` and 2^*n* on the *n*th polling
      * interval, not to exceed `max`.
      *
      * For more information about exponential backoff with jitter, and its
      * advantages, see
      * [this blog post from the AWS team](https://www.awsarchitectureblog.com/2015/03/backoff.html).
      *
      * @default 'fixed-interval'
      */
    var strategy: js.UndefOr[`fixed-interval` | `linear-backoff` | `exponential-backoff`] = js.undefined
    
    /**
      * ## Basic usage
      * The core of `promise-poller` is a *task function*. This is simply a
      * function that starts your asynchronous task and returns a promise. If the
      * task function does not return a promise, it will be wrapped in a promise.
      * To start polling, pass your task function to the `promisePoller`
      * function, using this option.
      *
      * ## Cancel polling
      * You may want to cancel the polling early. For example, if the poll fails
      * because of an invalid password, that's not likely to change, so it would
      * be a waste of time to continue to poll. To cancel polling early, return
      * `false` from the task function instead of a promise.
      */
    def taskFn(): T | js.Thenable[T]
    
    /**
      * For each poll attempt, reject after this timeout has passed
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object PromisePollerOptions {
    
    @scala.inline
    def apply[T](taskFn: () => T | js.Thenable[T]): PromisePollerOptions[T] = {
      val __obj = js.Dynamic.literal(taskFn = js.Any.fromFunction0(taskFn))
      __obj.asInstanceOf[PromisePollerOptions[T]]
    }
    
    @scala.inline
    implicit class PromisePollerOptionsMutableBuilder[Self <: PromisePollerOptions[?], T] (val x: Self & PromisePollerOptions[T]) extends AnyVal {
      
      @scala.inline
      def setIncrement(value: Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setMasterTimeout(value: Double): Self = StObject.set(x, "masterTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterTimeoutUndefined: Self = StObject.set(x, "masterTimeout", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProgressCallback(value: (/* retriesRemaining */ Double, /* error */ js.Any) => Unit): Self = StObject.set(x, "progressCallback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProgressCallbackUndefined: Self = StObject.set(x, "progressCallback", js.undefined)
      
      @scala.inline
      def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      @scala.inline
      def setShouldContinue(value: (/* reason */ js.Any, /* value */ js.UndefOr[T]) => Boolean): Self = StObject.set(x, "shouldContinue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setShouldContinueUndefined: Self = StObject.set(x, "shouldContinue", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStrategy(value: `fixed-interval` | `linear-backoff` | `exponential-backoff`): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      
      @scala.inline
      def setTaskFn(value: () => T | js.Thenable[T]): Self = StObject.set(x, "taskFn", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
