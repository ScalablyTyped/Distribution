package typings.sharepoint

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.SP.Guid
import typings.sharepoint.SP.StringResult
import typings.sharepoint.SP.UI.ApplicationPages.ClientPeoplePickerQueryParameters
import typings.sharepoint.SP.Utilities.PrincipalSource
import typings.sharepoint.SP.Utilities.PrincipalType
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SPClientPeoplePicker extends js.Object {
  
  def AddLoadingSuggestionMenuOption(): Unit = js.native
  
  def AddPickerResolveQuery(queryStr: String): String = js.native
  
  def AddPickerSearchQuery(queryStr: String): String = js.native
  
  def AddProcessedUser(userObject: ISPClientPeoplePickerEntity): String = js.native
  def AddProcessedUser(userObject: ISPClientPeoplePickerEntity, fResolved: Boolean): String = js.native
  
  def AddResolvedUserToLocalCache(resolvedEntity: ISPClientPeoplePickerEntity, resolveText: String): Unit = js.native
  
  def AddUnresolvedUser(unresolvedUserObj: ISPClientPeoplePickerEntity): Unit = js.native
  def AddUnresolvedUser(unresolvedUserObj: ISPClientPeoplePickerEntity, bRunQuery: Boolean): Unit = js.native
  
  def AddUnresolvedUserFromEditor(): Unit = js.native
  def AddUnresolvedUserFromEditor(bRunQuery: Boolean): Unit = js.native
  
  def AddUserKeys(userKeys: String, bSearch: Boolean): Unit = js.native
  
   // null,
  var AllUrlZones: Boolean = js.native
  
   // 0,
  var AllowEmailAddresses: Boolean = js.native
  
   // '',
  var AllowEmpty: Boolean = js.native
  
   // true,
  var AllowMultipleUsers: Boolean = js.native
  
   // false,
  var AutoFillControl: SPClientAutoFill = js.native
  
   // '',
  var AutoFillElementId: String = js.native
  
   // false,
  var AutoFillEnabled: Boolean = js.native
  
  def BatchAddUserKeysOperation(allKeys: js.Array[String], numProcessed: Double): Unit = js.native
  
  def BlurAutoFill(): Unit = js.native
  
  def ClearServerError(): Unit = js.native
  
  def CompileLocalSuggestions(input: String): Unit = js.native
  
  var CurrentLocalSuggestions: js.Array[ISPClientPeoplePickerEntity] = js.native
  
  var CurrentLocalSuggestionsDict: ISPClientPeoplePickerEntity = js.native
  
   // true,
  var CurrentQueryStr: String = js.native
  
  def DeleteProcessedUser(elmToRemove: HTMLElement): Unit = js.native
  
  def DisplayLocalSuggestions(): Unit = js.native
  
   // '',
  var EditorElementId: String = js.native
  
   // 30,
  var EditorWidthSet: Boolean = js.native
  
  var EnabledClaimProviders: String = js.native
  
  def EnsureAutoFillControl(): Unit = js.native
  
  def EnsureEditorWidth(): Unit = js.native
  
  def ExecutePickerQuery(
    queryIds: String,
    onSuccess: js.Function2[/* queryId */ String, /* result */ StringResult, Unit],
    onFailure: js.Function2[/* queryId */ String, /* result */ StringResult, Unit],
    fnContinuation: js.Function0[Unit]
  ): Unit = js.native
  
  def FocusAutoFill(): Unit = js.native
  
   // true,
  var ForceClaims: Boolean = js.native
  
   // '{00000000-0000-0000-0000-000000000000}',
  def GetAllUserInfo(): js.Array[ISPClientPeoplePickerEntity] = js.native
  
  def GetAllUserKeys(): String = js.native
  
  def GetControlValueAsJSObject(): js.Array[ISPClientPeoplePickerEntity] = js.native
  
  def GetControlValueAsText(): String = js.native
  
  def GetCurrentEditorValue(): String = js.native
  
  def GetPeoplePickerQueryParameters(): ClientPeoplePickerQueryParameters = js.native
  
  def GetUnresolvedEntityErrorMessage(): String = js.native
  
  var HasInputError: Boolean = js.native
  
  def HasResolvedUsers(): Boolean = js.native
  
   // false,
  var HasServerError: Boolean = js.native
  
   // '',
  var HiddenInputId: String = js.native
  
   // '',
  var InitialHelpTextElementId: String = js.native
  
   // '',
  var InitialSuggestions: js.Array[ISPClientPeoplePickerEntity] = js.native
  
  def IsAutoFillOpen(): Boolean = js.native
  
  def IsEmpty(): Boolean = js.native
  
  def IterateEachProcessedUser(fnCallback: js.Function2[/* index */ Double, /* user */ SPClientPeoplePickerProcessedUser, Unit]): Unit = js.native
  
   // '',
  var LatestSearchQueryStr: String = js.native
  
   // null,
  var MaximumEntitySuggestions: Double = js.native
  
  def OnControlResolvedUserChanged(): Unit = js.native
  
  def OnControlValidate(): Unit = js.native
  
  def OnControlValidateClientScript(pickerElementId: String, users: js.Array[ISPClientPeoplePickerEntity]): Unit = js.native
  
  def OnControlValueChanged(): Unit = js.native
  
  def OnUserResolvedClientScript(pickerElementId: String, users: js.Array[ISPClientPeoplePickerEntity]): Unit = js.native
  
   // false,
  def OnValueChangedClientScript(pickerElementId: String, users: js.Array[ISPClientPeoplePickerEntity]): Unit = js.native
  
   // false,
  var PPMRU: SPClientPeoplePickerMRU = js.native
  
  def PlanningGlobalSearch(): Boolean = js.native
  
   // 5,
  var PrincipalAccountType: String = js.native
  
   // '',
  var PrincipalAccountTypeEnum: PrincipalType = js.native
  
  var ProcessedUserList: StringDictionary[SPClientPeoplePickerProcessedUser] = js.native
  
   // false,
  var QueryScriptInit: Boolean = js.native
  
  def ResolveAllUsers(fnContinuation: js.Function0[Unit]): Unit = js.native
  
   // null,
  var ResolvePrincipalSource: PrincipalSource = js.native
  
   // '',
  var ResolvedListElementId: String = js.native
  
  def SaveAllUserKeysToHiddenInput(): Unit = js.native
  
   // '',
  var SearchPrincipalSource: PrincipalSource = js.native
  
  def SetEnabledState(bEnabled: Boolean): Unit = js.native
  
  def SetFocusOnEditorEnd(): Unit = js.native
  
  def SetInitialValue(entities: js.Array[ISPClientPeoplePickerEntity]): Unit = js.native
  def SetInitialValue(entities: js.Array[ISPClientPeoplePickerEntity], initialErrorMsg: String): Unit = js.native
  
  def SetServerError(): Unit = js.native
  
   // false,
  var SharePointGroupID: Double = js.native
  
  def ShouldUsePPMRU(): Boolean = js.native
  
  def ShowAutoFill(resultsTable: js.Array[ISPClientAutoFillData]): Unit = js.native
  
  def ShowErrorMessage(msg: String): Unit = js.native
  
   // false,
  var ShowUserPresence: Boolean = js.native
  
  def ShowingLocalSuggestions(): Boolean = js.native
  
   // true,
  var TerminatingCharacter: String = js.native
  
  def ToggleWaitImageDisplay(): Unit = js.native
  def ToggleWaitImageDisplay(bShowImage: Boolean): Unit = js.native
  
  var TopLevelElementId: String = js.native
  
   // null,
  var TotalUserCount: Double = js.native
  
   // 0,
  var UnresolvedUserCount: Double = js.native
  
   // ';',
  var UnresolvedUserElmIdToReplace: String = js.native
  
  def UpdateUnresolvedUser(results: StringResult, user: ISPClientPeoplePickerEntity): Unit = js.native
  
  var UrlZone: typings.sharepoint.SP.UrlZone = js.native
  
  var UseLocalSuggestionCache: Boolean = js.native
  
   // 0,
  var UserQueryDict: StringDictionary[StringResult] = js.native
  
  def Validate(): Unit = js.native
  
  def ValidateCurrentState(): Unit = js.native
  
  var VisibleSuggestions: Double = js.native
  
   // '',
  var WaitImageId: String = js.native
  
   // '',
  var WebApplicationID: Guid = js.native
}
