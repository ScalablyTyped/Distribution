package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePicker
  extends senchaUnderscoreTouchLib.ExtNs.pickerNs.IPicker {
  /** [Config Option] (String) */
  var dayText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of dayText
  		* @returns String
  		*/
  var getDayText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of monthText
  		* @returns String
  		*/
  var getMonthText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of slotOrder
  		* @returns Array
  		*/
  var getSlotOrder: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of yearFrom
  		* @returns Number
  		*/
  var getYearFrom: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of yearText
  		* @returns String
  		*/
  var getYearText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of yearTo
  		* @returns Number
  		*/
  var getYearTo: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Config Option] (String) */
  var monthText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of dayText
  		* @param dayText String The new value.
  		*/
  var setDayText: js.UndefOr[js.Function1[/* dayText */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of monthText
  		* @param monthText String The new value.
  		*/
  var setMonthText: js.UndefOr[js.Function1[/* monthText */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of slotOrder
  		* @param slotOrder Array The new value.
  		*/
  var setSlotOrder: js.UndefOr[js.Function1[/* slotOrder */ js.UndefOr[Array], scala.Unit]] = js.undefined
  /** [Method] Sets the values of the pickers slots
  		* @param value Object
  		* @param animated Object
  		* @returns Ext.Picker this This picker.
  		*/
  @JSName("setValue")
  var setValue_IDatePicker: js.UndefOr[
    js.Function2[/* value */ js.UndefOr[js.Any], /* animated */ js.UndefOr[js.Any], IPicker]
  ] = js.undefined
  /** [Method] Sets the value of yearFrom
  		* @param yearFrom Number The new value.
  		*/
  var setYearFrom: js.UndefOr[js.Function1[/* yearFrom */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of yearText
  		* @param yearText String The new value.
  		*/
  var setYearText: js.UndefOr[js.Function1[/* yearText */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of yearTo
  		* @param yearTo Number The new value.
  		*/
  var setYearTo: js.UndefOr[js.Function1[/* yearTo */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Config Option] (Array) */
  var slotOrder: js.UndefOr[Array] = js.undefined
  /** [Method] Updates the dayText configuration
  		* @param newDayText Object
  		* @param oldDayText Object
  		*/
  var updateDayText: js.UndefOr[
    js.Function2[/* newDayText */ js.UndefOr[js.Any], /* oldDayText */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Updates the monthText configuration
  		* @param newMonthText Object
  		* @param oldMonthText Object
  		*/
  var updateMonthText: js.UndefOr[
    js.Function2[
      /* newMonthText */ js.UndefOr[js.Any], 
      /* oldMonthText */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Updates the yearFrom configuration */
  var updateYearFrom: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Updates the yearText configuration
  		* @param yearText Object
  		*/
  var updateYearText: js.UndefOr[js.Function1[/* yearText */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Updates the yearTo configuration */
  var updateYearTo: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var yearFrom: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var yearText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var yearTo: js.UndefOr[scala.Double] = js.undefined
}

object IDatePicker {
  @scala.inline
  def apply(
    IPicker: senchaUnderscoreTouchLib.ExtNs.pickerNs.IPicker = null,
    dayText: java.lang.String = null,
    doneButton: js.Any = null,
    getDayText: js.Function0[java.lang.String] = null,
    getDoneButton: js.Function0[_] = null,
    getMonthText: js.Function0[java.lang.String] = null,
    getSlotOrder: js.Function0[Array] = null,
    getValue: js.Function1[/* useDom */ js.UndefOr[js.Any], _] = null,
    getYearFrom: js.Function0[scala.Double] = null,
    getYearText: js.Function0[java.lang.String] = null,
    getYearTo: js.Function0[scala.Double] = null,
    initialize: js.Function0[scala.Unit] = null,
    monthText: java.lang.String = null,
    setDayText: js.Function1[/* dayText */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setDoneButton: js.Function1[/* doneButton */ js.UndefOr[js.Any], scala.Unit] = null,
    setMonthText: js.Function1[/* monthText */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setSlotOrder: js.Function1[/* slotOrder */ js.UndefOr[Array], scala.Unit] = null,
    setValue: js.Function2[/* value */ js.UndefOr[js.Any], /* animated */ js.UndefOr[js.Any], IPicker] = null,
    setYearFrom: js.Function1[/* yearFrom */ js.UndefOr[scala.Double], scala.Unit] = null,
    setYearText: js.Function1[/* yearText */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setYearTo: js.Function1[/* yearTo */ js.UndefOr[scala.Double], scala.Unit] = null,
    slotOrder: Array = null,
    updateDayText: js.Function2[/* newDayText */ js.UndefOr[js.Any], /* oldDayText */ js.UndefOr[js.Any], scala.Unit] = null,
    updateMonthText: js.Function2[
      /* newMonthText */ js.UndefOr[js.Any], 
      /* oldMonthText */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    updateYearFrom: js.Function0[scala.Unit] = null,
    updateYearText: js.Function1[/* yearText */ js.UndefOr[js.Any], scala.Unit] = null,
    updateYearTo: js.Function0[scala.Unit] = null,
    value: js.Any = null,
    yearFrom: scala.Int | scala.Double = null,
    yearText: java.lang.String = null,
    yearTo: scala.Int | scala.Double = null
  ): IDatePicker = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IPicker)
    if (dayText != null) __obj.updateDynamic("dayText")(dayText)
    if (doneButton != null) __obj.updateDynamic("doneButton")(doneButton)
    if (getDayText != null) __obj.updateDynamic("getDayText")(getDayText)
    if (getDoneButton != null) __obj.updateDynamic("getDoneButton")(getDoneButton)
    if (getMonthText != null) __obj.updateDynamic("getMonthText")(getMonthText)
    if (getSlotOrder != null) __obj.updateDynamic("getSlotOrder")(getSlotOrder)
    if (getValue != null) __obj.updateDynamic("getValue")(getValue)
    if (getYearFrom != null) __obj.updateDynamic("getYearFrom")(getYearFrom)
    if (getYearText != null) __obj.updateDynamic("getYearText")(getYearText)
    if (getYearTo != null) __obj.updateDynamic("getYearTo")(getYearTo)
    if (initialize != null) __obj.updateDynamic("initialize")(initialize)
    if (monthText != null) __obj.updateDynamic("monthText")(monthText)
    if (setDayText != null) __obj.updateDynamic("setDayText")(setDayText)
    if (setDoneButton != null) __obj.updateDynamic("setDoneButton")(setDoneButton)
    if (setMonthText != null) __obj.updateDynamic("setMonthText")(setMonthText)
    if (setSlotOrder != null) __obj.updateDynamic("setSlotOrder")(setSlotOrder)
    if (setValue != null) __obj.updateDynamic("setValue")(setValue)
    if (setYearFrom != null) __obj.updateDynamic("setYearFrom")(setYearFrom)
    if (setYearText != null) __obj.updateDynamic("setYearText")(setYearText)
    if (setYearTo != null) __obj.updateDynamic("setYearTo")(setYearTo)
    if (slotOrder != null) __obj.updateDynamic("slotOrder")(slotOrder)
    if (updateDayText != null) __obj.updateDynamic("updateDayText")(updateDayText)
    if (updateMonthText != null) __obj.updateDynamic("updateMonthText")(updateMonthText)
    if (updateYearFrom != null) __obj.updateDynamic("updateYearFrom")(updateYearFrom)
    if (updateYearText != null) __obj.updateDynamic("updateYearText")(updateYearText)
    if (updateYearTo != null) __obj.updateDynamic("updateYearTo")(updateYearTo)
    if (value != null) __obj.updateDynamic("value")(value)
    if (yearFrom != null) __obj.updateDynamic("yearFrom")(yearFrom.asInstanceOf[js.Any])
    if (yearText != null) __obj.updateDynamic("yearText")(yearText)
    if (yearTo != null) __obj.updateDynamic("yearTo")(yearTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePicker]
  }
}

