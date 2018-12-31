package typings
package atPulumiPulumiLib.dynamicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckResult extends js.Object {
  /**
    * Any validation failures that occurred.
    */
  val failures: js.UndefOr[js.Array[CheckFailure]] = js.undefined
  /**
    * The inputs to use, if any.
    */
  val inputs: js.UndefOr[js.Any] = js.undefined
}

