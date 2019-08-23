package typings.reactDashNativeDashGestureDashHandler.drawerLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerMovementOptionType extends js.Object {
  var velocity: js.UndefOr[Double] = js.undefined
}

object DrawerMovementOptionType {
  @scala.inline
  def apply(velocity: Int | Double = null): DrawerMovementOptionType = {
    val __obj = js.Dynamic.literal()
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerMovementOptionType]
  }
}

