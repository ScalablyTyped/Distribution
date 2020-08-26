package typings.reactabularTable.mod

import typings.react.mod.global.JSX.Element
import typings.reactabularTable.anon.Cell
import typings.reactabularTable.anon.Row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderers extends js.Object {
  var body: js.UndefOr[Row] = js.native
  var header: js.UndefOr[Cell] = js.native
  var table: js.UndefOr[String | js.Function0[Element]] = js.native
}

object Renderers {
  @scala.inline
  def apply(): Renderers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Renderers]
  }
  @scala.inline
  implicit class RenderersOps[Self <: Renderers] (val x: Self) extends AnyVal {
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
    def setBody(value: Row): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setHeader(value: Cell): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setTableFunction0(value: () => Element): Self = this.set("table", js.Any.fromFunction0(value))
    @scala.inline
    def setTable(value: String | js.Function0[Element]): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
  }
  
}

