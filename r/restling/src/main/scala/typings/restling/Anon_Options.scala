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
    val __obj = js.Dynamic.literal(url = url)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Anon_Options]
  }
}

