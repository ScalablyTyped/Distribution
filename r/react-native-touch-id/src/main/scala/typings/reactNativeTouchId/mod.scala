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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-touch-id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def authenticate(reason: String): js.Promise[Boolean | TouchIDError] = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(reason.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean | TouchIDError]]
  inline def authenticate(reason: String, config: AuthenticateConfig): js.Promise[Boolean | TouchIDError] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(reason.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean | TouchIDError]]
  
  inline def isSupported(): js.Promise[Boolean | String | TouchIDError] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[js.Promise[Boolean | String | TouchIDError]]
  
  trait AuthenticateConfig extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var fallbackTitle: String
    
    var title: js.UndefOr[String] = js.undefined
  }
  object AuthenticateConfig {
    
    inline def apply(fallbackTitle: String): AuthenticateConfig = {
      val __obj = js.Dynamic.literal(fallbackTitle = fallbackTitle.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthenticateConfig]
    }
    
    extension [Self <: AuthenticateConfig](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFallbackTitle(value: String): Self = StObject.set(x, "fallbackTitle", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait TouchIDError extends StObject {
    
    var details: js.Any
    
    var message: String
    
    var name: LAErrorAuthenticationFailed | LAErrorUserCancel | LAErrorUserFallback | LAErrorSystemCancel | LAErrorPasscodeNotSet | LAErrorTouchIDNotAvailable | LAErrorTouchIDNotEnrolled | RCTTouchIDUnknownError | RCTTouchIDNotSupported
  }
  object TouchIDError {
    
    inline def apply(
      details: js.Any,
      message: String,
      name: LAErrorAuthenticationFailed | LAErrorUserCancel | LAErrorUserFallback | LAErrorSystemCancel | LAErrorPasscodeNotSet | LAErrorTouchIDNotAvailable | LAErrorTouchIDNotEnrolled | RCTTouchIDUnknownError | RCTTouchIDNotSupported
    ): TouchIDError = {
      val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TouchIDError]
    }
    
    extension [Self <: TouchIDError](x: Self) {
      
      inline def setDetails(value: js.Any): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(
        value: LAErrorAuthenticationFailed | LAErrorUserCancel | LAErrorUserFallback | LAErrorSystemCancel | LAErrorPasscodeNotSet | LAErrorTouchIDNotAvailable | LAErrorTouchIDNotEnrolled | RCTTouchIDUnknownError | RCTTouchIDNotSupported
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
