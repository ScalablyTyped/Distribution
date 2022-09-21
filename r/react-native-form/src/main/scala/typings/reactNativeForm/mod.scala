package typings.reactNativeForm

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.reactNative.mod.ViewProps
import typings.reactNativeForm.anon.CallbackProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-form", JSImport.Default)
  @js.native
  open class default ()
    extends Component[FormProps, js.Object, Any]
  
  type Form = Component[FormProps, js.Object, Any]
  
  trait FormProps
    extends StObject
       with ViewProps {
    
    var customFields: js.UndefOr[StringDictionary[CallbackProp]] = js.undefined
    
    var ref: String
  }
  object FormProps {
    
    inline def apply(ref: String): FormProps = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormProps]
    }
    
    extension [Self <: FormProps](x: Self) {
      
      inline def setCustomFields(value: StringDictionary[CallbackProp]): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
      
      inline def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
      
      inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
}
