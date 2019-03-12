package typings
package senchaUnderscoreTouchLib.ExtNs.dataviewNs.componentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataItem
  extends senchaUnderscoreTouchLib.ExtNs.IContainer {
  /** [Config Option] (Object) */
  var dataMap: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of dataMap
  		* @returns Object
  		*/
  var getDataMap: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of itemCls
  		* @returns String
  		*/
  var getItemCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of items
  		* @returns Array
  		*/
  @JSName("getItems")
  var getItems_IDataItem: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Config Option] (String) */
  var itemCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of dataMap
  		* @param dataMap Object The new value.
  		*/
  var setDataMap: js.UndefOr[js.Function1[/* dataMap */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of itemCls
  		* @param itemCls String The new value.
  		*/
  var setItemCls: js.UndefOr[js.Function1[/* itemCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of items
  		* @param items Array The new value.
  		*/
  @JSName("setItems")
  var setItems_IDataItem: js.UndefOr[
    js.Function1[/* items */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of width
  		* @param width String The new value.
  		*/
  @JSName("setWidth")
  var setWidth_IDataItem: js.UndefOr[js.Function1[/* width */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
}

object IDataItem {
  @scala.inline
  def apply(
    IContainer: senchaUnderscoreTouchLib.ExtNs.IContainer = null,
    baseCls: java.lang.String = null,
    dataMap: js.Any = null,
    defaultType: java.lang.String = null,
    getBaseCls: () => java.lang.String = null,
    getDataMap: () => _ = null,
    getDefaultType: () => java.lang.String = null,
    getItemCls: () => java.lang.String = null,
    getItems: () => senchaUnderscoreTouchLib.ExtNs.Array = null,
    getRecord: () => senchaUnderscoreTouchLib.ExtNs.dataNs.IModel = null,
    itemCls: java.lang.String = null,
    items: js.Any = null,
    record: senchaUnderscoreTouchLib.ExtNs.dataNs.IModel = null,
    setBaseCls: /* baseCls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setDataMap: /* dataMap */ js.UndefOr[js.Any] => scala.Unit = null,
    setDefaultType: /* defaultType */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setItemCls: /* itemCls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setItems: /* items */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] => scala.Unit = null,
    setRecord: /* record */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IModel] => scala.Unit = null,
    setWidth: /* width */ js.UndefOr[java.lang.String] => scala.Unit = null,
    width: js.Any = null
  ): IDataItem = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (dataMap != null) __obj.updateDynamic("dataMap")(dataMap)
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(js.Any.fromFunction0(getBaseCls))
    if (getDataMap != null) __obj.updateDynamic("getDataMap")(js.Any.fromFunction0(getDataMap))
    if (getDefaultType != null) __obj.updateDynamic("getDefaultType")(js.Any.fromFunction0(getDefaultType))
    if (getItemCls != null) __obj.updateDynamic("getItemCls")(js.Any.fromFunction0(getItemCls))
    if (getItems != null) __obj.updateDynamic("getItems")(js.Any.fromFunction0(getItems))
    if (getRecord != null) __obj.updateDynamic("getRecord")(js.Any.fromFunction0(getRecord))
    if (itemCls != null) __obj.updateDynamic("itemCls")(itemCls)
    if (items != null) __obj.updateDynamic("items")(items)
    if (record != null) __obj.updateDynamic("record")(record)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(js.Any.fromFunction1(setBaseCls))
    if (setDataMap != null) __obj.updateDynamic("setDataMap")(js.Any.fromFunction1(setDataMap))
    if (setDefaultType != null) __obj.updateDynamic("setDefaultType")(js.Any.fromFunction1(setDefaultType))
    if (setItemCls != null) __obj.updateDynamic("setItemCls")(js.Any.fromFunction1(setItemCls))
    if (setItems != null) __obj.updateDynamic("setItems")(js.Any.fromFunction1(setItems))
    if (setRecord != null) __obj.updateDynamic("setRecord")(js.Any.fromFunction1(setRecord))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1(setWidth))
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[IDataItem]
  }
}

