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

