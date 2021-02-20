package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IDatePickerMutableBuilder[Self <: IDatePicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDayText(value: java.lang.String): Self = StObject.set(x, "dayText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayTextUndefined: Self = StObject.set(x, "dayText", js.undefined)
    
    @scala.inline
    def setGetDayText(value: () => java.lang.String): Self = StObject.set(x, "getDayText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDayTextUndefined: Self = StObject.set(x, "getDayText", js.undefined)
    
    @scala.inline
    def setGetMonthText(value: () => java.lang.String): Self = StObject.set(x, "getMonthText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMonthTextUndefined: Self = StObject.set(x, "getMonthText", js.undefined)
    
    @scala.inline
    def setGetSlotOrder(value: () => Array): Self = StObject.set(x, "getSlotOrder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSlotOrderUndefined: Self = StObject.set(x, "getSlotOrder", js.undefined)
    
    @scala.inline
    def setGetYearFrom(value: () => Double): Self = StObject.set(x, "getYearFrom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetYearFromUndefined: Self = StObject.set(x, "getYearFrom", js.undefined)
    
    @scala.inline
    def setGetYearText(value: () => java.lang.String): Self = StObject.set(x, "getYearText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetYearTextUndefined: Self = StObject.set(x, "getYearText", js.undefined)
    
    @scala.inline
    def setGetYearTo(value: () => Double): Self = StObject.set(x, "getYearTo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetYearToUndefined: Self = StObject.set(x, "getYearTo", js.undefined)
    
    @scala.inline
    def setMonthText(value: java.lang.String): Self = StObject.set(x, "monthText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthTextUndefined: Self = StObject.set(x, "monthText", js.undefined)
    
    @scala.inline
    def setSetDayText(value: /* dayText */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setDayText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDayTextUndefined: Self = StObject.set(x, "setDayText", js.undefined)
    
    @scala.inline
    def setSetMonthText(value: /* monthText */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setMonthText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMonthTextUndefined: Self = StObject.set(x, "setMonthText", js.undefined)
    
    @scala.inline
    def setSetSlotOrder(value: /* slotOrder */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setSlotOrder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSlotOrderUndefined: Self = StObject.set(x, "setSlotOrder", js.undefined)
    
    @scala.inline
    def setSetValue(value: (/* value */ js.UndefOr[js.Any], /* animated */ js.UndefOr[js.Any]) => IPicker): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    @scala.inline
    def setSetYearFrom(value: /* yearFrom */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setYearFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetYearFromUndefined: Self = StObject.set(x, "setYearFrom", js.undefined)
    
    @scala.inline
    def setSetYearText(value: /* yearText */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setYearText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetYearTextUndefined: Self = StObject.set(x, "setYearText", js.undefined)
    
    @scala.inline
    def setSetYearTo(value: /* yearTo */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setYearTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetYearToUndefined: Self = StObject.set(x, "setYearTo", js.undefined)
    
    @scala.inline
    def setSlotOrder(value: Array): Self = StObject.set(x, "slotOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotOrderUndefined: Self = StObject.set(x, "slotOrder", js.undefined)
    
    @scala.inline
    def setUpdateDayText(value: (/* newDayText */ js.UndefOr[js.Any], /* oldDayText */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "updateDayText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateDayTextUndefined: Self = StObject.set(x, "updateDayText", js.undefined)
    
    @scala.inline
    def setUpdateMonthText(value: (/* newMonthText */ js.UndefOr[js.Any], /* oldMonthText */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "updateMonthText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateMonthTextUndefined: Self = StObject.set(x, "updateMonthText", js.undefined)
    
    @scala.inline
    def setUpdateYearFrom(value: () => Unit): Self = StObject.set(x, "updateYearFrom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateYearFromUndefined: Self = StObject.set(x, "updateYearFrom", js.undefined)
    
    @scala.inline
    def setUpdateYearText(value: /* yearText */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "updateYearText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateYearTextUndefined: Self = StObject.set(x, "updateYearText", js.undefined)
    
    @scala.inline
    def setUpdateYearTo(value: () => Unit): Self = StObject.set(x, "updateYearTo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateYearToUndefined: Self = StObject.set(x, "updateYearTo", js.undefined)
    
    @scala.inline
    def setYearFrom(value: Double): Self = StObject.set(x, "yearFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearFromUndefined: Self = StObject.set(x, "yearFrom", js.undefined)
    
    @scala.inline
    def setYearText(value: java.lang.String): Self = StObject.set(x, "yearText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearTextUndefined: Self = StObject.set(x, "yearText", js.undefined)
    
    @scala.inline
    def setYearTo(value: Double): Self = StObject.set(x, "yearTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearToUndefined: Self = StObject.set(x, "yearTo", js.undefined)
  }
}
