package typings.atPulumiAws.ec2Mod

import typings.atPulumiAws.ec2GetInstancesMod.GetInstancesArgs
import typings.atPulumiAws.ec2GetInstancesMod.GetInstancesResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getInstances")
@js.native
object getInstances extends js.Object {
  def apply(): js.Promise[GetInstancesResult] with GetInstancesResult = js.native
  def apply(args: GetInstancesArgs): js.Promise[GetInstancesResult] with GetInstancesResult = js.native
  def apply(args: GetInstancesArgs, opts: InvokeOptions): js.Promise[GetInstancesResult] with GetInstancesResult = js.native
}

