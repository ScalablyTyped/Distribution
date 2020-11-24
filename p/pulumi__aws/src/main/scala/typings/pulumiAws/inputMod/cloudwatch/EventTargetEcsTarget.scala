package typings.pulumiAws.inputMod.cloudwatch

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventTargetEcsTarget extends js.Object {
  
  /**
    * Specifies an ECS task group for the task. The maximum length is 255 characters.
    */
  var group: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies the launch type on which your task is running. The launch type that you specify here must match one of the launch type (compatibilities) of the target task. Valid values are `EC2` or `FARGATE`.
    */
  var launchType: js.UndefOr[Input[String]] = js.native
  
  /**
    * Use this if the ECS task uses the awsvpc network mode. This specifies the VPC subnets and security groups associated with the task, and whether a public IP address is to be used. Required if launchType is FARGATE because the awsvpc mode is required for Fargate tasks.
    */
  var networkConfiguration: js.UndefOr[Input[EventTargetEcsTargetNetworkConfiguration]] = js.native
  
  /**
    * Specifies the platform version for the task. Specify only the numeric portion of the platform version, such as 1.1.0. This is used only if LaunchType is FARGATE. For more information about valid platform versions, see [AWS Fargate Platform Versions](http://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
    */
  var platformVersion: js.UndefOr[Input[String]] = js.native
  
  /**
    * The number of tasks to create based on the TaskDefinition. The default is 1.
    */
  var taskCount: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The ARN of the task definition to use if the event target is an Amazon ECS cluster.
    */
  var taskDefinitionArn: Input[String] = js.native
}
object EventTargetEcsTarget {
  
  @scala.inline
  def apply(taskDefinitionArn: Input[String]): EventTargetEcsTarget = {
    val __obj = js.Dynamic.literal(taskDefinitionArn = taskDefinitionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTargetEcsTarget]
  }
  
  @scala.inline
  implicit class EventTargetEcsTargetOps[Self <: EventTargetEcsTarget] (val x: Self) extends AnyVal {
    
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
    def setTaskDefinitionArn(value: Input[String]): Self = this.set("taskDefinitionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: Input[String]): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setLaunchType(value: Input[String]): Self = this.set("launchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchType: Self = this.set("launchType", js.undefined)
    
    @scala.inline
    def setNetworkConfiguration(value: Input[EventTargetEcsTargetNetworkConfiguration]): Self = this.set("networkConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkConfiguration: Self = this.set("networkConfiguration", js.undefined)
    
    @scala.inline
    def setPlatformVersion(value: Input[String]): Self = this.set("platformVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformVersion: Self = this.set("platformVersion", js.undefined)
    
    @scala.inline
    def setTaskCount(value: Input[Double]): Self = this.set("taskCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskCount: Self = this.set("taskCount", js.undefined)
  }
}
