package typings.atPulumiAws.atPulumiAwsMod.ec2

import typings.atPulumiAws.ec2GetInstanceMod.GetInstanceArgs
import typings.atPulumiAws.ec2GetInstanceMod.GetInstanceResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
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

