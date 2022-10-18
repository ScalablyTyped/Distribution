package typings.snyk

import typings.snyk.distLibErrorsCustomErrorMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibErrorsMonitorErrorMod {
  
  @JSImport("snyk/dist/lib/errors/monitor-error", "MonitorError")
  @js.native
  open class MonitorError protected () extends CustomError {
    def this(errorCode: Any, message: Any) = this()
  }
  /* static members */
  object MonitorError {
    
    @JSImport("snyk/dist/lib/errors/monitor-error", "MonitorError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors/monitor-error", "MonitorError.ERROR_MESSAGE")
    @js.native
    def ERROR_MESSAGE: Any = js.native
    inline def ERROR_MESSAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MESSAGE")(x.asInstanceOf[js.Any])
  }
}
