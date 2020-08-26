package typings.reactToolbox.tableTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableTheme extends js.Object {
  /**
    * Used for the `thead` element.
    */
  var head: js.UndefOr[String] = js.native
  /**
    * Used for the root element of the component (`table`).
    */
  var table: js.UndefOr[String] = js.native
}

object TableTheme {
  @scala.inline
  def apply(): TableTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableTheme]
  }
  @scala.inline
  implicit class TableThemeOps[Self <: TableTheme] (val x: Self) extends AnyVal {
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
    def setHead(value: String): Self = this.set("head", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHead: Self = this.set("head", js.undefined)
    @scala.inline
    def setTable(value: String): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
  }
  
}

