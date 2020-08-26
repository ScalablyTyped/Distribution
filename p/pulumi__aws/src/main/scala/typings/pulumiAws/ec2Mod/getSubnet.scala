package typings.pulumiAws.ec2Mod

import typings.pulumiAws.getSubnetMod.GetSubnetArgs
import typings.pulumiAws.getSubnetMod.GetSubnetResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getSubnet")
@js.native
object getSubnet extends js.Object {
  def apply(): js.Promise[GetSubnetResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetSubnetResult] = js.native
  def apply(args: GetSubnetArgs): js.Promise[GetSubnetResult] = js.native
  def apply(args: GetSubnetArgs, opts: InvokeOptions): js.Promise[GetSubnetResult] = js.native
}

