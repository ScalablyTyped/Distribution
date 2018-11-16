package typings
package speakeasyLib.speakeasyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Totp extends js.Object {
  /**
       * Generate a time-based one-time token. Specify the key, and receive the
       * one-time password for that time as a string. By default, it uses the current
       * time and a time step of 30 seconds, so there is a new token every 30 seconds.
       * You may override the time step and epoch for custom timing. You can also
       * specify a token length, as well as the encoding (ASCII, hexadecimal, or
       * base32) and the hashing algorithm to use (SHA1, SHA256, SHA512).
       *
       * Under the hood, TOTP calculates the counter value by finding how many time
       * steps have passed since the epoch, and calls HOTP with that counter value.
       *
       * @return The one-time passcode.
       */
  def apply(options: TotpOptions): java.lang.String = js.native
  /**
       * Verify a time-based one-time token against the secret and return true if it
       * verifies. Helper function for verifyDelta() that returns a boolean instead of
       * an object.
       *
       * @return Returns true if the token matches within the given
       *   window, false otherwise.
       */
  def verify(options: TotpVerifyOptions): scala.Boolean = js.native
  /**
       * Verify a time-based one-time token against the secret and return the delta.
       * By default, it verifies the token at the current time window, with no leeway
       * (no look-ahead or look-behind). A token validated at the current time window
       * will have a delta of 0.
       *
       * You can specify a window to add more leeway to the verification process.
       * Setting the window param will check for the token at the given counter value
       * as well as `window` tokens ahead and `window` tokens behind (two-sided
       * window). See param for more info.
       *
       * `verifyDelta()` will return the delta between the counter value of the token
       * and the given counter value. For example, if given a time at counter 1000 and
       * a window of 5, `verifyDelta()` will look at tokens from 995 to 1005,
       * inclusive. In other words, if the time-step is 30 seconds, it will look at
       * tokens from 2.5 minutes ago to 2.5 minutes in the future, inclusive.
       * If it finds it at counter position 1002, it will return `{ delta: 2 }`.
       * If it finds it at counter position 997, it will return `{ delta: -3 }`.
       *
       * @return On success, returns an object with the time step
       *   difference between the client and the server as the `delta` property (e.g.
       *   `{ delta: 0 }`).
       */
  def verifyDelta(options: TotpVerifyOptions): js.UndefOr[Delta] = js.native
}

