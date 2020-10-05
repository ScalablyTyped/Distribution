package typings.rcMenu.anon

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuiltinPlacements extends js.Object {
  var className: String = js.native
  var defaultOpenKeys: js.Array[_] = js.native
  var defaultSelectedKeys: js.Array[_] = js.native
  var mode: String = js.native
  var onClick: js.Function0[Unit] = js.native
  var onDeselect: js.Function0[Unit] = js.native
  var onOpenChange: js.Function0[Unit] = js.native
  var onSelect: js.Function0[Unit] = js.native
  var overflowedIndicator: Element = js.native
  var prefixCls: String = js.native
  var selectable: Boolean = js.native
  var subMenuCloseDelay: Double = js.native
  var subMenuOpenDelay: Double = js.native
  var triggerSubMenuAction: String = js.native
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
  @scala.inline
  implicit class BuiltinPlacementsOps[Self <: BuiltinPlacements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultOpenKeysVarargs(value: js.Any*): Self = this.set("defaultOpenKeys", js.Array(value :_*))
    @scala.inline
    def setDefaultOpenKeys(value: js.Array[_]): Self = this.set("defaultOpenKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultSelectedKeysVarargs(value: js.Any*): Self = this.set("defaultSelectedKeys", js.Array(value :_*))
    @scala.inline
    def setDefaultSelectedKeys(value: js.Array[_]): Self = this.set("defaultSelectedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClick(value: () => Unit): Self = this.set("onClick", js.Any.fromFunction0(value))
    @scala.inline
    def setOnDeselect(value: () => Unit): Self = this.set("onDeselect", js.Any.fromFunction0(value))
    @scala.inline
    def setOnOpenChange(value: () => Unit): Self = this.set("onOpenChange", js.Any.fromFunction0(value))
    @scala.inline
    def setOnSelect(value: () => Unit): Self = this.set("onSelect", js.Any.fromFunction0(value))
    @scala.inline
    def setOverflowedIndicator(value: Element): Self = this.set("overflowedIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubMenuCloseDelay(value: Double): Self = this.set("subMenuCloseDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubMenuOpenDelay(value: Double): Self = this.set("subMenuOpenDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerSubMenuAction(value: String): Self = this.set("triggerSubMenuAction", value.asInstanceOf[js.Any])
  }
  
}

