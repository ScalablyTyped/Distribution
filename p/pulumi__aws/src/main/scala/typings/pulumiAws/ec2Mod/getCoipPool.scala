package typings.pulumiAws.ec2Mod

import typings.pulumiAws.getCoipPoolMod.GetCoipPoolArgs
import typings.pulumiAws.getCoipPoolMod.GetCoipPoolResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getCoipPool")
@js.native
object getCoipPool extends js.Object {
  def apply(): js.Promise[GetCoipPoolResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetCoipPoolResult] = js.native
  def apply(args: GetCoipPoolArgs): js.Promise[GetCoipPoolResult] = js.native
  def apply(args: GetCoipPoolArgs, opts: InvokeOptions): js.Promise[GetCoipPoolResult] = js.native
}

