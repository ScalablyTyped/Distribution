package typings.reactNavigation.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNavigation.mod.NavigationScreenConfig
import typings.reactNavigation.mod.NavigationScreenConfigProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path[Options, NavigationScreenPropType, ScreenProps] extends StObject {
  
  var navigationOptions: js.UndefOr[NavigationScreenConfig[Options, NavigationScreenPropType, ScreenProps]] = js.undefined
  
  var params: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
}
object Path {
  
  @scala.inline
  def apply[Options, NavigationScreenPropType, ScreenProps](): Path[Options, NavigationScreenPropType, ScreenProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Path[Options, NavigationScreenPropType, ScreenProps]]
  }
  
  @scala.inline
  implicit class PathMutableBuilder[Self <: Path[?, ?, ?], Options, NavigationScreenPropType, ScreenProps] (val x: Self & (Path[Options, NavigationScreenPropType, ScreenProps])) extends AnyVal {
    
    @scala.inline
    def setNavigationOptions(value: NavigationScreenConfig[Options, NavigationScreenPropType, ScreenProps]): Self = StObject.set(x, "navigationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationScreenPropType, ScreenProps]) & NavigationOptionsOptions[Options] => Options
    ): Self = StObject.set(x, "navigationOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNavigationOptionsUndefined: Self = StObject.set(x, "navigationOptions", js.undefined)
    
    @scala.inline
    def setParams(value: StringDictionary[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
