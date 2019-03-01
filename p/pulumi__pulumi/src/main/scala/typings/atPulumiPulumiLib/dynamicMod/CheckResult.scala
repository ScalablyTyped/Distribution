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

object CheckResult {
  @scala.inline
  def apply(failures: js.Array[CheckFailure] = null, inputs: js.Any = null): CheckResult = {
    val __obj = js.Dynamic.literal()
    if (failures != null) __obj.updateDynamic("failures")(failures)
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    __obj.asInstanceOf[CheckResult]
  }
}

