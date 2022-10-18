package typings.snyk

import typings.snyk.distLibErrorsCustomErrorMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object distLibErrorsFailOnErrorMod {
  
  @JSImport("snyk/dist/lib/errors/fail-on-error", "FailOnError")
  @js.native
  open class FailOnError () extends CustomError
  /* static members */
  object FailOnError {
    
    @JSImport("snyk/dist/lib/errors/fail-on-error", "FailOnError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors/fail-on-error", "FailOnError.ERROR_MESSAGE")
    @js.native
    def ERROR_MESSAGE: Any = js.native
    inline def ERROR_MESSAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MESSAGE")(x.asInstanceOf[js.Any])
  }
}
