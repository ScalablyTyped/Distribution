package typings.atPulumiAws.atPulumiAwsMod.ec2

import typings.atPulumiAws.ec2GetSecurityGroupsMod.GetSecurityGroupsArgs
import typings.atPulumiAws.ec2GetSecurityGroupsMod.GetSecurityGroupsResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.getSecurityGroups")
@js.native
object getSecurityGroups extends js.Object {
  def apply(): js.Promise[GetSecurityGroupsResult] with GetSecurityGroupsResult = js.native
  def apply(args: GetSecurityGroupsArgs): js.Promise[GetSecurityGroupsResult] with GetSecurityGroupsResult = js.native
  def apply(args: GetSecurityGroupsArgs, opts: InvokeOptions): js.Promise[GetSecurityGroupsResult] with GetSecurityGroupsResult = js.native
}

