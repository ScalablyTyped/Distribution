package typings.pulumiAws.mod.ec2

import typings.pulumiAws.getInstanceMod.GetInstanceArgs
import typings.pulumiAws.getInstanceMod.GetInstanceResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.getInstance")
@js.native
object getInstance extends js.Object {
  def apply(): js.Promise[GetInstanceResult] with GetInstanceResult = js.native
  def apply(args: GetInstanceArgs): js.Promise[GetInstanceResult] with GetInstanceResult = js.native
  def apply(args: GetInstanceArgs, opts: InvokeOptions): js.Promise[GetInstanceResult] with GetInstanceResult = js.native
}

