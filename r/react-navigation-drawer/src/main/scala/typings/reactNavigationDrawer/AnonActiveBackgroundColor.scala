package typings.reactNavigationDrawer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActiveBackgroundColor extends js.Object {
  var activeBackgroundColor: AnonDark
  var activeTintColor: AnonDark
  var inactiveBackgroundColor: AnonDark
  var inactiveTintColor: AnonDark
}

object AnonActiveBackgroundColor {
  @scala.inline
  def apply(
    activeBackgroundColor: AnonDark,
    activeTintColor: AnonDark,
    inactiveBackgroundColor: AnonDark,
    inactiveTintColor: AnonDark
  ): AnonActiveBackgroundColor = {
    val __obj = js.Dynamic.literal(activeBackgroundColor = activeBackgroundColor.asInstanceOf[js.Any], activeTintColor = activeTintColor.asInstanceOf[js.Any], inactiveBackgroundColor = inactiveBackgroundColor.asInstanceOf[js.Any], inactiveTintColor = inactiveTintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActiveBackgroundColor]
  }
}

