package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccountIdsTypeInput extends js.Object {
  var accountIds: Input[String]
  var `type`: Input[String]
}

object Anon_AccountIdsTypeInput {
  @scala.inline
  def apply(accountIds: Input[String], `type`: Input[String]): Anon_AccountIdsTypeInput = {
    val __obj = js.Dynamic.literal(accountIds = accountIds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AccountIdsTypeInput]
  }
}

