package typings.storybookRouter

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visibilityMod {
  
  @JSImport("@storybook/router/dist/visibility", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ToggleVisibility(hasHiddenChildren: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ToggleVisibility")(hasHiddenChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var children: ReactNode
    
    var hidden: Boolean
  }
  object Props {
    
    inline def apply(hidden: Boolean): Props = {
      val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    }
  }
}
