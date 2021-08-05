package typings.rmcTrigger

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lazyRenderBoxMod {
  
  @JSImport("rmc-trigger/lib/LazyRenderBox", JSImport.Default)
  @js.native
  class default () extends LazyRenderBox
  
  trait ILazyRenderBoxProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var hiddenClassName: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[js.Any] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object ILazyRenderBoxProps {
    
    inline def apply(): ILazyRenderBoxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILazyRenderBoxProps]
    }
    
    extension [Self <: ILazyRenderBoxProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setHiddenClassName(value: String): Self = StObject.set(x, "hiddenClassName", value.asInstanceOf[js.Any])
      
      inline def setHiddenClassNameUndefined: Self = StObject.set(x, "hiddenClassName", js.undefined)
      
      inline def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait LazyRenderBox
    extends Component[ILazyRenderBoxProps, js.Any, js.Any] {
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MLazyRenderBox(nextProps: js.Any): js.Any = js.native
  }
}
