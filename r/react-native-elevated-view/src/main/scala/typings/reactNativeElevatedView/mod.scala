package typings.reactNativeElevatedView

import typings.react.mod.Component
import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-elevated-view", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ElevatedViewProperties, js.Object, Any]
  
  type ElevatedView = Component[ElevatedViewProperties, js.Object, Any]
  
  trait ElevatedViewProperties
    extends StObject
       with ViewProps {
    
    var elevation: js.UndefOr[Double] = js.undefined
  }
  object ElevatedViewProperties {
    
    inline def apply(): ElevatedViewProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElevatedViewProperties]
    }
    
    extension [Self <: ElevatedViewProperties](x: Self) {
      
      inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      inline def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
    }
  }
}
