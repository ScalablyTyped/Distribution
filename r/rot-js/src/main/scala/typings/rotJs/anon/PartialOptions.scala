package typings.rotJs.anon

import typings.rotJs.rotJsNumbers.`4`
import typings.rotJs.rotJsNumbers.`6`
import typings.rotJs.rotJsNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rot-js.rot-js/lib/path/path.Options> */
trait PartialOptions extends js.Object {
  var topology: js.UndefOr[`4` | `6` | `8`] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(topology: `4` | `6` | `8` = null): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (topology != null) __obj.updateDynamic("topology")(topology.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

