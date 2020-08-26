package typings.pulumiAws.mod.ec2

import typings.pulumiAws.getNetworkInterfacesMod.GetNetworkInterfacesArgs
import typings.pulumiAws.getNetworkInterfacesMod.GetNetworkInterfacesResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.getNetworkInterfaces")
@js.native
object getNetworkInterfaces extends js.Object {
  def apply(): js.Promise[GetNetworkInterfacesResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetNetworkInterfacesResult] = js.native
  def apply(args: GetNetworkInterfacesArgs): js.Promise[GetNetworkInterfacesResult] = js.native
  def apply(args: GetNetworkInterfacesArgs, opts: InvokeOptions): js.Promise[GetNetworkInterfacesResult] = js.native
}

