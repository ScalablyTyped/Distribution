package typings.pulumiAws.mod.ec2

import typings.pulumiAws.getLocalGatewayVirtualInterfaceGroupsMod.GetLocalGatewayVirtualInterfaceGroupsArgs
import typings.pulumiAws.getLocalGatewayVirtualInterfaceGroupsMod.GetLocalGatewayVirtualInterfaceGroupsResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "ec2.getLocalGatewayVirtualInterfaceGroups")
@js.native
object getLocalGatewayVirtualInterfaceGroups extends js.Object {
  
  def apply(): js.Promise[GetLocalGatewayVirtualInterfaceGroupsResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetLocalGatewayVirtualInterfaceGroupsResult] = js.native
  def apply(args: GetLocalGatewayVirtualInterfaceGroupsArgs): js.Promise[GetLocalGatewayVirtualInterfaceGroupsResult] = js.native
  def apply(args: GetLocalGatewayVirtualInterfaceGroupsArgs, opts: InvokeOptions): js.Promise[GetLocalGatewayVirtualInterfaceGroupsResult] = js.native
}
