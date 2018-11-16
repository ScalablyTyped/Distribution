package typings
package senchaUnderscoreTouchLib.ExtNs.pickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPicker
  extends senchaUnderscoreTouchLib.ExtNs.ISheet {
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
  var getBottom_IPicker: js.UndefOr[js.Function0[scala.Double]] = js.undefined
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
  var getSlots: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
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
  var getUseTitles: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
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
  var height_IPicker: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Sets the value of bottom
  		* @param bottom Number The new value.
  		*/
  @JSName("setBottom")
  var setBottom_IPicker: js.UndefOr[js.Function1[/* bottom */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of cancelButton
  		* @param cancelButton String/Mixed The new value.
  		*/
  var setCancelButton: js.UndefOr[js.Function1[/* cancelButton */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of activeItem
  		* @param activeItem Object/String/Number The new value.
  		*/
  var setCard: js.UndefOr[js.Function1[/* activeItem */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of doneButton
  		* @param doneButton String/Mixed The new value.
  		*/
  var setDoneButton: js.UndefOr[js.Function1[/* doneButton */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of height
  		* @param height Number The new value.
  		*/
  @JSName("setHeight")
  var setHeight_IPicker: js.UndefOr[js.Function1[/* height */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of left
  		* @param left Number The new value.
  		*/
  @JSName("setLeft")
  var setLeft_IPicker: js.UndefOr[js.Function1[/* left */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of right
  		* @param right Number The new value.
  		*/
  @JSName("setRight")
  var setRight_IPicker: js.UndefOr[js.Function1[/* right */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of slots
  		* @param slots Array The new value.
  		*/
  var setSlots: js.UndefOr[
    js.Function1[/* slots */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of toolbar
  		* @param toolbar Ext.TitleBar/Ext.Toolbar/Object The new value.
  		*/
  var setToolbar: js.UndefOr[js.Function1[/* toolbar */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of toolbarPosition
  		* @param toolbarPosition String The new value.
  		*/
  var setToolbarPosition: js.UndefOr[js.Function1[/* toolbarPosition */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of useTitles
  		* @param useTitles Boolean The new value.
  		*/
  var setUseTitles: js.UndefOr[js.Function1[/* useTitles */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the values of the pickers slots
  		* @param values Object The values in a {name:'value'} format.
  		* @param animated Boolean true to animate setting the values.
  		* @returns Ext.Picker this This picker.
  		*/
  var setValue: js.UndefOr[
    js.Function2[/* values */ js.UndefOr[js.Any], /* animated */ js.UndefOr[scala.Boolean], this.type]
  ] = js.undefined
  /** [Config Option] (Array) */
  var slots: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Ext.TitleBar/Ext.Toolbar/Object) */
  var toolbar: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var useTitles: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String/Number) */
  var value: js.UndefOr[js.Any] = js.undefined
}

