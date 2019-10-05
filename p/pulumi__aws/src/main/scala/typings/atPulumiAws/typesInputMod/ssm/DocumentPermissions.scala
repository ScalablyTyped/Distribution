package typings.atPulumiAws.typesInputMod.ssm

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentPermissions extends js.Object {
  var accountIds: Input[String]
  var `type`: Input[String]
}

object DocumentPermissions {
  @scala.inline
  def apply(accountIds: Input[String], `type`: Input[String]): DocumentPermissions = {
    val __obj = js.Dynamic.literal(accountIds = accountIds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentPermissions]
  }
}

