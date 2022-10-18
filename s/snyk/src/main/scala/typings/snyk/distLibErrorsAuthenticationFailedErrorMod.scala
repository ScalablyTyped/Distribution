package typings.snyk

import typings.snyk.distLibErrorsCustomErrorMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibErrorsAuthenticationFailedErrorMod {
  
  @JSImport("snyk/dist/lib/errors/authentication-failed-error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def AuthFailedError(): CustomError = ^.asInstanceOf[js.Dynamic].applyDynamic("AuthFailedError")().asInstanceOf[CustomError]
  inline def AuthFailedError(errorMessage: String): CustomError = ^.asInstanceOf[js.Dynamic].applyDynamic("AuthFailedError")(errorMessage.asInstanceOf[js.Any]).asInstanceOf[CustomError]
  inline def AuthFailedError(errorMessage: String, errorCode: Double): CustomError = (^.asInstanceOf[js.Dynamic].applyDynamic("AuthFailedError")(errorMessage.asInstanceOf[js.Any], errorCode.asInstanceOf[js.Any])).asInstanceOf[CustomError]
  inline def AuthFailedError(errorMessage: Unit, errorCode: Double): CustomError = (^.asInstanceOf[js.Dynamic].applyDynamic("AuthFailedError")(errorMessage.asInstanceOf[js.Any], errorCode.asInstanceOf[js.Any])).asInstanceOf[CustomError]
}
