package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccountIdsType extends js.Object {
  var accountIds: java.lang.String
  var `type`: java.lang.String
}

object Anon_AccountIdsType {
  @scala.inline
  def apply(accountIds: java.lang.String, `type`: java.lang.String): Anon_AccountIdsType = {
    val __obj = js.Dynamic.literal(accountIds = accountIds)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AccountIdsType]
  }
}

