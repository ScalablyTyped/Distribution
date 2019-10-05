package typings.atPulumiAws.ec2Mod

import typings.atPulumiAws.ec2GetSecurityGroupMod.GetSecurityGroupArgs
import typings.atPulumiAws.ec2GetSecurityGroupMod.GetSecurityGroupResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getSecurityGroup")
@js.native
object getSecurityGroup extends js.Object {
  def apply(): js.Promise[GetSecurityGroupResult] with GetSecurityGroupResult = js.native
  def apply(args: GetSecurityGroupArgs): js.Promise[GetSecurityGroupResult] with GetSecurityGroupResult = js.native
  def apply(args: GetSecurityGroupArgs, opts: InvokeOptions): js.Promise[GetSecurityGroupResult] with GetSecurityGroupResult = js.native
}

