package typings.pulumiAws.outputMod.codebuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookFilterGroup extends js.Object {
  /**
    * A webhook filter for the group. Filter blocks are documented below.
    */
  var filters: js.UndefOr[js.Array[WebhookFilterGroupFilter]] = js.native
}

object WebhookFilterGroup {
  @scala.inline
  def apply(): WebhookFilterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebhookFilterGroup]
  }
  @scala.inline
  implicit class WebhookFilterGroupOps[Self <: WebhookFilterGroup] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: WebhookFilterGroupFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[WebhookFilterGroupFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
  
}

