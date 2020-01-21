package typings.reactPlaidLink

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccounts extends js.Object {
  var accounts: js.Array[AnonId]
  var institution: AnonInstitutionid
  var link_session_id: String
}

object AnonAccounts {
  @scala.inline
  def apply(accounts: js.Array[AnonId], institution: AnonInstitutionid, link_session_id: String): AnonAccounts = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], institution = institution.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAccounts]
  }
}

