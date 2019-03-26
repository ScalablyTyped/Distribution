package typings
package reactDashNativeDashUuidLib.reactDashNativeDashUuidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait v4 extends js.Object {
  var random: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var rng: js.UndefOr[js.Function1[/* args */ js.Any, scala.Unit]] = js.undefined
}

object v4 {
  @scala.inline
  def apply(random: js.Array[scala.Double] = null, rng: /* args */ js.Any => scala.Unit = null): v4 = {
    val __obj = js.Dynamic.literal()
    if (random != null) __obj.updateDynamic("random")(random)
    if (rng != null) __obj.updateDynamic("rng")(js.Any.fromFunction1(rng))
    __obj.asInstanceOf[v4]
  }
}

