package typings
package redlockLib.redlockMod.RedlockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  var driftFactor: js.UndefOr[scala.Double] = js.undefined
  var extendScript: js.UndefOr[js.Function1[/* origExtendScript */ java.lang.String, java.lang.String]] = js.undefined
  var lockScript: js.UndefOr[js.Function1[/* origLockScript */ java.lang.String, java.lang.String]] = js.undefined
  var retryCount: js.UndefOr[scala.Double] = js.undefined
  var retryDelay: js.UndefOr[scala.Double] = js.undefined
  var retryJitter: js.UndefOr[scala.Double] = js.undefined
  var unlockScript: js.UndefOr[js.Function1[/* origUnlockScript */ java.lang.String, java.lang.String]] = js.undefined
}

