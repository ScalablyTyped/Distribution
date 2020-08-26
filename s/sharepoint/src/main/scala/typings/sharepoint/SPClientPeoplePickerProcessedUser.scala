package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SPClientPeoplePickerProcessedUser extends js.Object {
   // '',
  var DeleteUserElementId: String = js.native
   // '',
  var DisplayElementId: String = js.native
   // '',
  var DisplayName: String = js.native
   // null,
  var ErrorDescription: String = js.native
   // '',
  var PresenceElementId: String = js.native
   // '',
  var ResolveText: String = js.native
   // null,
  var ResolvedUser: Boolean = js.native
   // '',
  var SID: String = js.native
   // '',
  var SIPAddress: String = js.native
   // true,
  var Suggestions: js.Array[ISPClientAutoFillData] = js.native
  var UserContainerElementId: String = js.native
   // '',
  var UserInfo: ISPClientPeoplePickerEntity = js.native
  def BuildUserHTML(): String = js.native
  def ResolvedAsUnverifiedEmail(): String = js.native
   // '',
  def UpdateResolvedUser(newUserInfo: ISPClientPeoplePickerEntity, strNewElementId: String): Unit = js.native
  def UpdateSuggestions(entity: ISPClientPeoplePickerEntity): Unit = js.native
  def UpdateUserMaxWidth(): Unit = js.native
}

object SPClientPeoplePickerProcessedUser {
  @scala.inline
  def apply(
    BuildUserHTML: () => String,
    DeleteUserElementId: String,
    DisplayElementId: String,
    DisplayName: String,
    ErrorDescription: String,
    PresenceElementId: String,
    ResolveText: String,
    ResolvedAsUnverifiedEmail: () => String,
    ResolvedUser: Boolean,
    SID: String,
    SIPAddress: String,
    Suggestions: js.Array[ISPClientAutoFillData],
    UpdateResolvedUser: (ISPClientPeoplePickerEntity, String) => Unit,
    UpdateSuggestions: ISPClientPeoplePickerEntity => Unit,
    UpdateUserMaxWidth: () => Unit,
    UserContainerElementId: String,
    UserInfo: ISPClientPeoplePickerEntity
  ): SPClientPeoplePickerProcessedUser = {
    val __obj = js.Dynamic.literal(BuildUserHTML = js.Any.fromFunction0(BuildUserHTML), DeleteUserElementId = DeleteUserElementId.asInstanceOf[js.Any], DisplayElementId = DisplayElementId.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], ErrorDescription = ErrorDescription.asInstanceOf[js.Any], PresenceElementId = PresenceElementId.asInstanceOf[js.Any], ResolveText = ResolveText.asInstanceOf[js.Any], ResolvedAsUnverifiedEmail = js.Any.fromFunction0(ResolvedAsUnverifiedEmail), ResolvedUser = ResolvedUser.asInstanceOf[js.Any], SID = SID.asInstanceOf[js.Any], SIPAddress = SIPAddress.asInstanceOf[js.Any], Suggestions = Suggestions.asInstanceOf[js.Any], UpdateResolvedUser = js.Any.fromFunction2(UpdateResolvedUser), UpdateSuggestions = js.Any.fromFunction1(UpdateSuggestions), UpdateUserMaxWidth = js.Any.fromFunction0(UpdateUserMaxWidth), UserContainerElementId = UserContainerElementId.asInstanceOf[js.Any], UserInfo = UserInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SPClientPeoplePickerProcessedUser]
  }
  @scala.inline
  implicit class SPClientPeoplePickerProcessedUserOps[Self <: SPClientPeoplePickerProcessedUser] (val x: Self) extends AnyVal {
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
    def setBuildUserHTML(value: () => String): Self = this.set("BuildUserHTML", js.Any.fromFunction0(value))
    @scala.inline
    def setDeleteUserElementId(value: String): Self = this.set("DeleteUserElementId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayElementId(value: String): Self = this.set("DisplayElementId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: String): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorDescription(value: String): Self = this.set("ErrorDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setPresenceElementId(value: String): Self = this.set("PresenceElementId", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolveText(value: String): Self = this.set("ResolveText", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolvedAsUnverifiedEmail(value: () => String): Self = this.set("ResolvedAsUnverifiedEmail", js.Any.fromFunction0(value))
    @scala.inline
    def setResolvedUser(value: Boolean): Self = this.set("ResolvedUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setSID(value: String): Self = this.set("SID", value.asInstanceOf[js.Any])
    @scala.inline
    def setSIPAddress(value: String): Self = this.set("SIPAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuggestionsVarargs(value: ISPClientAutoFillData*): Self = this.set("Suggestions", js.Array(value :_*))
    @scala.inline
    def setSuggestions(value: js.Array[ISPClientAutoFillData]): Self = this.set("Suggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateResolvedUser(value: (ISPClientPeoplePickerEntity, String) => Unit): Self = this.set("UpdateResolvedUser", js.Any.fromFunction2(value))
    @scala.inline
    def setUpdateSuggestions(value: ISPClientPeoplePickerEntity => Unit): Self = this.set("UpdateSuggestions", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateUserMaxWidth(value: () => Unit): Self = this.set("UpdateUserMaxWidth", js.Any.fromFunction0(value))
    @scala.inline
    def setUserContainerElementId(value: String): Self = this.set("UserContainerElementId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserInfo(value: ISPClientPeoplePickerEntity): Self = this.set("UserInfo", value.asInstanceOf[js.Any])
  }
  
}

