package typings.reactBootstrapTable2Paginator.mod

import typings.reactBootstrapTableNext.mod.PaginationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationCtxOptions extends js.Object {
  var options: js.UndefOr[PaginationOptions] = js.native
}

object PaginationCtxOptions {
  @scala.inline
  def apply(): PaginationCtxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationCtxOptions]
  }
  @scala.inline
  implicit class PaginationCtxOptionsOps[Self <: PaginationCtxOptions] (val x: Self) extends AnyVal {
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
    def setOptions(value: PaginationOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

