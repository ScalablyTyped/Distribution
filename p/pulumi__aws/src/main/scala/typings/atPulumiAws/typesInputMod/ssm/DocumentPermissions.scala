package typings.atPulumiAws.typesInputMod.ssm

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentPermissions extends js.Object {
  var accountIds: Input[String] = js.native
  var `type`: Input[String] = js.native
}

object DocumentPermissions {
  @scala.inline
  def apply(accountIds: Input[String], `type`: Input[String]): DocumentPermissions = {
    val __obj = js.Dynamic.literal(accountIds = accountIds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentPermissions]
  }
}

