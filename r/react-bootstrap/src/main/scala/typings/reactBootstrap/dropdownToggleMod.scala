package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownToggleMod {
  
  @JSImport("react-bootstrap/lib/DropdownToggle", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[DropdownToggleProps, js.Object, js.Any]
  
  @js.native
  trait DropdownToggle
    extends Component[DropdownToggleProps, js.Object, js.Any]
  
  trait DropdownToggleProps
    extends StObject
       with HTMLProps[DropdownToggle] {
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var bsRole: js.UndefOr[String] = js.undefined
    
    var bsSize: js.UndefOr[String] = js.undefined
    
    // Added since v0.30.0
    var bsStyle: js.UndefOr[String | Null] = js.undefined
    
    var noCaret: js.UndefOr[Boolean] = js.undefined
    
    var useAnchor: js.UndefOr[Boolean] = js.undefined
  }
  object DropdownToggleProps {
    
    @scala.inline
    def apply(): DropdownToggleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownToggleProps]
    }
    
    @scala.inline
    implicit class DropdownTogglePropsMutableBuilder[Self <: DropdownToggleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      @scala.inline
      def setBsRole(value: String): Self = StObject.set(x, "bsRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsRoleUndefined: Self = StObject.set(x, "bsRole", js.undefined)
      
      @scala.inline
      def setBsSize(value: String): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      @scala.inline
      def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsStyleNull: Self = StObject.set(x, "bsStyle", null)
      
      @scala.inline
      def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
      
      @scala.inline
      def setNoCaret(value: Boolean): Self = StObject.set(x, "noCaret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoCaretUndefined: Self = StObject.set(x, "noCaret", js.undefined)
      
      @scala.inline
      def setUseAnchor(value: Boolean): Self = StObject.set(x, "useAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseAnchorUndefined: Self = StObject.set(x, "useAnchor", js.undefined)
    }
  }
}
