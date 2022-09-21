package typings.sharepoint.global

import typings.sharepoint.ISPClientAutoFillData
import typings.sharepoint.ISPClientPeoplePickerEntity
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SPClientPeoplePickerProcessedUser")
@js.native
open class SPClientPeoplePickerProcessedUser ()
  extends StObject
     with typings.sharepoint.SPClientPeoplePickerProcessedUser {
  
  /* CompleteClass */
  override def BuildUserHTML(): String = js.native
  
  // '',
  /* CompleteClass */
  var DeleteUserElementId: String = js.native
  
  // '',
  /* CompleteClass */
  var DisplayElementId: String = js.native
  
  // '',
  /* CompleteClass */
  var DisplayName: String = js.native
  
  // null,
  /* CompleteClass */
  var ErrorDescription: String = js.native
  
  // '',
  /* CompleteClass */
  var PresenceElementId: String = js.native
  
  // '',
  /* CompleteClass */
  var ResolveText: String = js.native
  
  /* CompleteClass */
  override def ResolvedAsUnverifiedEmail(): String = js.native
  
  // null,
  /* CompleteClass */
  var ResolvedUser: Boolean = js.native
  
  // '',
  /* CompleteClass */
  var SID: String = js.native
  
  // '',
  /* CompleteClass */
  var SIPAddress: String = js.native
  
  // true,
  /* CompleteClass */
  var Suggestions: js.Array[ISPClientAutoFillData] = js.native
  
  // '',
  /* CompleteClass */
  override def UpdateResolvedUser(newUserInfo: ISPClientPeoplePickerEntity, strNewElementId: String): Unit = js.native
  
  /* CompleteClass */
  override def UpdateSuggestions(entity: ISPClientPeoplePickerEntity): Unit = js.native
  
  /* CompleteClass */
  override def UpdateUserMaxWidth(): Unit = js.native
  
  /* CompleteClass */
  var UserContainerElementId: String = js.native
  
  // '',
  /* CompleteClass */
  var UserInfo: ISPClientPeoplePickerEntity = js.native
}
object SPClientPeoplePickerProcessedUser {
  
  @JSGlobal("SPClientPeoplePickerProcessedUser")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def BuildUserPresenceHtml(elmId: String, strSip: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("BuildUserPresenceHtml")(elmId.asInstanceOf[js.Any], strSip.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def BuildUserPresenceHtml(elmId: String, strSip: String, bResolved: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("BuildUserPresenceHtml")(elmId.asInstanceOf[js.Any], strSip.asInstanceOf[js.Any], bResolved.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  inline def DeleteProcessedUser(elmToRemove: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("DeleteProcessedUser")(elmToRemove.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  inline def GetUserContainerElement(elmChild: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("GetUserContainerElement")(elmChild.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  
  /* static member */
  inline def HandleDeleteProcessedUserKey(e: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("HandleDeleteProcessedUserKey")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  inline def HandleProcessedUserClick(ndClicked: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("HandleProcessedUserClick")(ndClicked.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  inline def HandleResolveProcessedUserKey(e: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("HandleResolveProcessedUserKey")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
