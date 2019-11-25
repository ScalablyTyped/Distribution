package typings.reactDashPlaidDashLink

import typings.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.choose_device
import typings.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.institution_not_found
import typings.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.requires_code
import typings.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.requires_credentials
import typings.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.requires_questions
import typings.reactDashPlaidDashLink.reactDashPlaidDashLinkStrings.requires_selections
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Choosedevice extends js.Object {
  var institution: Anon_InstitutionidName
  var link_session_id: String | Null
  var request_id: String | Null
  var status: requires_questions | requires_selections | requires_code | choose_device | requires_credentials | institution_not_found
}

object Anon_Choosedevice {
  @scala.inline
  def apply(
    institution: Anon_InstitutionidName,
    status: requires_questions | requires_selections | requires_code | choose_device | requires_credentials | institution_not_found,
    link_session_id: String = null,
    request_id: String = null
  ): Anon_Choosedevice = {
    val __obj = js.Dynamic.literal(institution = institution.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (link_session_id != null) __obj.updateDynamic("link_session_id")(link_session_id.asInstanceOf[js.Any])
    if (request_id != null) __obj.updateDynamic("request_id")(request_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Choosedevice]
  }
}

