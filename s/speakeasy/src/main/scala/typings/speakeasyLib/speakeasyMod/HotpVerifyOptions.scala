package typings
package speakeasyLib.speakeasyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HotpVerifyOptions extends SharedOptions {
  /**
    * Counter value. This should be stored by
    * the application and must be incremented for each request.
    */
  var counter: scala.Double
  /**
    * The number of digits for the one-time passcode, defaults to 6
    */
  var digits: js.UndefOr[scala.Double] = js.undefined
  /**
    * Shared secret key
    */
  var secret: java.lang.String
  /**
    * Passcode to validate
    */
  var token: java.lang.String
  /**
    * The allowable margin for the counter.
    * The function will check "W" codes in the future against the provided
    * passcode, e.g. if W = 10, and C = 5, this function will check the
    * passcode against all One Time Passcodes between 5 and 15, inclusive,
    * defaults to 0
    */
  var window: js.UndefOr[scala.Double] = js.undefined
}

