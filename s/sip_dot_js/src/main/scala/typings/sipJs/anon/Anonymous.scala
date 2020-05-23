package typings.sipJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anonymous extends js.Object {
  var anonymous: js.UndefOr[Boolean] = js.undefined
  var outbound: js.UndefOr[Boolean] = js.undefined
}

object Anonymous {
  @scala.inline
  def apply(anonymous: js.UndefOr[Boolean] = js.undefined, outbound: js.UndefOr[Boolean] = js.undefined): Anonymous = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anonymous)) __obj.updateDynamic("anonymous")(anonymous.get.asInstanceOf[js.Any])
    if (!js.isUndefined(outbound)) __obj.updateDynamic("outbound")(outbound.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anonymous]
  }
}

