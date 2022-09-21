package typings.reactNativeTouchId

import typings.reactNativeTouchId.mod.AuthenticateErrorCode
import typings.reactNativeTouchId.mod.BiometryType
import typings.reactNativeTouchId.mod.IsSupportedErrorCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeTouchIdStrings {
  
  @js.native
  sealed trait AUTHENTICATION_FAILED
    extends StObject
       with AuthenticateErrorCode
  inline def AUTHENTICATION_FAILED: AUTHENTICATION_FAILED = "AUTHENTICATION_FAILED".asInstanceOf[AUTHENTICATION_FAILED]
  
  @js.native
  sealed trait FaceID
    extends StObject
       with BiometryType
  inline def FaceID: FaceID = "FaceID".asInstanceOf[FaceID]
  
  @js.native
  sealed trait LOCKOUT
    extends StObject
       with AuthenticateErrorCode
  inline def LOCKOUT: LOCKOUT = "LOCKOUT".asInstanceOf[LOCKOUT]
  
  @js.native
  sealed trait LOCKOUT_PERMANENT
    extends StObject
       with AuthenticateErrorCode
  inline def LOCKOUT_PERMANENT: LOCKOUT_PERMANENT = "LOCKOUT_PERMANENT".asInstanceOf[LOCKOUT_PERMANENT]
  
  @js.native
  sealed trait NOT_AVAILABLE
    extends StObject
       with AuthenticateErrorCode
       with IsSupportedErrorCode
  inline def NOT_AVAILABLE: NOT_AVAILABLE = "NOT_AVAILABLE".asInstanceOf[NOT_AVAILABLE]
  
  @js.native
  sealed trait NOT_ENROLLED
    extends StObject
       with AuthenticateErrorCode
       with IsSupportedErrorCode
  inline def NOT_ENROLLED: NOT_ENROLLED = "NOT_ENROLLED".asInstanceOf[NOT_ENROLLED]
  
  @js.native
  sealed trait NOT_PRESENT
    extends StObject
       with AuthenticateErrorCode
       with IsSupportedErrorCode
  inline def NOT_PRESENT: NOT_PRESENT = "NOT_PRESENT".asInstanceOf[NOT_PRESENT]
  
  @js.native
  sealed trait NOT_SUPPORTED
    extends StObject
       with AuthenticateErrorCode
       with IsSupportedErrorCode
  inline def NOT_SUPPORTED: NOT_SUPPORTED = "NOT_SUPPORTED".asInstanceOf[NOT_SUPPORTED]
  
  @js.native
  sealed trait PROCESSING_ERROR
    extends StObject
       with AuthenticateErrorCode
  inline def PROCESSING_ERROR: PROCESSING_ERROR = "PROCESSING_ERROR".asInstanceOf[PROCESSING_ERROR]
  
  @js.native
  sealed trait SYSTEM_CANCELED
    extends StObject
       with AuthenticateErrorCode
  inline def SYSTEM_CANCELED: SYSTEM_CANCELED = "SYSTEM_CANCELED".asInstanceOf[SYSTEM_CANCELED]
  
  @js.native
  sealed trait TIMEOUT
    extends StObject
       with AuthenticateErrorCode
  inline def TIMEOUT: TIMEOUT = "TIMEOUT".asInstanceOf[TIMEOUT]
  
  @js.native
  sealed trait TouchID
    extends StObject
       with BiometryType
  inline def TouchID: TouchID = "TouchID".asInstanceOf[TouchID]
  
  @js.native
  sealed trait TouchIDError extends StObject
  inline def TouchIDError: TouchIDError = "TouchIDError".asInstanceOf[TouchIDError]
  
  @js.native
  sealed trait UNKNOWN_ERROR
    extends StObject
       with AuthenticateErrorCode
  inline def UNKNOWN_ERROR: UNKNOWN_ERROR = "UNKNOWN_ERROR".asInstanceOf[UNKNOWN_ERROR]
  
  @js.native
  sealed trait USER_CANCELED
    extends StObject
       with AuthenticateErrorCode
  inline def USER_CANCELED: USER_CANCELED = "USER_CANCELED".asInstanceOf[USER_CANCELED]
  
  @js.native
  sealed trait USER_FALLBACK
    extends StObject
       with AuthenticateErrorCode
  inline def USER_FALLBACK: USER_FALLBACK = "USER_FALLBACK".asInstanceOf[USER_FALLBACK]
}
