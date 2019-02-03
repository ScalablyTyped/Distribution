package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPClientPeoplePickerProcessedUser")
@js.native
class SPClientPeoplePickerProcessedUser () extends js.Object {
   // '',
  var DeleteUserElementId: java.lang.String = js.native
   // '',
  var DisplayElementId: java.lang.String = js.native
   // '',
  var DisplayName: java.lang.String = js.native
   // null,
  var ErrorDescription: java.lang.String = js.native
   // '',
  var PresenceElementId: java.lang.String = js.native
   // '',
  var ResolveText: java.lang.String = js.native
   // null,
  var ResolvedUser: scala.Boolean = js.native
   // '',
  var SID: java.lang.String = js.native
   // '',
  var SIPAddress: java.lang.String = js.native
   // true,
  var Suggestions: js.Array[ISPClientAutoFillData] = js.native
  var UserContainerElementId: java.lang.String = js.native
   // '',
  var UserInfo: ISPClientPeoplePickerEntity = js.native
  def BuildUserHTML(): java.lang.String = js.native
  def ResolvedAsUnverifiedEmail(): java.lang.String = js.native
   // '',
  def UpdateResolvedUser(newUserInfo: ISPClientPeoplePickerEntity, strNewElementId: java.lang.String): scala.Unit = js.native
  def UpdateSuggestions(entity: ISPClientPeoplePickerEntity): scala.Unit = js.native
  def UpdateUserMaxWidth(): scala.Unit = js.native
}

/* static members */
@JSGlobal("SPClientPeoplePickerProcessedUser")
@js.native
object SPClientPeoplePickerProcessedUser extends js.Object {
  def BuildUserPresenceHtml(elmId: java.lang.String, strSip: java.lang.String): java.lang.String = js.native
  def BuildUserPresenceHtml(elmId: java.lang.String, strSip: java.lang.String, bResolved: scala.Boolean): java.lang.String = js.native
  def DeleteProcessedUser(elmToRemove: stdLib.HTMLElement): scala.Unit = js.native
  def GetUserContainerElement(elmChild: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  def HandleDeleteProcessedUserKey(e: stdLib.Event): scala.Unit = js.native
  def HandleProcessedUserClick(ndClicked: stdLib.HTMLElement): scala.Unit = js.native
  def HandleResolveProcessedUserKey(e: stdLib.Event): scala.Unit = js.native
}

