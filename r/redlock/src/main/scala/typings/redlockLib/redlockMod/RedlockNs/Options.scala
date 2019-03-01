package typings
package redlockLib.redlockMod.RedlockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var driftFactor: js.UndefOr[scala.Double] = js.undefined
  var extendScript: js.UndefOr[js.Function1[/* origExtendScript */ java.lang.String, java.lang.String]] = js.undefined
  var lockScript: js.UndefOr[js.Function1[/* origLockScript */ java.lang.String, java.lang.String]] = js.undefined
  var retryCount: js.UndefOr[scala.Double] = js.undefined
  var retryDelay: js.UndefOr[scala.Double] = js.undefined
  var retryJitter: js.UndefOr[scala.Double] = js.undefined
  var unlockScript: js.UndefOr[js.Function1[/* origUnlockScript */ java.lang.String, java.lang.String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    driftFactor: scala.Int | scala.Double = null,
    extendScript: js.Function1[/* origExtendScript */ java.lang.String, java.lang.String] = null,
    lockScript: js.Function1[/* origLockScript */ java.lang.String, java.lang.String] = null,
    retryCount: scala.Int | scala.Double = null,
    retryDelay: scala.Int | scala.Double = null,
    retryJitter: scala.Int | scala.Double = null,
    unlockScript: js.Function1[/* origUnlockScript */ java.lang.String, java.lang.String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (driftFactor != null) __obj.updateDynamic("driftFactor")(driftFactor.asInstanceOf[js.Any])
    if (extendScript != null) __obj.updateDynamic("extendScript")(extendScript)
    if (lockScript != null) __obj.updateDynamic("lockScript")(lockScript)
    if (retryCount != null) __obj.updateDynamic("retryCount")(retryCount.asInstanceOf[js.Any])
    if (retryDelay != null) __obj.updateDynamic("retryDelay")(retryDelay.asInstanceOf[js.Any])
    if (retryJitter != null) __obj.updateDynamic("retryJitter")(retryJitter.asInstanceOf[js.Any])
    if (unlockScript != null) __obj.updateDynamic("unlockScript")(unlockScript)
    __obj.asInstanceOf[Options]
  }
}

