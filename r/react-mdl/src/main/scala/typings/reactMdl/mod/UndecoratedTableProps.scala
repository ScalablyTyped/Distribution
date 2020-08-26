package typings.reactMdl.mod

import typings.react.mod.ClassAttributes
import typings.react.mod.DOMAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UndecoratedTableProps
  extends ClassAttributes[js.Any]
     with MDLHTMLAttributes
     with DOMAttributes[UndecoratedTable]
     with ShadowedComponent {
  var name: js.UndefOr[String] = js.native
  var rowKeyColumn: js.UndefOr[String] = js.native
  var rows: js.Array[_] = js.native
  var title: js.UndefOr[String] = js.native
}

object UndecoratedTableProps {
  @scala.inline
  def apply(rows: js.Array[_]): UndecoratedTableProps = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[UndecoratedTableProps]
  }
  @scala.inline
  implicit class UndecoratedTablePropsOps[Self <: UndecoratedTableProps] (val x: Self) extends AnyVal {
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
    def setRowsVarargs(value: js.Any*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[_]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRowKeyColumn(value: String): Self = this.set("rowKeyColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowKeyColumn: Self = this.set("rowKeyColumn", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

