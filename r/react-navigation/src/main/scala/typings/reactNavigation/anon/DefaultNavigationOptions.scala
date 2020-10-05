package typings.reactNavigation.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigation.mod.NavigationScreenConfig
import typings.reactNavigation.mod.NavigationScreenConfigProps
import typings.reactNavigation.mod.NavigationScreenProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultNavigationOptions[Options, NavigationScreenPropType] extends js.Object {
  var defaultNavigationOptions: js.UndefOr[NavigationScreenConfig[Options, NavigationScreenPropType, _]] = js.native
  var navigationOptions: js.UndefOr[
    NavigationScreenConfig[
      StringDictionary[_], 
      NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], 
      _
    ]
  ] = js.native
}

object DefaultNavigationOptions {
  @scala.inline
  def apply[Options, NavigationScreenPropType](): DefaultNavigationOptions[Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultNavigationOptions[Options, NavigationScreenPropType]]
  }
  @scala.inline
  implicit class DefaultNavigationOptionsOps[Self <: DefaultNavigationOptions[_, _], Options, NavigationScreenPropType] (val x: Self with (DefaultNavigationOptions[Options, NavigationScreenPropType])) extends AnyVal {
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
    def setDefaultNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationScreenPropType, _]) with NavigationOptionsOptions[Options] => Options
    ): Self = this.set("defaultNavigationOptions", js.Any.fromFunction1(value))
    @scala.inline
    def setDefaultNavigationOptions(value: NavigationScreenConfig[Options, NavigationScreenPropType, _]): Self = this.set("defaultNavigationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultNavigationOptions: Self = this.set("defaultNavigationOptions", js.undefined)
    @scala.inline
    def setNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], _]) with NavigationOptionsOptions[StringDictionary[_]] => StringDictionary[_]
    ): Self = this.set("navigationOptions", js.Any.fromFunction1(value))
    @scala.inline
    def setNavigationOptions(
      value: NavigationScreenConfig[
          StringDictionary[_], 
          NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], 
          _
        ]
    ): Self = this.set("navigationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationOptions: Self = this.set("navigationOptions", js.undefined)
  }
  
}

