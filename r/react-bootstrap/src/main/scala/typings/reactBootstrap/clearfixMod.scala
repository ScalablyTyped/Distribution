package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clearfixMod {
  
  @JSImport("react-bootstrap/lib/Clearfix", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[ClearfixProps, js.Object, js.Any]
  
  @js.native
  trait Clearfix
    extends Component[ClearfixProps, js.Object, js.Any]
  
  @js.native
  trait ClearfixProps extends HTMLProps[Clearfix] {
    
    var bsClass: js.UndefOr[String] = js.native
    
    var componentClass: js.UndefOr[ReactType[_]] = js.native
    
    var visibleLgBlock: js.UndefOr[Boolean] = js.native
    
    var visibleMdBlock: js.UndefOr[Boolean] = js.native
    
    var visibleSmBlock: js.UndefOr[Boolean] = js.native
    
    var visibleXsBlock: js.UndefOr[Boolean] = js.native
  }
  object ClearfixProps {
    
    @scala.inline
    def apply(): ClearfixProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearfixProps]
    }
    
    @scala.inline
    implicit class ClearfixPropsMutableBuilder[Self <: ClearfixProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      @scala.inline
      def setComponentClass(value: ReactType[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
      
      @scala.inline
      def setVisibleLgBlock(value: Boolean): Self = StObject.set(x, "visibleLgBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleLgBlockUndefined: Self = StObject.set(x, "visibleLgBlock", js.undefined)
      
      @scala.inline
      def setVisibleMdBlock(value: Boolean): Self = StObject.set(x, "visibleMdBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleMdBlockUndefined: Self = StObject.set(x, "visibleMdBlock", js.undefined)
      
      @scala.inline
      def setVisibleSmBlock(value: Boolean): Self = StObject.set(x, "visibleSmBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleSmBlockUndefined: Self = StObject.set(x, "visibleSmBlock", js.undefined)
      
      @scala.inline
      def setVisibleXsBlock(value: Boolean): Self = StObject.set(x, "visibleXsBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleXsBlockUndefined: Self = StObject.set(x, "visibleXsBlock", js.undefined)
    }
  }
}
