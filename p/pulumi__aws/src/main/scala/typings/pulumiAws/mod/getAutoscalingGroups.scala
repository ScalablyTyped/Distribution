package typings.pulumiAws.mod

import typings.pulumiAws.getAutoscalingGroupsMod.GetAutoscalingGroupsArgs
import typings.pulumiAws.getAutoscalingGroupsMod.GetAutoscalingGroupsResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "getAutoscalingGroups")
@js.native
object getAutoscalingGroups extends js.Object {
  def apply(): js.Promise[GetAutoscalingGroupsResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetAutoscalingGroupsResult] = js.native
  def apply(args: GetAutoscalingGroupsArgs): js.Promise[GetAutoscalingGroupsResult] = js.native
  def apply(args: GetAutoscalingGroupsArgs, opts: InvokeOptions): js.Promise[GetAutoscalingGroupsResult] = js.native
}

