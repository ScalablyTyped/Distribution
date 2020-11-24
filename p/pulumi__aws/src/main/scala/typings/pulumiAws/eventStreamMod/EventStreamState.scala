package typings.pulumiAws.eventStreamMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventStreamState extends js.Object {
  
  /**
    * The application ID.
    */
  val applicationId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to publish events.
    */
  val destinationStreamArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
    */
  val roleArn: js.UndefOr[Input[String]] = js.native
}
object EventStreamState {
  
  @scala.inline
  def apply(): EventStreamState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventStreamState]
  }
  
  @scala.inline
  implicit class EventStreamStateOps[Self <: EventStreamState] (val x: Self) extends AnyVal {
    
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
    def setApplicationId(value: Input[String]): Self = this.set("applicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationId: Self = this.set("applicationId", js.undefined)
    
    @scala.inline
    def setDestinationStreamArn(value: Input[String]): Self = this.set("destinationStreamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationStreamArn: Self = this.set("destinationStreamArn", js.undefined)
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
  }
}
