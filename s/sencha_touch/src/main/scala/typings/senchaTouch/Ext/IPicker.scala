package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): IPicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPicker]
  }
  
  @scala.inline
  implicit class IPickerMutableBuilder[Self <: IPicker] (val x: Self) extends AnyVal {
    
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
    def setSetValue(value: (/* values */ js.UndefOr[js.Any], /* animated */ js.UndefOr[Boolean]) => IPicker): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
    
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
