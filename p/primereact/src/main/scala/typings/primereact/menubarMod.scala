package typings.primereact

import typings.primereact.menuItemMod.MenuItem
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait MenubarProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var end: js.UndefOr[js.Function1[/* props */ js.Object, _]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var model: js.UndefOr[js.Array[MenuItem]] = js.native
    
    var start: js.UndefOr[js.Function1[/* props */ js.Object, _]] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
  }
  object MenubarProps {
    
    @scala.inline
    def apply(): MenubarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenubarProps]
    }
    
    @scala.inline
    implicit class MenubarPropsMutableBuilder[Self <: MenubarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setEnd(value: /* props */ js.Object => _): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setModel(value: js.Array[MenuItem]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setModelVarargs(value: MenuItem*): Self = StObject.set(x, "model", js.Array(value :_*))
      
      @scala.inline
      def setStart(value: /* props */ js.Object => _): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
