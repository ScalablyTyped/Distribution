package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationOrientationInjectedProps extends StObject {
  
  var isLandscape: Boolean
}
object NavigationOrientationInjectedProps {
  
  inline def apply(isLandscape: Boolean): NavigationOrientationInjectedProps = {
    val __obj = js.Dynamic.literal(isLandscape = isLandscape.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationOrientationInjectedProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationOrientationInjectedProps] (val x: Self) extends AnyVal {
    
    inline def setIsLandscape(value: Boolean): Self = StObject.set(x, "isLandscape", value.asInstanceOf[js.Any])
  }
}
