package typings.reactNavigation

import typings.reactNavigation.mod.NavigationComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScreen[Options, NavigationScreenPropType] extends js.Object {
  var screen: NavigationComponent[Options, NavigationScreenPropType]
}

object AnonScreen {
  @scala.inline
  def apply[Options, NavigationScreenPropType](screen: NavigationComponent[Options, NavigationScreenPropType]): AnonScreen[Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal(screen = screen.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScreen[Options, NavigationScreenPropType]]
  }
}

