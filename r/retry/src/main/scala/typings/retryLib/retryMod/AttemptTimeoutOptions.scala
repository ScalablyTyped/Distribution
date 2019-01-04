package typings
package retryLib.retryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttemptTimeoutOptions extends js.Object {
  /**
    * Callback to execute when the operation takes longer than the timeout.
    */
  var callback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * A timeout in milliseconds.
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

