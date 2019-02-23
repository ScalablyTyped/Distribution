package typings
package atPulumiAwsLib.autoscalingAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentState extends js.Object {
  /**
    * The ARN of an ALB Target Group.
    */
  val albTargetGroupArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Name of ASG to associate with the ELB.
    */
  val autoscalingGroupName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the ELB.
    */
  val elb: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

