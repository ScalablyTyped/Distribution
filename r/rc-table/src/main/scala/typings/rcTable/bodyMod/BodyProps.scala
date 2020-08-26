package typings.rcTable.bodyMod

import typings.rcTable.interfaceMod.GetComponentProps
import typings.rcTable.interfaceMod.GetRowKey
import typings.rcTable.interfaceMod.Key
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BodyProps[RecordType] extends js.Object {
  var childrenColumnName: String = js.native
  var data: js.Array[RecordType] = js.native
  var emptyNode: ReactNode = js.native
  var expandedKeys: Set[Key] = js.native
  var getRowKey: GetRowKey[RecordType] = js.native
  var measureColumnWidth: Boolean = js.native
  var onRow: GetComponentProps[RecordType] = js.native
  def rowExpandable(record: RecordType): Boolean = js.native
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
    rowExpandable: RecordType => Boolean
  ): BodyProps[RecordType] = {
    val __obj = js.Dynamic.literal(childrenColumnName = childrenColumnName.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], getRowKey = js.Any.fromFunction2(getRowKey), measureColumnWidth = measureColumnWidth.asInstanceOf[js.Any], onRow = js.Any.fromFunction2(onRow), rowExpandable = js.Any.fromFunction1(rowExpandable))
    __obj.asInstanceOf[BodyProps[RecordType]]
  }
  @scala.inline
  implicit class BodyPropsOps[Self <: BodyProps[_], RecordType] (val x: Self with BodyProps[RecordType]) extends AnyVal {
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
    def setChildrenColumnName(value: String): Self = this.set("childrenColumnName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataVarargs(value: RecordType*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[RecordType]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandedKeys(value: Set[Key]): Self = this.set("expandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetRowKey(value: (RecordType, /* index */ js.UndefOr[Double]) => Key): Self = this.set("getRowKey", js.Any.fromFunction2(value))
    @scala.inline
    def setMeasureColumnWidth(value: Boolean): Self = this.set("measureColumnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnRow(value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]): Self = this.set("onRow", js.Any.fromFunction2(value))
    @scala.inline
    def setRowExpandable(value: RecordType => Boolean): Self = this.set("rowExpandable", js.Any.fromFunction1(value))
    @scala.inline
    def setEmptyNode(value: ReactNode): Self = this.set("emptyNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyNode: Self = this.set("emptyNode", js.undefined)
  }
  
}

