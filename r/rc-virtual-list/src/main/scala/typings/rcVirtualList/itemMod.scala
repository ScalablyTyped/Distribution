package typings.rcVirtualList

import typings.react.mod.ReactElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object itemMod {
  
  @JSImport("rc-virtual-list/es/Item", "Item")
  @js.native
  def Item(hasChildrenSetRef: ItemProps): ReactElement = js.native
  
  @js.native
  trait ItemProps extends StObject {
    
    var children: ReactElement = js.native
    
    def setRef(element: HTMLElement): Unit = js.native
  }
  object ItemProps {
    
    @scala.inline
    def apply(children: ReactElement, setRef: HTMLElement => Unit): ItemProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], setRef = js.Any.fromFunction1(setRef))
      __obj.asInstanceOf[ItemProps]
    }
    
    @scala.inline
    implicit class ItemPropsMutableBuilder[Self <: ItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetRef(value: HTMLElement => Unit): Self = StObject.set(x, "setRef", js.Any.fromFunction1(value))
    }
  }
}
