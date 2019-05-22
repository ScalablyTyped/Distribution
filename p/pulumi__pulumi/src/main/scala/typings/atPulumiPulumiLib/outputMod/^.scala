package typings
package atPulumiPulumiLib.outputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/output", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Output: OutputConstructor = js.native
  def all[T /* <: js.Object */](`val`: T): Output[UnwrappedObject[T]] = js.native
  def all[T /* <: js.Array[_] */](xs: js.Array[js.Any]): Output[UnwrappedObject[T]] = js.native
  @JSName("all")
  def all_TArray[T /* <: js.Array[_] */](xs: T): Output[UnwrappedObject[T]] = js.native
  def concat(params: Input[_]*): Output[java.lang.String] = js.native
  def interpolate(literals: stdLib.TemplateStringsArray, placeholders: Input[_]*): Output[java.lang.String] = js.native
  def output[T](): Output[Unwrap[js.UndefOr[T]]] = js.native
  def output[T](`val`: Input[T]): Output[Unwrap[T]] = js.native
  def secret[T](): Output[Unwrap[js.UndefOr[T]]] = js.native
  def secret[T](`val`: Input[T]): Output[Unwrap[T]] = js.native
}

