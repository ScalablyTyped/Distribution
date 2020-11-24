package typings.pulumiAws.ec2Mod

import typings.pulumiAws.getLocalGatewayRouteTableMod.GetLocalGatewayRouteTableArgs
import typings.pulumiAws.getLocalGatewayRouteTableMod.GetLocalGatewayRouteTableResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "getLocalGatewayRouteTable")
@js.native
object getLocalGatewayRouteTable extends js.Object {
  
  def apply(): js.Promise[GetLocalGatewayRouteTableResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetLocalGatewayRouteTableResult] = js.native
  def apply(args: GetLocalGatewayRouteTableArgs): js.Promise[GetLocalGatewayRouteTableResult] = js.native
  def apply(args: GetLocalGatewayRouteTableArgs, opts: InvokeOptions): js.Promise[GetLocalGatewayRouteTableResult] = js.native
}
