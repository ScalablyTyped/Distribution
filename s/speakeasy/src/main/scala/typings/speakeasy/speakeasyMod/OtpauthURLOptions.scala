package typings.speakeasy.speakeasyMod

import typings.speakeasy.speakeasyStrings.htop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtpauthURLOptions extends SharedOptions {
  /**
    * The initial counter value, required for HOTP.
    */
  var counter: js.UndefOr[Double] = js.undefined
  /**
    * The number of digits for the one-time passcode. Currently ignored
    * by Google Authenticator, defaults to 6
    */
  var digits: js.UndefOr[Double] = js.undefined
  /**
    * The provider or service with which the secret key is associated.
    */
  var issuer: js.UndefOr[String] = js.undefined
  /**
    * Used to identify the account with which the secret key is associated,
    * e.g. the user's email address.
    */
  var label: String
  /**
    * The length of time for which a TOTP code will be valid, in seconds.
    * Currently ignored by Google Authenticator, defaults to 30
    */
  var period: js.UndefOr[Double] = js.undefined
  /**
    * Shared secret key
    */
  var secret: String
  /**
    * Either 'hotp' or 'totp', defaults to 'totp'
    */
  var `type`: js.UndefOr[htop | typings.speakeasy.speakeasyStrings.totp] = js.undefined
}

object OtpauthURLOptions {
  @scala.inline
  def apply(
    label: String,
    secret: String,
    algorithm: Algorithm = null,
    counter: Int | Double = null,
    digits: Int | Double = null,
    encoding: Encoding = null,
    issuer: String = null,
    period: Int | Double = null,
    `type`: htop | typings.speakeasy.speakeasyStrings.totp = null
  ): OtpauthURLOptions = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (counter != null) __obj.updateDynamic("counter")(counter.asInstanceOf[js.Any])
    if (digits != null) __obj.updateDynamic("digits")(digits.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtpauthURLOptions]
  }
}

