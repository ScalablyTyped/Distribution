package typings
package retryLib.retryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeoutsOptions extends CreateTimeoutOptions {
  /**
    * The maximum amount of times to retry the operation.
    * @default 10
    */
  var retries: js.UndefOr[scala.Double] = js.undefined
}

