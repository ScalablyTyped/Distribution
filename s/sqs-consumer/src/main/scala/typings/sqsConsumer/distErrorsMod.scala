package typings.sqsConsumer

import typings.sqsConsumer.distTypesMod.AWSError
import typings.sqsConsumer.sqsConsumerStrings.client
import typings.sqsConsumer.sqsConsumerStrings.server
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distErrorsMod {
  
  @JSImport("sqs-consumer/dist/errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sqs-consumer/dist/errors", "SQSError")
  @js.native
  open class SQSError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    var code: String = js.native
    
    var fault: client | server = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var retryable: Boolean = js.native
    
    var service: String = js.native
    
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
  
  /**
    * Checks if the error provided should be treated as a connection error.
    * @param err The error that was received.
    */
  inline def isConnectionError(err: js.Error): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConnectionError")(err.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Formats an AWSError the the SQSError type.
    * @param err The error object that was received.
    * @param message The message that the error occurred on.
    */
  inline def toSQSError(err: AWSError, message: String): SQSError = (^.asInstanceOf[js.Dynamic].applyDynamic("toSQSError")(err.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[SQSError]
}
