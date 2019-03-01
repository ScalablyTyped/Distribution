package typings
package restlingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  var options: js.UndefOr[restlingLib.restlingMod.RestlingOptions] = js.undefined
  var url: java.lang.String
}

object Anon_Options {
  @scala.inline
  def apply(url: java.lang.String, options: restlingLib.restlingMod.RestlingOptions = null): Anon_Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Anon_Options]
  }
}

