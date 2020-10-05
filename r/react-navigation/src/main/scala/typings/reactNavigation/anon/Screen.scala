package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Screen[Options, NavigationScreenPropType] extends js.Object {
  var screen: NavigationComponent[Options, NavigationScreenPropType] = js.native
}

object Screen {
  @scala.inline
  def apply[Options, NavigationScreenPropType](screen: NavigationComponent[Options, NavigationScreenPropType]): Screen[Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal(screen = screen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Screen[Options, NavigationScreenPropType]]
  }
  @scala.inline
  implicit class ScreenOps[Self <: Screen[_, _], Options, NavigationScreenPropType] (val x: Self with (Screen[Options, NavigationScreenPropType])) extends AnyVal {
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
    def setScreen(value: NavigationComponent[Options, NavigationScreenPropType]): Self = this.set("screen", value.asInstanceOf[js.Any])
  }
  
}

