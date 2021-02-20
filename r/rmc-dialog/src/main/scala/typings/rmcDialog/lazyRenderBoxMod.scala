package typings.rmcDialog

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lazyRenderBoxMod {
  
  @JSImport("rmc-dialog/lib/LazyRenderBox", JSImport.Default)
  @js.native
  class default () extends LazyRenderBox
  
  @js.native
  trait ILazyRenderBoxPropTypes extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var hiddenClassName: js.UndefOr[String] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object ILazyRenderBoxPropTypes {
    
    @scala.inline
    def apply(): ILazyRenderBoxPropTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILazyRenderBoxPropTypes]
    }
    
    @scala.inline
    implicit class ILazyRenderBoxPropTypesMutableBuilder[Self <: ILazyRenderBoxPropTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setHiddenClassName(value: String): Self = StObject.set(x, "hiddenClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenClassNameUndefined: Self = StObject.set(x, "hiddenClassName", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
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
    extends Component[ILazyRenderBoxPropTypes, js.Any, js.Any] {
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MLazyRenderBox(nextProps: js.Any): Boolean = js.native
  }
}
