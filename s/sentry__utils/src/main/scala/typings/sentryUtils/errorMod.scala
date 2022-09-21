package typings.sentryUtils

import typings.sentryUtils.loggerMod.ConsoleLevel
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  @JSImport("@sentry/utils/types/error", "SentryError")
  @js.native
  open class SentryError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: String, logLevel: ConsoleLevel) = this()
    
    var logLevel: ConsoleLevel = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
