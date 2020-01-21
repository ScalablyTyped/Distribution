package typings.queue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Ensures the queue is always running if jobs are available. Useful in situations where you are using a queue only for concurrency control.
    *
    * @default false
    */
  var autostart: js.UndefOr[Boolean] = js.undefined
  /**
    * Max number of jobs the queue should process concurrently.
    *
    * @default Infinity
    */
  var concurrency: js.UndefOr[Double] = js.undefined
  /**
    * An array to set job callback arguments on.
    *
    * @default null
    */
  var results: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Milliseconds to wait for a job to execute its callback.
    *
    * @default 0
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autostart: js.UndefOr[Boolean] = js.undefined,
    concurrency: Int | Double = null,
    results: js.Array[_] = null,
    timeout: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autostart)) __obj.updateDynamic("autostart")(autostart.asInstanceOf[js.Any])
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

