package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseTableColumnOptions[D /* <: js.Object */] extends js.Object {
  var Header: js.UndefOr[Renderer[HeaderProps[D]]] = js.native
  var id: js.UndefOr[IdType[D]] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double | String] = js.native
}

object UseTableColumnOptions {
  @scala.inline
  def apply[/* <: js.Object */ D](): UseTableColumnOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseTableColumnOptions[D]]
  }
  @scala.inline
  implicit class UseTableColumnOptionsOps[Self <: UseTableColumnOptions[_], /* <: js.Object */ D] (val x: Self with UseTableColumnOptions[D]) extends AnyVal {
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
    def setHeader(value: Renderer[HeaderProps[D]]): Self = this.set("Header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("Header", js.undefined)
    @scala.inline
    def setId(value: IdType[D]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

