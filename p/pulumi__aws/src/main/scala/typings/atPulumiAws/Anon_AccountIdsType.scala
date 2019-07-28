package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccountIdsType extends js.Object {
  var accountIds: String
  var `type`: String
}

object Anon_AccountIdsType {
  @scala.inline
  def apply(accountIds: String, `type`: String): Anon_AccountIdsType = {
    val __obj = js.Dynamic.literal(accountIds = accountIds)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AccountIdsType]
  }
}

