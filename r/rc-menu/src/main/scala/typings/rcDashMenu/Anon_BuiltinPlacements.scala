package typings.rcDashMenu

import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BuiltinPlacements extends js.Object {
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

object Anon_BuiltinPlacements {
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
  ): Anon_BuiltinPlacements = {
    val __obj = js.Dynamic.literal(className = className, defaultOpenKeys = defaultOpenKeys, defaultSelectedKeys = defaultSelectedKeys, mode = mode, onClick = js.Any.fromFunction0(onClick), onDeselect = js.Any.fromFunction0(onDeselect), onOpenChange = js.Any.fromFunction0(onOpenChange), onSelect = js.Any.fromFunction0(onSelect), overflowedIndicator = overflowedIndicator, prefixCls = prefixCls, selectable = selectable, subMenuCloseDelay = subMenuCloseDelay, subMenuOpenDelay = subMenuOpenDelay, triggerSubMenuAction = triggerSubMenuAction)
  
    __obj.asInstanceOf[Anon_BuiltinPlacements]
  }
}

