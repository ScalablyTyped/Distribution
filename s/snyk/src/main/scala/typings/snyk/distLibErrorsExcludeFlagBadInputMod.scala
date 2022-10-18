package typings.snyk

import typings.snyk.distLibErrorsCustomErrorMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibErrorsExcludeFlagBadInputMod {
  
  @JSImport("snyk/dist/lib/errors/exclude-flag-bad-input", "ExcludeFlagBadInputError")
  @js.native
  open class ExcludeFlagBadInputError () extends CustomError
  /* static members */
  object ExcludeFlagBadInputError {
    
    @JSImport("snyk/dist/lib/errors/exclude-flag-bad-input", "ExcludeFlagBadInputError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors/exclude-flag-bad-input", "ExcludeFlagBadInputError.ERROR_CODE")
    @js.native
    def ERROR_CODE: Any = js.native
    inline def ERROR_CODE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CODE")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/errors/exclude-flag-bad-input", "ExcludeFlagBadInputError.ERROR_MESSAGE")
    @js.native
    def ERROR_MESSAGE: Any = js.native
    inline def ERROR_MESSAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MESSAGE")(x.asInstanceOf[js.Any])
  }
}
