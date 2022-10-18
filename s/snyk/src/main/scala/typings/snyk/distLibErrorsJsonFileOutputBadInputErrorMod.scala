package typings.snyk

import typings.snyk.distLibErrorsCustomErrorMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibErrorsJsonFileOutputBadInputErrorMod {
  
  @JSImport("snyk/dist/lib/errors/json-file-output-bad-input-error", "JsonFileOutputBadInputError")
  @js.native
  open class JsonFileOutputBadInputError () extends CustomError
  /* static members */
  object JsonFileOutputBadInputError {
    
    @JSImport("snyk/dist/lib/errors/json-file-output-bad-input-error", "JsonFileOutputBadInputError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors/json-file-output-bad-input-error", "JsonFileOutputBadInputError.ERROR_CODE")
    @js.native
    def ERROR_CODE: Any = js.native
    inline def ERROR_CODE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_CODE")(x.asInstanceOf[js.Any])
    
    @JSImport("snyk/dist/lib/errors/json-file-output-bad-input-error", "JsonFileOutputBadInputError.ERROR_MESSAGE")
    @js.native
    def ERROR_MESSAGE: Any = js.native
    inline def ERROR_MESSAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MESSAGE")(x.asInstanceOf[js.Any])
  }
}
