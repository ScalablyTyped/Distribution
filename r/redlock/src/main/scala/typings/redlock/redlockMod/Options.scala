package typings.redlock.redlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var driftFactor: js.UndefOr[Double] = js.undefined
  var extendScript: js.UndefOr[js.Function1[/* origExtendScript */ String, String]] = js.undefined
  var lockScript: js.UndefOr[js.Function1[/* origLockScript */ String, String]] = js.undefined
  var retryCount: js.UndefOr[Double] = js.undefined
  var retryDelay: js.UndefOr[Double] = js.undefined
  var retryJitter: js.UndefOr[Double] = js.undefined
  var unlockScript: js.UndefOr[js.Function1[/* origUnlockScript */ String, String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    driftFactor: Int | Double = null,
    extendScript: /* origExtendScript */ String => String = null,
    lockScript: /* origLockScript */ String => String = null,
    retryCount: Int | Double = null,
    retryDelay: Int | Double = null,
    retryJitter: Int | Double = null,
    unlockScript: /* origUnlockScript */ String => String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (driftFactor != null) __obj.updateDynamic("driftFactor")(driftFactor.asInstanceOf[js.Any])
    if (extendScript != null) __obj.updateDynamic("extendScript")(js.Any.fromFunction1(extendScript))
    if (lockScript != null) __obj.updateDynamic("lockScript")(js.Any.fromFunction1(lockScript))
    if (retryCount != null) __obj.updateDynamic("retryCount")(retryCount.asInstanceOf[js.Any])
    if (retryDelay != null) __obj.updateDynamic("retryDelay")(retryDelay.asInstanceOf[js.Any])
    if (retryJitter != null) __obj.updateDynamic("retryJitter")(retryJitter.asInstanceOf[js.Any])
    if (unlockScript != null) __obj.updateDynamic("unlockScript")(js.Any.fromFunction1(unlockScript))
    __obj.asInstanceOf[Options]
  }
}

