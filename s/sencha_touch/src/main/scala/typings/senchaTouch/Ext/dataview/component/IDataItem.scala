package typings.senchaTouch.Ext.dataview.component

import typings.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataItem
  extends typings.senchaTouch.Ext.IContainer {
  /** [Config Option] (Object) */
  var dataMap: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of dataMap
    * @returns Object
    */
  var getDataMap: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of itemCls
    * @returns String
    */
  var getItemCls: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of items
    * @returns Array
    */
  @JSName("getItems")
  var getItems_IDataItem: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Config Option] (String) */
  var itemCls: js.UndefOr[String] = js.undefined
  /** [Method] Sets the value of dataMap
    * @param dataMap Object The new value.
    */
  var setDataMap: js.UndefOr[js.Function1[/* dataMap */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of itemCls
    * @param itemCls String The new value.
    */
  var setItemCls: js.UndefOr[js.Function1[/* itemCls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of items
    * @param items Array The new value.
    */
  @JSName("setItems")
  var setItems_IDataItem: js.UndefOr[js.Function1[/* items */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of width
    * @param width String The new value.
    */
  @JSName("setWidth")
  var setWidth_IDataItem: js.UndefOr[js.Function1[/* width */ js.UndefOr[String], Unit]] = js.undefined
}

object IDataItem {
  @scala.inline
  def apply(
    IContainer: typings.senchaTouch.Ext.IContainer = null,
    dataMap: js.Any = null,
    getDataMap: () => _ = null,
    getItemCls: () => String = null,
    getItems: () => Array = null,
    itemCls: String = null,
    setDataMap: /* dataMap */ js.UndefOr[js.Any] => Unit = null,
    setItemCls: /* itemCls */ js.UndefOr[String] => Unit = null,
    setItems: /* items */ js.UndefOr[Array] => Unit = null,
    setWidth: /* width */ js.UndefOr[String] => Unit = null
  ): IDataItem = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (dataMap != null) __obj.updateDynamic("dataMap")(dataMap.asInstanceOf[js.Any])
    if (getDataMap != null) __obj.updateDynamic("getDataMap")(js.Any.fromFunction0(getDataMap))
    if (getItemCls != null) __obj.updateDynamic("getItemCls")(js.Any.fromFunction0(getItemCls))
    if (getItems != null) __obj.updateDynamic("getItems")(js.Any.fromFunction0(getItems))
    if (itemCls != null) __obj.updateDynamic("itemCls")(itemCls.asInstanceOf[js.Any])
    if (setDataMap != null) __obj.updateDynamic("setDataMap")(js.Any.fromFunction1(setDataMap))
    if (setItemCls != null) __obj.updateDynamic("setItemCls")(js.Any.fromFunction1(setItemCls))
    if (setItems != null) __obj.updateDynamic("setItems")(js.Any.fromFunction1(setItems))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1(setWidth))
    __obj.asInstanceOf[IDataItem]
  }
}

