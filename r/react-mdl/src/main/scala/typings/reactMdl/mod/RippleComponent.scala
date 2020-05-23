package typings.reactMdl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RippleComponent extends js.Object {
  var ripple: js.UndefOr[Boolean] = js.undefined
}

object RippleComponent {
  @scala.inline
  def apply(ripple: js.UndefOr[Boolean] = js.undefined): RippleComponent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ripple)) __obj.updateDynamic("ripple")(ripple.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleComponent]
  }
}

