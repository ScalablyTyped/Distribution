package typings.primereact

import typings.primereact.menuItemMod.MenuItem
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelMenuMod {
  
  @JSImport("primereact/components/panelmenu/PanelMenu", "PanelMenu")
  @js.native
  class PanelMenu protected ()
    extends Component[PanelMenuProps, js.Any, js.Any] {
    def this(props: PanelMenuProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PanelMenuProps, context: js.Any) = this()
  }
  
  trait PanelMenuProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var model: js.UndefOr[js.Array[MenuItem]] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object PanelMenuProps {
    
    @scala.inline
    def apply(): PanelMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelMenuProps]
    }
    
    @scala.inline
    implicit class PanelMenuPropsMutableBuilder[Self <: PanelMenuProps] (val x: Self) extends AnyVal {
      
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
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
