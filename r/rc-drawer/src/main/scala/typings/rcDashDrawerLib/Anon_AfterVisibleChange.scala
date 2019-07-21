package typings
package rcDashDrawerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AfterVisibleChange extends js.Object {
  var className: java.lang.String
  var defaultOpen: scala.Boolean
  var duration: java.lang.String
  var ease: java.lang.String
  var forceRender: scala.Boolean
  var getContainer: java.lang.String
  var handler: reactLib.reactMod.Global.JSXNs.Element
  var keyboard: scala.Boolean
  var level: java.lang.String
  var maskClosable: scala.Boolean
  var placement: java.lang.String
  var prefixCls: java.lang.String
  var showMask: scala.Boolean
  var wrapperClassName: java.lang.String
  def afterVisibleChange(): scala.Unit
  def onChange(): scala.Unit
}

object Anon_AfterVisibleChange {
  @scala.inline
  def apply(
    afterVisibleChange: () => scala.Unit,
    className: java.lang.String,
    defaultOpen: scala.Boolean,
    duration: java.lang.String,
    ease: java.lang.String,
    forceRender: scala.Boolean,
    getContainer: java.lang.String,
    handler: reactLib.reactMod.Global.JSXNs.Element,
    keyboard: scala.Boolean,
    level: java.lang.String,
    maskClosable: scala.Boolean,
    onChange: () => scala.Unit,
    placement: java.lang.String,
    prefixCls: java.lang.String,
    showMask: scala.Boolean,
    wrapperClassName: java.lang.String
  ): Anon_AfterVisibleChange = {
    val __obj = js.Dynamic.literal(afterVisibleChange = js.Any.fromFunction0(afterVisibleChange), className = className, defaultOpen = defaultOpen, duration = duration, ease = ease, forceRender = forceRender, getContainer = getContainer, handler = handler, keyboard = keyboard, level = level, maskClosable = maskClosable, onChange = js.Any.fromFunction0(onChange), placement = placement, prefixCls = prefixCls, showMask = showMask, wrapperClassName = wrapperClassName)
  
    __obj.asInstanceOf[Anon_AfterVisibleChange]
  }
}

