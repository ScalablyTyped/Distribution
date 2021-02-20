package typings.reactFacebookLoginComponent

import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.Component
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-facebook-login-component", "FacebookLogin")
  @js.native
  class FacebookLogin protected ()
    extends Component[FacebookLoginProps, js.Object, js.Any] {
    def this(props: FacebookLoginProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FacebookLoginProps, context: js.Any) = this()
  }
  
  @js.native
  trait FacebookLoginInfo extends StObject {
    
    var accessToken: String = js.native
    
    var email: js.UndefOr[String] = js.native
    
    var id: String = js.native
    
    var name: js.UndefOr[String] = js.native
  }
  object FacebookLoginInfo {
    
    @scala.inline
    def apply(accessToken: String, id: String): FacebookLoginInfo = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[FacebookLoginInfo]
    }
    
    @scala.inline
    implicit class FacebookLoginInfoMutableBuilder[Self <: FacebookLoginInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait FacebookLoginProps extends ButtonHTMLAttributes[HTMLButtonElement] {
    
    var buttonText: js.UndefOr[String] = js.native
    
    var fields: js.UndefOr[String] = js.native
    
    def responseHandler(response: FacebookLoginInfo): Unit = js.native
    
    var socialId: String = js.native
    
    var version: js.UndefOr[String] = js.native
    
    var xfbml: js.UndefOr[Boolean] = js.native
  }
  object FacebookLoginProps {
    
    @scala.inline
    def apply(responseHandler: FacebookLoginInfo => Unit, socialId: String): FacebookLoginProps = {
      val __obj = js.Dynamic.literal(responseHandler = js.Any.fromFunction1(responseHandler), socialId = socialId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FacebookLoginProps]
    }
    
    @scala.inline
    implicit class FacebookLoginPropsMutableBuilder[Self <: FacebookLoginProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setResponseHandler(value: FacebookLoginInfo => Unit): Self = StObject.set(x, "responseHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSocialId(value: String): Self = StObject.set(x, "socialId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setXfbml(value: Boolean): Self = StObject.set(x, "xfbml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXfbmlUndefined: Self = StObject.set(x, "xfbml", js.undefined)
    }
  }
}
