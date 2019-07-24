package typings
package reactDashPlaidDashLinkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Choosedevice extends js.Object {
  var institution: Anon_InstitutionidName
  var link_session_id: java.lang.String | scala.Null
  var request_id: java.lang.String | scala.Null
  var status: reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.requires_questions | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.requires_selections | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.requires_code | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.choose_device | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.requires_credentials | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.institution_not_found
}

object Anon_Choosedevice {
  @scala.inline
  def apply(
    institution: Anon_InstitutionidName,
    status: reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.requires_questions | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.requires_selections | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.requires_code | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.choose_device | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.requires_credentials | reactDashPlaidDashLinkLib.reactDashPlaidDashLinkLibStrings.institution_not_found,
    link_session_id: java.lang.String = null,
    request_id: java.lang.String = null
  ): Anon_Choosedevice = {
    val __obj = js.Dynamic.literal(institution = institution, status = status.asInstanceOf[js.Any])
    if (link_session_id != null) __obj.updateDynamic("link_session_id")(link_session_id)
    if (request_id != null) __obj.updateDynamic("request_id")(request_id)
    __obj.asInstanceOf[Anon_Choosedevice]
  }
}

