package typings.rmcDashTrigger

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AfterPopupVisibleChange extends js.Object {
  var afterPopupVisibleChange: js.Function0[Unit]
  var defaultPopupVisible: Boolean
  var destroyPopupOnHide: Boolean
  var getDocument: js.Function0[Document]
  var getPopupClassNameFromAlign: js.Function0[String]
  var mask: Boolean
  var maskClosable: Boolean
  var onPopupAlign: js.Function0[Unit]
  var onPopupVisibleChange: js.Function0[Unit]
  var popupClassName: String
  var prefixCls: String
}

object Anon_AfterPopupVisibleChange {
  @scala.inline
  def apply(
    afterPopupVisibleChange: () => Unit,
    defaultPopupVisible: Boolean,
    destroyPopupOnHide: Boolean,
    getDocument: () => Document,
    getPopupClassNameFromAlign: () => String,
    mask: Boolean,
    maskClosable: Boolean,
    onPopupAlign: () => Unit,
    onPopupVisibleChange: () => Unit,
    popupClassName: String,
    prefixCls: String
  ): Anon_AfterPopupVisibleChange = {
    val __obj = js.Dynamic.literal(afterPopupVisibleChange = js.Any.fromFunction0(afterPopupVisibleChange), defaultPopupVisible = defaultPopupVisible, destroyPopupOnHide = destroyPopupOnHide, getDocument = js.Any.fromFunction0(getDocument), getPopupClassNameFromAlign = js.Any.fromFunction0(getPopupClassNameFromAlign), mask = mask, maskClosable = maskClosable, onPopupAlign = js.Any.fromFunction0(onPopupAlign), onPopupVisibleChange = js.Any.fromFunction0(onPopupVisibleChange), popupClassName = popupClassName, prefixCls = prefixCls)
  
    __obj.asInstanceOf[Anon_AfterPopupVisibleChange]
  }
}

