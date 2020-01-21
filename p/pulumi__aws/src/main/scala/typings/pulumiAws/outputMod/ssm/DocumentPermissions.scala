package typings.pulumiAws.outputMod.ssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentPermissions extends js.Object {
  var accountIds: String = js.native
  var `type`: String = js.native
}

object DocumentPermissions {
  @scala.inline
  def apply(accountIds: String, `type`: String): DocumentPermissions = {
    val __obj = js.Dynamic.literal(accountIds = accountIds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentPermissions]
  }
}

