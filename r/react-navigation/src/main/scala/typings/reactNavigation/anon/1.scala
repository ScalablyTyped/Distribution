package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigation.mod.NavigationScreenConfig
import typings.reactNavigation.mod.NavigationScreenConfigProps
import typings.reactNavigation.mod.NavigationSwitchProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `1`[Params, ScreenProps] extends js.Object {
  var navigationOptions: js.UndefOr[
    NavigationScreenConfig[
      js.Object, 
      NavigationSwitchProp[NavigationRoute[NavigationParams], Params], 
      ScreenProps
    ]
  ] = js.native
}

object `1` {
  @scala.inline
  def apply[Params, ScreenProps](): `1`[Params, ScreenProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`[Params, ScreenProps]]
  }
  @scala.inline
  implicit class `1Ops`[Self <: `1`[_, _], Params, ScreenProps] (val x: Self with (`1`[Params, ScreenProps])) extends AnyVal {
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
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationSwitchProp[NavigationRoute[NavigationParams], Params], ScreenProps]) with NavigationOptionsOptions[js.Object] => js.Object
    ): Self = this.set("navigationOptions", js.Any.fromFunction1(value))
    @scala.inline
    def setNavigationOptions(
      value: NavigationScreenConfig[
          js.Object, 
          NavigationSwitchProp[NavigationRoute[NavigationParams], Params], 
          ScreenProps
        ]
    ): Self = this.set("navigationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationOptions: Self = this.set("navigationOptions", js.undefined)
  }
  
}

