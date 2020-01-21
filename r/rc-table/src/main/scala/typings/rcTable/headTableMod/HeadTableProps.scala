package typings.rcTable.headTableMod

import typings.rcTable.interfaceMod.ColumnType
import typings.rcTable.interfaceMod.DefaultValueType
import typings.rcTable.interfaceMod.Expander
import typings.rcTable.interfaceMod.FixedType
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
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

