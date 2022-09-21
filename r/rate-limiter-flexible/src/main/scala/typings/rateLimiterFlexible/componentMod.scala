package typings.rateLimiterFlexible

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("rate-limiter-flexible/lib/component", "RateLimiterQueueError")
  @js.native
  open class RateLimiterQueueError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: String, extra: String) = this()
    def this(message: Unit, extra: String) = this()
    
    val extra: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
