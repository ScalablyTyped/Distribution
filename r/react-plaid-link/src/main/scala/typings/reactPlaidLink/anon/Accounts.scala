package typings.reactPlaidLink.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accounts extends js.Object {
  var accounts: js.Array[Id]
  var institution: Institutionid
  var link_session_id: String
}

object Accounts {
  @scala.inline
  def apply(accounts: js.Array[Id], institution: Institutionid, link_session_id: String): Accounts = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], institution = institution.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accounts]
  }
}

