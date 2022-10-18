package typings.snyk

import typings.snyk.distLibErrorsCustomErrorMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibErrorsUnsupportedEntitlementErrorMod {
  
  @JSImport("snyk/dist/lib/errors/unsupported-entitlement-error", "UnsupportedEntitlementError")
  @js.native
  open class UnsupportedEntitlementError protected () extends CustomError {
    def this(entitlement: String) = this()
    def this(entitlement: String, userMessage: String) = this()
    
    val entitlement: String = js.native
  }
  /* static members */
  object UnsupportedEntitlementError {
    
    @JSImport("snyk/dist/lib/errors/unsupported-entitlement-error", "UnsupportedEntitlementError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors/unsupported-entitlement-error", "UnsupportedEntitlementError.ERROR_CODE")
    @js.native
    def ERROR_CODE: Any = js.native
    inline def ERROR_CODE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CODE")(x.asInstanceOf[js.Any])
  }
}
