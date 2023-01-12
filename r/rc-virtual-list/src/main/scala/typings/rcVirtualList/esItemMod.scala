package typings.rcVirtualList

import typings.react.mod.ReactElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esItemMod {
  
  @JSImport("rc-virtual-list/es/Item", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Item(param0: ItemProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Item")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait ItemProps extends StObject {
    
    var children: ReactElement
    
    def setRef(element: HTMLElement): Unit
  }
  object ItemProps {
    
    inline def apply(children: ReactElement, setRef: HTMLElement => Unit): ItemProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], setRef = js.Any.fromFunction1(setRef))
      __obj.asInstanceOf[ItemProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setSetRef(value: HTMLElement => Unit): Self = StObject.set(x, "setRef", js.Any.fromFunction1(value))
    }
  }
}
