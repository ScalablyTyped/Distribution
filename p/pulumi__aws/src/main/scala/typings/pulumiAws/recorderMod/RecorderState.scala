package typings.pulumiAws.recorderMod

import typings.pulumiAws.inputMod.cfg.RecorderRecordingGroup
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecorderState extends js.Object {
  
  /**
    * The name of the recorder. Defaults to `default`. Changing it recreates the resource.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Recording group - see below.
    */
  val recordingGroup: js.UndefOr[Input[RecorderRecordingGroup]] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the IAM role. Used to make read or write requests to the delivery channel and to describe the AWS resources associated with the account. See [AWS Docs](http://docs.aws.amazon.com/config/latest/developerguide/iamrole-permissions.html) for more details.
    */
  val roleArn: js.UndefOr[Input[String]] = js.native
}
object RecorderState {
  
  @scala.inline
  def apply(): RecorderState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecorderState]
  }
  
  @scala.inline
  implicit class RecorderStateOps[Self <: RecorderState] (val x: Self) extends AnyVal {
    
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRecordingGroup(value: Input[RecorderRecordingGroup]): Self = this.set("recordingGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordingGroup: Self = this.set("recordingGroup", js.undefined)
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
  }
}
