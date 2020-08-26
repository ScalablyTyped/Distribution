package typings.rcTable.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnGroupType[RecordType] extends ColumnSharedType[RecordType] {
  var children: ColumnsType[RecordType] = js.native
}

object ColumnGroupType {
  @scala.inline
  def apply[RecordType](children: ColumnsType[RecordType]): ColumnGroupType[RecordType] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGroupType[RecordType]]
  }
  @scala.inline
  implicit class ColumnGroupTypeOps[Self <: ColumnGroupType[_], RecordType] (val x: Self with ColumnGroupType[RecordType]) extends AnyVal {
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
    def setChildrenVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: ColumnsType[RecordType]): Self = this.set("children", value.asInstanceOf[js.Any])
  }
  
}

