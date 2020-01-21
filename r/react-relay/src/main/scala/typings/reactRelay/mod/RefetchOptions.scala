package typings.reactRelay.mod

import typings.reactRelay.reactRelayStrings.`network-only`
import typings.reactRelay.reactRelayStrings.`store-or-network`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefetchOptions extends js.Object {
  var fetchPolicy: js.UndefOr[`store-or-network` | `network-only`] = js.undefined
  var force: js.UndefOr[Boolean] = js.undefined
}

object RefetchOptions {
  @scala.inline
  def apply(fetchPolicy: `store-or-network` | `network-only` = null, force: js.UndefOr[Boolean] = js.undefined): RefetchOptions = {
    val __obj = js.Dynamic.literal()
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefetchOptions]
  }
}

