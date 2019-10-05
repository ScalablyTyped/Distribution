package typings.atPulumiAws.atPulumiAwsMod.ec2

import typings.atPulumiAws.ec2GetVpcMod.GetVpcArgs
import typings.atPulumiAws.ec2GetVpcMod.GetVpcResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.getVpc")
@js.native
object getVpc extends js.Object {
  def apply(): js.Promise[GetVpcResult] with GetVpcResult = js.native
  def apply(args: GetVpcArgs): js.Promise[GetVpcResult] with GetVpcResult = js.native
  def apply(args: GetVpcArgs, opts: InvokeOptions): js.Promise[GetVpcResult] with GetVpcResult = js.native
}

