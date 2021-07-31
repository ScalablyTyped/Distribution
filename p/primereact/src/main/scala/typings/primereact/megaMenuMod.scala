package typings.primereact

import typings.primereact.menuItemMod.MenuItem
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object megaMenuMod {
  
  @JSImport("primereact/components/megamenu/MegaMenu", "MegaMenu")
  @js.native
  class MegaMenu protected ()
    extends Component[MegaMenuProps, js.Any, js.Any] {
    def this(props: MegaMenuProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MegaMenuProps, context: js.Any) = this()
  }
  
  trait MegaMenuProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var model: js.UndefOr[js.Array[MenuItem]] = js.undefined
    
    var orientation: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object MegaMenuProps {
    
    @scala.inline
    def apply(): MegaMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MegaMenuProps]
    }
    
    @scala.inline
    implicit class MegaMenuPropsMutableBuilder[Self <: MegaMenuProps] (val x: Self) extends AnyVal {
      
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
      def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
