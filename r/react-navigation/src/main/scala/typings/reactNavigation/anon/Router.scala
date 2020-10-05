package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationRouter
import typings.reactNavigation.mod.NavigationScreenConfig
import typings.reactNavigation.mod.NavigationScreenConfigProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Router[Options, NavigationPropType] extends js.Object {
  var navigationOptions: js.UndefOr[NavigationScreenConfig[Options, NavigationPropType, _]] = js.native
  var router: NavigationRouter[Options, js.Object] = js.native
}

object Router {
  @scala.inline
  def apply[Options, NavigationPropType](router: NavigationRouter[Options, js.Object]): Router[Options, NavigationPropType] = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[Router[Options, NavigationPropType]]
  }
  @scala.inline
  implicit class RouterOps[Self <: Router[_, _], Options, NavigationPropType] (val x: Self with (Router[Options, NavigationPropType])) extends AnyVal {
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
    def setRouter(value: NavigationRouter[Options, js.Object]): Self = this.set("router", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationPropType, _]) with NavigationOptionsOptions[Options] => Options
    ): Self = this.set("navigationOptions", js.Any.fromFunction1(value))
    @scala.inline
    def setNavigationOptions(value: NavigationScreenConfig[Options, NavigationPropType, _]): Self = this.set("navigationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationOptions: Self = this.set("navigationOptions", js.undefined)
  }
  
}

