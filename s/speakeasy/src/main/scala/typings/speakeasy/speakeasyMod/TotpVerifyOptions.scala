package typings.speakeasy.speakeasyMod

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
    counter: Int | Double = null,
    digits: Int | Double = null,
    encoding: Encoding = null,
    epoch: Int | Double = null,
    step: Int | Double = null,
    time: Int | Double = null,
    window: Int | Double = null
  ): TotpVerifyOptions = {
    val __obj = js.Dynamic.literal(secret = secret, token = token)
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (counter != null) __obj.updateDynamic("counter")(counter.asInstanceOf[js.Any])
    if (digits != null) __obj.updateDynamic("digits")(digits.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (epoch != null) __obj.updateDynamic("epoch")(epoch.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[TotpVerifyOptions]
  }
}

