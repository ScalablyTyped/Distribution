package typings.sharepoint.global

import typings.sharepoint.ISPClientAutoFillData
import typings.sharepoint.ISPClientPeoplePickerEntity
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPClientPeoplePickerProcessedUser")
@js.native
class SPClientPeoplePickerProcessedUser ()
  extends typings.sharepoint.SPClientPeoplePickerProcessedUser {
   // '',
  /* CompleteClass */
  override var DeleteUserElementId: String = js.native
   // '',
  /* CompleteClass */
  override var DisplayElementId: String = js.native
   // '',
  /* CompleteClass */
  override var DisplayName: String = js.native
   // null,
  /* CompleteClass */
  override var ErrorDescription: String = js.native
   // '',
  /* CompleteClass */
  override var PresenceElementId: String = js.native
   // '',
  /* CompleteClass */
  override var ResolveText: String = js.native
   // null,
  /* CompleteClass */
  override var ResolvedUser: Boolean = js.native
   // '',
  /* CompleteClass */
  override var SID: String = js.native
   // '',
  /* CompleteClass */
  override var SIPAddress: String = js.native
   // true,
  /* CompleteClass */
  override var Suggestions: js.Array[ISPClientAutoFillData] = js.native
  /* CompleteClass */
  override var UserContainerElementId: String = js.native
   // '',
  /* CompleteClass */
  override var UserInfo: ISPClientPeoplePickerEntity = js.native
  /* CompleteClass */
  override def BuildUserHTML(): String = js.native
  /* CompleteClass */
  override def ResolvedAsUnverifiedEmail(): String = js.native
   // '',
  /* CompleteClass */
  override def UpdateResolvedUser(newUserInfo: ISPClientPeoplePickerEntity, strNewElementId: String): Unit = js.native
  /* CompleteClass */
  override def UpdateSuggestions(entity: ISPClientPeoplePickerEntity): Unit = js.native
  /* CompleteClass */
  override def UpdateUserMaxWidth(): Unit = js.native
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

