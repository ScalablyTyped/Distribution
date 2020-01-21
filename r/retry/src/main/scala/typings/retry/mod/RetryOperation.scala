package typings.retry.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryOperation extends js.Object {
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
  def errors(): js.Array[Error] = js.native
  /**
    * A reference to the error object that occured most frequently.
    * Errors are compared using the `error.message` property.
    * If multiple error messages occured the same amount of time, the last error object with that message is returned.
    *
    * @return If no errors occured so far the value will be `null`.
    */
  def mainError(): Error | Null = js.native
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
  def retry(err: Error): Boolean = js.native
  /**
    * Stops the operation being retried. Useful for aborting the operation on a fatal error etc.
    */
  def stop(): Unit = js.native
}

