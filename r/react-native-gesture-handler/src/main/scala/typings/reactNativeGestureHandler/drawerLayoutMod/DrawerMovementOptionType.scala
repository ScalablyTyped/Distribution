package typings.reactNativeGestureHandler.drawerLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerMovementOptionType extends js.Object {
  var velocity: js.UndefOr[Double] = js.undefined
}

object DrawerMovementOptionType {
  @scala.inline
  def apply(velocity: js.UndefOr[Double] = js.undefined): DrawerMovementOptionType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(velocity)) __obj.updateDynamic("velocity")(velocity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerMovementOptionType]
  }
}

