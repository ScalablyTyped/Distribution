package typings.sharepoint

import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPClientPeoplePickerProcessedUser")
@js.native
class SPClientPeoplePickerProcessedUser () extends js.Object {
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

/* static members */
@JSGlobal("SPClientPeoplePickerProcessedUser")
@js.native
object SPClientPeoplePickerProcessedUser extends js.Object {
  def BuildUserPresenceHtml(elmId: String, strSip: String): String = js.native
  def BuildUserPresenceHtml(elmId: String, strSip: String, bResolved: Boolean): String = js.native
  def DeleteProcessedUser(elmToRemove: HTMLElement): Unit = js.native
  def GetUserContainerElement(elmChild: HTMLElement): HTMLElement = js.native
  def HandleDeleteProcessedUserKey(e: Event): Unit = js.native
  def HandleProcessedUserClick(ndClicked: HTMLElement): Unit = js.native
  def HandleResolveProcessedUserKey(e: Event): Unit = js.native
}

