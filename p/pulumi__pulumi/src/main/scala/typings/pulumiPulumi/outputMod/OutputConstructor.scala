package typings.pulumiPulumi.outputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputConstructor extends js.Object {
  def create[T](): Output_[Unwrap[js.UndefOr[T]]] = js.native
  def create[T](`val`: Input[T]): Output_[Unwrap[T]] = js.native
  def isInstance[T](obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/output.Output<T> */ Boolean = js.native
}

