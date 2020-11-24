package typings.sqsConsumer.consumerMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Events extends js.Object {
  
  var empty: js.Array[js.Any] = js.native
  
  var error: js.Tuple2[Error, Unit | SQSMessage | js.Array[SQSMessage]] = js.native
  
  var message_processed: js.Array[SQSMessage] = js.native
  
  var message_received: js.Array[SQSMessage] = js.native
  
  var processing_error: js.Tuple2[Error, SQSMessage] = js.native
  
  var response_processed: js.Array[js.Any] = js.native
  
  var stopped: js.Array[js.Any] = js.native
  
  var timeout_error: js.Tuple2[Error, SQSMessage] = js.native
}
object Events {
  
  @scala.inline
  def apply(
    empty: js.Array[js.Any],
    error: js.Tuple2[Error, Unit | SQSMessage | js.Array[SQSMessage]],
    message_processed: js.Array[SQSMessage],
    message_received: js.Array[SQSMessage],
    processing_error: js.Tuple2[Error, SQSMessage],
    response_processed: js.Array[js.Any],
    stopped: js.Array[js.Any],
    timeout_error: js.Tuple2[Error, SQSMessage]
  ): Events = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message_processed = message_processed.asInstanceOf[js.Any], message_received = message_received.asInstanceOf[js.Any], processing_error = processing_error.asInstanceOf[js.Any], response_processed = response_processed.asInstanceOf[js.Any], stopped = stopped.asInstanceOf[js.Any], timeout_error = timeout_error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
  
  @scala.inline
  implicit class EventsOps[Self <: Events] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEmptyVarargs(value: js.Any*): Self = this.set("empty", js.Array(value :_*))
    
    @scala.inline
    def setEmpty(value: js.Array[js.Any]): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: js.Tuple2[Error, Unit | SQSMessage | js.Array[SQSMessage]]): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage_processedVarargs(value: SQSMessage*): Self = this.set("message_processed", js.Array(value :_*))
    
    @scala.inline
    def setMessage_processed(value: js.Array[SQSMessage]): Self = this.set("message_processed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage_receivedVarargs(value: SQSMessage*): Self = this.set("message_received", js.Array(value :_*))
    
    @scala.inline
    def setMessage_received(value: js.Array[SQSMessage]): Self = this.set("message_received", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessing_error(value: js.Tuple2[Error, SQSMessage]): Self = this.set("processing_error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse_processedVarargs(value: js.Any*): Self = this.set("response_processed", js.Array(value :_*))
    
    @scala.inline
    def setResponse_processed(value: js.Array[js.Any]): Self = this.set("response_processed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoppedVarargs(value: js.Any*): Self = this.set("stopped", js.Array(value :_*))
    
    @scala.inline
    def setStopped(value: js.Array[js.Any]): Self = this.set("stopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout_error(value: js.Tuple2[Error, SQSMessage]): Self = this.set("timeout_error", value.asInstanceOf[js.Any])
  }
}
