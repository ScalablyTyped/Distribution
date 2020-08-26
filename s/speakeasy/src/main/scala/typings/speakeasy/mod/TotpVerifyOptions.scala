package typings.speakeasy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TotpVerifyOptions extends SharedOptions {
  /**
    * The counter value, calculated from time by default
    */
  var counter: js.UndefOr[Double] = js.native
  /**
    * The number of digits for the one-time passcode, defaults to 6
    */
  var digits: js.UndefOr[Double] = js.native
  /**
    * Initial time since the UNIX epoch from which to calculate the counter value,
    * defaults to 0 (no offset).
    */
  var epoch: js.UndefOr[Double] = js.native
  /**
    * Shared secret key
    */
  var secret: String = js.native
  /**
    * Time step in seconds, defaults to 30
    */
  var step: js.UndefOr[Double] = js.native
  /**
    * Time in seconds with which to calculate
    * counter value, defaults to `Date.now() / 1000`.
    */
  var time: js.UndefOr[Double] = js.native
  /**
    * Passcode to validate
    */
  var token: String = js.native
  /**
    * The allowable margin for the counter.
    * The function will check "W" codes in the future and the past against the
    * provided passcode, e.g. if W = 5, and C = 1000, this function will check
    * the passcode against all One Time Passcodes between 995 and 1005, inclusive
    * defaults to 0
    */
  var window: js.UndefOr[Double] = js.native
}

object TotpVerifyOptions {
  @scala.inline
  def apply(secret: String, token: String): TotpVerifyOptions = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TotpVerifyOptions]
  }
  @scala.inline
  implicit class TotpVerifyOptionsOps[Self <: TotpVerifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setCounter(value: Double): Self = this.set("counter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCounter: Self = this.set("counter", js.undefined)
    @scala.inline
    def setDigits(value: Double): Self = this.set("digits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDigits: Self = this.set("digits", js.undefined)
    @scala.inline
    def setEpoch(value: Double): Self = this.set("epoch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEpoch: Self = this.set("epoch", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    @scala.inline
    def setWindow(value: Double): Self = this.set("window", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
  }
  
}

