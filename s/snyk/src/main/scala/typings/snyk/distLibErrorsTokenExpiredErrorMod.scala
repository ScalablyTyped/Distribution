package typings.snyk

import typings.snyk.distLibErrorsCustomErrorMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibErrorsTokenExpiredErrorMod {
  
  @JSImport("snyk/dist/lib/errors/token-expired-error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def TokenExpiredError(): CustomError = ^.asInstanceOf[js.Dynamic].applyDynamic("TokenExpiredError")().asInstanceOf[CustomError]
}
