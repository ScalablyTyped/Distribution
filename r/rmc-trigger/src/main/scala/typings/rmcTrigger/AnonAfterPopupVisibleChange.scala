package typings.rmcTrigger

import typings.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAfterPopupVisibleChange extends js.Object {
  var afterPopupVisibleChange: js.Function0[Unit]
  var defaultPopupVisible: Boolean
  var destroyPopupOnHide: Boolean
  var getDocument: js.Function0[Document_]
  var getPopupClassNameFromAlign: js.Function0[String]
  var mask: Boolean
  var maskClosable: Boolean
  var onPopupAlign: js.Function0[Unit]
  var onPopupVisibleChange: js.Function0[Unit]
  var popupClassName: String
  var prefixCls: String
}

object AnonAfterPopupVisibleChange {
  @scala.inline
  def apply(
    afterPopupVisibleChange: () => Unit,
    defaultPopupVisible: Boolean,
    destroyPopupOnHide: Boolean,
    getDocument: () => Document_,
    getPopupClassNameFromAlign: () => String,
    mask: Boolean,
    maskClosable: Boolean,
    onPopupAlign: () => Unit,
    onPopupVisibleChange: () => Unit,
    popupClassName: String,
    prefixCls: String
  ): AnonAfterPopupVisibleChange = {
    val __obj = js.Dynamic.literal(afterPopupVisibleChange = js.Any.fromFunction0(afterPopupVisibleChange), defaultPopupVisible = defaultPopupVisible.asInstanceOf[js.Any], destroyPopupOnHide = destroyPopupOnHide.asInstanceOf[js.Any], getDocument = js.Any.fromFunction0(getDocument), getPopupClassNameFromAlign = js.Any.fromFunction0(getPopupClassNameFromAlign), mask = mask.asInstanceOf[js.Any], maskClosable = maskClosable.asInstanceOf[js.Any], onPopupAlign = js.Any.fromFunction0(onPopupAlign), onPopupVisibleChange = js.Any.fromFunction0(onPopupVisibleChange), popupClassName = popupClassName.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAfterPopupVisibleChange]
  }
}

