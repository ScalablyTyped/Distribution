package typings.sipDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Anonymous extends js.Object {
  var anonymous: js.UndefOr[Boolean] = js.undefined
  var outbound: js.UndefOr[Boolean] = js.undefined
}

object Anon_Anonymous {
  @scala.inline
  def apply(anonymous: js.UndefOr[Boolean] = js.undefined, outbound: js.UndefOr[Boolean] = js.undefined): Anon_Anonymous = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anonymous)) __obj.updateDynamic("anonymous")(anonymous.asInstanceOf[js.Any])
    if (!js.isUndefined(outbound)) __obj.updateDynamic("outbound")(outbound.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Anonymous]
  }
}

