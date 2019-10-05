package typings.atPulumiPulumi.atPulumiPulumiMod

import org.scalablytyped.runtime.TopLevel
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.outputMod.OutputConstructor
import typings.atPulumiPulumi.outputMod.Unwrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "Output")
@js.native
object Output extends TopLevel[OutputConstructor]

@JSImport("@pulumi/pulumi", "output")
@js.native
object output extends js.Object {
  def apply[T](): Output[Unwrap[js.UndefOr[T]]] = js.native
  def apply[T](`val`: Input[T]): Output[Unwrap[T]] = js.native
}

