package typings.reactNativeAndroidTaskdescription

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-android-taskdescription", JSImport.Default)
  @js.native
  class default ()
    extends Component[ReactNativeAndroidTaskDescriptionProps, js.Object, js.Any]
  
  type ReactNativeAndroidTaskDescription = Component[ReactNativeAndroidTaskDescriptionProps, js.Object, js.Any]
  
  @js.native
  trait ReactNativeAndroidTaskDescriptionProps extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var label: js.UndefOr[String] = js.native
  }
  object ReactNativeAndroidTaskDescriptionProps {
    
    @scala.inline
    def apply(): ReactNativeAndroidTaskDescriptionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactNativeAndroidTaskDescriptionProps]
    }
    
    @scala.inline
    implicit class ReactNativeAndroidTaskDescriptionPropsMutableBuilder[Self <: ReactNativeAndroidTaskDescriptionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
}
