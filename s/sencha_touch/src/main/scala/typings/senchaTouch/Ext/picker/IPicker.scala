package typings.senchaTouch.Ext.picker

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.ISheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPicker extends ISheet {
  
  /** [Config Option] (String) */
  var activeCls: js.UndefOr[String] = js.native
  
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
  var getToolbarPosition: js.UndefOr[js.Function0[String]] = js.native
  
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
  var setToolbarPosition: js.UndefOr[js.Function1[/* toolbarPosition */ js.UndefOr[String], Unit]] = js.native
  
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
  implicit class IPickerOps[Self <: IPicker] (val x: Self) extends AnyVal {
    
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
    def setActiveCls(value: String): Self = this.set("activeCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveCls: Self = this.set("activeCls", js.undefined)
    
    @scala.inline
    def setApplyCancelButton(value: /* config */ js.UndefOr[js.Any] => _): Self = this.set("applyCancelButton", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteApplyCancelButton: Self = this.set("applyCancelButton", js.undefined)
    
    @scala.inline
    def setApplyDoneButton(value: /* config */ js.UndefOr[js.Any] => _): Self = this.set("applyDoneButton", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteApplyDoneButton: Self = this.set("applyDoneButton", js.undefined)
    
    @scala.inline
    def setCancelButton(value: js.Any): Self = this.set("cancelButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelButton: Self = this.set("cancelButton", js.undefined)
    
    @scala.inline
    def setDoneButton(value: js.Any): Self = this.set("doneButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoneButton: Self = this.set("doneButton", js.undefined)
    
    @scala.inline
    def setGetBottom(value: () => Double): Self = this.set("getBottom", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetBottom: Self = this.set("getBottom", js.undefined)
    
    @scala.inline
    def setGetCancelButton(value: () => _): Self = this.set("getCancelButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCancelButton: Self = this.set("getCancelButton", js.undefined)
    
    @scala.inline
    def setGetCard(value: () => _): Self = this.set("getCard", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCard: Self = this.set("getCard", js.undefined)
    
    @scala.inline
    def setGetDoneButton(value: () => _): Self = this.set("getDoneButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDoneButton: Self = this.set("getDoneButton", js.undefined)
    
    @scala.inline
    def setGetLayout(value: () => _): Self = this.set("getLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetLayout: Self = this.set("getLayout", js.undefined)
    
    @scala.inline
    def setGetSlots(value: () => Array): Self = this.set("getSlots", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSlots: Self = this.set("getSlots", js.undefined)
    
    @scala.inline
    def setGetToolbar(value: () => _): Self = this.set("getToolbar", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetToolbar: Self = this.set("getToolbar", js.undefined)
    
    @scala.inline
    def setGetToolbarPosition(value: () => String): Self = this.set("getToolbarPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetToolbarPosition: Self = this.set("getToolbarPosition", js.undefined)
    
    @scala.inline
    def setGetUseTitles(value: () => Boolean): Self = this.set("getUseTitles", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetUseTitles: Self = this.set("getUseTitles", js.undefined)
    
    @scala.inline
    def setGetValue(value: /* useDom */ js.UndefOr[js.Any] => _): Self = this.set("getValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetValue: Self = this.set("getValue", js.undefined)
    
    @scala.inline
    def setGetValues(value: () => _): Self = this.set("getValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetValues: Self = this.set("getValues", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setSetBottom(value: /* bottom */ js.UndefOr[Double] => Unit): Self = this.set("setBottom", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetBottom: Self = this.set("setBottom", js.undefined)
    
    @scala.inline
    def setSetCancelButton(value: /* cancelButton */ js.UndefOr[js.Any] => Unit): Self = this.set("setCancelButton", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetCancelButton: Self = this.set("setCancelButton", js.undefined)
    
    @scala.inline
    def setSetCard(value: /* activeItem */ js.UndefOr[js.Any] => Unit): Self = this.set("setCard", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetCard: Self = this.set("setCard", js.undefined)
    
    @scala.inline
    def setSetDoneButton(value: /* doneButton */ js.UndefOr[js.Any] => Unit): Self = this.set("setDoneButton", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDoneButton: Self = this.set("setDoneButton", js.undefined)
    
    @scala.inline
    def setSetHeight(value: /* height */ js.UndefOr[Double] => Unit): Self = this.set("setHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetHeight: Self = this.set("setHeight", js.undefined)
    
    @scala.inline
    def setSetLeft(value: /* left */ js.UndefOr[Double] => Unit): Self = this.set("setLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetLeft: Self = this.set("setLeft", js.undefined)
    
    @scala.inline
    def setSetRight(value: /* right */ js.UndefOr[Double] => Unit): Self = this.set("setRight", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetRight: Self = this.set("setRight", js.undefined)
    
    @scala.inline
    def setSetSlots(value: /* slots */ js.UndefOr[Array] => Unit): Self = this.set("setSlots", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetSlots: Self = this.set("setSlots", js.undefined)
    
    @scala.inline
    def setSetToolbar(value: /* toolbar */ js.UndefOr[js.Any] => Unit): Self = this.set("setToolbar", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetToolbar: Self = this.set("setToolbar", js.undefined)
    
    @scala.inline
    def setSetToolbarPosition(value: /* toolbarPosition */ js.UndefOr[String] => Unit): Self = this.set("setToolbarPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetToolbarPosition: Self = this.set("setToolbarPosition", js.undefined)
    
    @scala.inline
    def setSetUseTitles(value: /* useTitles */ js.UndefOr[Boolean] => Unit): Self = this.set("setUseTitles", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetUseTitles: Self = this.set("setUseTitles", js.undefined)
    
    @scala.inline
    def setSetValue(value: (/* values */ js.UndefOr[js.Any], /* animated */ js.UndefOr[Boolean]) => IPicker): Self = this.set("setValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
    
    @scala.inline
    def setSlots(value: Array): Self = this.set("slots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlots: Self = this.set("slots", js.undefined)
    
    @scala.inline
    def setToolbar(value: js.Any): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    
    @scala.inline
    def setUseTitles(value: Boolean): Self = this.set("useTitles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseTitles: Self = this.set("useTitles", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
