package typings.reactBootstrapTable2Paginator.mod

import typings.reactBootstrapTableNext.mod.PaginationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationCtxOptions extends js.Object {
  var options: js.UndefOr[PaginationOptions] = js.undefined
}

object PaginationCtxOptions {
  @scala.inline
  def apply(options: PaginationOptions = null): PaginationCtxOptions = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationCtxOptions]
  }
}

