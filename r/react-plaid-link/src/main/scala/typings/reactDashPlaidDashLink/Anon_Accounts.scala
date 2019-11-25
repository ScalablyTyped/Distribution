package typings.reactDashPlaidDashLink

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accounts extends js.Object {
  var accounts: js.Array[Anon_Id]
  var institution: Anon_Institutionid
  var link_session_id: String
}

object Anon_Accounts {
  @scala.inline
  def apply(accounts: js.Array[Anon_Id], institution: Anon_Institutionid, link_session_id: String): Anon_Accounts = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], institution = institution.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Accounts]
  }
}

