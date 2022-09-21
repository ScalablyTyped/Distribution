package typings.reactGoogleLoginComponent

import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.Component
import typings.reactGoogleLoginComponent.anon.Accesstoken
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-google-login-component", "GoogleLogin")
  @js.native
  open class GoogleLogin protected ()
    extends Component[GoogleLoginProps, js.Object, Any] {
    def this(props: GoogleLoginProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: GoogleLoginProps, context: Any) = this()
  }
  
  trait GoogleLoginInfo extends StObject {
    
    def getAuthResponse(): Accesstoken
  }
  object GoogleLoginInfo {
    
    inline def apply(getAuthResponse: () => Accesstoken): GoogleLoginInfo = {
      val __obj = js.Dynamic.literal(getAuthResponse = js.Any.fromFunction0(getAuthResponse))
      __obj.asInstanceOf[GoogleLoginInfo]
    }
    
    extension [Self <: GoogleLoginInfo](x: Self) {
      
      inline def setGetAuthResponse(value: () => Accesstoken): Self = StObject.set(x, "getAuthResponse", js.Any.fromFunction0(value))
    }
  }
  
  trait GoogleLoginProps
    extends StObject
       with ButtonHTMLAttributes[HTMLButtonElement] {
    
    var buttonText: js.UndefOr[String] = js.undefined
    
    var fetchBasicProfile: js.UndefOr[Boolean] = js.undefined
    
    var prompt: js.UndefOr[String] = js.undefined
    
    def responseHandler(response: GoogleLoginInfo): Unit
    
    var scope: js.UndefOr[String] = js.undefined
    
    var socialId: String
  }
  object GoogleLoginProps {
    
    inline def apply(responseHandler: GoogleLoginInfo => Unit, socialId: String): GoogleLoginProps = {
      val __obj = js.Dynamic.literal(responseHandler = js.Any.fromFunction1(responseHandler), socialId = socialId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GoogleLoginProps]
    }
    
    extension [Self <: GoogleLoginProps](x: Self) {
      
      inline def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      inline def setFetchBasicProfile(value: Boolean): Self = StObject.set(x, "fetchBasicProfile", value.asInstanceOf[js.Any])
      
      inline def setFetchBasicProfileUndefined: Self = StObject.set(x, "fetchBasicProfile", js.undefined)
      
      inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      inline def setResponseHandler(value: GoogleLoginInfo => Unit): Self = StObject.set(x, "responseHandler", js.Any.fromFunction1(value))
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setSocialId(value: String): Self = StObject.set(x, "socialId", value.asInstanceOf[js.Any])
    }
  }
}
