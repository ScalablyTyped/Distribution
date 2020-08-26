package typings.rcTable.colGroupMod

import typings.rcTable.interfaceMod.ColumnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColGroupProps[RecordType] extends js.Object {
  var colWidths: js.Array[Double | String] = js.native
  var columCount: js.UndefOr[Double] = js.native
  var columns: js.UndefOr[js.Array[ColumnType[RecordType]]] = js.native
}

object ColGroupProps {
  @scala.inline
  def apply[RecordType](colWidths: js.Array[Double | String]): ColGroupProps[RecordType] = {
    val __obj = js.Dynamic.literal(colWidths = colWidths.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColGroupProps[RecordType]]
  }
  @scala.inline
  implicit class ColGroupPropsOps[Self <: ColGroupProps[_], RecordType] (val x: Self with ColGroupProps[RecordType]) extends AnyVal {
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
    def setColWidthsVarargs(value: (Double | String)*): Self = this.set("colWidths", js.Array(value :_*))
    @scala.inline
    def setColWidths(value: js.Array[Double | String]): Self = this.set("colWidths", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumCount(value: Double): Self = this.set("columCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumCount: Self = this.set("columCount", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: ColumnType[RecordType]*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[ColumnType[RecordType]]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
  }
  
}

