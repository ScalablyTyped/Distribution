package typings.rmcTrigger

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupInnerMod {
  
  @JSImport("rmc-trigger/lib/PopupInner", JSImport.Default)
  @js.native
  class default () extends PopupInner
  
  @js.native
  trait IPopupInnerProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var hiddenClassName: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[js.Any] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object IPopupInnerProps {
    
    @scala.inline
    def apply(): IPopupInnerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPopupInnerProps]
    }
    
    @scala.inline
    implicit class IPopupInnerPropsMutableBuilder[Self <: IPopupInnerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setHiddenClassName(value: String): Self = StObject.set(x, "hiddenClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenClassNameUndefined: Self = StObject.set(x, "hiddenClassName", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
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
  trait PopupInner
    extends Component[IPopupInnerProps, js.Any, js.Any]
}
