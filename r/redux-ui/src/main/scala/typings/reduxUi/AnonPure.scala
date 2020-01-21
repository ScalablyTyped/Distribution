package typings.reduxUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPure extends js.Object {
  var pure: js.UndefOr[Boolean] = js.undefined
  var withRef: js.UndefOr[Boolean] = js.undefined
}

object AnonPure {
  @scala.inline
  def apply(pure: js.UndefOr[Boolean] = js.undefined, withRef: js.UndefOr[Boolean] = js.undefined): AnonPure = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure.asInstanceOf[js.Any])
    if (!js.isUndefined(withRef)) __obj.updateDynamic("withRef")(withRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPure]
  }
}

