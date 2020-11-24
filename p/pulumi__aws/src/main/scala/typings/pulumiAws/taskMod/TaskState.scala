package typings.pulumiAws.taskMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.inputMod.datasync.TaskOptions
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskState extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of the DataSync Task.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the CloudWatch Log Group that is used to monitor and log events in the sync task.
    */
  val cloudwatchLogGroupArn: js.UndefOr[Input[ARN]] = js.native
  
  /**
    * Amazon Resource Name (ARN) of destination DataSync Location.
    */
  val destinationLocationArn: js.UndefOr[Input[ARN]] = js.native
  
  /**
    * Name of the DataSync Task.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Configuration block containing option that controls the default behavior when you start an execution of this DataSync Task. For each individual task execution, you can override these options by specifying an overriding configuration in those executions.
    */
  val options: js.UndefOr[Input[TaskOptions]] = js.native
  
  /**
    * Amazon Resource Name (ARN) of source DataSync Location.
    */
  val sourceLocationArn: js.UndefOr[Input[ARN]] = js.native
  
  /**
    * Key-value pairs of resource tags to assign to the DataSync Task.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object TaskState {
  
  @scala.inline
  def apply(): TaskState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskState]
  }
  
  @scala.inline
  implicit class TaskStateOps[Self <: TaskState] (val x: Self) extends AnyVal {
    
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
    def setCloudwatchLogGroupArn(value: Input[ARN]): Self = this.set("cloudwatchLogGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudwatchLogGroupArn: Self = this.set("cloudwatchLogGroupArn", js.undefined)
    
    @scala.inline
    def setDestinationLocationArn(value: Input[ARN]): Self = this.set("destinationLocationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationLocationArn: Self = this.set("destinationLocationArn", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOptions(value: Input[TaskOptions]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setSourceLocationArn(value: Input[ARN]): Self = this.set("sourceLocationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceLocationArn: Self = this.set("sourceLocationArn", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
