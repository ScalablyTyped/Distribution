package typings.rcPicker.rangePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<rc-picker.rc-picker/es/panels/TimePanel.SharedTimeProps<DateType>, 'defaultValue'> & {  defaultValue :std.Array<DateType> | undefined} */
@js.native
trait RangeShowTimeObject[DateType] extends js.Object {
  var defaultValue: js.UndefOr[js.Array[DateType]] = js.native
  var disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.native
  var disabledMinutes: js.UndefOr[js.Function1[/* hour */ Double, js.Array[Double]]] = js.native
  var disabledSeconds: js.UndefOr[js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]] = js.native
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

object RangeShowTimeObject {
  @scala.inline
  def apply[DateType](): RangeShowTimeObject[DateType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeShowTimeObject[DateType]]
  }
  @scala.inline
  implicit class RangeShowTimeObjectOps[Self <: RangeShowTimeObject[_], DateType] (val x: Self with RangeShowTimeObject[DateType]) extends AnyVal {
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
    def setDefaultValueVarargs(value: DateType*): Self = this.set("defaultValue", js.Array(value :_*))
    @scala.inline
    def setDefaultValue(value: js.Array[DateType]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDisabledHours(value: () => js.Array[Double]): Self = this.set("disabledHours", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDisabledHours: Self = this.set("disabledHours", js.undefined)
    @scala.inline
    def setDisabledMinutes(value: /* hour */ Double => js.Array[Double]): Self = this.set("disabledMinutes", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDisabledMinutes: Self = this.set("disabledMinutes", js.undefined)
    @scala.inline
    def setDisabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): Self = this.set("disabledSeconds", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDisabledSeconds: Self = this.set("disabledSeconds", js.undefined)
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

