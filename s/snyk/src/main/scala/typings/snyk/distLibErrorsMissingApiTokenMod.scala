package typings.snyk

import typings.snyk.distLibErrorsCustomErrorMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibErrorsMissingApiTokenMod {
  
  @JSImport("snyk/dist/lib/errors/missing-api-token", "MissingApiTokenError")
  @js.native
  open class MissingApiTokenError () extends CustomError
  /* static members */
  object MissingApiTokenError {
    
    @JSImport("snyk/dist/lib/errors/missing-api-token", "MissingApiTokenError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors/missing-api-token", "MissingApiTokenError.ERROR_CODE")
    @js.native
    def ERROR_CODE: Any = js.native
    inline def ERROR_CODE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CODE")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/errors/missing-api-token", "MissingApiTokenError.ERROR_MESSAGE")
    @js.native
    def ERROR_MESSAGE: Any = js.native
    inline def ERROR_MESSAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MESSAGE")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/errors/missing-api-token", "MissingApiTokenError.ERROR_STRING_CODE")
    @js.native
    def ERROR_STRING_CODE: Any = js.native
    inline def ERROR_STRING_CODE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_STRING_CODE")(x.asInstanceOf[js.Any])
  }
}
