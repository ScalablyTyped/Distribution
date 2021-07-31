package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonToolbarMod {
  
  @JSImport("react-bootstrap/lib/ButtonToolbar", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[ButtonToolbarProps, js.Object, js.Any]
  
  @js.native
  trait ButtonToolbar
    extends Component[ButtonToolbarProps, js.Object, js.Any]
  
  trait ButtonToolbarProps
    extends StObject
       with HTMLProps[ButtonToolbar] {
    
    var block: js.UndefOr[Boolean] = js.undefined
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var bsSize: js.UndefOr[Sizes] = js.undefined
    
    var bsStyle: js.UndefOr[String] = js.undefined
    
    var justified: js.UndefOr[Boolean] = js.undefined
    
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object ButtonToolbarProps {
    
    @scala.inline
    def apply(): ButtonToolbarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonToolbarProps]
    }
    
    @scala.inline
    implicit class ButtonToolbarPropsMutableBuilder[Self <: ButtonToolbarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      @scala.inline
      def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      @scala.inline
      def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
      
      @scala.inline
      def setJustified(value: Boolean): Self = StObject.set(x, "justified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifiedUndefined: Self = StObject.set(x, "justified", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
}
