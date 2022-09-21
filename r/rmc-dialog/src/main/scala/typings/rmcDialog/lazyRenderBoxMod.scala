package typings.rmcDialog

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lazyRenderBoxMod {
  
  @JSImport("rmc-dialog/lib/LazyRenderBox", JSImport.Default)
  @js.native
  open class default () extends LazyRenderBox
  
  trait ILazyRenderBoxPropTypes extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var hiddenClassName: js.UndefOr[String] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object ILazyRenderBoxPropTypes {
    
    inline def apply(): ILazyRenderBoxPropTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILazyRenderBoxPropTypes]
    }
    
    extension [Self <: ILazyRenderBoxPropTypes](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setHiddenClassName(value: String): Self = StObject.set(x, "hiddenClassName", value.asInstanceOf[js.Any])
      
      inline def setHiddenClassNameUndefined: Self = StObject.set(x, "hiddenClassName", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait LazyRenderBox extends Component[ILazyRenderBoxPropTypes, Any, Any] {
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MLazyRenderBox(nextProps: Any): Boolean = js.native
  }
}
