package typings.atPulumiAws.typesInputMod.backup

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlanRuleLifecycle extends js.Object {
  /**
    * Specifies the number of days after creation that a recovery point is moved to cold storage.
    */
  var coldStorageAfter: js.UndefOr[Input[Double]] = js.native
  /**
    * Specifies the number of days after creation that a recovery point is deleted. Must be 90 days greater than `coldStorageAfter`.
    */
  var deleteAfter: js.UndefOr[Input[Double]] = js.native
}

object PlanRuleLifecycle {
  @scala.inline
  def apply(coldStorageAfter: Input[Double] = null, deleteAfter: Input[Double] = null): PlanRuleLifecycle = {
    val __obj = js.Dynamic.literal()
    if (coldStorageAfter != null) __obj.updateDynamic("coldStorageAfter")(coldStorageAfter.asInstanceOf[js.Any])
    if (deleteAfter != null) __obj.updateDynamic("deleteAfter")(deleteAfter.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanRuleLifecycle]
  }
}

