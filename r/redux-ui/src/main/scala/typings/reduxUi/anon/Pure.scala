package typings.reduxUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pure extends js.Object {
  var pure: js.UndefOr[Boolean] = js.undefined
  var withRef: js.UndefOr[Boolean] = js.undefined
}

object Pure {
  @scala.inline
  def apply(pure: js.UndefOr[Boolean] = js.undefined, withRef: js.UndefOr[Boolean] = js.undefined): Pure = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withRef)) __obj.updateDynamic("withRef")(withRef.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pure]
  }
}

