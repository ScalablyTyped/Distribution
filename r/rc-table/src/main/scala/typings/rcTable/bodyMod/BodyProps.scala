package typings.rcTable.bodyMod

import typings.rcTable.interfaceMod.GetComponentProps
import typings.rcTable.interfaceMod.GetRowKey
import typings.rcTable.interfaceMod.Key
import typings.rcTable.interfaceMod.StickyOffsets
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyProps[RecordType] extends js.Object {
  var childrenColumnName: String
  var data: js.Array[RecordType]
  var emptyNode: ReactNode
  var expandedKeys: Set[Key]
  var getRowKey: GetRowKey[RecordType]
  var measureColumnWidth: Boolean
  var onRow: GetComponentProps[RecordType]
  var stickyOffsets: StickyOffsets
  def rowExpandable(record: RecordType): Boolean
}

object BodyProps {
  @scala.inline
  def apply[RecordType](
    childrenColumnName: String,
    data: js.Array[RecordType],
    expandedKeys: Set[Key],
    getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => Key,
    measureColumnWidth: Boolean,
    onRow: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement],
    rowExpandable: RecordType => Boolean,
    stickyOffsets: StickyOffsets,
    emptyNode: ReactNode = null
  ): BodyProps[RecordType] = {
    val __obj = js.Dynamic.literal(childrenColumnName = childrenColumnName.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], getRowKey = js.Any.fromFunction2(getRowKey), measureColumnWidth = measureColumnWidth.asInstanceOf[js.Any], onRow = js.Any.fromFunction2(onRow), rowExpandable = js.Any.fromFunction1(rowExpandable), stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
    if (emptyNode != null) __obj.updateDynamic("emptyNode")(emptyNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyProps[RecordType]]
  }
}

