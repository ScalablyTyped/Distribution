package typings.pulumiAws.mod.ec2

import typings.pulumiAws.getVpcPeeringConnectionsMod.GetVpcPeeringConnectionsArgs
import typings.pulumiAws.getVpcPeeringConnectionsMod.GetVpcPeeringConnectionsResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "ec2.getVpcPeeringConnections")
@js.native
object getVpcPeeringConnections extends js.Object {
  
  def apply(): js.Promise[GetVpcPeeringConnectionsResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetVpcPeeringConnectionsResult] = js.native
  def apply(args: GetVpcPeeringConnectionsArgs): js.Promise[GetVpcPeeringConnectionsResult] = js.native
  def apply(args: GetVpcPeeringConnectionsArgs, opts: InvokeOptions): js.Promise[GetVpcPeeringConnectionsResult] = js.native
}
