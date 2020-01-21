package typings.pulumiPulumi.mod

import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Unwrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "output")
@js.native
object output extends js.Object {
  def apply[T](): typings.pulumiPulumi.outputMod.Output_[Unwrap[js.UndefOr[T]]] = js.native
  def apply[T](`val`: Input[T]): typings.pulumiPulumi.outputMod.Output_[Unwrap[T]] = js.native
}

