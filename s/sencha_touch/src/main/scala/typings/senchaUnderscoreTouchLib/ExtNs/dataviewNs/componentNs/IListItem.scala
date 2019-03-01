package typings
package senchaUnderscoreTouchLib.ExtNs.dataviewNs.componentNs

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
  var setBody: js.UndefOr[js.Function1[/* body */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of disclosure
  		* @param disclosure Object The new value.
  		*/
  var setDisclosure: js.UndefOr[js.Function1[/* disclosure */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of header
  		* @param header Object The new value.
  		*/
  var setHeader: js.UndefOr[js.Function1[/* header */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object IListItem {
  @scala.inline
  def apply(
    IDataItem: IDataItem = null,
    baseCls: java.lang.String = null,
    dataMap: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    getBaseCls: js.Function0[java.lang.String] = null,
    getBody: js.Function0[_] = null,
    getDataMap: js.Function0[_] = null,
    getDisclosure: js.Function0[_] = null,
    getHeader: js.Function0[_] = null,
    items: js.Any = null,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setBody: js.Function1[/* body */ js.UndefOr[js.Any], scala.Unit] = null,
    setDataMap: js.Function1[/* dataMap */ js.UndefOr[js.Any], scala.Unit] = null,
    setDisclosure: js.Function1[/* disclosure */ js.UndefOr[js.Any], scala.Unit] = null,
    setHeader: js.Function1[/* header */ js.UndefOr[js.Any], scala.Unit] = null,
    setItems: js.Function1[/* items */ js.UndefOr[js.Any], scala.Unit] = null,
    setTpl: js.Function1[/* tpl */ js.UndefOr[js.Any], scala.Unit] = null,
    tpl: js.Any = null
  ): IListItem = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IDataItem)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (dataMap != null) __obj.updateDynamic("dataMap")(dataMap)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (getBody != null) __obj.updateDynamic("getBody")(getBody)
    if (getDataMap != null) __obj.updateDynamic("getDataMap")(getDataMap)
    if (getDisclosure != null) __obj.updateDynamic("getDisclosure")(getDisclosure)
    if (getHeader != null) __obj.updateDynamic("getHeader")(getHeader)
    if (items != null) __obj.updateDynamic("items")(items)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    if (setBody != null) __obj.updateDynamic("setBody")(setBody)
    if (setDataMap != null) __obj.updateDynamic("setDataMap")(setDataMap)
    if (setDisclosure != null) __obj.updateDynamic("setDisclosure")(setDisclosure)
    if (setHeader != null) __obj.updateDynamic("setHeader")(setHeader)
    if (setItems != null) __obj.updateDynamic("setItems")(setItems)
    if (setTpl != null) __obj.updateDynamic("setTpl")(setTpl)
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    __obj.asInstanceOf[IListItem]
  }
}

