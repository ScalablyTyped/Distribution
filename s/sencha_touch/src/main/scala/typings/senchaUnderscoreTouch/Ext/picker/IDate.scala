package typings.senchaUnderscoreTouch.Ext.picker

import typings.senchaUnderscoreTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDate extends IPicker {
  /** [Config Option] (String) */
  var dayText: js.UndefOr[String] = js.undefined
  /** [Method] Returns the value of dayText
  		* @returns String
  		*/
  var getDayText: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of monthText
  		* @returns String
  		*/
  var getMonthText: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of slotOrder
  		* @returns Array
  		*/
  var getSlotOrder: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of yearFrom
  		* @returns Number
  		*/
  var getYearFrom: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of yearText
  		* @returns String
  		*/
  var getYearText: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of yearTo
  		* @returns Number
  		*/
  var getYearTo: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Config Option] (String) */
  var monthText: js.UndefOr[String] = js.undefined
  /** [Method] Sets the value of dayText
  		* @param dayText String The new value.
  		*/
  var setDayText: js.UndefOr[js.Function1[/* dayText */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of monthText
  		* @param monthText String The new value.
  		*/
  var setMonthText: js.UndefOr[js.Function1[/* monthText */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of slotOrder
  		* @param slotOrder Array The new value.
  		*/
  var setSlotOrder: js.UndefOr[js.Function1[/* slotOrder */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the values of the pickers slots
  		* @param value Object
  		* @param animated Object
  		* @returns Ext.Picker this This picker.
  		*/
  @JSName("setValue")
  var setValue_IDate: js.UndefOr[
    js.Function2[
      /* value */ js.UndefOr[js.Any], 
      /* animated */ js.UndefOr[js.Any], 
      typings.senchaUnderscoreTouch.Ext.IPicker
    ]
  ] = js.undefined
  /** [Method] Sets the value of yearFrom
  		* @param yearFrom Number The new value.
  		*/
  var setYearFrom: js.UndefOr[js.Function1[/* yearFrom */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of yearText
  		* @param yearText String The new value.
  		*/
  var setYearText: js.UndefOr[js.Function1[/* yearText */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of yearTo
  		* @param yearTo Number The new value.
  		*/
  var setYearTo: js.UndefOr[js.Function1[/* yearTo */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Config Option] (Array) */
  var slotOrder: js.UndefOr[Array] = js.undefined
  /** [Method] Updates the dayText configuration
  		* @param newDayText Object
  		* @param oldDayText Object
  		*/
  var updateDayText: js.UndefOr[
    js.Function2[/* newDayText */ js.UndefOr[js.Any], /* oldDayText */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Updates the monthText configuration
  		* @param newMonthText Object
  		* @param oldMonthText Object
  		*/
  var updateMonthText: js.UndefOr[
    js.Function2[/* newMonthText */ js.UndefOr[js.Any], /* oldMonthText */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Updates the yearFrom configuration */
  var updateYearFrom: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Updates the yearText configuration
  		* @param yearText Object
  		*/
  var updateYearText: js.UndefOr[js.Function1[/* yearText */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Updates the yearTo configuration */
  var updateYearTo: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Number) */
  var yearFrom: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var yearText: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var yearTo: js.UndefOr[Double] = js.undefined
}

object IDate {
  @scala.inline
  def apply(
    IPicker: IPicker = null,
    dayText: String = null,
    getDayText: () => String = null,
    getMonthText: () => String = null,
    getSlotOrder: () => Array = null,
    getYearFrom: () => Double = null,
    getYearText: () => String = null,
    getYearTo: () => Double = null,
    monthText: String = null,
    setDayText: /* dayText */ js.UndefOr[String] => Unit = null,
    setMonthText: /* monthText */ js.UndefOr[String] => Unit = null,
    setSlotOrder: /* slotOrder */ js.UndefOr[Array] => Unit = null,
    setValue: (/* value */ js.UndefOr[js.Any], /* animated */ js.UndefOr[js.Any]) => typings.senchaUnderscoreTouch.Ext.IPicker = null,
    setYearFrom: /* yearFrom */ js.UndefOr[Double] => Unit = null,
    setYearText: /* yearText */ js.UndefOr[String] => Unit = null,
    setYearTo: /* yearTo */ js.UndefOr[Double] => Unit = null,
    slotOrder: Array = null,
    updateDayText: (/* newDayText */ js.UndefOr[js.Any], /* oldDayText */ js.UndefOr[js.Any]) => Unit = null,
    updateMonthText: (/* newMonthText */ js.UndefOr[js.Any], /* oldMonthText */ js.UndefOr[js.Any]) => Unit = null,
    updateYearFrom: () => Unit = null,
    updateYearText: /* yearText */ js.UndefOr[js.Any] => Unit = null,
    updateYearTo: () => Unit = null,
    yearFrom: Int | Double = null,
    yearText: String = null,
    yearTo: Int | Double = null
  ): IDate = {
    val __obj = js.Dynamic.literal()
    if (IPicker != null) js.Dynamic.global.Object.assign(__obj, IPicker)
    if (dayText != null) __obj.updateDynamic("dayText")(dayText.asInstanceOf[js.Any])
    if (getDayText != null) __obj.updateDynamic("getDayText")(js.Any.fromFunction0(getDayText))
    if (getMonthText != null) __obj.updateDynamic("getMonthText")(js.Any.fromFunction0(getMonthText))
    if (getSlotOrder != null) __obj.updateDynamic("getSlotOrder")(js.Any.fromFunction0(getSlotOrder))
    if (getYearFrom != null) __obj.updateDynamic("getYearFrom")(js.Any.fromFunction0(getYearFrom))
    if (getYearText != null) __obj.updateDynamic("getYearText")(js.Any.fromFunction0(getYearText))
    if (getYearTo != null) __obj.updateDynamic("getYearTo")(js.Any.fromFunction0(getYearTo))
    if (monthText != null) __obj.updateDynamic("monthText")(monthText.asInstanceOf[js.Any])
    if (setDayText != null) __obj.updateDynamic("setDayText")(js.Any.fromFunction1(setDayText))
    if (setMonthText != null) __obj.updateDynamic("setMonthText")(js.Any.fromFunction1(setMonthText))
    if (setSlotOrder != null) __obj.updateDynamic("setSlotOrder")(js.Any.fromFunction1(setSlotOrder))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction2(setValue))
    if (setYearFrom != null) __obj.updateDynamic("setYearFrom")(js.Any.fromFunction1(setYearFrom))
    if (setYearText != null) __obj.updateDynamic("setYearText")(js.Any.fromFunction1(setYearText))
    if (setYearTo != null) __obj.updateDynamic("setYearTo")(js.Any.fromFunction1(setYearTo))
    if (slotOrder != null) __obj.updateDynamic("slotOrder")(slotOrder.asInstanceOf[js.Any])
    if (updateDayText != null) __obj.updateDynamic("updateDayText")(js.Any.fromFunction2(updateDayText))
    if (updateMonthText != null) __obj.updateDynamic("updateMonthText")(js.Any.fromFunction2(updateMonthText))
    if (updateYearFrom != null) __obj.updateDynamic("updateYearFrom")(js.Any.fromFunction0(updateYearFrom))
    if (updateYearText != null) __obj.updateDynamic("updateYearText")(js.Any.fromFunction1(updateYearText))
    if (updateYearTo != null) __obj.updateDynamic("updateYearTo")(js.Any.fromFunction0(updateYearTo))
    if (yearFrom != null) __obj.updateDynamic("yearFrom")(yearFrom.asInstanceOf[js.Any])
    if (yearText != null) __obj.updateDynamic("yearText")(yearText.asInstanceOf[js.Any])
    if (yearTo != null) __obj.updateDynamic("yearTo")(yearTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDate]
  }
}

