package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationScreenComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScreen[Options, NavigationScreenPropType] extends StObject {
  
  def getScreen(): NavigationScreenComponent[Options, NavigationScreenPropType]
}
object GetScreen {
  
  inline def apply[Options, NavigationScreenPropType](getScreen: () => NavigationScreenComponent[Options, NavigationScreenPropType]): GetScreen[Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal(getScreen = js.Any.fromFunction0(getScreen))
    __obj.asInstanceOf[GetScreen[Options, NavigationScreenPropType]]
  }
  
  extension [Self <: GetScreen[?, ?], Options, NavigationScreenPropType](x: Self & (GetScreen[Options, NavigationScreenPropType])) {
    
    inline def setGetScreen(value: () => NavigationScreenComponent[Options, NavigationScreenPropType]): Self = StObject.set(x, "getScreen", js.Any.fromFunction0(value))
  }
}
