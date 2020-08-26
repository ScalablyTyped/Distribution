package typings.storybookComponents.propDefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropSummaryValue extends js.Object {
  var detail: js.UndefOr[String] = js.native
  var summary: String = js.native
}

object PropSummaryValue {
  @scala.inline
  def apply(summary: String): PropSummaryValue = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropSummaryValue]
  }
  @scala.inline
  implicit class PropSummaryValueOps[Self <: PropSummaryValue] (val x: Self) extends AnyVal {
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
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetail(value: String): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
  }
  
}

