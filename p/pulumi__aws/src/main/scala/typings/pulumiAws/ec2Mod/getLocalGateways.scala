package typings.pulumiAws.ec2Mod

import typings.pulumiAws.getLocalGatewaysMod.GetLocalGatewaysArgs
import typings.pulumiAws.getLocalGatewaysMod.GetLocalGatewaysResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getLocalGateways")
@js.native
object getLocalGateways extends js.Object {
  def apply(): js.Promise[GetLocalGatewaysResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetLocalGatewaysResult] = js.native
  def apply(args: GetLocalGatewaysArgs): js.Promise[GetLocalGatewaysResult] = js.native
  def apply(args: GetLocalGatewaysArgs, opts: InvokeOptions): js.Promise[GetLocalGatewaysResult] = js.native
}

