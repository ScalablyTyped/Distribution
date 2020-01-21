package typings.restling

import typings.restling.mod.RestlingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptions extends js.Object {
  var options: js.UndefOr[RestlingOptions] = js.undefined
  var url: String
}

object AnonOptions {
  @scala.inline
  def apply(url: String, options: RestlingOptions = null): AnonOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptions]
  }
}

