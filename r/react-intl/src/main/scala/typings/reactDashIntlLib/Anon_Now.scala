package typings
package reactDashIntlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Now extends js.Object {
  var now: js.UndefOr[js.Any] = js.undefined
}

object Anon_Now {
  @scala.inline
  def apply(now: js.Any = null): Anon_Now = {
    val __obj = js.Dynamic.literal()
    if (now != null) __obj.updateDynamic("now")(now)
    __obj.asInstanceOf[Anon_Now]
  }
}

