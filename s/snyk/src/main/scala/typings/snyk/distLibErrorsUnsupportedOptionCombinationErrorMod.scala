package typings.snyk

import typings.snyk.distLibErrorsCustomErrorMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibErrorsUnsupportedOptionCombinationErrorMod {
  
  @JSImport("snyk/dist/lib/errors/unsupported-option-combination-error", "UnsupportedOptionCombinationError")
  @js.native
  open class UnsupportedOptionCombinationError protected () extends CustomError {
    def this(options: js.Array[String]) = this()
    
    @JSName("code")
    var code_UnsupportedOptionCombinationError: Double = js.native
    
    @JSName("userMessage")
    var userMessage_UnsupportedOptionCombinationError: String = js.native
  }
  /* static members */
  object UnsupportedOptionCombinationError {
    
    @JSImport("snyk/dist/lib/errors/unsupported-option-combination-error", "UnsupportedOptionCombinationError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors/unsupported-option-combination-error", "UnsupportedOptionCombinationError.ERROR_MESSAGE")
    @js.native
    def ERROR_MESSAGE: Any = js.native
    inline def ERROR_MESSAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MESSAGE")(x.asInstanceOf[js.Any])
  }
}
