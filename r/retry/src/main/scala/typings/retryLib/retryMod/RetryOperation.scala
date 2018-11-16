package typings
package retryLib.retryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryOperation extends js.Object {
  /**
     * Defines the function that is to be retried and executes it for the first time right away.
     *
     * @param callback The function that is to be retried
     * @param callback.current Number of attempts callback has been executed so far.
     * @param [options.timeout] A timeout in milliseconds.
     * @param [options.callback] Callback to execute when the operation takes longer than the timeout.
     *
     */
  def attempt(callback: js.Function1[/* current */ scala.Double, scala.Unit]): scala.Unit = js.native
  /**
     * Defines the function that is to be retried and executes it for the first time right away.
     *
     * @param callback The function that is to be retried
     * @param callback.current Number of attempts callback has been executed so far.
     * @param [options.timeout] A timeout in milliseconds.
     * @param [options.callback] Callback to execute when the operation takes longer than the timeout.
     *
     */
  def attempt(callback: js.Function1[/* current */ scala.Double, scala.Unit], options: AttemptOptions): scala.Unit = js.native
  /**
     * The number of attempts it took to call the retrying function before it was successful.
     *
     */
  def attempts(): scala.Double = js.native
  /**
     * Returns an array of all errors that have been passed to RetryOperation.retry() so far.
     *
     */
  def errors(): js.Array[stdLib.Error] = js.native
  /**
     * A reference to the error object that occured most frequently.
     * Errors are compared using the error.message property.
     *
     * @return If no errors occured so far the value will be null.
     */
  def mainError(): stdLib.Error | scala.Null = js.native
  /**
     * Returns false when no error value is given, or the maximum amount of retries has been reached.
     * Otherwise it returns true, and retries the operation after the timeout for the current attempt number.
     *
     *
     */
  def retry(): scala.Boolean = js.native
  /**
     * Returns false when no error value is given, or the maximum amount of retries has been reached.
     * Otherwise it returns true, and retries the operation after the timeout for the current attempt number.
     *
     *
     */
  def retry(err: stdLib.Error): scala.Boolean = js.native
  /**
     * Stops the operation being retried. Useful for aborting the operation on a fatal error etc.
     */
  def stop(): scala.Unit = js.native
}

