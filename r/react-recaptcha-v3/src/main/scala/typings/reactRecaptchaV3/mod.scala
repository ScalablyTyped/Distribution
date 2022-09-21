package typings.reactRecaptchaV3

import typings.react.mod.Component
import typings.reactRecaptchaV3.mod.ReCaptcha.ReCaptchaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-recaptcha-v3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-recaptcha-v3", "ReCaptcha")
  @js.native
  open class ReCaptcha protected ()
    extends Component[ReCaptchaProps, js.Object, Any] {
    def this(props: ReCaptchaProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ReCaptchaProps, context: Any) = this()
    
    def execute(): Unit = js.native
  }
  /* static members */
  object ReCaptcha {
    
    @JSImport("react-recaptcha-v3", "ReCaptcha")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-recaptcha-v3", "ReCaptcha.defaultProps")
    @js.native
    def defaultProps: ReCaptchaProps = js.native
    inline def defaultProps_=(x: ReCaptchaProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-recaptcha-v3", "ReCaptcha.propTypes")
    @js.native
    def propTypes: Any = js.native
    inline def propTypes_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    trait ReCaptchaProps extends StObject {
      
      var action: String
      
      var elementID: js.UndefOr[String] = js.undefined
      
      var sitekey: String
      
      var verifyCallback: js.UndefOr[js.Function1[/* response */ String, Unit]] = js.undefined
      
      var verifyCallbackName: js.UndefOr[String] = js.undefined
    }
    object ReCaptchaProps {
      
      inline def apply(action: String, sitekey: String): ReCaptchaProps = {
        val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], sitekey = sitekey.asInstanceOf[js.Any])
        __obj.asInstanceOf[ReCaptchaProps]
      }
      
      extension [Self <: ReCaptchaProps](x: Self) {
        
        inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        inline def setElementID(value: String): Self = StObject.set(x, "elementID", value.asInstanceOf[js.Any])
        
        inline def setElementIDUndefined: Self = StObject.set(x, "elementID", js.undefined)
        
        inline def setSitekey(value: String): Self = StObject.set(x, "sitekey", value.asInstanceOf[js.Any])
        
        inline def setVerifyCallback(value: /* response */ String => Unit): Self = StObject.set(x, "verifyCallback", js.Any.fromFunction1(value))
        
        inline def setVerifyCallbackName(value: String): Self = StObject.set(x, "verifyCallbackName", value.asInstanceOf[js.Any])
        
        inline def setVerifyCallbackNameUndefined: Self = StObject.set(x, "verifyCallbackName", js.undefined)
        
        inline def setVerifyCallbackUndefined: Self = StObject.set(x, "verifyCallback", js.undefined)
      }
    }
  }
  
  inline def loadReCaptcha(siteKey: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadReCaptcha")(siteKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
