package typings.pulumiAws.ec2Mod

import typings.pulumiAws.getVpnGatewayMod.GetVpnGatewayArgs
import typings.pulumiAws.getVpnGatewayMod.GetVpnGatewayResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "getVpnGateway")
@js.native
object getVpnGateway extends js.Object {
  
  def apply(): js.Promise[GetVpnGatewayResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetVpnGatewayResult] = js.native
  def apply(args: GetVpnGatewayArgs): js.Promise[GetVpnGatewayResult] = js.native
  def apply(args: GetVpnGatewayArgs, opts: InvokeOptions): js.Promise[GetVpnGatewayResult] = js.native
}
