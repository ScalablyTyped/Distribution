package typings.sqsConsumer

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distErrorsMod {
  
  @JSImport("sqs-consumer/dist/errors", "SQSError")
  @js.native
  open class SQSError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    var code: String = js.native
    
    var hostname: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var region: String = js.native
    
    var retryable: Boolean = js.native
    
    var statusCode: Double = js.native
    
    var time: js.Date = js.native
  }
  
  @JSImport("sqs-consumer/dist/errors", "TimeoutError")
  @js.native
  open class TimeoutError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
