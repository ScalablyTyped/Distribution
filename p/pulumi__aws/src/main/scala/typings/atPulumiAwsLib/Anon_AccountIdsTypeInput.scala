package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccountIdsTypeInput extends js.Object {
  var accountIds: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_AccountIdsTypeInput {
  @scala.inline
  def apply(
    accountIds: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_AccountIdsTypeInput = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("accountIds")(accountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AccountIdsTypeInput]
  }
}

