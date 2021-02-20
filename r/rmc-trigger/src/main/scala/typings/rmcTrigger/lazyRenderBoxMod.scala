package typings.rmcTrigger

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lazyRenderBoxMod {
  
  @JSImport("rmc-trigger/lib/LazyRenderBox", JSImport.Default)
  @js.native
  class default () extends LazyRenderBox
  
  @js.native
  trait ILazyRenderBoxProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var hiddenClassName: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[js.Any] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object ILazyRenderBoxProps {
    
    @scala.inline
    def apply(): ILazyRenderBoxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILazyRenderBoxProps]
    }
    
    @scala.inline
    implicit class ILazyRenderBoxPropsMutableBuilder[Self <: ILazyRenderBoxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setHiddenClassName(value: String): Self = StObject.set(x, "hiddenClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenClassNameUndefined: Self = StObject.set(x, "hiddenClassName", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait LazyRenderBox
    extends Component[ILazyRenderBoxProps, js.Any, js.Any] {
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MLazyRenderBox(nextProps: js.Any): js.Any = js.native
  }
}
