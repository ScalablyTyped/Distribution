package typings.reactLoaderSpinner

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmLoaderInfinitySpinMod {
  
  @JSImport("react-loader-spinner/dist/esm/loader/InfinitySpin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasColorWidth: Props): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasColorWidth.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait Props extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
