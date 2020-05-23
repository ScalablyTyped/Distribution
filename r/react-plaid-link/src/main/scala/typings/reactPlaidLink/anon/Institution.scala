package typings.reactPlaidLink.anon

import typings.reactPlaidLink.reactPlaidLinkStrings.choose_device
import typings.reactPlaidLink.reactPlaidLinkStrings.institution_not_found
import typings.reactPlaidLink.reactPlaidLinkStrings.requires_code
import typings.reactPlaidLink.reactPlaidLinkStrings.requires_credentials
import typings.reactPlaidLink.reactPlaidLinkStrings.requires_questions
import typings.reactPlaidLink.reactPlaidLinkStrings.requires_selections
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Institution extends js.Object {
  var institution: Name
  var link_session_id: String | Null
  var request_id: String | Null
  var status: requires_questions | requires_selections | requires_code | choose_device | requires_credentials | institution_not_found
}

object Institution {
  @scala.inline
  def apply(
    institution: Name,
    status: requires_questions | requires_selections | requires_code | choose_device | requires_credentials | institution_not_found,
    link_session_id: String = null,
    request_id: String = null
  ): Institution = {
    val __obj = js.Dynamic.literal(institution = institution.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Institution]
  }
}

