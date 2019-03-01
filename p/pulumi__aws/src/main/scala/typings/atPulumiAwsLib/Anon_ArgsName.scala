package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsName extends js.Object {
  var args: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  var name: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var path: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_ArgsName {
  @scala.inline
  def apply(
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    path: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    args: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null
  ): Anon_ArgsName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArgsName]
  }
}

