package typings.snyk

import typings.snyk.distLibErrorsCustomErrorMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibErrorsFailedToRunTestErrorMod {
  
  @JSImport("snyk/dist/lib/errors/failed-to-run-test-error", "FailedToRunTestError")
  @js.native
  open class FailedToRunTestError protected () extends CustomError {
    def this(userMessage: Any) = this()
    def this(userMessage: Any, errorCode: Any) = this()
  }
  /* static members */
  object FailedToRunTestError {
    
    @JSImport("snyk/dist/lib/errors/failed-to-run-test-error", "FailedToRunTestError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors/failed-to-run-test-error", "FailedToRunTestError.ERROR_MESSAGE")
    @js.native
    def ERROR_MESSAGE: Any = js.native
    inline def ERROR_MESSAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MESSAGE")(x.asInstanceOf[js.Any])
  }
}
