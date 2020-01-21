package typings.retry.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttemptTimeoutOptions extends js.Object {
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
  @scala.inline
  def apply(callback: () => Unit = null, timeout: Int | Double = null): AttemptTimeoutOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttemptTimeoutOptions]
  }
}

