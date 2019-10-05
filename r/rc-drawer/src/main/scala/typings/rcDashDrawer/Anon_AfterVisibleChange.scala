package typings.rcDashDrawer

import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AfterVisibleChange extends js.Object {
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

object Anon_AfterVisibleChange {
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
  ): Anon_AfterVisibleChange = {
    val __obj = js.Dynamic.literal(afterVisibleChange = js.Any.fromFunction0(afterVisibleChange), className = className, defaultOpen = defaultOpen, duration = duration, ease = ease, forceRender = forceRender, getContainer = getContainer, handler = handler, keyboard = keyboard, level = level, maskClosable = maskClosable, onChange = js.Any.fromFunction0(onChange), placement = placement, prefixCls = prefixCls, showMask = showMask, wrapperClassName = wrapperClassName)
  
    __obj.asInstanceOf[Anon_AfterVisibleChange]
  }
}

