package typings.reactBootstrapTable2Paginator.mod

import typings.reactBootstrapTable2Paginator.reactBootstrapTable2PaginatorStrings.dropdown
import typings.reactBootstrapTable2Paginator.reactBootstrapTable2PaginatorStrings.dropup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizePerPageDropdownStandaloneProps extends PaginationChildProps {
  var btnContextual: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var open: js.UndefOr[Boolean] = js.native
  var variation: js.UndefOr[dropdown | dropup] = js.native
}

object SizePerPageDropdownStandaloneProps {
  @scala.inline
  def apply(): SizePerPageDropdownStandaloneProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizePerPageDropdownStandaloneProps]
  }
  @scala.inline
  implicit class SizePerPageDropdownStandalonePropsOps[Self <: SizePerPageDropdownStandaloneProps] (val x: Self) extends AnyVal {
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
    def setBtnContextual(value: Boolean): Self = this.set("btnContextual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBtnContextual: Self = this.set("btnContextual", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setVariation(value: dropdown | dropup): Self = this.set("variation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariation: Self = this.set("variation", js.undefined)
  }
  
}

