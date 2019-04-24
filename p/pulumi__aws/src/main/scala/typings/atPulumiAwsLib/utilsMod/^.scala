package typings
package atPulumiAwsLib.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def ifUndefined[T](
    input: atPulumiPulumiLib.outputMod.Input[T] | js.UndefOr[scala.Nothing],
    value: atPulumiPulumiLib.outputMod.Input[T]
  ): atPulumiPulumiLib.outputMod.Output[atPulumiPulumiLib.outputMod.Unwrap[T]] = js.native
  def sha1hash(s: java.lang.String): java.lang.String = js.native
}

