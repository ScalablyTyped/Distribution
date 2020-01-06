package typings.atPulumiAws.autoscalingNotificationTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atPulumiAws.atPulumiAwsStrings.autoscalingColonEC2_INSTANCE_LAUNCH
  - typings.atPulumiAws.atPulumiAwsStrings.autoscalingColonEC2_INSTANCE_TERMINATE
  - typings.atPulumiAws.atPulumiAwsStrings.autoscalingColonEC2_INSTANCE_LAUNCH_ERROR
  - typings.atPulumiAws.atPulumiAwsStrings.autoscalingColonEC2_INSTANCE_TERMINATE_ERROR
  - typings.atPulumiAws.atPulumiAwsStrings.autoscalingColonTEST_NOTIFICATION
*/
trait NotificationType extends js.Object

object NotificationType {
  @scala.inline
  def autoscalingColonEC2_INSTANCE_LAUNCH: typings.atPulumiAws.atPulumiAwsStrings.autoscalingColonEC2_INSTANCE_LAUNCH = this.cast("autoscaling:EC2_INSTANCE_LAUNCH")
  @scala.inline
  def autoscalingColonEC2_INSTANCE_LAUNCH_ERROR: typings.atPulumiAws.atPulumiAwsStrings.autoscalingColonEC2_INSTANCE_LAUNCH_ERROR = this.cast("autoscaling:EC2_INSTANCE_LAUNCH_ERROR")
  @scala.inline
  def autoscalingColonEC2_INSTANCE_TERMINATE: typings.atPulumiAws.atPulumiAwsStrings.autoscalingColonEC2_INSTANCE_TERMINATE = this.cast("autoscaling:EC2_INSTANCE_TERMINATE")
  @scala.inline
  def autoscalingColonEC2_INSTANCE_TERMINATE_ERROR: typings.atPulumiAws.atPulumiAwsStrings.autoscalingColonEC2_INSTANCE_TERMINATE_ERROR = this.cast("autoscaling:EC2_INSTANCE_TERMINATE_ERROR")
  @scala.inline
  def autoscalingColonTEST_NOTIFICATION: typings.atPulumiAws.atPulumiAwsStrings.autoscalingColonTEST_NOTIFICATION = this.cast("autoscaling:TEST_NOTIFICATION")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

