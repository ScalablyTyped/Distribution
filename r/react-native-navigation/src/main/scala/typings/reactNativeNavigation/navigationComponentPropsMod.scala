package typings.reactNativeNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationComponentPropsMod {
  
  @js.native
  trait NavigationComponentProps extends StObject {
    
    var componentId: String = js.native
  }
  object NavigationComponentProps {
    
    @scala.inline
    def apply(componentId: String): NavigationComponentProps = {
      val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationComponentProps]
    }
    
    @scala.inline
    implicit class NavigationComponentPropsMutableBuilder[Self <: NavigationComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentId(value: String): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
    }
  }
}
