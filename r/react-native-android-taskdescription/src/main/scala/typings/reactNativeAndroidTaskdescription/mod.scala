package typings.reactNativeAndroidTaskdescription

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-android-taskdescription", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ReactNativeAndroidTaskDescriptionProps, js.Object, Any]
  
  type ReactNativeAndroidTaskDescription = Component[ReactNativeAndroidTaskDescriptionProps, js.Object, Any]
  
  trait ReactNativeAndroidTaskDescriptionProps extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
  }
  object ReactNativeAndroidTaskDescriptionProps {
    
    inline def apply(): ReactNativeAndroidTaskDescriptionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactNativeAndroidTaskDescriptionProps]
    }
    
    extension [Self <: ReactNativeAndroidTaskDescriptionProps](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
}
