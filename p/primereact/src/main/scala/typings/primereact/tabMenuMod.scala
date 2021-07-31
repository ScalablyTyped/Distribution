package typings.primereact

import typings.primereact.anon.Value
import typings.primereact.menuItemMod.MenuItem
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabMenuMod {
  
  @JSImport("primereact/components/tabmenu/TabMenu", "TabMenu")
  @js.native
  class TabMenu protected ()
    extends Component[TabMenuProps, js.Any, js.Any] {
    def this(props: TabMenuProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabMenuProps, context: js.Any) = this()
  }
  
  trait TabMenuProps extends StObject {
    
    var activeItem: js.UndefOr[js.Any] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var model: js.UndefOr[js.Array[MenuItem]] = js.undefined
    
    var onTabChange: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
    
    var style: js.UndefOr[js.Any] = js.undefined
  }
  object TabMenuProps {
    
    @scala.inline
    def apply(): TabMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabMenuProps]
    }
    
    @scala.inline
    implicit class TabMenuPropsMutableBuilder[Self <: TabMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveItem(value: js.Any): Self = StObject.set(x, "activeItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveItemUndefined: Self = StObject.set(x, "activeItem", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
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
      def setOnTabChange(value: /* e */ Value => Unit): Self = StObject.set(x, "onTabChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTabChangeUndefined: Self = StObject.set(x, "onTabChange", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
