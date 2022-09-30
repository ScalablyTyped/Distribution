package typings.reactNativeDraggableFlatlist

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cellContextMod {
  
  @JSImport("react-native-draggable-flatlist/lib/context/cellContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasIsActiveChildren: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasIsActiveChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useIsActive(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsActive")().asInstanceOf[Boolean]
  
  trait Props extends StObject {
    
    var children: ReactNode
    
    var isActive: Boolean
  }
  object Props {
    
    inline def apply(isActive: Boolean): Props = {
      val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    }
  }
}
