package typings.pulumiAws.ec2Mod

import typings.pulumiAws.getInternetGatewayMod.GetInternetGatewayArgs
import typings.pulumiAws.getInternetGatewayMod.GetInternetGatewayResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "getInternetGateway")
@js.native
object getInternetGateway extends js.Object {
  
  def apply(): js.Promise[GetInternetGatewayResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetInternetGatewayResult] = js.native
  def apply(args: GetInternetGatewayArgs): js.Promise[GetInternetGatewayResult] = js.native
  def apply(args: GetInternetGatewayArgs, opts: InvokeOptions): js.Promise[GetInternetGatewayResult] = js.native
}
