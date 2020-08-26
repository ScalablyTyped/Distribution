package typings.speakeasy.mod

import typings.speakeasy.speakeasyStrings.htop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OtpauthURLOptions extends SharedOptions {
  /**
    * The initial counter value, required for HOTP.
    */
  var counter: js.UndefOr[Double] = js.native
  /**
    * The number of digits for the one-time passcode. Currently ignored
    * by Google Authenticator, defaults to 6
    */
  var digits: js.UndefOr[Double] = js.native
  /**
    * The provider or service with which the secret key is associated.
    */
  var issuer: js.UndefOr[String] = js.native
  /**
    * Used to identify the account with which the secret key is associated,
    * e.g. the user's email address.
    */
  var label: String = js.native
  /**
    * The length of time for which a TOTP code will be valid, in seconds.
    * Currently ignored by Google Authenticator, defaults to 30
    */
  var period: js.UndefOr[Double] = js.native
  /**
    * Shared secret key
    */
  var secret: String = js.native
  /**
    * Either 'hotp' or 'totp', defaults to 'totp'
    */
  var `type`: js.UndefOr[htop | typings.speakeasy.speakeasyStrings.totp] = js.native
}

object OtpauthURLOptions {
  @scala.inline
  def apply(label: String, secret: String): OtpauthURLOptions = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtpauthURLOptions]
  }
  @scala.inline
  implicit class OtpauthURLOptionsOps[Self <: OtpauthURLOptions] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    @scala.inline
    def setCounter(value: Double): Self = this.set("counter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCounter: Self = this.set("counter", js.undefined)
    @scala.inline
    def setDigits(value: Double): Self = this.set("digits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDigits: Self = this.set("digits", js.undefined)
    @scala.inline
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssuer: Self = this.set("issuer", js.undefined)
    @scala.inline
    def setPeriod(value: Double): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    @scala.inline
    def setType(value: htop | typings.speakeasy.speakeasyStrings.totp): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

