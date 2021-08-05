package typings.reactMdMenu

import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object orientationMod {
  
  @JSImport("@react-md/menu/types/Orientation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/menu/types/Orientation", "OrientationProvider")
  @js.native
  val OrientationProvider: FC[OrientationProviderProps] = js.native
  
  inline def useOrientation(): MenuOrientation = ^.asInstanceOf[js.Dynamic].applyDynamic("useOrientation")().asInstanceOf[MenuOrientation]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdMenu.reactMdMenuStrings.horizontal
    - typings.reactMdMenu.reactMdMenuStrings.vertical
  */
  trait MenuOrientation extends StObject
  object MenuOrientation {
    
    inline def horizontal: typings.reactMdMenu.reactMdMenuStrings.horizontal = "horizontal".asInstanceOf[typings.reactMdMenu.reactMdMenuStrings.horizontal]
    
    inline def vertical: typings.reactMdMenu.reactMdMenuStrings.vertical = "vertical".asInstanceOf[typings.reactMdMenu.reactMdMenuStrings.vertical]
  }
  
  trait OrientationProviderProps extends StObject {
    
    var children: ReactNode
    
    var orientation: MenuOrientation
  }
  object OrientationProviderProps {
    
    inline def apply(orientation: MenuOrientation): OrientationProviderProps = {
      val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrientationProviderProps]
    }
    
    extension [Self <: OrientationProviderProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOrientation(value: MenuOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    }
  }
}
