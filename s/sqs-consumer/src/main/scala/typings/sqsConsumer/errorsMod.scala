package typings.sqsConsumer

import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sqs-consumer/dist/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  
  @js.native
  class SQSError protected () extends Error {
    def this(message: String) = this()
    
    var code: String = js.native
    
    var hostname: String = js.native
    
    var region: String = js.native
    
    var retryable: Boolean = js.native
    
    var statusCode: Double = js.native
    
    var time: Date = js.native
  }
  
  @js.native
  class TimeoutError () extends Error {
    def this(message: String) = this()
  }
}
