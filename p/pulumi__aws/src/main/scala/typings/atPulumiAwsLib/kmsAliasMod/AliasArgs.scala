package typings
package atPulumiAwsLib.kmsAliasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasArgs extends js.Object {
  /**
    * The display name of the alias. The name must start with the word "alias" followed by a forward slash (alias/)
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Creates an unique alias beginning with the specified prefix.
    * The name must start with the word "alias" followed by a forward slash (alias/).  Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Identifier for the key for which the alias is for, can be either an ARN or key_id.
    */
  val targetKeyId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object AliasArgs {
  @scala.inline
  def apply(
    targetKeyId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    namePrefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): AliasArgs = {
    val __obj = js.Dynamic.literal(targetKeyId = targetKeyId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasArgs]
  }
}

