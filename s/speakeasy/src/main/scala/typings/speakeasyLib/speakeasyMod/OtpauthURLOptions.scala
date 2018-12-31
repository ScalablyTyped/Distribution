package typings
package speakeasyLib.speakeasyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtpauthURLOptions extends SharedOptions {
  /**
    * The initial counter value, required for HOTP.
    */
  var counter: js.UndefOr[scala.Double] = js.undefined
  /**
    * The number of digits for the one-time passcode. Currently ignored
    * by Google Authenticator, defaults to 6
    */
  var digits: js.UndefOr[scala.Double] = js.undefined
  /**
    * The provider or service with which the secret key is associated.
    */
  var issuer: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used to identify the account with which the secret key is associated,
    * e.g. the user's email address.
    */
  var label: java.lang.String
  /**
    * The length of time for which a TOTP code will be valid, in seconds.
    * Currently ignored by Google Authenticator, defaults to 30
    */
  var period: js.UndefOr[scala.Double] = js.undefined
  /**
    * Shared secret key
    */
  var secret: java.lang.String
  /**
    * Either 'hotp' or 'totp', defaults to 'totp'
    */
  var `type`: js.UndefOr[speakeasyLib.speakeasyLibStrings.htop | speakeasyLib.speakeasyLibStrings.totp] = js.undefined
}

