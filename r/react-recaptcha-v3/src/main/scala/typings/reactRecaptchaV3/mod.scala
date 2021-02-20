package typings.reactRecaptchaV3

import typings.react.mod.Component
import typings.reactRecaptchaV3.mod.ReCaptcha.ReCaptchaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-recaptcha-v3", "ReCaptcha")
  @js.native
  class ReCaptcha protected ()
    extends Component[ReCaptchaProps, js.Object, js.Any] {
    def this(props: ReCaptchaProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ReCaptchaProps, context: js.Any) = this()
    
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
    @scala.inline
    def defaultProps_=(x: ReCaptchaProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-recaptcha-v3", "ReCaptcha.propTypes")
    @js.native
    def propTypes: js.Any = js.native
    @scala.inline
    def propTypes_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @js.native
    trait ReCaptchaProps extends StObject {
      
      var action: String = js.native
      
      var elementID: js.UndefOr[String] = js.native
      
      var sitekey: String = js.native
      
      var verifyCallback: js.UndefOr[js.Function1[/* response */ String, Unit]] = js.native
      
      var verifyCallbackName: js.UndefOr[String] = js.native
    }
    object ReCaptchaProps {
      
      @scala.inline
      def apply(action: String, sitekey: String): ReCaptchaProps = {
        val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], sitekey = sitekey.asInstanceOf[js.Any])
        __obj.asInstanceOf[ReCaptchaProps]
      }
      
      @scala.inline
      implicit class ReCaptchaPropsMutableBuilder[Self <: ReCaptchaProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setElementID(value: String): Self = StObject.set(x, "elementID", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setElementIDUndefined: Self = StObject.set(x, "elementID", js.undefined)
        
        @scala.inline
        def setSitekey(value: String): Self = StObject.set(x, "sitekey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerifyCallback(value: /* response */ String => Unit): Self = StObject.set(x, "verifyCallback", js.Any.fromFunction1(value))
        
        @scala.inline
        def setVerifyCallbackName(value: String): Self = StObject.set(x, "verifyCallbackName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerifyCallbackNameUndefined: Self = StObject.set(x, "verifyCallbackName", js.undefined)
        
        @scala.inline
        def setVerifyCallbackUndefined: Self = StObject.set(x, "verifyCallback", js.undefined)
      }
    }
  }
  
  @JSImport("react-recaptcha-v3", "loadReCaptcha")
  @js.native
  def loadReCaptcha(siteKey: String): Unit = js.native
}
