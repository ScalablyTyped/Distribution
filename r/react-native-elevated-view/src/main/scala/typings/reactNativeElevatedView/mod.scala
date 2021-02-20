package typings.reactNativeElevatedView

import typings.react.mod.Component
import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-elevated-view", JSImport.Default)
  @js.native
  class default ()
    extends Component[ElevatedViewProperties, js.Object, js.Any]
  
  type ElevatedView = Component[ElevatedViewProperties, js.Object, js.Any]
  
  @js.native
  trait ElevatedViewProperties extends ViewProps {
    
    var elevation: js.UndefOr[Double] = js.native
  }
  object ElevatedViewProperties {
    
    @scala.inline
    def apply(): ElevatedViewProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElevatedViewProperties]
    }
    
    @scala.inline
    implicit class ElevatedViewPropertiesMutableBuilder[Self <: ElevatedViewProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
    }
  }
}
