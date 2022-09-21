package typings.reactFacebookLoginComponent

import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.Component
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-facebook-login-component", "FacebookLogin")
  @js.native
  open class FacebookLogin protected ()
    extends Component[FacebookLoginProps, js.Object, Any] {
    def this(props: FacebookLoginProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FacebookLoginProps, context: Any) = this()
  }
  
  trait FacebookLoginInfo extends StObject {
    
    var accessToken: String
    
    var email: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var name: js.UndefOr[String] = js.undefined
  }
  object FacebookLoginInfo {
    
    inline def apply(accessToken: String, id: String): FacebookLoginInfo = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[FacebookLoginInfo]
    }
    
    extension [Self <: FacebookLoginInfo](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait FacebookLoginProps
    extends StObject
       with ButtonHTMLAttributes[HTMLButtonElement] {
    
    var buttonText: js.UndefOr[String] = js.undefined
    
    var fields: js.UndefOr[String] = js.undefined
    
    def responseHandler(response: FacebookLoginInfo): Unit
    
    var socialId: String
    
    var version: js.UndefOr[String] = js.undefined
    
    var xfbml: js.UndefOr[Boolean] = js.undefined
  }
  object FacebookLoginProps {
    
    inline def apply(responseHandler: FacebookLoginInfo => Unit, socialId: String): FacebookLoginProps = {
      val __obj = js.Dynamic.literal(responseHandler = js.Any.fromFunction1(responseHandler), socialId = socialId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FacebookLoginProps]
    }
    
    extension [Self <: FacebookLoginProps](x: Self) {
      
      inline def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setResponseHandler(value: FacebookLoginInfo => Unit): Self = StObject.set(x, "responseHandler", js.Any.fromFunction1(value))
      
      inline def setSocialId(value: String): Self = StObject.set(x, "socialId", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setXfbml(value: Boolean): Self = StObject.set(x, "xfbml", value.asInstanceOf[js.Any])
      
      inline def setXfbmlUndefined: Self = StObject.set(x, "xfbml", js.undefined)
    }
  }
}
