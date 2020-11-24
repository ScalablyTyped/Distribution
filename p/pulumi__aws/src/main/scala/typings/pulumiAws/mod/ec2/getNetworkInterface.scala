package typings.pulumiAws.mod.ec2

import typings.pulumiAws.getNetworkInterfaceMod.GetNetworkInterfaceArgs
import typings.pulumiAws.getNetworkInterfaceMod.GetNetworkInterfaceResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "ec2.getNetworkInterface")
@js.native
object getNetworkInterface extends js.Object {
  
  def apply(): js.Promise[GetNetworkInterfaceResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetNetworkInterfaceResult] = js.native
  def apply(args: GetNetworkInterfaceArgs): js.Promise[GetNetworkInterfaceResult] = js.native
  def apply(args: GetNetworkInterfaceArgs, opts: InvokeOptions): js.Promise[GetNetworkInterfaceResult] = js.native
}
