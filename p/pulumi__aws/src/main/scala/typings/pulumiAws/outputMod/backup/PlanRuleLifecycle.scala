package typings.pulumiAws.outputMod.backup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlanRuleLifecycle extends js.Object {
  /**
    * Specifies the number of days after creation that a recovery point is moved to cold storage.
    */
  var coldStorageAfter: js.UndefOr[Double] = js.native
  /**
    * Specifies the number of days after creation that a recovery point is deleted. Must be 90 days greater than `coldStorageAfter`.
    */
  var deleteAfter: js.UndefOr[Double] = js.native
}

object PlanRuleLifecycle {
  @scala.inline
  def apply(
    coldStorageAfter: js.UndefOr[Double] = js.undefined,
    deleteAfter: js.UndefOr[Double] = js.undefined
  ): PlanRuleLifecycle = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(coldStorageAfter)) __obj.updateDynamic("coldStorageAfter")(coldStorageAfter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteAfter)) __obj.updateDynamic("deleteAfter")(deleteAfter.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanRuleLifecycle]
  }
}

