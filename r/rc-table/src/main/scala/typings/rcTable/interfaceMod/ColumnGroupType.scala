package typings.rcTable.interfaceMod

import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnGroupType[RecordType] extends ColumnSharedType[RecordType] {
  var children: ColumnsType[RecordType]
}

object ColumnGroupType {
  @scala.inline
  def apply[RecordType](
    children: ColumnsType[RecordType],
    align: AlignType = null,
    className: String = null,
    ellipsis: js.UndefOr[Boolean] = js.undefined,
    fixed: FixedType = null,
    key: Key = null,
    onHeaderCell: (/* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement] = null,
    title: ReactNode = null
  ): ColumnGroupType[RecordType] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(ellipsis)) __obj.updateDynamic("ellipsis")(ellipsis.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onHeaderCell != null) __obj.updateDynamic("onHeaderCell")(js.Any.fromFunction2(onHeaderCell))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGroupType[RecordType]]
  }
}

