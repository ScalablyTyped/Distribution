package typings.pulumiAws.outputMod.ses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventDestinationKinesisDestination extends js.Object {
  
  /**
    * The ARN of the role that has permissions to access the Kinesis Stream
    */
  var roleArn: String = js.native
  
  /**
    * The ARN of the Kinesis Stream
    */
  var streamArn: String = js.native
}
object EventDestinationKinesisDestination {
  
  @scala.inline
  def apply(roleArn: String, streamArn: String): EventDestinationKinesisDestination = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], streamArn = streamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDestinationKinesisDestination]
  }
  
  @scala.inline
  implicit class EventDestinationKinesisDestinationOps[Self <: EventDestinationKinesisDestination] (val x: Self) extends AnyVal {
    
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
    def setRoleArn(value: String): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamArn(value: String): Self = this.set("streamArn", value.asInstanceOf[js.Any])
  }
}
