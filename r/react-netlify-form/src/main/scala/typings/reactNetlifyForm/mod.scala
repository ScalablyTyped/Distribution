package typings.reactNetlifyForm

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.reactGoogleRecaptcha.mod.ReCAPTCHAProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-netlify-form", JSImport.Default)
  @js.native
  open class default protected () extends NetlifyForm {
    def this(props: NetlifyFormProps) = this()
  }
  
  @js.native
  trait NetlifyForm extends Component[NetlifyFormProps, NetlifyFormState, Any]
  
  trait NetlifyFormProps extends StObject {
    
    var action: js.UndefOr[String] = js.undefined
    
    def children(state: NetlifyFormState): ReactElement
    
    var honeypotName: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var recaptcha: js.UndefOr[ReCAPTCHAProps] = js.undefined
  }
  object NetlifyFormProps {
    
    inline def apply(children: NetlifyFormState => ReactElement, name: String): NetlifyFormProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetlifyFormProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NetlifyFormProps] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setChildren(value: NetlifyFormState => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setHoneypotName(value: String): Self = StObject.set(x, "honeypotName", value.asInstanceOf[js.Any])
      
      inline def setHoneypotNameUndefined: Self = StObject.set(x, "honeypotName", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRecaptcha(value: ReCAPTCHAProps): Self = StObject.set(x, "recaptcha", value.asInstanceOf[js.Any])
      
      inline def setRecaptchaUndefined: Self = StObject.set(x, "recaptcha", js.undefined)
    }
  }
  
  trait NetlifyFormState extends StObject {
    
    var error: Boolean
    
    var loading: Boolean
    
    var recaptcha: js.UndefOr[ReactElement] = js.undefined
    
    var recaptchaError: js.UndefOr[Boolean] = js.undefined
    
    var success: Boolean
  }
  object NetlifyFormState {
    
    inline def apply(error: Boolean, loading: Boolean, success: Boolean): NetlifyFormState = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetlifyFormState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NetlifyFormState] (val x: Self) extends AnyVal {
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setRecaptcha(value: ReactElement): Self = StObject.set(x, "recaptcha", value.asInstanceOf[js.Any])
      
      inline def setRecaptchaError(value: Boolean): Self = StObject.set(x, "recaptchaError", value.asInstanceOf[js.Any])
      
      inline def setRecaptchaErrorUndefined: Self = StObject.set(x, "recaptchaError", js.undefined)
      
      inline def setRecaptchaUndefined: Self = StObject.set(x, "recaptcha", js.undefined)
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
}
