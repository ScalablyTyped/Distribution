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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyRowProps[RecordType] extends js.Object {
  var cellComponent: CustomizeComponent = js.native
  var childrenColumnName: String = js.native
  var className: js.UndefOr[String] = js.native
  var expandedKeys: Set[Key] = js.native
  var getRowKey: GetRowKey[RecordType] = js.native
  var indent: js.UndefOr[Double] = js.native
  var index: Double = js.native
  var onRow: GetComponentProps[RecordType] = js.native
  var record: RecordType = js.native
  var recordKey: Key = js.native
  var rowComponent: CustomizeComponent = js.native
  var rowKey: typings.react.mod.Key = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  def rowExpandable(record: RecordType): Boolean = js.native
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
    rowKey: typings.react.mod.Key
  ): BodyRowProps[RecordType] = {
    val __obj = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], childrenColumnName = childrenColumnName.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], getRowKey = js.Any.fromFunction2(getRowKey), index = index.asInstanceOf[js.Any], onRow = js.Any.fromFunction2(onRow), record = record.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any], rowComponent = rowComponent.asInstanceOf[js.Any], rowExpandable = js.Any.fromFunction1(rowExpandable), rowKey = rowKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyRowProps[RecordType]]
  }
  @scala.inline
  implicit class BodyRowPropsOps[Self <: BodyRowProps[_], RecordType] (val x: Self with BodyRowProps[RecordType]) extends AnyVal {
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
    def setCellComponent(value: CustomizeComponent): Self = this.set("cellComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenColumnName(value: String): Self = this.set("childrenColumnName", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandedKeys(value: Set[Key]): Self = this.set("expandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetRowKey(value: (RecordType, /* index */ js.UndefOr[Double]) => Key): Self = this.set("getRowKey", js.Any.fromFunction2(value))
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnRow(value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]): Self = this.set("onRow", js.Any.fromFunction2(value))
    @scala.inline
    def setRecord(value: RecordType): Self = this.set("record", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecordKey(value: Key): Self = this.set("recordKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowComponent(value: CustomizeComponent): Self = this.set("rowComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowExpandable(value: RecordType => Boolean): Self = this.set("rowExpandable", js.Any.fromFunction1(value))
    @scala.inline
    def setRowKey(value: typings.react.mod.Key): Self = this.set("rowKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setIndent(value: Double): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

