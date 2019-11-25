package typings.restling

import typings.restling.restlingMod.RestlingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  var options: js.UndefOr[RestlingOptions] = js.undefined
  var url: String
}

object Anon_Options {
  @scala.inline
  def apply(url: String, options: RestlingOptions = null): Anon_Options = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Options]
  }
}

