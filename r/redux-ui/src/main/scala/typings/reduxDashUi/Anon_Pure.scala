package typings.reduxDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pure extends js.Object {
  var pure: js.UndefOr[Boolean] = js.undefined
  var withRef: js.UndefOr[Boolean] = js.undefined
}

object Anon_Pure {
  @scala.inline
  def apply(pure: js.UndefOr[Boolean] = js.undefined, withRef: js.UndefOr[Boolean] = js.undefined): Anon_Pure = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure)
    if (!js.isUndefined(withRef)) __obj.updateDynamic("withRef")(withRef)
    __obj.asInstanceOf[Anon_Pure]
  }
}

