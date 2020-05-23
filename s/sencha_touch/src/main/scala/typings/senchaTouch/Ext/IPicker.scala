package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPicker extends ISheet {
  /** [Config Option] (String) */
  var activeCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Updates the cancelButton configuration
    * @param config Object
    * @returns Object
    */
  var applyCancelButton: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Updates the doneButton configuration
    * @param config Object
    * @returns Object
    */
  var applyDoneButton: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (String/Mixed) */
  var cancelButton: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Mixed) */
  var doneButton: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of bottom
    * @returns Number
    */
  @JSName("getBottom")
  var getBottom_IPicker: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of cancelButton
    * @returns String/Mixed
    */
  var getCancelButton: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of activeItem
    * @returns Object/String/Number
    */
  var getCard: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of doneButton
    * @returns String/Mixed
    */
  var getDoneButton: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of layout
    * @returns Object
    */
  var getLayout: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of slots
    * @returns Array
    */
  var getSlots: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of toolbar
    * @returns Ext.TitleBar/Ext.Toolbar/Object
    */
  var getToolbar: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of toolbarPosition
    * @returns String
    */
  var getToolbarPosition: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of useTitles
    * @returns Boolean
    */
  var getUseTitles: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the values of each of the pickers slots
    * @param useDom Object
    * @returns Object The values of the pickers slots
    */
  var getValue: js.UndefOr[js.Function1[/* useDom */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the values of each of the pickers slots
    * @returns Object The values of the pickers slots.
    */
  var getValues: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Number) */
  @JSName("height")
  var height_IPicker: js.UndefOr[Double] = js.undefined
  /** [Method] Sets the value of bottom
    * @param bottom Number The new value.
    */
  @JSName("setBottom")
  var setBottom_IPicker: js.UndefOr[js.Function1[/* bottom */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of cancelButton
    * @param cancelButton String/Mixed The new value.
    */
  var setCancelButton: js.UndefOr[js.Function1[/* cancelButton */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of activeItem
    * @param activeItem Object/String/Number The new value.
    */
  var setCard: js.UndefOr[js.Function1[/* activeItem */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of doneButton
    * @param doneButton String/Mixed The new value.
    */
  var setDoneButton: js.UndefOr[js.Function1[/* doneButton */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of height
    * @param height Number The new value.
    */
  @JSName("setHeight")
  var setHeight_IPicker: js.UndefOr[js.Function1[/* height */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of left
    * @param left Number The new value.
    */
  @JSName("setLeft")
  var setLeft_IPicker: js.UndefOr[js.Function1[/* left */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of right
    * @param right Number The new value.
    */
  @JSName("setRight")
  var setRight_IPicker: js.UndefOr[js.Function1[/* right */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of slots
    * @param slots Array The new value.
    */
  var setSlots: js.UndefOr[js.Function1[/* slots */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of toolbar
    * @param toolbar Ext.TitleBar/Ext.Toolbar/Object The new value.
    */
  var setToolbar: js.UndefOr[js.Function1[/* toolbar */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of toolbarPosition
    * @param toolbarPosition String The new value.
    */
  var setToolbarPosition: js.UndefOr[js.Function1[/* toolbarPosition */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of useTitles
    * @param useTitles Boolean The new value.
    */
  var setUseTitles: js.UndefOr[js.Function1[/* useTitles */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the values of the pickers slots
    * @param values Object The values in a {name:'value'} format.
    * @param animated Boolean true to animate setting the values.
    * @returns Ext.Picker this This picker.
    */
  var setValue: js.UndefOr[
    js.Function2[/* values */ js.UndefOr[js.Any], /* animated */ js.UndefOr[Boolean], this.type]
  ] = js.undefined
  /** [Config Option] (Array) */
  var slots: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Ext.TitleBar/Ext.Toolbar/Object) */
  var toolbar: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var useTitles: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String/Number) */
  var value: js.UndefOr[js.Any] = js.undefined
}

object IPicker {
  @scala.inline
  def apply(
    ISheet: ISheet = null,
    activeCls: java.lang.String = null,
    applyCancelButton: /* config */ js.UndefOr[js.Any] => _ = null,
    applyDoneButton: /* config */ js.UndefOr[js.Any] => _ = null,
    cancelButton: js.Any = null,
    doneButton: js.Any = null,
    getBottom: () => Double = null,
    getCancelButton: () => _ = null,
    getCard: () => _ = null,
    getDoneButton: () => _ = null,
    getLayout: () => _ = null,
    getSlots: () => Array = null,
    getToolbar: () => _ = null,
    getToolbarPosition: () => java.lang.String = null,
    getUseTitles: () => Boolean = null,
    getValue: /* useDom */ js.UndefOr[js.Any] => _ = null,
    getValues: () => _ = null,
    height: js.UndefOr[Double] = js.undefined,
    setBottom: /* bottom */ js.UndefOr[Double] => Unit = null,
    setCancelButton: /* cancelButton */ js.UndefOr[js.Any] => Unit = null,
    setCard: /* activeItem */ js.UndefOr[js.Any] => Unit = null,
    setDoneButton: /* doneButton */ js.UndefOr[js.Any] => Unit = null,
    setHeight: /* height */ js.UndefOr[Double] => Unit = null,
    setLeft: /* left */ js.UndefOr[Double] => Unit = null,
    setRight: /* right */ js.UndefOr[Double] => Unit = null,
    setSlots: /* slots */ js.UndefOr[Array] => Unit = null,
    setToolbar: /* toolbar */ js.UndefOr[js.Any] => Unit = null,
    setToolbarPosition: /* toolbarPosition */ js.UndefOr[java.lang.String] => Unit = null,
    setUseTitles: /* useTitles */ js.UndefOr[Boolean] => Unit = null,
    setValue: (/* values */ js.UndefOr[js.Any], /* animated */ js.UndefOr[Boolean]) => IPicker = null,
    slots: Array = null,
    toolbar: js.Any = null,
    useTitles: js.UndefOr[Boolean] = js.undefined,
    value: js.Any = null
  ): IPicker = {
    val __obj = js.Dynamic.literal()
    if (ISheet != null) js.Dynamic.global.Object.assign(__obj, ISheet)
    if (activeCls != null) __obj.updateDynamic("activeCls")(activeCls.asInstanceOf[js.Any])
    if (applyCancelButton != null) __obj.updateDynamic("applyCancelButton")(js.Any.fromFunction1(applyCancelButton))
    if (applyDoneButton != null) __obj.updateDynamic("applyDoneButton")(js.Any.fromFunction1(applyDoneButton))
    if (cancelButton != null) __obj.updateDynamic("cancelButton")(cancelButton.asInstanceOf[js.Any])
    if (doneButton != null) __obj.updateDynamic("doneButton")(doneButton.asInstanceOf[js.Any])
    if (getBottom != null) __obj.updateDynamic("getBottom")(js.Any.fromFunction0(getBottom))
    if (getCancelButton != null) __obj.updateDynamic("getCancelButton")(js.Any.fromFunction0(getCancelButton))
    if (getCard != null) __obj.updateDynamic("getCard")(js.Any.fromFunction0(getCard))
    if (getDoneButton != null) __obj.updateDynamic("getDoneButton")(js.Any.fromFunction0(getDoneButton))
    if (getLayout != null) __obj.updateDynamic("getLayout")(js.Any.fromFunction0(getLayout))
    if (getSlots != null) __obj.updateDynamic("getSlots")(js.Any.fromFunction0(getSlots))
    if (getToolbar != null) __obj.updateDynamic("getToolbar")(js.Any.fromFunction0(getToolbar))
    if (getToolbarPosition != null) __obj.updateDynamic("getToolbarPosition")(js.Any.fromFunction0(getToolbarPosition))
    if (getUseTitles != null) __obj.updateDynamic("getUseTitles")(js.Any.fromFunction0(getUseTitles))
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction1(getValue))
    if (getValues != null) __obj.updateDynamic("getValues")(js.Any.fromFunction0(getValues))
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (setBottom != null) __obj.updateDynamic("setBottom")(js.Any.fromFunction1(setBottom))
    if (setCancelButton != null) __obj.updateDynamic("setCancelButton")(js.Any.fromFunction1(setCancelButton))
    if (setCard != null) __obj.updateDynamic("setCard")(js.Any.fromFunction1(setCard))
    if (setDoneButton != null) __obj.updateDynamic("setDoneButton")(js.Any.fromFunction1(setDoneButton))
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1(setHeight))
    if (setLeft != null) __obj.updateDynamic("setLeft")(js.Any.fromFunction1(setLeft))
    if (setRight != null) __obj.updateDynamic("setRight")(js.Any.fromFunction1(setRight))
    if (setSlots != null) __obj.updateDynamic("setSlots")(js.Any.fromFunction1(setSlots))
    if (setToolbar != null) __obj.updateDynamic("setToolbar")(js.Any.fromFunction1(setToolbar))
    if (setToolbarPosition != null) __obj.updateDynamic("setToolbarPosition")(js.Any.fromFunction1(setToolbarPosition))
    if (setUseTitles != null) __obj.updateDynamic("setUseTitles")(js.Any.fromFunction1(setUseTitles))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction2(setValue))
    if (slots != null) __obj.updateDynamic("slots")(slots.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (!js.isUndefined(useTitles)) __obj.updateDynamic("useTitles")(useTitles.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPicker]
  }
}

