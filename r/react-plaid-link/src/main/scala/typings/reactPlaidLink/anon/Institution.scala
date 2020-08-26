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

@js.native
trait Institution extends js.Object {
  var institution: Name = js.native
  var link_session_id: String | Null = js.native
  var request_id: String | Null = js.native
  var status: requires_questions | requires_selections | requires_code | choose_device | requires_credentials | institution_not_found = js.native
}

object Institution {
  @scala.inline
  def apply(
    institution: Name,
    status: requires_questions | requires_selections | requires_code | choose_device | requires_credentials | institution_not_found
  ): Institution = {
    val __obj = js.Dynamic.literal(institution = institution.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Institution]
  }
  @scala.inline
  implicit class InstitutionOps[Self <: Institution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInstitution(value: Name): Self = this.set("institution", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(
      value: requires_questions | requires_selections | requires_code | choose_device | requires_credentials | institution_not_found
    ): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink_session_id(value: String): Self = this.set("link_session_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink_session_idNull: Self = this.set("link_session_id", null)
    @scala.inline
    def setRequest_id(value: String): Self = this.set("request_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest_idNull: Self = this.set("request_id", null)
  }
  
}

