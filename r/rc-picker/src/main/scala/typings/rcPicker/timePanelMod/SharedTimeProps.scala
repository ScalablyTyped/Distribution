package typings.rcPicker.timePanelMod

import typings.rcPicker.interfaceMod.DisabledTimes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedTimeProps[DateType] extends DisabledTimes {
  var defaultValue: js.UndefOr[DateType] = js.native
  var format: js.UndefOr[String] = js.native
  var hideDisabledOptions: js.UndefOr[Boolean] = js.native
  var hourStep: js.UndefOr[Double] = js.native
  var minuteStep: js.UndefOr[Double] = js.native
  var secondStep: js.UndefOr[Double] = js.native
  var showHour: js.UndefOr[Boolean] = js.native
  var showMinute: js.UndefOr[Boolean] = js.native
  var showNow: js.UndefOr[Boolean] = js.native
  var showSecond: js.UndefOr[Boolean] = js.native
  var use12Hours: js.UndefOr[Boolean] = js.native
}

object SharedTimeProps {
  @scala.inline
  def apply[DateType](): SharedTimeProps[DateType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedTimeProps[DateType]]
  }
  @scala.inline
  implicit class SharedTimePropsOps[Self <: SharedTimeProps[_], DateType] (val x: Self with SharedTimeProps[DateType]) extends AnyVal {
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
    def setDefaultValue(value: DateType): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHideDisabledOptions(value: Boolean): Self = this.set("hideDisabledOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideDisabledOptions: Self = this.set("hideDisabledOptions", js.undefined)
    @scala.inline
    def setHourStep(value: Double): Self = this.set("hourStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHourStep: Self = this.set("hourStep", js.undefined)
    @scala.inline
    def setMinuteStep(value: Double): Self = this.set("minuteStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinuteStep: Self = this.set("minuteStep", js.undefined)
    @scala.inline
    def setSecondStep(value: Double): Self = this.set("secondStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondStep: Self = this.set("secondStep", js.undefined)
    @scala.inline
    def setShowHour(value: Boolean): Self = this.set("showHour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHour: Self = this.set("showHour", js.undefined)
    @scala.inline
    def setShowMinute(value: Boolean): Self = this.set("showMinute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMinute: Self = this.set("showMinute", js.undefined)
    @scala.inline
    def setShowNow(value: Boolean): Self = this.set("showNow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowNow: Self = this.set("showNow", js.undefined)
    @scala.inline
    def setShowSecond(value: Boolean): Self = this.set("showSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSecond: Self = this.set("showSecond", js.undefined)
    @scala.inline
    def setUse12Hours(value: Boolean): Self = this.set("use12Hours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse12Hours: Self = this.set("use12Hours", js.undefined)
  }
  
}

