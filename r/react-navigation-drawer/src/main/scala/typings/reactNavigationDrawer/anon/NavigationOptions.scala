package typings.reactNavigationDrawer.anon

import typings.reactNavigation.anon.NavigationOptionsOptions
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigation.mod.NavigationScreenConfig
import typings.reactNavigation.mod.NavigationScreenConfigProps
import typings.reactNavigationDrawer.libTypescriptSrcTypesMod.NavigationDrawerOptions
import typings.reactNavigationDrawer.libTypescriptSrcTypesMod.NavigationDrawerProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationOptions[Params, ScreenProps] extends StObject {
  
  var navigationOptions: js.UndefOr[
    NavigationScreenConfig[
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], Params], 
      ScreenProps
    ]
  ] = js.undefined
}
object NavigationOptions {
  
  inline def apply[Params, ScreenProps](): NavigationOptions[Params, ScreenProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationOptions[Params, ScreenProps]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationOptions[?, ?], Params, ScreenProps] (val x: Self & (NavigationOptions[Params, ScreenProps])) extends AnyVal {
    
    inline def setNavigationOptions(
      value: NavigationScreenConfig[
          NavigationDrawerOptions, 
          NavigationDrawerProp[NavigationRoute[NavigationParams], Params], 
          ScreenProps
        ]
    ): Self = StObject.set(x, "navigationOptions", value.asInstanceOf[js.Any])
    
    inline def setNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationDrawerProp[NavigationRoute[NavigationParams], Params], ScreenProps]) & NavigationOptionsOptions[NavigationDrawerOptions] => NavigationDrawerOptions
    ): Self = StObject.set(x, "navigationOptions", js.Any.fromFunction1(value))
    
    inline def setNavigationOptionsUndefined: Self = StObject.set(x, "navigationOptions", js.undefined)
  }
}
