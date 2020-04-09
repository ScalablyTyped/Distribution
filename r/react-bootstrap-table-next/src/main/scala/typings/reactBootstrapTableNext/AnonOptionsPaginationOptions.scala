package typings.reactBootstrapTableNext

import typings.reactBootstrapTableNext.mod.PaginationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptionsPaginationOptions extends js.Object {
  var options: js.UndefOr[PaginationOptions] = js.undefined
}

object AnonOptionsPaginationOptions {
  @scala.inline
  def apply(options: PaginationOptions = null): AnonOptionsPaginationOptions = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptionsPaginationOptions]
  }
}

