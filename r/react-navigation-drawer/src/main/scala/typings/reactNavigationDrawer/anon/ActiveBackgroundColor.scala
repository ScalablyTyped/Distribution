package typings.reactNavigationDrawer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveBackgroundColor extends js.Object {
  var activeBackgroundColor: Dark
  var activeTintColor: Dark
  var inactiveBackgroundColor: Dark
  var inactiveTintColor: Dark
}

object ActiveBackgroundColor {
  @scala.inline
  def apply(
    activeBackgroundColor: Dark,
    activeTintColor: Dark,
    inactiveBackgroundColor: Dark,
    inactiveTintColor: Dark
  ): ActiveBackgroundColor = {
    val __obj = js.Dynamic.literal(activeBackgroundColor = activeBackgroundColor.asInstanceOf[js.Any], activeTintColor = activeTintColor.asInstanceOf[js.Any], inactiveBackgroundColor = inactiveBackgroundColor.asInstanceOf[js.Any], inactiveTintColor = inactiveTintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveBackgroundColor]
  }
}

