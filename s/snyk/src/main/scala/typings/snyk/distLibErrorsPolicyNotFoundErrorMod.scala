package typings.snyk

import typings.snyk.distLibErrorsCustomErrorMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibErrorsPolicyNotFoundErrorMod {
  
  @JSImport("snyk/dist/lib/errors/policy-not-found-error", "PolicyNotFoundError")
  @js.native
  open class PolicyNotFoundError () extends CustomError
  /* static members */
  object PolicyNotFoundError {
    
    @JSImport("snyk/dist/lib/errors/policy-not-found-error", "PolicyNotFoundError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors/policy-not-found-error", "PolicyNotFoundError.ERROR_CODE")
    @js.native
    def ERROR_CODE: Any = js.native
    inline def ERROR_CODE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CODE")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/errors/policy-not-found-error", "PolicyNotFoundError.ERROR_MESSAGE")
    @js.native
    def ERROR_MESSAGE: Any = js.native
    inline def ERROR_MESSAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MESSAGE")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/errors/policy-not-found-error", "PolicyNotFoundError.ERROR_STRING_CODE")
    @js.native
    def ERROR_STRING_CODE: Any = js.native
    inline def ERROR_STRING_CODE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_STRING_CODE")(x.asInstanceOf[js.Any])
  }
}
