package typings.pulumiAws.getSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSelectionArgs extends js.Object {
  /**
    * The backup plan ID associated with the selection of resources.
    */
  val planId: String = js.native
  /**
    * The backup selection ID.
    */
  val selectionId: String = js.native
}

object GetSelectionArgs {
  @scala.inline
  def apply(planId: String, selectionId: String): GetSelectionArgs = {
    val __obj = js.Dynamic.literal(planId = planId.asInstanceOf[js.Any], selectionId = selectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSelectionArgs]
  }
  @scala.inline
  implicit class GetSelectionArgsOps[Self <: GetSelectionArgs] (val x: Self) extends AnyVal {
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
    def setPlanId(value: String): Self = this.set("planId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionId(value: String): Self = this.set("selectionId", value.asInstanceOf[js.Any])
  }
  
}

