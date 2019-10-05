package typings.senchaUnderscoreTouch.Ext.dataview.component

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IListItem extends IDataItem {
  /** [Method] Returns the value of body
  		* @returns Object
  		*/
  var getBody: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of disclosure
  		* @returns Object
  		*/
  var getDisclosure: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of header
  		* @returns Object
  		*/
  var getHeader: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of body
  		* @param body Object The new value.
  		*/
  var setBody: js.UndefOr[js.Function1[/* body */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of disclosure
  		* @param disclosure Object The new value.
  		*/
  var setDisclosure: js.UndefOr[js.Function1[/* disclosure */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of header
  		* @param header Object The new value.
  		*/
  var setHeader: js.UndefOr[js.Function1[/* header */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IListItem {
  @scala.inline
  def apply(
    IDataItem: IDataItem = null,
    baseCls: java.lang.String = null,
    dataMap: js.Any = null,
    destroy: () => Unit = null,
    getBaseCls: () => java.lang.String = null,
    getBody: () => _ = null,
    getDataMap: () => _ = null,
    getDisclosure: () => _ = null,
    getHeader: () => _ = null,
    items: js.Any = null,
    setBaseCls: /* baseCls */ js.UndefOr[java.lang.String] => Unit = null,
    setBody: /* body */ js.UndefOr[js.Any] => Unit = null,
    setDataMap: /* dataMap */ js.UndefOr[js.Any] => Unit = null,
    setDisclosure: /* disclosure */ js.UndefOr[js.Any] => Unit = null,
    setHeader: /* header */ js.UndefOr[js.Any] => Unit = null,
    setItems: /* items */ js.UndefOr[js.Any] => Unit = null,
    setTpl: /* tpl */ js.UndefOr[js.Any] => Unit = null,
    tpl: js.Any = null
  ): IListItem = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IDataItem)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (dataMap != null) __obj.updateDynamic("dataMap")(dataMap)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(js.Any.fromFunction0(getBaseCls))
    if (getBody != null) __obj.updateDynamic("getBody")(js.Any.fromFunction0(getBody))
    if (getDataMap != null) __obj.updateDynamic("getDataMap")(js.Any.fromFunction0(getDataMap))
    if (getDisclosure != null) __obj.updateDynamic("getDisclosure")(js.Any.fromFunction0(getDisclosure))
    if (getHeader != null) __obj.updateDynamic("getHeader")(js.Any.fromFunction0(getHeader))
    if (items != null) __obj.updateDynamic("items")(items)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(js.Any.fromFunction1(setBaseCls))
    if (setBody != null) __obj.updateDynamic("setBody")(js.Any.fromFunction1(setBody))
    if (setDataMap != null) __obj.updateDynamic("setDataMap")(js.Any.fromFunction1(setDataMap))
    if (setDisclosure != null) __obj.updateDynamic("setDisclosure")(js.Any.fromFunction1(setDisclosure))
    if (setHeader != null) __obj.updateDynamic("setHeader")(js.Any.fromFunction1(setHeader))
    if (setItems != null) __obj.updateDynamic("setItems")(js.Any.fromFunction1(setItems))
    if (setTpl != null) __obj.updateDynamic("setTpl")(js.Any.fromFunction1(setTpl))
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    __obj.asInstanceOf[IListItem]
  }
}

