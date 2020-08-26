package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationScreenConfig
import typings.reactNavigation.mod.NavigationScreenConfigProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationOptions[Options, NavigationScreenPropType] extends js.Object {
  var navigationOptions: js.UndefOr[NavigationScreenConfig[Options, NavigationScreenPropType, _]] = js.native
}

object NavigationOptions {
  @scala.inline
  def apply[Options, NavigationScreenPropType](): NavigationOptions[Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationOptions[Options, NavigationScreenPropType]]
  }
  @scala.inline
  implicit class NavigationOptionsOps[Self <: NavigationOptions[_, _], Options, NavigationScreenPropType] (val x: Self with (NavigationOptions[Options, NavigationScreenPropType])) extends AnyVal {
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
    def setNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationScreenPropType, _]) with NavigationOptionsOptions[Options] => Options
    ): Self = this.set("navigationOptions", js.Any.fromFunction1(value))
    @scala.inline
    def setNavigationOptions(value: NavigationScreenConfig[Options, NavigationScreenPropType, _]): Self = this.set("navigationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationOptions: Self = this.set("navigationOptions", js.undefined)
  }
  
}

