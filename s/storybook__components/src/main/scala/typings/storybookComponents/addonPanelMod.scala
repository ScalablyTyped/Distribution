package typings.storybookComponents

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addonPanelMod {
  
  @JSImport("@storybook/components/dist/addon-panel/addon-panel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def AddonPanel(hasActiveChildren: AddonPanelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AddonPanel")(hasActiveChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait AddonPanelProps extends StObject {
    
    var active: Boolean
    
    var children: ReactNode
  }
  object AddonPanelProps {
    
    inline def apply(active: Boolean): AddonPanelProps = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddonPanelProps]
    }
    
    extension [Self <: AddonPanelProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
