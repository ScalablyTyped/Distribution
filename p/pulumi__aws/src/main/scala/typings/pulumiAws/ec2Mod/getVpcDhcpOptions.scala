package typings.pulumiAws.ec2Mod

import typings.pulumiAws.getVpcDhcpOptionsMod.GetVpcDhcpOptionsArgs
import typings.pulumiAws.getVpcDhcpOptionsMod.GetVpcDhcpOptionsResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
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

