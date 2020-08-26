package typings.senchaTouch.Ext.dataview.component

import typings.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataItem
  extends typings.senchaTouch.Ext.IContainer {
  /** [Config Option] (Object) */
  var dataMap: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of dataMap
    * @returns Object
    */
  var getDataMap: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of itemCls
    * @returns String
    */
  var getItemCls: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of items
    * @returns Array
    */
  @JSName("getItems")
  var getItems_IDataItem: js.UndefOr[js.Function0[Array]] = js.native
  /** [Config Option] (String) */
  var itemCls: js.UndefOr[String] = js.native
  /** [Method] Sets the value of dataMap
    * @param dataMap Object The new value.
    */
  var setDataMap: js.UndefOr[js.Function1[/* dataMap */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of itemCls
    * @param itemCls String The new value.
    */
  var setItemCls: js.UndefOr[js.Function1[/* itemCls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of items
    * @param items Array The new value.
    */
  @JSName("setItems")
  var setItems_IDataItem: js.UndefOr[js.Function1[/* items */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of width
    * @param width String The new value.
    */
  @JSName("setWidth")
  var setWidth_IDataItem: js.UndefOr[js.Function1[/* width */ js.UndefOr[String], Unit]] = js.native
}

object IDataItem {
  @scala.inline
  def apply(): IDataItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataItem]
  }
  @scala.inline
  implicit class IDataItemOps[Self <: IDataItem] (val x: Self) extends AnyVal {
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
    def setDataMap(value: js.Any): Self = this.set("dataMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataMap: Self = this.set("dataMap", js.undefined)
    @scala.inline
    def setGetDataMap(value: () => _): Self = this.set("getDataMap", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDataMap: Self = this.set("getDataMap", js.undefined)
    @scala.inline
    def setGetItemCls(value: () => String): Self = this.set("getItemCls", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetItemCls: Self = this.set("getItemCls", js.undefined)
    @scala.inline
    def setGetItems(value: () => Array): Self = this.set("getItems", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetItems: Self = this.set("getItems", js.undefined)
    @scala.inline
    def setItemCls(value: String): Self = this.set("itemCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemCls: Self = this.set("itemCls", js.undefined)
    @scala.inline
    def setSetDataMap(value: /* dataMap */ js.UndefOr[js.Any] => Unit): Self = this.set("setDataMap", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDataMap: Self = this.set("setDataMap", js.undefined)
    @scala.inline
    def setSetItemCls(value: /* itemCls */ js.UndefOr[String] => Unit): Self = this.set("setItemCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetItemCls: Self = this.set("setItemCls", js.undefined)
    @scala.inline
    def setSetItems(value: /* items */ js.UndefOr[Array] => Unit): Self = this.set("setItems", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetItems: Self = this.set("setItems", js.undefined)
    @scala.inline
    def setSetWidth(value: /* width */ js.UndefOr[String] => Unit): Self = this.set("setWidth", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetWidth: Self = this.set("setWidth", js.undefined)
  }
  
}

