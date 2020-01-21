package typings.rmfr

import typings.glob.mod.IOptions
import typings.rmfr.rmfrBooleans.`false`
import typings.rmfr.rmfrBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFalse extends js.Object {
  var glob: js.UndefOr[IOptions | `false` | `true`] = js.undefined
}

object AnonFalse {
  @scala.inline
  def apply(glob: IOptions | `false` | `true` = null): AnonFalse = {
    val __obj = js.Dynamic.literal()
    if (glob != null) __obj.updateDynamic("glob")(glob.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFalse]
  }
}

