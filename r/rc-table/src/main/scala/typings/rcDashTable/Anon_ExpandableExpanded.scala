package typings.rcDashTable

import typings.rcDashTable.libInterfaceMod.IconExpandEventHandler
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExpandableExpanded[ValueType] extends js.Object {
  var expandable: Boolean
  var expanded: Boolean
  var needIndentSpaced: Boolean
  var onExpand: IconExpandEventHandler[ValueType]
  var prefixCls: String
  var record: ValueType
}

object Anon_ExpandableExpanded {
  @scala.inline
  def apply[ValueType](
    expandable: Boolean,
    expanded: Boolean,
    needIndentSpaced: Boolean,
    onExpand: (ValueType, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit,
    prefixCls: String,
    record: ValueType
  ): Anon_ExpandableExpanded[ValueType] = {
    val __obj = js.Dynamic.literal(expandable = expandable.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], needIndentSpaced = needIndentSpaced.asInstanceOf[js.Any], onExpand = js.Any.fromFunction2(onExpand), prefixCls = prefixCls.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ExpandableExpanded[ValueType]]
  }
}

