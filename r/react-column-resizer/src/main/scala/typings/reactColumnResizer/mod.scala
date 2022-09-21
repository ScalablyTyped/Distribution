package typings.reactColumnResizer

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-column-resizer", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ResizerProps, js.Object, Any]
  
  type ColumnResizer = Component[ResizerProps, js.Object, Any]
  
  trait ResizerProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
  }
  object ResizerProps {
    
    inline def apply(): ResizerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizerProps]
    }
    
    extension [Self <: ResizerProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    }
  }
}
