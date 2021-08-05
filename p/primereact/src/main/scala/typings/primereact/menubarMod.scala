package typings.primereact

import typings.primereact.menuItemMod.MenuItem
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menubarMod {
  
  @JSImport("primereact/components/menubar/Menubar", "Menubar")
  @js.native
  class Menubar protected ()
    extends Component[MenubarProps, js.Any, js.Any] {
    def this(props: MenubarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MenubarProps, context: js.Any) = this()
  }
  
  trait MenubarProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var end: js.UndefOr[js.Function1[/* props */ js.Object, js.Any]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var model: js.UndefOr[js.Array[MenuItem]] = js.undefined
    
    var start: js.UndefOr[js.Function1[/* props */ js.Object, js.Any]] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object MenubarProps {
    
    inline def apply(): MenubarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenubarProps]
    }
    
    extension [Self <: MenubarProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setEnd(value: /* props */ js.Object => js.Any): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setModel(value: js.Array[MenuItem]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setModelVarargs(value: MenuItem*): Self = StObject.set(x, "model", js.Array(value :_*))
      
      inline def setStart(value: /* props */ js.Object => js.Any): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
