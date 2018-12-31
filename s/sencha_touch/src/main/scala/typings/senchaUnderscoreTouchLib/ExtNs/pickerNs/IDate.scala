package typings
package senchaUnderscoreTouchLib.ExtNs.pickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDate extends IPicker {
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
  var getSlotOrder: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
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
  var setSlotOrder: js.UndefOr[
    js.Function1[/* slotOrder */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
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
      senchaUnderscoreTouchLib.ExtNs.IPicker
    ]
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
  var slotOrder: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
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

