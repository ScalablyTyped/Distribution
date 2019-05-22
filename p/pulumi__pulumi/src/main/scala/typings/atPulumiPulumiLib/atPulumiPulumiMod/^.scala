package typings
package atPulumiPulumiLib.atPulumiPulumiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Output: atPulumiPulumiLib.outputMod.OutputConstructor = js.native
  def all[T /* <: js.Object */](`val`: T): atPulumiPulumiLib.outputMod.Output[atPulumiPulumiLib.outputMod.UnwrappedObject[T]] = js.native
  def all[T /* <: js.Array[_] */](xs: js.Array[js.Any]): atPulumiPulumiLib.outputMod.Output[atPulumiPulumiLib.outputMod.UnwrappedObject[T]] = js.native
  @JSName("all")
  def all_TArray[T /* <: js.Array[_] */](xs: T): atPulumiPulumiLib.outputMod.Output[atPulumiPulumiLib.outputMod.UnwrappedObject[T]] = js.native
  def concat(params: atPulumiPulumiLib.outputMod.Input[_]*): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def getProject(): java.lang.String = js.native
  def getStack(): java.lang.String = js.native
  def interpolate(literals: stdLib.TemplateStringsArray, placeholders: atPulumiPulumiLib.outputMod.Input[_]*): atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  def output[T](): atPulumiPulumiLib.outputMod.Output[atPulumiPulumiLib.outputMod.Unwrap[js.UndefOr[T]]] = js.native
  def output[T](`val`: atPulumiPulumiLib.outputMod.Input[T]): atPulumiPulumiLib.outputMod.Output[atPulumiPulumiLib.outputMod.Unwrap[T]] = js.native
  def secret[T](): atPulumiPulumiLib.outputMod.Output[atPulumiPulumiLib.outputMod.Unwrap[js.UndefOr[T]]] = js.native
  def secret[T](`val`: atPulumiPulumiLib.outputMod.Input[T]): atPulumiPulumiLib.outputMod.Output[atPulumiPulumiLib.outputMod.Unwrap[T]] = js.native
}

