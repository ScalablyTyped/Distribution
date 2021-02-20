package typings.sharepoint.global

import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SPClientPeoplePickerProcessedUser")
@js.native
class SPClientPeoplePickerProcessedUser ()
  extends typings.sharepoint.SPClientPeoplePickerProcessedUser
object SPClientPeoplePickerProcessedUser {
  
  /* static member */
  @JSGlobal("SPClientPeoplePickerProcessedUser.BuildUserPresenceHtml")
  @js.native
  def BuildUserPresenceHtml(elmId: String, strSip: String): String = js.native
  @JSGlobal("SPClientPeoplePickerProcessedUser.BuildUserPresenceHtml")
  @js.native
  def BuildUserPresenceHtml(elmId: String, strSip: String, bResolved: Boolean): String = js.native
  
  /* static member */
  @JSGlobal("SPClientPeoplePickerProcessedUser.DeleteProcessedUser")
  @js.native
  def DeleteProcessedUser(elmToRemove: HTMLElement): Unit = js.native
  
  /* static member */
  @JSGlobal("SPClientPeoplePickerProcessedUser.GetUserContainerElement")
  @js.native
  def GetUserContainerElement(elmChild: HTMLElement): HTMLElement = js.native
  
  /* static member */
  @JSGlobal("SPClientPeoplePickerProcessedUser.HandleDeleteProcessedUserKey")
  @js.native
  def HandleDeleteProcessedUserKey(e: Event): Unit = js.native
  
  /* static member */
  @JSGlobal("SPClientPeoplePickerProcessedUser.HandleProcessedUserClick")
  @js.native
  def HandleProcessedUserClick(ndClicked: HTMLElement): Unit = js.native
  
  /* static member */
  @JSGlobal("SPClientPeoplePickerProcessedUser.HandleResolveProcessedUserKey")
  @js.native
  def HandleResolveProcessedUserKey(e: Event): Unit = js.native
}
