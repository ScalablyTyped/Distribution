package typings
package senchaUnderscoreTouchLib.ExtNs.pickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISlot
  extends senchaUnderscoreTouchLib.ExtNs.dataviewNs.IDataView {
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
  var setAlign: js.UndefOr[js.Function1[/* align */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of displayField
  		* @param displayField String The new value.
  		*/
  var setDisplayField: js.UndefOr[js.Function1[/* displayField */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of itemTpl
  		* @param itemTpl String The new value.
  		*/
  @JSName("setItemTpl")
  var setItemTpl_ISlot: js.UndefOr[js.Function1[/* itemTpl */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of name
  		* @param name String The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of title
  		* @param title String The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of valueField
  		* @param valueField String The new value.
  		*/
  var setValueField: js.UndefOr[js.Function1[/* valueField */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Updates the align configuration
  		* @param newAlign Object
  		* @param oldAlign Object
  		*/
  var updateAlign: js.UndefOr[
    js.Function2[/* newAlign */ js.UndefOr[js.Any], /* oldAlign */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Number) */
  var value: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var valueField: js.UndefOr[java.lang.String] = js.undefined
}

object ISlot {
  @scala.inline
  def apply(
    IDataView: senchaUnderscoreTouchLib.ExtNs.dataviewNs.IDataView = null,
    align: java.lang.String = null,
    applyData: js.Function1[/* data */ js.UndefOr[js.Any], _] = null,
    applyTitle: js.Function1[/* title */ js.UndefOr[java.lang.String], java.lang.String] = null,
    displayField: java.lang.String = null,
    getAlign: js.Function0[java.lang.String] = null,
    getDisplayField: js.Function0[java.lang.String] = null,
    getName: js.Function0[java.lang.String] = null,
    getTitle: js.Function0[java.lang.String] = null,
    getValueField: js.Function0[java.lang.String] = null,
    itemTpl: java.lang.String = null,
    name: java.lang.String = null,
    setAlign: js.Function1[/* align */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setDisplayField: js.Function1[/* displayField */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setItemTpl: js.Function1[/* itemTpl */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setName: js.Function1[/* name */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setTitle: js.Function1[/* title */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setValueField: js.Function1[/* valueField */ js.UndefOr[java.lang.String], scala.Unit] = null,
    title: java.lang.String = null,
    updateAlign: js.Function2[/* newAlign */ js.UndefOr[js.Any], /* oldAlign */ js.UndefOr[js.Any], scala.Unit] = null,
    value: scala.Int | scala.Double = null,
    valueField: java.lang.String = null
  ): ISlot = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IDataView)
    if (align != null) __obj.updateDynamic("align")(align)
    if (applyData != null) __obj.updateDynamic("applyData")(applyData)
    if (applyTitle != null) __obj.updateDynamic("applyTitle")(applyTitle)
    if (displayField != null) __obj.updateDynamic("displayField")(displayField)
    if (getAlign != null) __obj.updateDynamic("getAlign")(getAlign)
    if (getDisplayField != null) __obj.updateDynamic("getDisplayField")(getDisplayField)
    if (getName != null) __obj.updateDynamic("getName")(getName)
    if (getTitle != null) __obj.updateDynamic("getTitle")(getTitle)
    if (getValueField != null) __obj.updateDynamic("getValueField")(getValueField)
    if (itemTpl != null) __obj.updateDynamic("itemTpl")(itemTpl)
    if (name != null) __obj.updateDynamic("name")(name)
    if (setAlign != null) __obj.updateDynamic("setAlign")(setAlign)
    if (setDisplayField != null) __obj.updateDynamic("setDisplayField")(setDisplayField)
    if (setItemTpl != null) __obj.updateDynamic("setItemTpl")(setItemTpl)
    if (setName != null) __obj.updateDynamic("setName")(setName)
    if (setTitle != null) __obj.updateDynamic("setTitle")(setTitle)
    if (setValueField != null) __obj.updateDynamic("setValueField")(setValueField)
    if (title != null) __obj.updateDynamic("title")(title)
    if (updateAlign != null) __obj.updateDynamic("updateAlign")(updateAlign)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField)
    __obj.asInstanceOf[ISlot]
  }
}

