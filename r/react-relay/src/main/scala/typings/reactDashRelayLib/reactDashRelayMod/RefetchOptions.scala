package typings
package reactDashRelayLib.reactDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefetchOptions extends js.Object {
  var fetchPolicy: js.UndefOr[
    reactDashRelayLib.reactDashRelayLibStrings.`store-or-network` | reactDashRelayLib.reactDashRelayLibStrings.`network-only`
  ] = js.undefined
  var force: js.UndefOr[scala.Boolean] = js.undefined
}

object RefetchOptions {
  @scala.inline
  def apply(
    fetchPolicy: reactDashRelayLib.reactDashRelayLibStrings.`store-or-network` | reactDashRelayLib.reactDashRelayLibStrings.`network-only` = null,
    force: js.UndefOr[scala.Boolean] = js.undefined
  ): RefetchOptions = {
    val __obj = js.Dynamic.literal()
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    __obj.asInstanceOf[RefetchOptions]
  }
}

