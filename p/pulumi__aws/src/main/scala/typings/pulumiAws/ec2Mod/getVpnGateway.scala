package typings.pulumiAws.ec2Mod

import typings.pulumiAws.getVpnGatewayMod.GetVpnGatewayArgs
import typings.pulumiAws.getVpnGatewayMod.GetVpnGatewayResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
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

