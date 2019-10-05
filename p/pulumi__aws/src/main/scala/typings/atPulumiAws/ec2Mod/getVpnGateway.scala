package typings.atPulumiAws.ec2Mod

import typings.atPulumiAws.ec2GetVpnGatewayMod.GetVpnGatewayArgs
import typings.atPulumiAws.ec2GetVpnGatewayMod.GetVpnGatewayResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getVpnGateway")
@js.native
object getVpnGateway extends js.Object {
  def apply(): js.Promise[GetVpnGatewayResult] with GetVpnGatewayResult = js.native
  def apply(args: GetVpnGatewayArgs): js.Promise[GetVpnGatewayResult] with GetVpnGatewayResult = js.native
  def apply(args: GetVpnGatewayArgs, opts: InvokeOptions): js.Promise[GetVpnGatewayResult] with GetVpnGatewayResult = js.native
}

