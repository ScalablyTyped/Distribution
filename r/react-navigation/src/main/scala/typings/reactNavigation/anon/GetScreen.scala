package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationScreenComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetScreen[Options, NavigationScreenPropType] extends js.Object {
  def getScreen(): NavigationScreenComponent[Options, NavigationScreenPropType] = js.native
}

object GetScreen {
  @scala.inline
  def apply[Options, NavigationScreenPropType](getScreen: () => NavigationScreenComponent[Options, NavigationScreenPropType]): GetScreen[Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal(getScreen = js.Any.fromFunction0(getScreen))
    __obj.asInstanceOf[GetScreen[Options, NavigationScreenPropType]]
  }
  @scala.inline
  implicit class GetScreenOps[Self <: GetScreen[_, _], Options, NavigationScreenPropType] (val x: Self with (GetScreen[Options, NavigationScreenPropType])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetScreen(value: () => NavigationScreenComponent[Options, NavigationScreenPropType]): Self = this.set("getScreen", js.Any.fromFunction0(value))
  }
  
}

