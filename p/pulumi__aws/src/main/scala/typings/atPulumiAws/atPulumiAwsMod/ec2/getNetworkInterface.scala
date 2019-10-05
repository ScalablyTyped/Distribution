package typings.atPulumiAws.atPulumiAwsMod.ec2

import typings.atPulumiAws.ec2GetNetworkInterfaceMod.GetNetworkInterfaceArgs
import typings.atPulumiAws.ec2GetNetworkInterfaceMod.GetNetworkInterfaceResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.getNetworkInterface")
@js.native
object getNetworkInterface extends js.Object {
  def apply(): js.Promise[GetNetworkInterfaceResult] with GetNetworkInterfaceResult = js.native
  def apply(args: GetNetworkInterfaceArgs): js.Promise[GetNetworkInterfaceResult] with GetNetworkInterfaceResult = js.native
  def apply(args: GetNetworkInterfaceArgs, opts: InvokeOptions): js.Promise[GetNetworkInterfaceResult] with GetNetworkInterfaceResult = js.native
}

