package typings.rcTable.bodyTableMod

import typings.rcTable.interfaceMod.ColumnType
import typings.rcTable.interfaceMod.DefaultValueType
import typings.rcTable.interfaceMod.Expander
import typings.rcTable.interfaceMod.FixedType
import typings.rcTable.interfaceMod.GetRowKey
import typings.rcTable.interfaceMod.Key
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEvent
import typings.react.mod.WheelEventHandler
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyTableProps[ValueType] extends js.Object {
  var columns: js.Array[ColumnType[DefaultValueType]]
  var expander: Expander[DefaultValueType]
  var fixed: js.UndefOr[FixedType] = js.undefined
  var getRowKey: GetRowKey[ValueType]
  var handleBodyScroll: UIEventHandler[HTMLDivElement]
  var handleWheel: WheelEventHandler[HTMLDivElement]
  var isAnyColumnsFixed: js.UndefOr[Boolean] = js.undefined
  var tableClassName: String
}

object BodyTableProps {
  @scala.inline
  def apply[ValueType](
    columns: js.Array[ColumnType[DefaultValueType]],
    expander: Expander[DefaultValueType],
    getRowKey: (ValueType, /* index */ Double) => Key,
    handleBodyScroll: UIEvent[HTMLDivElement] => Unit,
    handleWheel: WheelEvent[HTMLDivElement] => Unit,
    tableClassName: String,
    fixed: FixedType = null,
    isAnyColumnsFixed: js.UndefOr[Boolean] = js.undefined
  ): BodyTableProps[ValueType] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], expander = expander.asInstanceOf[js.Any], getRowKey = js.Any.fromFunction2(getRowKey), handleBodyScroll = js.Any.fromFunction1(handleBodyScroll), handleWheel = js.Any.fromFunction1(handleWheel), tableClassName = tableClassName.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (!js.isUndefined(isAnyColumnsFixed)) __obj.updateDynamic("isAnyColumnsFixed")(isAnyColumnsFixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyTableProps[ValueType]]
  }
}

