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
    poll: js.UndefOr[Double] = js.undefined
  ): ISatnavOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (!js.isUndefined(html5)) __obj.updateDynamic("html5")(html5.get.asInstanceOf[js.Any])
    if (!js.isUndefined(matchAll)) __obj.updateDynamic("matchAll")(matchAll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(poll)) __obj.updateDynamic("poll")(poll.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISatnavOptions]
  }
}

