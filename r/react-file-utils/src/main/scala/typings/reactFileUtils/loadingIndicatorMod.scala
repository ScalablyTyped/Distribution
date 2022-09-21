package typings.reactFileUtils

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadingIndicatorMod {
  
  @JSImport("react-file-utils/dist/components/LoadingIndicator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def LoadingIndicator(hasSizeWidthBackgroundColorColor: LoadingIndicatorProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("LoadingIndicator")(hasSizeWidthBackgroundColorColor.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait LoadingIndicatorProps extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object LoadingIndicatorProps {
    
    inline def apply(): LoadingIndicatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadingIndicatorProps]
    }
    
    extension [Self <: LoadingIndicatorProps](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
