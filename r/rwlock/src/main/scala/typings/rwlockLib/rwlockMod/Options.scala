package typings
package rwlockLib.rwlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var scope: js.UndefOr[js.Any] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var timeoutCallback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    scope: js.Any = null,
    timeout: scala.Int | scala.Double = null,
    timeoutCallback: () => scala.Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (timeoutCallback != null) __obj.updateDynamic("timeoutCallback")(js.Any.fromFunction0(timeoutCallback))
    __obj.asInstanceOf[Options]
  }
}

