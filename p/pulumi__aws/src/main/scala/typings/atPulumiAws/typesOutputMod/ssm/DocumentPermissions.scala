package typings.atPulumiAws.typesOutputMod.ssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentPermissions extends js.Object {
  var accountIds: String
  var `type`: String
}

object DocumentPermissions {
  @scala.inline
  def apply(accountIds: String, `type`: String): DocumentPermissions = {
    val __obj = js.Dynamic.literal(accountIds = accountIds)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DocumentPermissions]
  }
}

