package typings.reactNativeTouchId

import typings.reactNativeTouchId.reactNativeTouchIdStrings.TouchIDError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-native-touch-id", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *
      * @param reason String that provides a clear reason for requesting authentication.
      * @param config Configuration object for more detailed dialog setup
      */
    inline def authenticate(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")().asInstanceOf[Any]
    inline def authenticate(reason: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(reason.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def authenticate(reason: String, config: AuthenticateConfig): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(reason.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def authenticate(reason: Unit, config: AuthenticateConfig): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(reason.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * 
      * @param config - Returns a `Promise` that rejects if TouchID is not supported. On iOS resolves with a `biometryType` `String` of `FaceID` or `TouchID`
      */
    inline def isSupported(): js.Promise[BiometryType] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[js.Promise[BiometryType]]
    inline def isSupported(config: IsSupportedConfig): js.Promise[BiometryType] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BiometryType]]
  }
  
  trait AuthenticateConfig
    extends StObject
       with IsSupportedConfig {
    
    /**
      * **Android only** - Cancel button text
      */
    var cancelText: js.UndefOr[String] = js.undefined
    
    /**
      * **iOS only** - By default specified 'Show Password' label. If set to empty string label is invisible.
      */
    var fallbackLabel: js.UndefOr[String] = js.undefined
    
    /**
      * **Android only** - Color of fingerprint image
      */
    var imageColor: js.UndefOr[String] = js.undefined
    
    /**
      * **Android only** - Color of fingerprint image after failed attempt
      */
    var imageErrorColor: js.UndefOr[String] = js.undefined
    
    /**
      * **iOS only** - By default set to false. If set to true, will allow use of keypad passcode.
      */
    var passcodeFallback: js.UndefOr[Boolean] = js.undefined
    
    /**
      * **Android only** - Text shown next to the fingerprint image
      */
    var sensorDescription: js.UndefOr[String] = js.undefined
    
    /**
      * **Android only** - Text shown next to the fingerprint image after failed attempt
      */
    var sensorErrorDescription: js.UndefOr[String] = js.undefined
    
    /**
      * **Android only** - Title of confirmation dialog
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object AuthenticateConfig {
    
    inline def apply(): AuthenticateConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthenticateConfig]
    }
    
    extension [Self <: AuthenticateConfig](x: Self) {
      
      inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      inline def setFallbackLabel(value: String): Self = StObject.set(x, "fallbackLabel", value.asInstanceOf[js.Any])
      
      inline def setFallbackLabelUndefined: Self = StObject.set(x, "fallbackLabel", js.undefined)
      
      inline def setImageColor(value: String): Self = StObject.set(x, "imageColor", value.asInstanceOf[js.Any])
      
      inline def setImageColorUndefined: Self = StObject.set(x, "imageColor", js.undefined)
      
      inline def setImageErrorColor(value: String): Self = StObject.set(x, "imageErrorColor", value.asInstanceOf[js.Any])
      
      inline def setImageErrorColorUndefined: Self = StObject.set(x, "imageErrorColor", js.undefined)
      
      inline def setPasscodeFallback(value: Boolean): Self = StObject.set(x, "passcodeFallback", value.asInstanceOf[js.Any])
      
      inline def setPasscodeFallbackUndefined: Self = StObject.set(x, "passcodeFallback", js.undefined)
      
      inline def setSensorDescription(value: String): Self = StObject.set(x, "sensorDescription", value.asInstanceOf[js.Any])
      
      inline def setSensorDescriptionUndefined: Self = StObject.set(x, "sensorDescription", js.undefined)
      
      inline def setSensorErrorDescription(value: String): Self = StObject.set(x, "sensorErrorDescription", value.asInstanceOf[js.Any])
      
      inline def setSensorErrorDescriptionUndefined: Self = StObject.set(x, "sensorErrorDescription", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /**
    * `authenticate` error code
    */
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeTouchId.reactNativeTouchIdStrings.AUTHENTICATION_FAILED
    - typings.reactNativeTouchId.reactNativeTouchIdStrings.USER_CANCELED
    - typings.reactNativeTouchId.reactNativeTouchIdStrings.SYSTEM_CANCELED
    - typings.reactNativeTouchId.reactNativeTouchIdStrings.TIMEOUT
    - typings.reactNativeTouchId.reactNativeTouchIdStrings.LOCKOUT
    - typings.reactNativeTouchId.reactNativeTouchIdStrings.LOCKOUT_PERMANENT
    - typings.reactNativeTouchId.reactNativeTouchIdStrings.PROCESSING_ERROR
    - typings.reactNativeTouchId.reactNativeTouchIdStrings.USER_FALLBACK
    - typings.reactNativeTouchId.reactNativeTouchIdStrings.UNKNOWN_ERROR
    - typings.reactNativeTouchId.reactNativeTouchIdStrings.NOT_SUPPORTED
    - typings.reactNativeTouchId.reactNativeTouchIdStrings.NOT_AVAILABLE
    - typings.reactNativeTouchId.reactNativeTouchIdStrings.NOT_PRESENT
    - typings.reactNativeTouchId.reactNativeTouchIdStrings.NOT_ENROLLED
  */
  trait AuthenticateErrorCode extends StObject
  object AuthenticateErrorCode {
    
    inline def AUTHENTICATION_FAILED: typings.reactNativeTouchId.reactNativeTouchIdStrings.AUTHENTICATION_FAILED = "AUTHENTICATION_FAILED".asInstanceOf[typings.reactNativeTouchId.reactNativeTouchIdStrings.AUTHENTICATION_FAILED]
    
    inline def LOCKOUT: typings.reactNativeTouchId.reactNativeTouchIdStrings.LOCKOUT = "LOCKOUT".asInstanceOf[typings.reactNativeTouchId.reactNativeTouchIdStrings.LOCKOUT]
    
    inline def LOCKOUT_PERMANENT: typings.reactNativeTouchId.reactNativeTouchIdStrings.LOCKOUT_PERMANENT = "LOCKOUT_PERMANENT".asInstanceOf[typings.reactNativeTouchId.reactNativeTouchIdStrings.LOCKOUT_PERMANENT]
    
    inline def NOT_AVAILABLE: typings.reactNativeTouchId.reactNativeTouchIdStrings.NOT_AVAILABLE = "NOT_AVAILABLE".asInstanceOf[typings.reactNativeTouchId.reactNativeTouchIdStrings.NOT_AVAILABLE]
    
    inline def NOT_ENROLLED: typings.reactNativeTouchId.reactNativeTouchIdStrings.NOT_ENROLLED = "NOT_ENROLLED".asInstanceOf[typings.reactNativeTouchId.reactNativeTouchIdStrings.NOT_ENROLLED]
    
    inline def NOT_PRESENT: typings.reactNativeTouchId.reactNativeTouchIdStrings.NOT_PRESENT = "NOT_PRESENT".asInstanceOf[typings.reactNativeTouchId.reactNativeTouchIdStrings.NOT_PRESENT]
    
    inline def NOT_SUPPORTED: typings.reactNativeTouchId.reactNativeTouchIdStrings.NOT_SUPPORTED = "NOT_SUPPORTED".asInstanceOf[typings.reactNativeTouchId.reactNativeTouchIdStrings.NOT_SUPPORTED]
    
    inline def PROCESSING_ERROR: typings.reactNativeTouchId.reactNativeTouchIdStrings.PROCESSING_ERROR = "PROCESSING_ERROR".asInstanceOf[typings.reactNativeTouchId.reactNativeTouchIdStrings.PROCESSING_ERROR]
    
    inline def SYSTEM_CANCELED: typings.reactNativeTouchId.reactNativeTouchIdStrings.SYSTEM_CANCELED = "SYSTEM_CANCELED".asInstanceOf[typings.reactNativeTouchId.reactNativeTouchIdStrings.SYSTEM_CANCELED]
    
    inline def TIMEOUT: typings.reactNativeTouchId.reactNativeTouchIdStrings.TIMEOUT = "TIMEOUT".asInstanceOf[typings.reactNativeTouchId.reactNativeTouchIdStrings.TIMEOUT]
    
    inline def UNKNOWN_ERROR: typings.reactNativeTouchId.reactNativeTouchIdStrings.UNKNOWN_ERROR = "UNKNOWN_ERROR".asInstanceOf[typings.reactNativeTouchId.reactNativeTouchIdStrings.UNKNOWN_ERROR]
    
    inline def USER_CANCELED: typings.reactNativeTouchId.reactNativeTouchIdStrings.USER_CANCELED = "USER_CANCELED".asInstanceOf[typings.reactNativeTouchId.reactNativeTouchIdStrings.USER_CANCELED]
    
    inline def USER_FALLBACK: typings.reactNativeTouchId.reactNativeTouchIdStrings.USER_FALLBACK = "USER_FALLBACK".asInstanceOf[typings.reactNativeTouchId.reactNativeTouchIdStrings.USER_FALLBACK]
  }
  
  trait AuthenticationError extends StObject {
    
    var code: AuthenticateErrorCode
    
    var details: String
    
    var message: String
    
    var name: TouchIDError
  }
  object AuthenticationError {
    
    inline def apply(code: AuthenticateErrorCode, details: String, message: String): AuthenticationError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = "TouchIDError")
      __obj.asInstanceOf[AuthenticationError]
    }
    
    extension [Self <: AuthenticationError](x: Self) {
      
      inline def setCode(value: AuthenticateErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: TouchIDError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The supported biometry type
    */
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeTouchId.reactNativeTouchIdStrings.FaceID
    - typings.reactNativeTouchId.reactNativeTouchIdStrings.TouchID
  */
  trait BiometryType extends StObject
  object BiometryType {
    
    inline def FaceID: typings.reactNativeTouchId.reactNativeTouchIdStrings.FaceID = "FaceID".asInstanceOf[typings.reactNativeTouchId.reactNativeTouchIdStrings.FaceID]
    
    inline def TouchID: typings.reactNativeTouchId.reactNativeTouchIdStrings.TouchID = "TouchID".asInstanceOf[typings.reactNativeTouchId.reactNativeTouchIdStrings.TouchID]
  }
  
  /**
    * Base config to pass to `TouchID.isSupported` and `TouchID.authenticate`
    */
  trait IsSupportedConfig extends StObject {
    
    /**
      * Return unified error messages
      */
    var unifiedErrors: js.UndefOr[Boolean] = js.undefined
  }
  object IsSupportedConfig {
    
    inline def apply(): IsSupportedConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsSupportedConfig]
    }
    
    extension [Self <: IsSupportedConfig](x: Self) {
      
      inline def setUnifiedErrors(value: Boolean): Self = StObject.set(x, "unifiedErrors", value.asInstanceOf[js.Any])
      
      inline def setUnifiedErrorsUndefined: Self = StObject.set(x, "unifiedErrors", js.undefined)
    }
  }
  
  trait IsSupportedError extends StObject {
    
    var code: IsSupportedErrorCode
    
    var details: String
    
    var message: String
    
    var name: TouchIDError
  }
  object IsSupportedError {
    
    inline def apply(code: IsSupportedErrorCode, details: String, message: String): IsSupportedError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = "TouchIDError")
      __obj.asInstanceOf[IsSupportedError]
    }
    
    extension [Self <: IsSupportedError](x: Self) {
      
      inline def setCode(value: IsSupportedErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: TouchIDError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * `isSupported` error code
    */
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeTouchId.reactNativeTouchIdStrings.NOT_SUPPORTED
    - typings.reactNativeTouchId.reactNativeTouchIdStrings.NOT_AVAILABLE
    - typings.reactNativeTouchId.reactNativeTouchIdStrings.NOT_PRESENT
    - typings.reactNativeTouchId.reactNativeTouchIdStrings.NOT_ENROLLED
  */
  trait IsSupportedErrorCode extends StObject
  object IsSupportedErrorCode {
    
    inline def NOT_AVAILABLE: typings.reactNativeTouchId.reactNativeTouchIdStrings.NOT_AVAILABLE = "NOT_AVAILABLE".asInstanceOf[typings.reactNativeTouchId.reactNativeTouchIdStrings.NOT_AVAILABLE]
    
    inline def NOT_ENROLLED: typings.reactNativeTouchId.reactNativeTouchIdStrings.NOT_ENROLLED = "NOT_ENROLLED".asInstanceOf[typings.reactNativeTouchId.reactNativeTouchIdStrings.NOT_ENROLLED]
    
    inline def NOT_PRESENT: typings.reactNativeTouchId.reactNativeTouchIdStrings.NOT_PRESENT = "NOT_PRESENT".asInstanceOf[typings.reactNativeTouchId.reactNativeTouchIdStrings.NOT_PRESENT]
    
    inline def NOT_SUPPORTED: typings.reactNativeTouchId.reactNativeTouchIdStrings.NOT_SUPPORTED = "NOT_SUPPORTED".asInstanceOf[typings.reactNativeTouchId.reactNativeTouchIdStrings.NOT_SUPPORTED]
  }
}
