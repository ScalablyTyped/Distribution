package typings.rcTable.expandIconMod

import typings.rcTable.interfaceMod.IconExpandEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandIconProps[ValueType] extends js.Object {
  var expandable: js.UndefOr[Boolean] = js.undefined
  var expanded: js.UndefOr[Boolean] = js.undefined
  var needIndentSpaced: js.UndefOr[Boolean] = js.undefined
  var onExpand: js.UndefOr[IconExpandEventHandler[ValueType]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var record: js.UndefOr[ValueType] = js.undefined
}

object ExpandIconProps {
  @scala.inline
  def apply[ValueType](
    expandable: js.UndefOr[Boolean] = js.undefined,
    expanded: js.UndefOr[Boolean] = js.undefined,
    needIndentSpaced: js.UndefOr[Boolean] = js.undefined,
    onExpand: (ValueType, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    prefixCls: String = null,
    record: ValueType = null
  ): ExpandIconProps[ValueType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (!js.isUndefined(needIndentSpaced)) __obj.updateDynamic("needIndentSpaced")(needIndentSpaced.asInstanceOf[js.Any])
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction2(onExpand))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (record != null) __obj.updateDynamic("record")(record.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandIconProps[ValueType]]
  }
}

