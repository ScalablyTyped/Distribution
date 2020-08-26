package typings.simplSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CleanOption extends js.Object {
  var autoConvert: js.UndefOr[Boolean] = js.native
  var extendAutoValueContext: js.UndefOr[Boolean] = js.native
  var filter: js.UndefOr[Boolean] = js.native
  var getAutoValues: js.UndefOr[Boolean] = js.native
  var isModifier: js.UndefOr[Boolean] = js.native
  var removeEmptyStrings: js.UndefOr[Boolean] = js.native
  var removeNullsFromArrays: js.UndefOr[Boolean] = js.native
  var trimStrings: js.UndefOr[Boolean] = js.native
}

object CleanOption {
  @scala.inline
  def apply(): CleanOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CleanOption]
  }
  @scala.inline
  implicit class CleanOptionOps[Self <: CleanOption] (val x: Self) extends AnyVal {
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
    def setAutoConvert(value: Boolean): Self = this.set("autoConvert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoConvert: Self = this.set("autoConvert", js.undefined)
    @scala.inline
    def setExtendAutoValueContext(value: Boolean): Self = this.set("extendAutoValueContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtendAutoValueContext: Self = this.set("extendAutoValueContext", js.undefined)
    @scala.inline
    def setFilter(value: Boolean): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setGetAutoValues(value: Boolean): Self = this.set("getAutoValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetAutoValues: Self = this.set("getAutoValues", js.undefined)
    @scala.inline
    def setIsModifier(value: Boolean): Self = this.set("isModifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsModifier: Self = this.set("isModifier", js.undefined)
    @scala.inline
    def setRemoveEmptyStrings(value: Boolean): Self = this.set("removeEmptyStrings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveEmptyStrings: Self = this.set("removeEmptyStrings", js.undefined)
    @scala.inline
    def setRemoveNullsFromArrays(value: Boolean): Self = this.set("removeNullsFromArrays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveNullsFromArrays: Self = this.set("removeNullsFromArrays", js.undefined)
    @scala.inline
    def setTrimStrings(value: Boolean): Self = this.set("trimStrings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrimStrings: Self = this.set("trimStrings", js.undefined)
  }
  
}

