package typings.reactLoaderSpinner

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmLoaderFallingLinesMod {
  
  @JSImport("react-loader-spinner/dist/esm/loader/FallingLines", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasColorWidthVisible: FallingLinesProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasColorWidthVisible.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  trait FallingLinesProps extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object FallingLinesProps {
    
    inline def apply(): FallingLinesProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FallingLinesProps]
    }
    
    extension [Self <: FallingLinesProps](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
