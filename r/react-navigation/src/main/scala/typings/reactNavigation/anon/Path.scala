package typings.reactNavigation.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNavigation.mod.NavigationScreenConfig
import typings.reactNavigation.mod.NavigationScreenConfigProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Path[Options, NavigationScreenPropType, ScreenProps] extends js.Object {
  
  var navigationOptions: js.UndefOr[NavigationScreenConfig[Options, NavigationScreenPropType, ScreenProps]] = js.native
  
  var params: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var path: js.UndefOr[String] = js.native
}
object Path {
  
  @scala.inline
  def apply[Options, NavigationScreenPropType, ScreenProps](): Path[Options, NavigationScreenPropType, ScreenProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Path[Options, NavigationScreenPropType, ScreenProps]]
  }
  
  @scala.inline
  implicit class PathOps[Self <: Path[_, _, _], Options, NavigationScreenPropType, ScreenProps] (val x: Self with (Path[Options, NavigationScreenPropType, ScreenProps])) extends AnyVal {
    
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
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationScreenPropType, ScreenProps]) with NavigationOptionsOptions[Options] => Options
    ): Self = this.set("navigationOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNavigationOptions(value: NavigationScreenConfig[Options, NavigationScreenPropType, ScreenProps]): Self = this.set("navigationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigationOptions: Self = this.set("navigationOptions", js.undefined)
    
    @scala.inline
    def setParams(value: StringDictionary[js.Any]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
