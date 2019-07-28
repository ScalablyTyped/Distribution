package typings.speakeasy.speakeasyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hotp extends js.Object {
  /**
    * Generate a counter-based one-time token. Specify the key and counter, and
    * receive the one-time password for that counter position as a string. You can
    * also specify a token length, as well as the encoding (ASCII, hexadecimal, or
    * base32) and the hashing algorithm to use (SHA1, SHA256, SHA512).
    *
    * @return The one-time passcode.
    */
  def apply(options: HotpOptions): String = js.native
  /**
    * Verify a counter-based one-time token against the secret and return true if
    * it verifies. Helper function for `hotp.verifyDelta()`` that returns a boolean
    * instead of an object.
    *
    * @return Returns true if the token matches within the given window, false otherwise.
    */
  def verify(options: HotpVerifyOptions): Boolean = js.native
  /**
    * Verify a counter-based one-time token against the secret and return the delta.
    * By default, it verifies the token at the given counter value, with no leeway
    * (no look-ahead or look-behind). A token validated at the current counter value
    * will have a delta of 0.
    *
    * You can specify a window to add more leeway to the verification process.
    * Setting the window param will check for the token at the given counter value
    * as well as `window` tokens ahead (one-sided window). See param for more info.
    *
    * `verifyDelta()` will return the delta between the counter value of the token
    * and the given counter value. For example, if given a counter 5 and a window
    * 10, `verifyDelta()` will look at tokens from 5 to 15, inclusive. If it finds
    * it at counter position 7, it will return `{ delta: 2 }`.
    *
    * @return On success, returns an object with the counter
    *   difference between the client and the server as the `delta` property (i.e.
    *   `{ delta: 0 }`).
    */
  def verifyDelta(options: HotpVerifyOptions): js.UndefOr[Delta] = js.native
}

