package typings.reactNavigationCore.anon

import typings.reactNavigationCore.libTypescriptSrcTypesMod.NavigationHelpersCommon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationNavigationHelpersCommon extends StObject {
  
  var navigation: NavigationHelpersCommon[Any, Any]
}
object NavigationNavigationHelpersCommon {
  
  inline def apply(navigation: NavigationHelpersCommon[Any, Any]): NavigationNavigationHelpersCommon = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationNavigationHelpersCommon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationNavigationHelpersCommon] (val x: Self) extends AnyVal {
    
    inline def setNavigation(value: NavigationHelpersCommon[Any, Any]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
  }
}
