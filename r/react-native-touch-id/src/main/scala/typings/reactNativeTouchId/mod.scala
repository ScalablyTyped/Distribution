package typings.reactNativeTouchId

import typings.reactNativeTouchId.reactNativeTouchIdStrings.LAErrorAuthenticationFailed
import typings.reactNativeTouchId.reactNativeTouchIdStrings.LAErrorPasscodeNotSet
import typings.reactNativeTouchId.reactNativeTouchIdStrings.LAErrorSystemCancel
import typings.reactNativeTouchId.reactNativeTouchIdStrings.LAErrorTouchIDNotAvailable
import typings.reactNativeTouchId.reactNativeTouchIdStrings.LAErrorTouchIDNotEnrolled
import typings.reactNativeTouchId.reactNativeTouchIdStrings.LAErrorUserCancel
import typings.reactNativeTouchId.reactNativeTouchIdStrings.LAErrorUserFallback
import typings.reactNativeTouchId.reactNativeTouchIdStrings.RCTTouchIDNotSupported
import typings.reactNativeTouchId.reactNativeTouchIdStrings.RCTTouchIDUnknownError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-touch-id", "authenticate")
  @js.native
  def authenticate(reason: String): js.Promise[Boolean | TouchIDError] = js.native
  @JSImport("react-native-touch-id", "authenticate")
  @js.native
  def authenticate(reason: String, config: AuthenticateConfig): js.Promise[Boolean | TouchIDError] = js.native
  
  @JSImport("react-native-touch-id", "isSupported")
  @js.native
  def isSupported(): js.Promise[Boolean | String | TouchIDError] = js.native
  
  @js.native
  trait AuthenticateConfig extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var fallbackTitle: String = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object AuthenticateConfig {
    
    @scala.inline
    def apply(fallbackTitle: String): AuthenticateConfig = {
      val __obj = js.Dynamic.literal(fallbackTitle = fallbackTitle.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthenticateConfig]
    }
    
    @scala.inline
    implicit class AuthenticateConfigMutableBuilder[Self <: AuthenticateConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFallbackTitle(value: String): Self = StObject.set(x, "fallbackTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait TouchIDError extends StObject {
    
    var details: js.Any = js.native
    
    var message: String = js.native
    
    var name: LAErrorAuthenticationFailed | LAErrorUserCancel | LAErrorUserFallback | LAErrorSystemCancel | LAErrorPasscodeNotSet | LAErrorTouchIDNotAvailable | LAErrorTouchIDNotEnrolled | RCTTouchIDUnknownError | RCTTouchIDNotSupported = js.native
  }
  object TouchIDError {
    
    @scala.inline
    def apply(
      details: js.Any,
      message: String,
      name: LAErrorAuthenticationFailed | LAErrorUserCancel | LAErrorUserFallback | LAErrorSystemCancel | LAErrorPasscodeNotSet | LAErrorTouchIDNotAvailable | LAErrorTouchIDNotEnrolled | RCTTouchIDUnknownError | RCTTouchIDNotSupported
    ): TouchIDError = {
      val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TouchIDError]
    }
    
    @scala.inline
    implicit class TouchIDErrorMutableBuilder[Self <: TouchIDError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetails(value: js.Any): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(
        value: LAErrorAuthenticationFailed | LAErrorUserCancel | LAErrorUserFallback | LAErrorSystemCancel | LAErrorPasscodeNotSet | LAErrorTouchIDNotAvailable | LAErrorTouchIDNotEnrolled | RCTTouchIDUnknownError | RCTTouchIDNotSupported
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
