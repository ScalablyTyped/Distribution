package typings
package rmcDashTriggerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AfterPopupVisibleChange extends js.Object {
  var afterPopupVisibleChange: js.Function0[scala.Unit]
  var defaultPopupVisible: scala.Boolean
  var destroyPopupOnHide: scala.Boolean
  var getDocument: js.Function0[stdLib.Document]
  var getPopupClassNameFromAlign: js.Function0[java.lang.String]
  var mask: scala.Boolean
  var maskClosable: scala.Boolean
  var onPopupAlign: js.Function0[scala.Unit]
  var onPopupVisibleChange: js.Function0[scala.Unit]
  var popupClassName: java.lang.String
  var prefixCls: java.lang.String
}

object Anon_AfterPopupVisibleChange {
  @scala.inline
  def apply(
    afterPopupVisibleChange: () => scala.Unit,
    defaultPopupVisible: scala.Boolean,
    destroyPopupOnHide: scala.Boolean,
    getDocument: () => stdLib.Document,
    getPopupClassNameFromAlign: () => java.lang.String,
    mask: scala.Boolean,
    maskClosable: scala.Boolean,
    onPopupAlign: () => scala.Unit,
    onPopupVisibleChange: () => scala.Unit,
    popupClassName: java.lang.String,
    prefixCls: java.lang.String
  ): Anon_AfterPopupVisibleChange = {
    val __obj = js.Dynamic.literal(afterPopupVisibleChange = js.Any.fromFunction0(afterPopupVisibleChange), defaultPopupVisible = defaultPopupVisible, destroyPopupOnHide = destroyPopupOnHide, getDocument = js.Any.fromFunction0(getDocument), getPopupClassNameFromAlign = js.Any.fromFunction0(getPopupClassNameFromAlign), mask = mask, maskClosable = maskClosable, onPopupAlign = js.Any.fromFunction0(onPopupAlign), onPopupVisibleChange = js.Any.fromFunction0(onPopupVisibleChange), popupClassName = popupClassName, prefixCls = prefixCls)
  
    __obj.asInstanceOf[Anon_AfterPopupVisibleChange]
  }
}

