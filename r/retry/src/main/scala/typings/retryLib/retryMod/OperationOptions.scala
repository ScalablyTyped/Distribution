package typings
package retryLib.retryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationOptions extends TimeoutsOptions {
  /**
    * Whether to retry forever.
    * @default false
    */
  var forever: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The maximum time (in milliseconds) that the retried operation is allowed to run.
    * @default Infinity
    */
  var maxRetryTime: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to [unref](https://nodejs.org/api/timers.html#timers_unref) the setTimeout's.
    * @default false
    */
  var unref: js.UndefOr[scala.Boolean] = js.undefined
}

