package typings.reactBootstrapTableNext.anon

import typings.reactBootstrapTableNext.mod.PaginationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsPaginationOptions extends js.Object {
  var options: js.UndefOr[PaginationOptions] = js.undefined
}

object OptionsPaginationOptions {
  @scala.inline
  def apply(options: PaginationOptions = null): OptionsPaginationOptions = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsPaginationOptions]
  }
}

