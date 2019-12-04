package typings.rcDashTable.libHeadTableMod

import typings.rcDashTable.libInterfaceMod.ColumnType
import typings.rcDashTable.libInterfaceMod.DefaultValueType
import typings.rcDashTable.libInterfaceMod.Expander
import typings.rcDashTable.libInterfaceMod.FixedType
import typings.react.reactMod.UIEvent
import typings.react.reactMod.UIEventHandler
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadTableProps extends js.Object {
  var columns: js.Array[ColumnType[DefaultValueType]]
  var expander: Expander[DefaultValueType]
  var fixed: js.UndefOr[FixedType] = js.undefined
  var handleBodyScrollLeft: UIEventHandler[HTMLDivElement]
  var tableClassName: String
}

object HeadTableProps {
  @scala.inline
  def apply(
    columns: js.Array[ColumnType[DefaultValueType]],
    expander: Expander[DefaultValueType],
    handleBodyScrollLeft: UIEvent[HTMLDivElement] => Unit,
    tableClassName: String,
    fixed: FixedType = null
  ): HeadTableProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], expander = expander.asInstanceOf[js.Any], handleBodyScrollLeft = js.Any.fromFunction1(handleBodyScrollLeft), tableClassName = tableClassName.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadTableProps]
  }
}

