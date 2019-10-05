package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.getAutoscalingGroupsMod.GetAutoscalingGroupsArgs
import typings.atPulumiAws.getAutoscalingGroupsMod.GetAutoscalingGroupsResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "getAutoscalingGroups")
@js.native
object getAutoscalingGroups extends js.Object {
  def apply(): js.Promise[GetAutoscalingGroupsResult] with GetAutoscalingGroupsResult = js.native
  def apply(args: GetAutoscalingGroupsArgs): js.Promise[GetAutoscalingGroupsResult] with GetAutoscalingGroupsResult = js.native
  def apply(args: GetAutoscalingGroupsArgs, opts: InvokeOptions): js.Promise[GetAutoscalingGroupsResult] with GetAutoscalingGroupsResult = js.native
}

