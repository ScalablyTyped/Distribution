package typings.rcDashTable.libBodyTableMod

import typings.rcDashTable.libInterfaceMod.ColumnType
import typings.rcDashTable.libInterfaceMod.DefaultValueType
import typings.rcDashTable.libInterfaceMod.Expander
import typings.rcDashTable.libInterfaceMod.FixedType
import typings.rcDashTable.libInterfaceMod.GetRowKey
import typings.rcDashTable.libInterfaceMod.Key
import typings.react.reactMod.UIEvent
import typings.react.reactMod.UIEventHandler
import typings.react.reactMod.WheelEvent
import typings.react.reactMod.WheelEventHandler
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

