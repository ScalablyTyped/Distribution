package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationScreenComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetScreen[Options, NavigationScreenPropType] extends js.Object {
  def getScreen(): NavigationScreenComponent[Options, NavigationScreenPropType]
}

object GetScreen {
  @scala.inline
  def apply[Options, NavigationScreenPropType](getScreen: () => NavigationScreenComponent[Options, NavigationScreenPropType]): GetScreen[Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal(getScreen = js.Any.fromFunction0(getScreen))
    __obj.asInstanceOf[GetScreen[Options, NavigationScreenPropType]]
  }
}

