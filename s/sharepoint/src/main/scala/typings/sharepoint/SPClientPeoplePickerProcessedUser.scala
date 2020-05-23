package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SPClientPeoplePickerProcessedUser extends js.Object {
   // '',
  var DeleteUserElementId: String
   // '',
  var DisplayElementId: String
   // '',
  var DisplayName: String
   // null,
  var ErrorDescription: String
   // '',
  var PresenceElementId: String
   // '',
  var ResolveText: String
   // null,
  var ResolvedUser: Boolean
   // '',
  var SID: String
   // '',
  var SIPAddress: String
   // true,
  var Suggestions: js.Array[ISPClientAutoFillData]
  var UserContainerElementId: String
   // '',
  var UserInfo: ISPClientPeoplePickerEntity
  def BuildUserHTML(): String
  def ResolvedAsUnverifiedEmail(): String
   // '',
  def UpdateResolvedUser(newUserInfo: ISPClientPeoplePickerEntity, strNewElementId: String): Unit
  def UpdateSuggestions(entity: ISPClientPeoplePickerEntity): Unit
  def UpdateUserMaxWidth(): Unit
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
}

