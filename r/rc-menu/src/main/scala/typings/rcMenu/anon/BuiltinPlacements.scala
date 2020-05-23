package typings.rcMenu.anon

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuiltinPlacements extends js.Object {
  var className: String
  var defaultOpenKeys: js.Array[_]
  var defaultSelectedKeys: js.Array[_]
  var mode: String
  var onClick: js.Function0[Unit]
  var onDeselect: js.Function0[Unit]
  var onOpenChange: js.Function0[Unit]
  var onSelect: js.Function0[Unit]
  var overflowedIndicator: Element
  var prefixCls: String
  var selectable: Boolean
  var subMenuCloseDelay: Double
  var subMenuOpenDelay: Double
  var triggerSubMenuAction: String
}

object BuiltinPlacements {
  @scala.inline
  def apply(
    className: String,
    defaultOpenKeys: js.Array[_],
    defaultSelectedKeys: js.Array[_],
    mode: String,
    onClick: () => Unit,
    onDeselect: () => Unit,
    onOpenChange: () => Unit,
    onSelect: () => Unit,
    overflowedIndicator: Element,
    prefixCls: String,
    selectable: Boolean,
    subMenuCloseDelay: Double,
    subMenuOpenDelay: Double,
    triggerSubMenuAction: String
  ): BuiltinPlacements = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], defaultOpenKeys = defaultOpenKeys.asInstanceOf[js.Any], defaultSelectedKeys = defaultSelectedKeys.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), onDeselect = js.Any.fromFunction0(onDeselect), onOpenChange = js.Any.fromFunction0(onOpenChange), onSelect = js.Any.fromFunction0(onSelect), overflowedIndicator = overflowedIndicator.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], subMenuCloseDelay = subMenuCloseDelay.asInstanceOf[js.Any], subMenuOpenDelay = subMenuOpenDelay.asInstanceOf[js.Any], triggerSubMenuAction = triggerSubMenuAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuiltinPlacements]
  }
}

