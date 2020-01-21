package typings.pulumiAws.ec2Mod

import typings.pulumiAws.getSecurityGroupsMod.GetSecurityGroupsArgs
import typings.pulumiAws.getSecurityGroupsMod.GetSecurityGroupsResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getSecurityGroups")
@js.native
object getSecurityGroups extends js.Object {
  def apply(): js.Promise[GetSecurityGroupsResult] with GetSecurityGroupsResult = js.native
  def apply(args: GetSecurityGroupsArgs): js.Promise[GetSecurityGroupsResult] with GetSecurityGroupsResult = js.native
  def apply(args: GetSecurityGroupsArgs, opts: InvokeOptions): js.Promise[GetSecurityGroupsResult] with GetSecurityGroupsResult = js.native
}

