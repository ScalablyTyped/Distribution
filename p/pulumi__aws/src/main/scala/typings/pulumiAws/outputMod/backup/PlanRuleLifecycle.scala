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
  def apply(): PlanRuleLifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlanRuleLifecycle]
  }
  @scala.inline
  implicit class PlanRuleLifecycleOps[Self <: PlanRuleLifecycle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColdStorageAfter(value: Double): Self = this.set("coldStorageAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColdStorageAfter: Self = this.set("coldStorageAfter", js.undefined)
    @scala.inline
    def setDeleteAfter(value: Double): Self = this.set("deleteAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteAfter: Self = this.set("deleteAfter", js.undefined)
  }
  
}

