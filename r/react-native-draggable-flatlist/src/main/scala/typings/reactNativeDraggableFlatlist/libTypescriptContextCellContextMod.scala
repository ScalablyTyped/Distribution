package typings.reactNativeDraggableFlatlist

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptContextCellContextMod {
  
  @JSImport("react-native-draggable-flatlist/lib/typescript/context/cellContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* was `typeof CellProvider` */
  inline def default(param0: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def CellProvider(param0: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CellProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    }
  }
}
