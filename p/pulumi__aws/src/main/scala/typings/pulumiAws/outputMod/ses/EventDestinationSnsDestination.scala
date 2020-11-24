package typings.pulumiAws.outputMod.ses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventDestinationSnsDestination extends js.Object {
  
  /**
    * The ARN of the SNS topic
    */
  var topicArn: String = js.native
}
object EventDestinationSnsDestination {
  
  @scala.inline
  def apply(topicArn: String): EventDestinationSnsDestination = {
    val __obj = js.Dynamic.literal(topicArn = topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDestinationSnsDestination]
  }
  
  @scala.inline
  implicit class EventDestinationSnsDestinationOps[Self <: EventDestinationSnsDestination] (val x: Self) extends AnyVal {
    
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
    def setTopicArn(value: String): Self = this.set("topicArn", value.asInstanceOf[js.Any])
  }
}
