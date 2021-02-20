package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object picker {
  
  @js.native
  trait IDate
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
    var setValue_IDate: js.UndefOr[
        js.Function2[
          /* value */ js.UndefOr[js.Any], 
          /* animated */ js.UndefOr[js.Any], 
          typings.senchaTouch.Ext.IPicker
        ]
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
  object IDate {
    
    @scala.inline
    def apply(): typings.senchaTouch.Ext.picker.IDate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.picker.IDate]
    }
    
    @scala.inline
    implicit class IDateMutableBuilder[Self <: typings.senchaTouch.Ext.picker.IDate] (val x: Self) extends AnyVal {
      
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
      def setSetValue(
        value: (/* value */ js.UndefOr[js.Any], /* animated */ js.UndefOr[js.Any]) => typings.senchaTouch.Ext.IPicker
      ): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
      
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
  
  @js.native
  trait IPicker extends ISheet {
    
    /** [Config Option] (String) */
    var activeCls: js.UndefOr[java.lang.String] = js.native
    
    /** [Method] Updates the cancelButton configuration
      * @param config Object
      * @returns Object
      */
    var applyCancelButton: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], _]] = js.native
    
    /** [Method] Updates the doneButton configuration
      * @param config Object
      * @returns Object
      */
    var applyDoneButton: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], _]] = js.native
    
    /** [Config Option] (String/Mixed) */
    var cancelButton: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (String/Mixed) */
    var doneButton: js.UndefOr[js.Any] = js.native
    
    /** [Method] Returns the value of bottom
      * @returns Number
      */
    @JSName("getBottom")
    var getBottom_IPicker: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Returns the value of cancelButton
      * @returns String/Mixed
      */
    var getCancelButton: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of activeItem
      * @returns Object/String/Number
      */
    var getCard: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of doneButton
      * @returns String/Mixed
      */
    var getDoneButton: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of layout
      * @returns Object
      */
    var getLayout: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of slots
      * @returns Array
      */
    var getSlots: js.UndefOr[js.Function0[Array]] = js.native
    
    /** [Method] Returns the value of toolbar
      * @returns Ext.TitleBar/Ext.Toolbar/Object
      */
    var getToolbar: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of toolbarPosition
      * @returns String
      */
    var getToolbarPosition: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
    /** [Method] Returns the value of useTitles
      * @returns Boolean
      */
    var getUseTitles: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Returns the values of each of the pickers slots
      * @param useDom Object
      * @returns Object The values of the pickers slots
      */
    var getValue: js.UndefOr[js.Function1[/* useDom */ js.UndefOr[js.Any], _]] = js.native
    
    /** [Method] Returns the values of each of the pickers slots
      * @returns Object The values of the pickers slots.
      */
    var getValues: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Config Option] (Number) */
    @JSName("height")
    var height_IPicker: js.UndefOr[Double] = js.native
    
    /** [Method] Sets the value of bottom
      * @param bottom Number The new value.
      */
    @JSName("setBottom")
    var setBottom_IPicker: js.UndefOr[js.Function1[/* bottom */ js.UndefOr[Double], Unit]] = js.native
    
    /** [Method] Sets the value of cancelButton
      * @param cancelButton String/Mixed The new value.
      */
    var setCancelButton: js.UndefOr[js.Function1[/* cancelButton */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of activeItem
      * @param activeItem Object/String/Number The new value.
      */
    var setCard: js.UndefOr[js.Function1[/* activeItem */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of doneButton
      * @param doneButton String/Mixed The new value.
      */
    var setDoneButton: js.UndefOr[js.Function1[/* doneButton */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of height
      * @param height Number The new value.
      */
    @JSName("setHeight")
    var setHeight_IPicker: js.UndefOr[js.Function1[/* height */ js.UndefOr[Double], Unit]] = js.native
    
    /** [Method] Sets the value of left
      * @param left Number The new value.
      */
    @JSName("setLeft")
    var setLeft_IPicker: js.UndefOr[js.Function1[/* left */ js.UndefOr[Double], Unit]] = js.native
    
    /** [Method] Sets the value of right
      * @param right Number The new value.
      */
    @JSName("setRight")
    var setRight_IPicker: js.UndefOr[js.Function1[/* right */ js.UndefOr[Double], Unit]] = js.native
    
    /** [Method] Sets the value of slots
      * @param slots Array The new value.
      */
    var setSlots: js.UndefOr[js.Function1[/* slots */ js.UndefOr[Array], Unit]] = js.native
    
    /** [Method] Sets the value of toolbar
      * @param toolbar Ext.TitleBar/Ext.Toolbar/Object The new value.
      */
    var setToolbar: js.UndefOr[js.Function1[/* toolbar */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of toolbarPosition
      * @param toolbarPosition String The new value.
      */
    var setToolbarPosition: js.UndefOr[js.Function1[/* toolbarPosition */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the value of useTitles
      * @param useTitles Boolean The new value.
      */
    var setUseTitles: js.UndefOr[js.Function1[/* useTitles */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Sets the values of the pickers slots
      * @param values Object The values in a {name:'value'} format.
      * @param animated Boolean true to animate setting the values.
      * @returns Ext.Picker this This picker.
      */
    var setValue: js.UndefOr[
        js.Function2[/* values */ js.UndefOr[js.Any], /* animated */ js.UndefOr[Boolean], this.type]
      ] = js.native
    
    /** [Config Option] (Array) */
    var slots: js.UndefOr[Array] = js.native
    
    /** [Config Option] (Ext.TitleBar/Ext.Toolbar/Object) */
    var toolbar: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Boolean) */
    var useTitles: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String/Number) */
    var value: js.UndefOr[js.Any] = js.native
  }
  object IPicker {
    
    @scala.inline
    def apply(): typings.senchaTouch.Ext.picker.IPicker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.picker.IPicker]
    }
    
    @scala.inline
    implicit class IPickerMutableBuilder[Self <: typings.senchaTouch.Ext.picker.IPicker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveCls(value: java.lang.String): Self = StObject.set(x, "activeCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveClsUndefined: Self = StObject.set(x, "activeCls", js.undefined)
      
      @scala.inline
      def setApplyCancelButton(value: /* config */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "applyCancelButton", js.Any.fromFunction1(value))
      
      @scala.inline
      def setApplyCancelButtonUndefined: Self = StObject.set(x, "applyCancelButton", js.undefined)
      
      @scala.inline
      def setApplyDoneButton(value: /* config */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "applyDoneButton", js.Any.fromFunction1(value))
      
      @scala.inline
      def setApplyDoneButtonUndefined: Self = StObject.set(x, "applyDoneButton", js.undefined)
      
      @scala.inline
      def setCancelButton(value: js.Any): Self = StObject.set(x, "cancelButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelButtonUndefined: Self = StObject.set(x, "cancelButton", js.undefined)
      
      @scala.inline
      def setDoneButton(value: js.Any): Self = StObject.set(x, "doneButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoneButtonUndefined: Self = StObject.set(x, "doneButton", js.undefined)
      
      @scala.inline
      def setGetBottom(value: () => Double): Self = StObject.set(x, "getBottom", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBottomUndefined: Self = StObject.set(x, "getBottom", js.undefined)
      
      @scala.inline
      def setGetCancelButton(value: () => _): Self = StObject.set(x, "getCancelButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCancelButtonUndefined: Self = StObject.set(x, "getCancelButton", js.undefined)
      
      @scala.inline
      def setGetCard(value: () => _): Self = StObject.set(x, "getCard", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCardUndefined: Self = StObject.set(x, "getCard", js.undefined)
      
      @scala.inline
      def setGetDoneButton(value: () => _): Self = StObject.set(x, "getDoneButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDoneButtonUndefined: Self = StObject.set(x, "getDoneButton", js.undefined)
      
      @scala.inline
      def setGetLayout(value: () => _): Self = StObject.set(x, "getLayout", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLayoutUndefined: Self = StObject.set(x, "getLayout", js.undefined)
      
      @scala.inline
      def setGetSlots(value: () => Array): Self = StObject.set(x, "getSlots", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSlotsUndefined: Self = StObject.set(x, "getSlots", js.undefined)
      
      @scala.inline
      def setGetToolbar(value: () => _): Self = StObject.set(x, "getToolbar", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetToolbarPosition(value: () => java.lang.String): Self = StObject.set(x, "getToolbarPosition", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetToolbarPositionUndefined: Self = StObject.set(x, "getToolbarPosition", js.undefined)
      
      @scala.inline
      def setGetToolbarUndefined: Self = StObject.set(x, "getToolbar", js.undefined)
      
      @scala.inline
      def setGetUseTitles(value: () => Boolean): Self = StObject.set(x, "getUseTitles", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUseTitlesUndefined: Self = StObject.set(x, "getUseTitles", js.undefined)
      
      @scala.inline
      def setGetValue(value: /* useDom */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
      
      @scala.inline
      def setGetValues(value: () => _): Self = StObject.set(x, "getValues", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValuesUndefined: Self = StObject.set(x, "getValues", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setSetBottom(value: /* bottom */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setBottom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetBottomUndefined: Self = StObject.set(x, "setBottom", js.undefined)
      
      @scala.inline
      def setSetCancelButton(value: /* cancelButton */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setCancelButton", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetCancelButtonUndefined: Self = StObject.set(x, "setCancelButton", js.undefined)
      
      @scala.inline
      def setSetCard(value: /* activeItem */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setCard", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetCardUndefined: Self = StObject.set(x, "setCard", js.undefined)
      
      @scala.inline
      def setSetDoneButton(value: /* doneButton */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setDoneButton", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDoneButtonUndefined: Self = StObject.set(x, "setDoneButton", js.undefined)
      
      @scala.inline
      def setSetHeight(value: /* height */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHeightUndefined: Self = StObject.set(x, "setHeight", js.undefined)
      
      @scala.inline
      def setSetLeft(value: /* left */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setLeft", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetLeftUndefined: Self = StObject.set(x, "setLeft", js.undefined)
      
      @scala.inline
      def setSetRight(value: /* right */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetRightUndefined: Self = StObject.set(x, "setRight", js.undefined)
      
      @scala.inline
      def setSetSlots(value: /* slots */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setSlots", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSlotsUndefined: Self = StObject.set(x, "setSlots", js.undefined)
      
      @scala.inline
      def setSetToolbar(value: /* toolbar */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setToolbar", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetToolbarPosition(value: /* toolbarPosition */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setToolbarPosition", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetToolbarPositionUndefined: Self = StObject.set(x, "setToolbarPosition", js.undefined)
      
      @scala.inline
      def setSetToolbarUndefined: Self = StObject.set(x, "setToolbar", js.undefined)
      
      @scala.inline
      def setSetUseTitles(value: /* useTitles */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUseTitles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetUseTitlesUndefined: Self = StObject.set(x, "setUseTitles", js.undefined)
      
      @scala.inline
      def setSetValue(
        value: (/* values */ js.UndefOr[js.Any], /* animated */ js.UndefOr[Boolean]) => typings.senchaTouch.Ext.picker.IPicker
      ): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
      
      @scala.inline
      def setSlots(value: Array): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
      
      @scala.inline
      def setToolbar(value: js.Any): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
      
      @scala.inline
      def setUseTitles(value: Boolean): Self = StObject.set(x, "useTitles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTitlesUndefined: Self = StObject.set(x, "useTitles", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait ISlot
    extends typings.senchaTouch.Ext.dataview.IDataView {
    
    /** [Config Option] (String) */
    var align: js.UndefOr[java.lang.String] = js.native
    
    /** [Method] Looks at the data configuration and turns it into store
      * @param data Object
      * @returns Object
      */
    var applyData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], _]] = js.native
    
    /** [Method] Sets the title for this dataview by creating element
      * @param title String
      * @returns String
      */
    var applyTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], java.lang.String]] = js.native
    
    /** [Config Option] (String) */
    var displayField: js.UndefOr[java.lang.String] = js.native
    
    /** [Method] Returns the value of align
      * @returns String
      */
    var getAlign: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
    /** [Method] Returns the value of displayField
      * @returns String
      */
    var getDisplayField: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
    /** [Method] Returns the value of name
      * @returns String
      */
    var getName: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
    /** [Method] Returns the value of title
      * @returns String
      */
    var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
    /** [Method] Returns the value of valueField
      * @returns String
      */
    var getValueField: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
    /** [Config Option] (String) */
    @JSName("itemTpl")
    var itemTpl_ISlot: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var name: js.UndefOr[java.lang.String] = js.native
    
    /** [Method] Sets the value of align
      * @param align String The new value.
      */
    var setAlign: js.UndefOr[js.Function1[/* align */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the value of displayField
      * @param displayField String The new value.
      */
    var setDisplayField: js.UndefOr[js.Function1[/* displayField */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the value of itemTpl
      * @param itemTpl String The new value.
      */
    @JSName("setItemTpl")
    var setItemTpl_ISlot: js.UndefOr[js.Function1[/* itemTpl */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the value of name
      * @param name String The new value.
      */
    var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the value of title
      * @param title String The new value.
      */
    var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the value of valueField
      * @param valueField String The new value.
      */
    var setValueField: js.UndefOr[js.Function1[/* valueField */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Config Option] (String) */
    var title: js.UndefOr[java.lang.String] = js.native
    
    /** [Method] Updates the align configuration
      * @param newAlign Object
      * @param oldAlign Object
      */
    var updateAlign: js.UndefOr[
        js.Function2[/* newAlign */ js.UndefOr[js.Any], /* oldAlign */ js.UndefOr[js.Any], Unit]
      ] = js.native
    
    /** [Config Option] (Number) */
    var value: js.UndefOr[Double] = js.native
    
    /** [Config Option] (String) */
    var valueField: js.UndefOr[java.lang.String] = js.native
  }
  object ISlot {
    
    @scala.inline
    def apply(): ISlot = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISlot]
    }
    
    @scala.inline
    implicit class ISlotMutableBuilder[Self <: ISlot] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: java.lang.String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setApplyData(value: /* data */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "applyData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setApplyDataUndefined: Self = StObject.set(x, "applyData", js.undefined)
      
      @scala.inline
      def setApplyTitle(value: /* title */ js.UndefOr[java.lang.String] => java.lang.String): Self = StObject.set(x, "applyTitle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setApplyTitleUndefined: Self = StObject.set(x, "applyTitle", js.undefined)
      
      @scala.inline
      def setDisplayField(value: java.lang.String): Self = StObject.set(x, "displayField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayFieldUndefined: Self = StObject.set(x, "displayField", js.undefined)
      
      @scala.inline
      def setGetAlign(value: () => java.lang.String): Self = StObject.set(x, "getAlign", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAlignUndefined: Self = StObject.set(x, "getAlign", js.undefined)
      
      @scala.inline
      def setGetDisplayField(value: () => java.lang.String): Self = StObject.set(x, "getDisplayField", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDisplayFieldUndefined: Self = StObject.set(x, "getDisplayField", js.undefined)
      
      @scala.inline
      def setGetName(value: () => java.lang.String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNameUndefined: Self = StObject.set(x, "getName", js.undefined)
      
      @scala.inline
      def setGetTitle(value: () => java.lang.String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTitleUndefined: Self = StObject.set(x, "getTitle", js.undefined)
      
      @scala.inline
      def setGetValueField(value: () => java.lang.String): Self = StObject.set(x, "getValueField", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValueFieldUndefined: Self = StObject.set(x, "getValueField", js.undefined)
      
      @scala.inline
      def setItemTpl(value: java.lang.String): Self = StObject.set(x, "itemTpl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTplUndefined: Self = StObject.set(x, "itemTpl", js.undefined)
      
      @scala.inline
      def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSetAlign(value: /* align */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setAlign", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetAlignUndefined: Self = StObject.set(x, "setAlign", js.undefined)
      
      @scala.inline
      def setSetDisplayField(value: /* displayField */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setDisplayField", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDisplayFieldUndefined: Self = StObject.set(x, "setDisplayField", js.undefined)
      
      @scala.inline
      def setSetItemTpl(value: /* itemTpl */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setItemTpl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetItemTplUndefined: Self = StObject.set(x, "setItemTpl", js.undefined)
      
      @scala.inline
      def setSetName(value: /* name */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetNameUndefined: Self = StObject.set(x, "setName", js.undefined)
      
      @scala.inline
      def setSetTitle(value: /* title */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
      
      @scala.inline
      def setSetValueField(value: /* valueField */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setValueField", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetValueFieldUndefined: Self = StObject.set(x, "setValueField", js.undefined)
      
      @scala.inline
      def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUpdateAlign(value: (/* newAlign */ js.UndefOr[js.Any], /* oldAlign */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "updateAlign", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdateAlignUndefined: Self = StObject.set(x, "updateAlign", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueField(value: java.lang.String): Self = StObject.set(x, "valueField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueFieldUndefined: Self = StObject.set(x, "valueField", js.undefined)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
