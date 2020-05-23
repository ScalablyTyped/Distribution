package typings.rcDrawer.anon

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AfterVisibleChange extends js.Object {
  var className: String
  var defaultOpen: Boolean
  var duration: String
  var ease: String
  var forceRender: Boolean
  var getContainer: String
  var handler: Element
  var keyboard: Boolean
  var level: String
  var maskClosable: Boolean
  var placement: String
  var prefixCls: String
  var showMask: Boolean
  var wrapperClassName: String
  def afterVisibleChange(): Unit
  def onChange(): Unit
}

object AfterVisibleChange {
  @scala.inline
  def apply(
    afterVisibleChange: () => Unit,
    className: String,
    defaultOpen: Boolean,
    duration: String,
    ease: String,
    forceRender: Boolean,
    getContainer: String,
    handler: Element,
    keyboard: Boolean,
    level: String,
    maskClosable: Boolean,
    onChange: () => Unit,
    placement: String,
    prefixCls: String,
    showMask: Boolean,
    wrapperClassName: String
  ): AfterVisibleChange = {
    val __obj = js.Dynamic.literal(afterVisibleChange = js.Any.fromFunction0(afterVisibleChange), className = className.asInstanceOf[js.Any], defaultOpen = defaultOpen.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], ease = ease.asInstanceOf[js.Any], forceRender = forceRender.asInstanceOf[js.Any], getContainer = getContainer.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], keyboard = keyboard.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], maskClosable = maskClosable.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), placement = placement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], showMask = showMask.asInstanceOf[js.Any], wrapperClassName = wrapperClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterVisibleChange]
  }
}

