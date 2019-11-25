package typings.promiseDashPoller.promiseDashPollerMod

import typings.promiseDashPoller.promiseDashPollerStrings.`exponential-backoff`
import typings.promiseDashPoller.promiseDashPollerStrings.`fixed-interval`
import typings.promiseDashPoller.promiseDashPollerStrings.`linear-backoff`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromisePollerOptions[T] extends js.Object {
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
    * For each poll attempt, reject after this timeout has passed
    */
  var timeout: js.UndefOr[Double] = js.undefined
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
}

object PromisePollerOptions {
  @scala.inline
  def apply[T](
    taskFn: () => T | js.Thenable[T],
    increment: Int | Double = null,
    interval: Int | Double = null,
    masterTimeout: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    name: String = null,
    progressCallback: (/* retriesRemaining */ Double, /* error */ js.Any) => Unit = null,
    retries: Int | Double = null,
    shouldContinue: (/* reason */ js.Any, /* value */ js.UndefOr[T]) => Boolean = null,
    start: Int | Double = null,
    strategy: `fixed-interval` | `linear-backoff` | `exponential-backoff` = null,
    timeout: Int | Double = null
  ): PromisePollerOptions[T] = {
    val __obj = js.Dynamic.literal(taskFn = js.Any.fromFunction0(taskFn))
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (masterTimeout != null) __obj.updateDynamic("masterTimeout")(masterTimeout.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (progressCallback != null) __obj.updateDynamic("progressCallback")(js.Any.fromFunction2(progressCallback))
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (shouldContinue != null) __obj.updateDynamic("shouldContinue")(js.Any.fromFunction2(shouldContinue))
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromisePollerOptions[T]]
  }
}

