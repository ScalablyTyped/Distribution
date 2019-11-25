package typings.senchaUnderscoreTouch.Ext.picker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISlot
  extends typings.senchaUnderscoreTouch.Ext.dataview.IDataView {
  /** [Config Option] (String) */
  var align: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Looks at the data configuration and turns it into store
  		* @param data Object
  		* @returns Object
  		*/
  var applyData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Sets the title for this dataview by creating element
  		* @param title String
  		* @returns String
  		*/
  var applyTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], java.lang.String]] = js.undefined
  /** [Config Option] (String) */
  var displayField: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of align
  		* @returns String
  		*/
  var getAlign: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of displayField
  		* @returns String
  		*/
  var getDisplayField: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of name
  		* @returns String
  		*/
  var getName: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of title
  		* @returns String
  		*/
  var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of valueField
  		* @returns String
  		*/
  var getValueField: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (String) */
  @JSName("itemTpl")
  var itemTpl_ISlot: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of align
  		* @param align String The new value.
  		*/
  var setAlign: js.UndefOr[js.Function1[/* align */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of displayField
  		* @param displayField String The new value.
  		*/
  var setDisplayField: js.UndefOr[js.Function1[/* displayField */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of itemTpl
  		* @param itemTpl String The new value.
  		*/
  @JSName("setItemTpl")
  var setItemTpl_ISlot: js.UndefOr[js.Function1[/* itemTpl */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of name
  		* @param name String The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of title
  		* @param title String The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of valueField
  		* @param valueField String The new value.
  		*/
  var setValueField: js.UndefOr[js.Function1[/* valueField */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Updates the align configuration
  		* @param newAlign Object
  		* @param oldAlign Object
  		*/
  var updateAlign: js.UndefOr[
    js.Function2[/* newAlign */ js.UndefOr[js.Any], /* oldAlign */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Config Option] (Number) */
  var value: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var valueField: js.UndefOr[java.lang.String] = js.undefined
}

object ISlot {
  @scala.inline
  def apply(
    IDataView: typings.senchaUnderscoreTouch.Ext.dataview.IDataView = null,
    align: java.lang.String = null,
    applyData: /* data */ js.UndefOr[js.Any] => _ = null,
    applyTitle: /* title */ js.UndefOr[java.lang.String] => java.lang.String = null,
    displayField: java.lang.String = null,
    getAlign: () => java.lang.String = null,
    getDisplayField: () => java.lang.String = null,
    getName: () => java.lang.String = null,
    getTitle: () => java.lang.String = null,
    getValueField: () => java.lang.String = null,
    itemTpl: java.lang.String = null,
    name: java.lang.String = null,
    setAlign: /* align */ js.UndefOr[java.lang.String] => Unit = null,
    setDisplayField: /* displayField */ js.UndefOr[java.lang.String] => Unit = null,
    setItemTpl: /* itemTpl */ js.UndefOr[java.lang.String] => Unit = null,
    setName: /* name */ js.UndefOr[java.lang.String] => Unit = null,
    setTitle: /* title */ js.UndefOr[java.lang.String] => Unit = null,
    setValueField: /* valueField */ js.UndefOr[java.lang.String] => Unit = null,
    title: java.lang.String = null,
    updateAlign: (/* newAlign */ js.UndefOr[js.Any], /* oldAlign */ js.UndefOr[js.Any]) => Unit = null,
    value: Int | Double = null,
    valueField: java.lang.String = null
  ): ISlot = {
    val __obj = js.Dynamic.literal()
    if (IDataView != null) js.Dynamic.global.Object.assign(__obj, IDataView)
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (applyData != null) __obj.updateDynamic("applyData")(js.Any.fromFunction1(applyData))
    if (applyTitle != null) __obj.updateDynamic("applyTitle")(js.Any.fromFunction1(applyTitle))
    if (displayField != null) __obj.updateDynamic("displayField")(displayField.asInstanceOf[js.Any])
    if (getAlign != null) __obj.updateDynamic("getAlign")(js.Any.fromFunction0(getAlign))
    if (getDisplayField != null) __obj.updateDynamic("getDisplayField")(js.Any.fromFunction0(getDisplayField))
    if (getName != null) __obj.updateDynamic("getName")(js.Any.fromFunction0(getName))
    if (getTitle != null) __obj.updateDynamic("getTitle")(js.Any.fromFunction0(getTitle))
    if (getValueField != null) __obj.updateDynamic("getValueField")(js.Any.fromFunction0(getValueField))
    if (itemTpl != null) __obj.updateDynamic("itemTpl")(itemTpl.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (setAlign != null) __obj.updateDynamic("setAlign")(js.Any.fromFunction1(setAlign))
    if (setDisplayField != null) __obj.updateDynamic("setDisplayField")(js.Any.fromFunction1(setDisplayField))
    if (setItemTpl != null) __obj.updateDynamic("setItemTpl")(js.Any.fromFunction1(setItemTpl))
    if (setName != null) __obj.updateDynamic("setName")(js.Any.fromFunction1(setName))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (setValueField != null) __obj.updateDynamic("setValueField")(js.Any.fromFunction1(setValueField))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updateAlign != null) __obj.updateDynamic("updateAlign")(js.Any.fromFunction2(updateAlign))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISlot]
  }
}

