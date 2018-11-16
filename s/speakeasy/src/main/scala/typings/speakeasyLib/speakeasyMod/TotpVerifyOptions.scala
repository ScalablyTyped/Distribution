package typings
package speakeasyLib.speakeasyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TotpVerifyOptions extends SharedOptions {
  /**
       * The counter value, calculated from time by default
       */
  var counter: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The number of digits for the one-time passcode, defaults to 6
       */
  var digits: js.UndefOr[scala.Double] = js.undefined
  /**
       * Initial time since the UNIX epoch from which to calculate the counter value,
       * defaults to 0 (no offset).
       */
  var epoch: js.UndefOr[scala.Double] = js.undefined
  /**
       * Shared secret key
       */
  var secret: java.lang.String
  /**
       * Time step in seconds, defaults to 30
       */
  var step: js.UndefOr[scala.Double] = js.undefined
  /**
       * Time in seconds with which to calculate
       * counter value, defaults to `Date.now() / 1000`.
       */
  var time: js.UndefOr[scala.Double] = js.undefined
  /**
       * Passcode to validate
       */
  var token: java.lang.String
  /**
       * The allowable margin for the counter.
       * The function will check "W" codes in the future and the past against the
       * provided passcode, e.g. if W = 5, and C = 1000, this function will check
       * the passcode against all One Time Passcodes between 995 and 1005, inclusive
       * defaults to 0
       */
  var window: js.UndefOr[scala.Double] = js.undefined
}

