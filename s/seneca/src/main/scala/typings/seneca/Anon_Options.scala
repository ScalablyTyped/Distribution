package typings.seneca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  // Print options. Best used via --seneca.print.options.
  var options: js.UndefOr[Boolean] = js.undefined
}

object Anon_Options {
  @scala.inline
  def apply(options: js.UndefOr[Boolean] = js.undefined): Anon_Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(options)) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Options]
  }
}

