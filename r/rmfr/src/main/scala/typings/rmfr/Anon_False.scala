package typings.rmfr

import typings.glob.globMod.IOptions
import typings.rmfr.rmfrNumbers.`false`
import typings.rmfr.rmfrNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False extends js.Object {
  var glob: js.UndefOr[IOptions | `false` | `true`] = js.undefined
}

object Anon_False {
  @scala.inline
  def apply(glob: IOptions | `false` | `true` = null): Anon_False = {
    val __obj = js.Dynamic.literal()
    if (glob != null) __obj.updateDynamic("glob")(glob.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_False]
  }
}

