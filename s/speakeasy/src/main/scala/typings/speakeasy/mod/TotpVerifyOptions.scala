package typings.speakeasy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TotpVerifyOptions extends SharedOptions {
  /**
    * The counter value, calculated from time by default
    */
  var counter: js.UndefOr[Double] = js.undefined
  /**
    * The number of digits for the one-time passcode, defaults to 6
    */
  var digits: js.UndefOr[Double] = js.undefined
  /**
    * Initial time since the UNIX epoch from which to calculate the counter value,
    * defaults to 0 (no offset).
    */
  var epoch: js.UndefOr[Double] = js.undefined
  /**
    * Shared secret key
    */
  var secret: String
  /**
    * Time step in seconds, defaults to 30
    */
  var step: js.UndefOr[Double] = js.undefined
  /**
    * Time in seconds with which to calculate
    * counter value, defaults to `Date.now() / 1000`.
    */
  var time: js.UndefOr[Double] = js.undefined
  /**
    * Passcode to validate
    */
  var token: String
  /**
    * The allowable margin for the counter.
    * The function will check "W" codes in the future and the past against the
    * provided passcode, e.g. if W = 5, and C = 1000, this function will check
    * the passcode against all One Time Passcodes between 995 and 1005, inclusive
    * defaults to 0
    */
  var window: js.UndefOr[Double] = js.undefined
}

object TotpVerifyOptions {
  @scala.inline
  def apply(
    secret: String,
    token: String,
    algorithm: Algorithm = null,
    counter: js.UndefOr[Double] = js.undefined,
    digits: js.UndefOr[Double] = js.undefined,
    encoding: Encoding = null,
    epoch: js.UndefOr[Double] = js.undefined,
    step: js.UndefOr[Double] = js.undefined,
    time: js.UndefOr[Double] = js.undefined,
    window: js.UndefOr[Double] = js.undefined
  ): TotpVerifyOptions = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (!js.isUndefined(counter)) __obj.updateDynamic("counter")(counter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(digits)) __obj.updateDynamic("digits")(digits.get.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(epoch)) __obj.updateDynamic("epoch")(epoch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time.get.asInstanceOf[js.Any])
    if (!js.isUndefined(window)) __obj.updateDynamic("window")(window.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TotpVerifyOptions]
  }
}

