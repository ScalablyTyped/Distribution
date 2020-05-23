package typings.rcTable.bodyRowMod

import typings.rcTable.interfaceMod.CustomizeComponent
import typings.rcTable.interfaceMod.GetComponentProps
import typings.rcTable.interfaceMod.GetRowKey
import typings.rcTable.interfaceMod.Key
import typings.react.mod.CSSProperties
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyRowProps[RecordType] extends js.Object {
  var cellComponent: CustomizeComponent
  var childrenColumnName: String
  var className: js.UndefOr[String] = js.undefined
  var expandedKeys: Set[Key]
  var getRowKey: GetRowKey[RecordType]
  var indent: js.UndefOr[Double] = js.undefined
  var index: Double
  var onRow: GetComponentProps[RecordType]
  var record: RecordType
  var recordKey: Key
  var rowComponent: CustomizeComponent
  var rowKey: typings.react.mod.Key
  var style: js.UndefOr[CSSProperties] = js.undefined
  def rowExpandable(record: RecordType): Boolean
}

object BodyRowProps {
  @scala.inline
  def apply[RecordType](
    cellComponent: CustomizeComponent,
    childrenColumnName: String,
    expandedKeys: Set[Key],
    getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => Key,
    index: Double,
    onRow: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement],
    record: RecordType,
    recordKey: Key,
    rowComponent: CustomizeComponent,
    rowExpandable: RecordType => Boolean,
    rowKey: typings.react.mod.Key,
    className: String = null,
    indent: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null
  ): BodyRowProps[RecordType] = {
    val __obj = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], childrenColumnName = childrenColumnName.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], getRowKey = js.Any.fromFunction2(getRowKey), index = index.asInstanceOf[js.Any], onRow = js.Any.fromFunction2(onRow), record = record.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any], rowComponent = rowComponent.asInstanceOf[js.Any], rowExpandable = js.Any.fromFunction1(rowExpandable), rowKey = rowKey.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(indent)) __obj.updateDynamic("indent")(indent.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyRowProps[RecordType]]
  }
}

