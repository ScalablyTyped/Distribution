package typings.reactNativeNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcInterfacesNavigationComponentPropsMod {
  
  trait NavigationComponentProps extends StObject {
    
    var componentId: String
  }
  object NavigationComponentProps {
    
    inline def apply(componentId: String): NavigationComponentProps = {
      val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationComponentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavigationComponentProps] (val x: Self) extends AnyVal {
      
      inline def setComponentId(value: String): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
    }
  }
}
