package typings.pulumiAws.scheduledActionMod

import typings.pulumiAws.inputMod.appautoscaling.ScheduledActionScalableTargetAction
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduledActionState extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the scheduled action.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The date and time for the scheduled action to end. Specify the following format: 2006-01-02T15:04:05Z
    */
  val endTime: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the scheduled action.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The identifier of the resource associated with the scheduled action. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ResourceId)
    */
  val resourceId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The scalable dimension. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ScalableDimension) Example: ecs:service:DesiredCount
    */
  val scalableDimension: js.UndefOr[Input[String]] = js.native
  
  /**
    * The new minimum and maximum capacity. You can set both values or just one. See below
    */
  val scalableTargetAction: js.UndefOr[Input[ScheduledActionScalableTargetAction]] = js.native
  
  /**
    * The schedule for this action. The following formats are supported: At expressions - at(yyyy-mm-ddThh:mm:ss), Rate expressions - rate(valueunit), Cron expressions - cron(fields). In UTC. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-Schedule)
    */
  val schedule: js.UndefOr[Input[String]] = js.native
  
  /**
    * The namespace of the AWS service. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ServiceNamespace) Example: ecs
    */
  val serviceNamespace: js.UndefOr[Input[String]] = js.native
  
  /**
    * The date and time for the scheduled action to start. Specify the following format: 2006-01-02T15:04:05Z
    */
  val startTime: js.UndefOr[Input[String]] = js.native
}
object ScheduledActionState {
  
  @scala.inline
  def apply(): ScheduledActionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledActionState]
  }
  
  @scala.inline
  implicit class ScheduledActionStateOps[Self <: ScheduledActionState] (val x: Self) extends AnyVal {
    
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
    def setEndTime(value: Input[String]): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setResourceId(value: Input[String]): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
    
    @scala.inline
    def setScalableDimension(value: Input[String]): Self = this.set("scalableDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalableDimension: Self = this.set("scalableDimension", js.undefined)
    
    @scala.inline
    def setScalableTargetAction(value: Input[ScheduledActionScalableTargetAction]): Self = this.set("scalableTargetAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalableTargetAction: Self = this.set("scalableTargetAction", js.undefined)
    
    @scala.inline
    def setSchedule(value: Input[String]): Self = this.set("schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
    
    @scala.inline
    def setServiceNamespace(value: Input[String]): Self = this.set("serviceNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceNamespace: Self = this.set("serviceNamespace", js.undefined)
    
    @scala.inline
    def setStartTime(value: Input[String]): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
}
