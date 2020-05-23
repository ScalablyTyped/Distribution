package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShadowRootInit extends js.Object {
  var delegatesFocus: js.UndefOr[scala.Boolean] = js.undefined
  var mode: ShadowRootMode
}

object ShadowRootInit {
  @scala.inline
  def apply(mode: ShadowRootMode, delegatesFocus: js.UndefOr[scala.Boolean] = js.undefined): ShadowRootInit = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    if (!js.isUndefined(delegatesFocus)) __obj.updateDynamic("delegatesFocus")(delegatesFocus.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowRootInit]
  }
}

