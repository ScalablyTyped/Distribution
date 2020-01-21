package typings.rcDialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassName extends js.Object {
  var className: String
  var closable: Boolean
  var destroyOnClose: Boolean
  var focusTriggerAfterClose: Boolean
  var keyboard: Boolean
  var mask: Boolean
  var maskClosable: Boolean
  var prefixCls: String
  var visible: Boolean
}

object AnonClassName {
  @scala.inline
  def apply(
    className: String,
    closable: Boolean,
    destroyOnClose: Boolean,
    focusTriggerAfterClose: Boolean,
    keyboard: Boolean,
    mask: Boolean,
    maskClosable: Boolean,
    prefixCls: String,
    visible: Boolean
  ): AnonClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], destroyOnClose = destroyOnClose.asInstanceOf[js.Any], focusTriggerAfterClose = focusTriggerAfterClose.asInstanceOf[js.Any], keyboard = keyboard.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], maskClosable = maskClosable.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClassName]
  }
}

