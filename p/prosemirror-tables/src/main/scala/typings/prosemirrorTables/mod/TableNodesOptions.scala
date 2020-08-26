package typings.prosemirrorTables.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableNodesOptions extends js.Object {
  var cellAttributes: StringDictionary[CellAttributes] = js.native
  var cellContent: String = js.native
  var tableGroup: js.UndefOr[String] = js.native
}

object TableNodesOptions {
  @scala.inline
  def apply(cellAttributes: StringDictionary[CellAttributes], cellContent: String): TableNodesOptions = {
    val __obj = js.Dynamic.literal(cellAttributes = cellAttributes.asInstanceOf[js.Any], cellContent = cellContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableNodesOptions]
  }
  @scala.inline
  implicit class TableNodesOptionsOps[Self <: TableNodesOptions] (val x: Self) extends AnyVal {
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
    def setCellAttributes(value: StringDictionary[CellAttributes]): Self = this.set("cellAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellContent(value: String): Self = this.set("cellContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableGroup(value: String): Self = this.set("tableGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableGroup: Self = this.set("tableGroup", js.undefined)
  }
  
}

