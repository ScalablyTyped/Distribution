package typings.rcVirtualList

import typings.react.mod.ReactElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object itemMod {
  
  @JSImport("rc-virtual-list/es/Item", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Item(hasChildrenSetRef: ItemProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Item")(hasChildrenSetRef.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait ItemProps extends StObject {
    
    var children: ReactElement
    
    def setRef(element: HTMLElement): Unit
  }
  object ItemProps {
    
    inline def apply(children: ReactElement, setRef: HTMLElement => Unit): ItemProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], setRef = js.Any.fromFunction1(setRef))
      __obj.asInstanceOf[ItemProps]
    }
    
    extension [Self <: ItemProps](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setSetRef(value: HTMLElement => Unit): Self = StObject.set(x, "setRef", js.Any.fromFunction1(value))
    }
  }
}
