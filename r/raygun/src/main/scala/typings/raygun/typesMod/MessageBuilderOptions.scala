package typings.raygun.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageBuilderOptions extends js.Object {
  var filters: js.UndefOr[js.Array[String]] = js.native
  var innerErrorFieldName: js.UndefOr[String] = js.native
  var reportColumnNumbers: js.UndefOr[Boolean] = js.native
  var useHumanStringForObject: js.UndefOr[Boolean] = js.native
}

object MessageBuilderOptions {
  @scala.inline
  def apply(): MessageBuilderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageBuilderOptions]
  }
  @scala.inline
  implicit class MessageBuilderOptionsOps[Self <: MessageBuilderOptions] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: String*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[String]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setInnerErrorFieldName(value: String): Self = this.set("innerErrorFieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerErrorFieldName: Self = this.set("innerErrorFieldName", js.undefined)
    @scala.inline
    def setReportColumnNumbers(value: Boolean): Self = this.set("reportColumnNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportColumnNumbers: Self = this.set("reportColumnNumbers", js.undefined)
    @scala.inline
    def setUseHumanStringForObject(value: Boolean): Self = this.set("useHumanStringForObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseHumanStringForObject: Self = this.set("useHumanStringForObject", js.undefined)
  }
  
}

