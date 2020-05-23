package typings.seneca.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  // Print options. Best used via --seneca.print.options.
  var options: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(options: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(options)) __obj.updateDynamic("options")(options.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

