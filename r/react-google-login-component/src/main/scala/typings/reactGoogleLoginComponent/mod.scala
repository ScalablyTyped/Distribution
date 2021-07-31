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
  class GoogleLogin protected ()
    extends Component[GoogleLoginProps, js.Object, js.Any] {
    def this(props: GoogleLoginProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: GoogleLoginProps, context: js.Any) = this()
  }
  
  trait GoogleLoginInfo extends StObject {
    
    def getAuthResponse(): Accesstoken
  }
  object GoogleLoginInfo {
    
    @scala.inline
    def apply(getAuthResponse: () => Accesstoken): GoogleLoginInfo = {
      val __obj = js.Dynamic.literal(getAuthResponse = js.Any.fromFunction0(getAuthResponse))
      __obj.asInstanceOf[GoogleLoginInfo]
    }
    
    @scala.inline
    implicit class GoogleLoginInfoMutableBuilder[Self <: GoogleLoginInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetAuthResponse(value: () => Accesstoken): Self = StObject.set(x, "getAuthResponse", js.Any.fromFunction0(value))
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
    
    @scala.inline
    def apply(responseHandler: GoogleLoginInfo => Unit, socialId: String): GoogleLoginProps = {
      val __obj = js.Dynamic.literal(responseHandler = js.Any.fromFunction1(responseHandler), socialId = socialId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GoogleLoginProps]
    }
    
    @scala.inline
    implicit class GoogleLoginPropsMutableBuilder[Self <: GoogleLoginProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      @scala.inline
      def setFetchBasicProfile(value: Boolean): Self = StObject.set(x, "fetchBasicProfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchBasicProfileUndefined: Self = StObject.set(x, "fetchBasicProfile", js.undefined)
      
      @scala.inline
      def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      @scala.inline
      def setResponseHandler(value: GoogleLoginInfo => Unit): Self = StObject.set(x, "responseHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setSocialId(value: String): Self = StObject.set(x, "socialId", value.asInstanceOf[js.Any])
    }
  }
}
