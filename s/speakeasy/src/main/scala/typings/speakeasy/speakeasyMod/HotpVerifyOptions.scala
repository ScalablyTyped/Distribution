package typings.speakeasy.speakeasyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HotpVerifyOptions extends SharedOptions {
  /**
    * Counter value. This should be stored by
    * the application and must be incremented for each request.
    */
  var counter: Double
  /**
    * The number of digits for the one-time passcode, defaults to 6
    */
  var digits: js.UndefOr[Double] = js.undefined
  /**
    * Shared secret key
    */
  var secret: String
  /**
    * Passcode to validate
    */
  var token: String
  /**
    * The allowable margin for the counter.
    * The function will check "W" codes in the future against the provided
    * passcode, e.g. if W = 10, and C = 5, this function will check the
    * passcode against all One Time Passcodes between 5 and 15, inclusive,
    * defaults to 0
    */
  var window: js.UndefOr[Double] = js.undefined
}

object HotpVerifyOptions {
  @scala.inline
  def apply(
    counter: Double,
    secret: String,
    token: String,
    algorithm: Algorithm = null,
    digits: Int | Double = null,
    encoding: Encoding = null,
    window: Int | Double = null
  ): HotpVerifyOptions = {
    val __obj = js.Dynamic.literal(counter = counter, secret = secret, token = token)
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (digits != null) __obj.updateDynamic("digits")(digits.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[HotpVerifyOptions]
  }
}

