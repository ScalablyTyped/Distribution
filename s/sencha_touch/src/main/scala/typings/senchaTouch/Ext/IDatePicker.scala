package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatePicker
  extends typings.senchaTouch.Ext.picker.IPicker {
  /** [Config Option] (String) */
  var dayText: js.UndefOr[java.lang.String] = js.native
  /** [Method] Returns the value of dayText
    * @returns String
    */
  var getDayText: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of monthText
    * @returns String
    */
  var getMonthText: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of slotOrder
    * @returns Array
    */
  var getSlotOrder: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of yearFrom
    * @returns Number
    */
  var getYearFrom: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of yearText
    * @returns String
    */
  var getYearText: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of yearTo
    * @returns Number
    */
  var getYearTo: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (String) */
  var monthText: js.UndefOr[java.lang.String] = js.native
  /** [Method] Sets the value of dayText
    * @param dayText String The new value.
    */
  var setDayText: js.UndefOr[js.Function1[/* dayText */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of monthText
    * @param monthText String The new value.
    */
  var setMonthText: js.UndefOr[js.Function1[/* monthText */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of slotOrder
    * @param slotOrder Array The new value.
    */
  var setSlotOrder: js.UndefOr[js.Function1[/* slotOrder */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the values of the pickers slots
    * @param value Object
    * @param animated Object
    * @returns Ext.Picker this This picker.
    */
  @JSName("setValue")
  var setValue_IDatePicker: js.UndefOr[
    js.Function2[/* value */ js.UndefOr[js.Any], /* animated */ js.UndefOr[js.Any], IPicker]
  ] = js.native
  /** [Method] Sets the value of yearFrom
    * @param yearFrom Number The new value.
    */
  var setYearFrom: js.UndefOr[js.Function1[/* yearFrom */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of yearText
    * @param yearText String The new value.
    */
  var setYearText: js.UndefOr[js.Function1[/* yearText */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of yearTo
    * @param yearTo Number The new value.
    */
  var setYearTo: js.UndefOr[js.Function1[/* yearTo */ js.UndefOr[Double], Unit]] = js.native
  /** [Config Option] (Array) */
  var slotOrder: js.UndefOr[Array] = js.native
  /** [Method] Updates the dayText configuration
    * @param newDayText Object
    * @param oldDayText Object
    */
  var updateDayText: js.UndefOr[
    js.Function2[/* newDayText */ js.UndefOr[js.Any], /* oldDayText */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Updates the monthText configuration
    * @param newMonthText Object
    * @param oldMonthText Object
    */
  var updateMonthText: js.UndefOr[
    js.Function2[/* newMonthText */ js.UndefOr[js.Any], /* oldMonthText */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Updates the yearFrom configuration */
  var updateYearFrom: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Updates the yearText configuration
    * @param yearText Object
    */
  var updateYearText: js.UndefOr[js.Function1[/* yearText */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Updates the yearTo configuration */
  var updateYearTo: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Number) */
  var yearFrom: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var yearText: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Number) */
  var yearTo: js.UndefOr[Double] = js.native
}

object IDatePicker {
  @scala.inline
  def apply(): IDatePicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatePicker]
  }
  @scala.inline
  implicit class IDatePickerOps[Self <: IDatePicker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDayText(value: java.lang.String): Self = this.set("dayText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayText: Self = this.set("dayText", js.undefined)
    @scala.inline
    def setGetDayText(value: () => java.lang.String): Self = this.set("getDayText", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDayText: Self = this.set("getDayText", js.undefined)
    @scala.inline
    def setGetMonthText(value: () => java.lang.String): Self = this.set("getMonthText", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMonthText: Self = this.set("getMonthText", js.undefined)
    @scala.inline
    def setGetSlotOrder(value: () => Array): Self = this.set("getSlotOrder", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSlotOrder: Self = this.set("getSlotOrder", js.undefined)
    @scala.inline
    def setGetYearFrom(value: () => Double): Self = this.set("getYearFrom", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetYearFrom: Self = this.set("getYearFrom", js.undefined)
    @scala.inline
    def setGetYearText(value: () => java.lang.String): Self = this.set("getYearText", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetYearText: Self = this.set("getYearText", js.undefined)
    @scala.inline
    def setGetYearTo(value: () => Double): Self = this.set("getYearTo", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetYearTo: Self = this.set("getYearTo", js.undefined)
    @scala.inline
    def setMonthText(value: java.lang.String): Self = this.set("monthText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthText: Self = this.set("monthText", js.undefined)
    @scala.inline
    def setSetDayText(value: /* dayText */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setDayText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDayText: Self = this.set("setDayText", js.undefined)
    @scala.inline
    def setSetMonthText(value: /* monthText */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setMonthText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMonthText: Self = this.set("setMonthText", js.undefined)
    @scala.inline
    def setSetSlotOrder(value: /* slotOrder */ js.UndefOr[Array] => Unit): Self = this.set("setSlotOrder", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetSlotOrder: Self = this.set("setSlotOrder", js.undefined)
    @scala.inline
    def setSetValue(value: (/* value */ js.UndefOr[js.Any], /* animated */ js.UndefOr[js.Any]) => IPicker): Self = this.set("setValue", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
    @scala.inline
    def setSetYearFrom(value: /* yearFrom */ js.UndefOr[Double] => Unit): Self = this.set("setYearFrom", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetYearFrom: Self = this.set("setYearFrom", js.undefined)
    @scala.inline
    def setSetYearText(value: /* yearText */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setYearText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetYearText: Self = this.set("setYearText", js.undefined)
    @scala.inline
    def setSetYearTo(value: /* yearTo */ js.UndefOr[Double] => Unit): Self = this.set("setYearTo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetYearTo: Self = this.set("setYearTo", js.undefined)
    @scala.inline
    def setSlotOrder(value: Array): Self = this.set("slotOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlotOrder: Self = this.set("slotOrder", js.undefined)
    @scala.inline
    def setUpdateDayText(value: (/* newDayText */ js.UndefOr[js.Any], /* oldDayText */ js.UndefOr[js.Any]) => Unit): Self = this.set("updateDayText", js.Any.fromFunction2(value))
    @scala.inline
    def deleteUpdateDayText: Self = this.set("updateDayText", js.undefined)
    @scala.inline
    def setUpdateMonthText(value: (/* newMonthText */ js.UndefOr[js.Any], /* oldMonthText */ js.UndefOr[js.Any]) => Unit): Self = this.set("updateMonthText", js.Any.fromFunction2(value))
    @scala.inline
    def deleteUpdateMonthText: Self = this.set("updateMonthText", js.undefined)
    @scala.inline
    def setUpdateYearFrom(value: () => Unit): Self = this.set("updateYearFrom", js.Any.fromFunction0(value))
    @scala.inline
    def deleteUpdateYearFrom: Self = this.set("updateYearFrom", js.undefined)
    @scala.inline
    def setUpdateYearText(value: /* yearText */ js.UndefOr[js.Any] => Unit): Self = this.set("updateYearText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUpdateYearText: Self = this.set("updateYearText", js.undefined)
    @scala.inline
    def setUpdateYearTo(value: () => Unit): Self = this.set("updateYearTo", js.Any.fromFunction0(value))
    @scala.inline
    def deleteUpdateYearTo: Self = this.set("updateYearTo", js.undefined)
    @scala.inline
    def setYearFrom(value: Double): Self = this.set("yearFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYearFrom: Self = this.set("yearFrom", js.undefined)
    @scala.inline
    def setYearText(value: java.lang.String): Self = this.set("yearText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYearText: Self = this.set("yearText", js.undefined)
    @scala.inline
    def setYearTo(value: Double): Self = this.set("yearTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYearTo: Self = this.set("yearTo", js.undefined)
  }
  
}

