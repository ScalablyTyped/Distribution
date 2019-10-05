package typings.atPulumiPulumi.atPulumiPulumiMod

import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.outputMod.Unwrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "secret")
@js.native
object secret extends js.Object {
  def apply[T](): Output[Unwrap[js.UndefOr[T]]] = js.native
  def apply[T](`val`: Input[T]): Output[Unwrap[T]] = js.native
}

