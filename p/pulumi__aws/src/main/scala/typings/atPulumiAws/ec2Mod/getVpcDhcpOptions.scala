package typings.atPulumiAws.ec2Mod

import typings.atPulumiAws.ec2GetVpcDhcpOptionsMod.GetVpcDhcpOptionsArgs
import typings.atPulumiAws.ec2GetVpcDhcpOptionsMod.GetVpcDhcpOptionsResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getVpcDhcpOptions")
@js.native
object getVpcDhcpOptions extends js.Object {
  def apply(): js.Promise[GetVpcDhcpOptionsResult] with GetVpcDhcpOptionsResult = js.native
  def apply(args: GetVpcDhcpOptionsArgs): js.Promise[GetVpcDhcpOptionsResult] with GetVpcDhcpOptionsResult = js.native
  def apply(args: GetVpcDhcpOptionsArgs, opts: InvokeOptions): js.Promise[GetVpcDhcpOptionsResult] with GetVpcDhcpOptionsResult = js.native
}

