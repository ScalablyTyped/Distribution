package typings.pulumiAws.logDestinationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogDestinationState extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) specifying the log destination.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * A name for the log destination
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to put data into the target
    */
  val roleArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the target Amazon Kinesis stream resource for the destination
    */
  val targetArn: js.UndefOr[Input[String]] = js.native
}
object LogDestinationState {
  
  @scala.inline
  def apply(): LogDestinationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogDestinationState]
  }
  
  @scala.inline
  implicit class LogDestinationStateOps[Self <: LogDestinationState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
    
    @scala.inline
    def setTargetArn(value: Input[String]): Self = this.set("targetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetArn: Self = this.set("targetArn", js.undefined)
  }
}
