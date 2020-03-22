package typings.rotJs

import typings.rotJs.rotJsNumbers.`4`
import typings.rotJs.rotJsNumbers.`6`
import typings.rotJs.rotJsNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rot-js.rot-js/lib/map/cellular.Options> */
trait PartialOptionsBorn extends js.Object {
  var born: js.UndefOr[js.Array[Double]] = js.undefined
  var survive: js.UndefOr[js.Array[Double]] = js.undefined
  var topology: js.UndefOr[`4` | `6` | `8`] = js.undefined
}

object PartialOptionsBorn {
  @scala.inline
  def apply(born: js.Array[Double] = null, survive: js.Array[Double] = null, topology: `4` | `6` | `8` = null): PartialOptionsBorn = {
    val __obj = js.Dynamic.literal()
    if (born != null) __obj.updateDynamic("born")(born.asInstanceOf[js.Any])
    if (survive != null) __obj.updateDynamic("survive")(survive.asInstanceOf[js.Any])
    if (topology != null) __obj.updateDynamic("topology")(topology.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptionsBorn]
  }
}

