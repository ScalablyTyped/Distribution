package typings.snyk

import typings.snyk.distLibErrorsCustomErrorMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibErrorsConnectionTimeoutErrorMod {
  
  @JSImport("snyk/dist/lib/errors/connection-timeout-error", "ConnectionTimeoutError")
  @js.native
  open class ConnectionTimeoutError () extends CustomError
  /* static members */
  object ConnectionTimeoutError {
    
    @JSImport("snyk/dist/lib/errors/connection-timeout-error", "ConnectionTimeoutError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors/connection-timeout-error", "ConnectionTimeoutError.ERROR_MESSAGE")
    @js.native
    def ERROR_MESSAGE: Any = js.native
    inline def ERROR_MESSAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MESSAGE")(x.asInstanceOf[js.Any])
  }
}
