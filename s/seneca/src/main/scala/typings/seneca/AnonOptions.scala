package typings.seneca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptions extends js.Object {
  // Print options. Best used via --seneca.print.options.
  var options: js.UndefOr[Boolean] = js.undefined
}

object AnonOptions {
  @scala.inline
  def apply(options: js.UndefOr[Boolean] = js.undefined): AnonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(options)) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptions]
  }
}

