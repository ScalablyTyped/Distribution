package typings.satnav

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISatnavOptions extends js.Object {
  var force: js.UndefOr[Boolean] = js.undefined
  var html5: js.UndefOr[Boolean] = js.undefined
  var matchAll: js.UndefOr[Boolean] = js.undefined
  var poll: js.UndefOr[Double] = js.undefined
}

object ISatnavOptions {
  @scala.inline
  def apply(
    force: js.UndefOr[Boolean] = js.undefined,
    html5: js.UndefOr[Boolean] = js.undefined,
    matchAll: js.UndefOr[Boolean] = js.undefined,
    poll: Int | Double = null
  ): ISatnavOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (!js.isUndefined(html5)) __obj.updateDynamic("html5")(html5.asInstanceOf[js.Any])
    if (!js.isUndefined(matchAll)) __obj.updateDynamic("matchAll")(matchAll.asInstanceOf[js.Any])
    if (poll != null) __obj.updateDynamic("poll")(poll.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISatnavOptions]
  }
}

