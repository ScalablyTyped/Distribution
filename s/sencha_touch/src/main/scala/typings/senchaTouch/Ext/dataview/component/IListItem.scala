package typings.senchaTouch.Ext.dataview.component

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
    getBody: () => _ = null,
    getDisclosure: () => _ = null,
    getHeader: () => _ = null,
    setBody: /* body */ js.UndefOr[js.Any] => Unit = null,
    setDisclosure: /* disclosure */ js.UndefOr[js.Any] => Unit = null,
    setHeader: /* header */ js.UndefOr[js.Any] => Unit = null
  ): IListItem = {
    val __obj = js.Dynamic.literal()
    if (IDataItem != null) js.Dynamic.global.Object.assign(__obj, IDataItem)
    if (getBody != null) __obj.updateDynamic("getBody")(js.Any.fromFunction0(getBody))
    if (getDisclosure != null) __obj.updateDynamic("getDisclosure")(js.Any.fromFunction0(getDisclosure))
    if (getHeader != null) __obj.updateDynamic("getHeader")(js.Any.fromFunction0(getHeader))
    if (setBody != null) __obj.updateDynamic("setBody")(js.Any.fromFunction1(setBody))
    if (setDisclosure != null) __obj.updateDynamic("setDisclosure")(js.Any.fromFunction1(setDisclosure))
    if (setHeader != null) __obj.updateDynamic("setHeader")(js.Any.fromFunction1(setHeader))
    __obj.asInstanceOf[IListItem]
  }
}

