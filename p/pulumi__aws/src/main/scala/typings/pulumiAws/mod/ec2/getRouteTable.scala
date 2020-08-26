package typings.pulumiAws.mod.ec2

import typings.pulumiAws.ec2GetRouteTableMod.GetRouteTableArgs
import typings.pulumiAws.ec2GetRouteTableMod.GetRouteTableResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.getRouteTable")
@js.native
object getRouteTable extends js.Object {
  def apply(): js.Promise[GetRouteTableResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetRouteTableResult] = js.native
  def apply(args: GetRouteTableArgs): js.Promise[GetRouteTableResult] = js.native
  def apply(args: GetRouteTableArgs, opts: InvokeOptions): js.Promise[GetRouteTableResult] = js.native
}

