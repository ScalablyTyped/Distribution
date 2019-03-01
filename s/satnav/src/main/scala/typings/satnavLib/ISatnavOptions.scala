package typings
package satnavLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISatnavOptions extends js.Object {
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var html5: js.UndefOr[scala.Boolean] = js.undefined
  var matchAll: js.UndefOr[scala.Boolean] = js.undefined
  var poll: js.UndefOr[scala.Double] = js.undefined
}

object ISatnavOptions {
  @scala.inline
  def apply(
    force: js.UndefOr[scala.Boolean] = js.undefined,
    html5: js.UndefOr[scala.Boolean] = js.undefined,
    matchAll: js.UndefOr[scala.Boolean] = js.undefined,
    poll: scala.Int | scala.Double = null
  ): ISatnavOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (!js.isUndefined(html5)) __obj.updateDynamic("html5")(html5)
    if (!js.isUndefined(matchAll)) __obj.updateDynamic("matchAll")(matchAll)
    if (poll != null) __obj.updateDynamic("poll")(poll.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISatnavOptions]
  }
}

