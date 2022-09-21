package typings.reactMdMenu

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMdMenu.typesMod.MenuOrientationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuKeyboardFocusProviderMod {
  
  @JSImport("@react-md/menu/types/MenuKeyboardFocusProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MenuKeyboardFocusProvider(hasHorizontalChildren: MenuKeyboardFocusProviderProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuKeyboardFocusProvider")(hasHorizontalChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait MenuKeyboardFocusProviderProps
    extends StObject
       with MenuOrientationProps {
    
    var children: ReactNode
  }
  object MenuKeyboardFocusProviderProps {
    
    inline def apply(): MenuKeyboardFocusProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuKeyboardFocusProviderProps]
    }
    
    extension [Self <: MenuKeyboardFocusProviderProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
