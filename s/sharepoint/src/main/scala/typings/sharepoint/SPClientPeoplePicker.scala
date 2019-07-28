package typings.sharepoint

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.SPNs.Guid
import typings.sharepoint.SPNs.StringResult
import typings.sharepoint.SPNs.UINs.ApplicationPagesNs.ClientPeoplePickerQueryParameters
import typings.sharepoint.SPNs.UtilitiesNs.PrincipalSource
import typings.sharepoint.SPNs.UtilitiesNs.PrincipalType
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPClientPeoplePicker")
@js.native
class SPClientPeoplePicker () extends js.Object {
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
  var CurrentLocalSuggestions: js.Array[ISPClientPeoplePickerEntity] = js.native
  var CurrentLocalSuggestionsDict: ISPClientPeoplePickerEntity = js.native
   // true,
  var CurrentQueryStr: String = js.native
   // '',
  var EditorElementId: String = js.native
   // 30,
  var EditorWidthSet: Boolean = js.native
  var EnabledClaimProviders: String = js.native
   // true,
  var ForceClaims: Boolean = js.native
  var HasInputError: Boolean = js.native
   // false,
  var HasServerError: Boolean = js.native
   // '',
  var HiddenInputId: String = js.native
   // '',
  var InitialHelpTextElementId: String = js.native
   // '',
  var InitialSuggestions: js.Array[ISPClientPeoplePickerEntity] = js.native
   // '',
  var LatestSearchQueryStr: String = js.native
   // null,
  var MaximumEntitySuggestions: Double = js.native
   // false,
  var PPMRU: SPClientPeoplePickerMRU = js.native
   // 5,
  var PrincipalAccountType: String = js.native
   // '',
  var PrincipalAccountTypeEnum: PrincipalType = js.native
  var ProcessedUserList: StringDictionary[SPClientPeoplePickerProcessedUser] = js.native
   // false,
  var QueryScriptInit: Boolean = js.native
   // null,
  var ResolvePrincipalSource: PrincipalSource = js.native
   // '',
  var ResolvedListElementId: String = js.native
   // '',
  var SearchPrincipalSource: PrincipalSource = js.native
   // false,
  var SharePointGroupID: Double = js.native
   // false,
  var ShowUserPresence: Boolean = js.native
   // true,
  var TerminatingCharacter: String = js.native
  var TopLevelElementId: String = js.native
   // null,
  var TotalUserCount: Double = js.native
   // 0,
  var UnresolvedUserCount: Double = js.native
   // ';',
  var UnresolvedUserElmIdToReplace: String = js.native
  var UrlZone: typings.sharepoint.SPNs.UrlZone = js.native
  var UseLocalSuggestionCache: Boolean = js.native
   // 0,
  var UserQueryDict: StringDictionary[StringResult] = js.native
  var VisibleSuggestions: Double = js.native
   // '',
  var WaitImageId: String = js.native
   // '',
  var WebApplicationID: Guid = js.native
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
  def BatchAddUserKeysOperation(allKeys: js.Array[String], numProcessed: Double): Unit = js.native
  def BlurAutoFill(): Unit = js.native
  def ClearServerError(): Unit = js.native
  def CompileLocalSuggestions(input: String): Unit = js.native
  def DeleteProcessedUser(elmToRemove: HTMLElement): Unit = js.native
  def DisplayLocalSuggestions(): Unit = js.native
  def EnsureAutoFillControl(): Unit = js.native
  def EnsureEditorWidth(): Unit = js.native
  def ExecutePickerQuery(
    queryIds: String,
    onSuccess: js.Function2[/* queryId */ String, /* result */ StringResult, Unit],
    onFailure: js.Function2[/* queryId */ String, /* result */ StringResult, Unit],
    fnContinuation: js.Function0[Unit]
  ): Unit = js.native
  def FocusAutoFill(): Unit = js.native
   // '{00000000-0000-0000-0000-000000000000}',
  def GetAllUserInfo(): js.Array[ISPClientPeoplePickerEntity] = js.native
  def GetAllUserKeys(): String = js.native
  def GetControlValueAsJSObject(): js.Array[ISPClientPeoplePickerEntity] = js.native
  def GetControlValueAsText(): String = js.native
  def GetCurrentEditorValue(): String = js.native
  def GetPeoplePickerQueryParameters(): ClientPeoplePickerQueryParameters = js.native
  def GetUnresolvedEntityErrorMessage(): String = js.native
  def HasResolvedUsers(): Boolean = js.native
  def IsAutoFillOpen(): Boolean = js.native
  def IsEmpty(): Boolean = js.native
  def IterateEachProcessedUser(fnCallback: js.Function2[/* index */ Double, /* user */ SPClientPeoplePickerProcessedUser, Unit]): Unit = js.native
  def OnControlResolvedUserChanged(): Unit = js.native
  def OnControlValidate(): Unit = js.native
  def OnControlValidateClientScript(pickerElementId: String, users: js.Array[ISPClientPeoplePickerEntity]): Unit = js.native
  def OnControlValueChanged(): Unit = js.native
  def OnUserResolvedClientScript(pickerElementId: String, users: js.Array[ISPClientPeoplePickerEntity]): Unit = js.native
   // false,
  def OnValueChangedClientScript(pickerElementId: String, users: js.Array[ISPClientPeoplePickerEntity]): Unit = js.native
  def PlanningGlobalSearch(): Boolean = js.native
  def ResolveAllUsers(fnContinuation: js.Function0[Unit]): Unit = js.native
  def SaveAllUserKeysToHiddenInput(): Unit = js.native
  def SetEnabledState(bEnabled: Boolean): Unit = js.native
  def SetFocusOnEditorEnd(): Unit = js.native
  def SetInitialValue(entities: js.Array[ISPClientPeoplePickerEntity]): Unit = js.native
  def SetInitialValue(entities: js.Array[ISPClientPeoplePickerEntity], initialErrorMsg: String): Unit = js.native
  def SetServerError(): Unit = js.native
  def ShouldUsePPMRU(): Boolean = js.native
  def ShowAutoFill(resultsTable: js.Array[ISPClientAutoFillData]): Unit = js.native
  def ShowErrorMessage(msg: String): Unit = js.native
  def ShowingLocalSuggestions(): Boolean = js.native
  def ToggleWaitImageDisplay(): Unit = js.native
  def ToggleWaitImageDisplay(bShowImage: Boolean): Unit = js.native
  def UpdateUnresolvedUser(results: StringResult, user: ISPClientPeoplePickerEntity): Unit = js.native
  def Validate(): Unit = js.native
  def ValidateCurrentState(): Unit = js.native
}

/* static members */
@JSGlobal("SPClientPeoplePicker")
@js.native
object SPClientPeoplePicker extends js.Object {
   // = 'Title';
  var DescriptionName: String = js.native
   // = 'Key';
  var DisplayTextName: String = js.native
   // = 'AutoFillKey';
  var DisplayTextProperty: String = js.native
   // = 'AutoFillTitleText';
  var DomainProperty: String = js.native
   // = "UNVALIDATED_EMAIL_ADDRESS";
  var KeyProperty: String = js.native
   // = 'Description';
  var SIPAddressName: String = js.native
   // = 'DomainText';
  var SPClientPeoplePickerDict: StringDictionary[SPClientPeoplePicker] = js.native
   // = 'DisplayText';
  var SubDisplayTextName: String = js.native
   // = 'AutoFillDisplayText';
  var SubDisplayTextProperty: String = js.native
   // = 'SIPAddress';
  var SuggestionsName: String = js.native
   // = 'AutoFillSubDisplayText';
  var TitleTextProperty: String = js.native
   // = 'MultipleMatches';
  var UnvalidatedEmailAddressKey: String = js.native
  var ValueName: String = js.native
  def AddAutoFillMetaData(pickerObj: SPClientPeoplePicker, options: js.Array[ISPClientPeoplePickerEntity], numOpts: Double): js.Array[ISPClientPeoplePickerEntity] = js.native
  def AugmentEntity(entity: ISPClientPeoplePickerEntity): ISPClientPeoplePickerEntity = js.native
  def AugmentEntitySuggestions(pickerObj: SPClientPeoplePicker, allEntities: js.Array[ISPClientPeoplePickerEntity]): js.Array[ISPClientPeoplePickerEntity] = js.native
  def AugmentEntitySuggestions(
    pickerObj: SPClientPeoplePicker,
    allEntities: js.Array[ISPClientPeoplePickerEntity],
    mergeLocal: Boolean
  ): js.Array[ISPClientPeoplePickerEntity] = js.native
  def BuildAutoFillMenuItems(pickerObj: SPClientPeoplePicker, options: js.Array[ISPClientPeoplePickerEntity]): js.Array[ISPClientPeoplePickerEntity] = js.native
  def BuildUnresolvedEntity(key: String, dispText: String): ISPClientPeoplePickerEntity = js.native
  def CreateSPPrincipalType(acctStr: String): Double = js.native
  def GetTopLevelControl(elmChild: HTMLElement): HTMLElement = js.native
  def InitializeStandalonePeoplePicker(
    clientId: String,
    value: js.Array[ISPClientPeoplePickerEntity],
    schema: ISPClientPeoplePickerSchema
  ): Unit = js.native
  def IsUserEntity(entity: ISPClientPeoplePickerEntity): Boolean = js.native
  def ParseUserKeyPaste(userKey: String): String = js.native
  def PickerObjectFromSubElement(elmSubElement: HTMLElement): SPClientPeoplePicker = js.native
  def TestLocalMatch(strSearchLower: String, dataEntity: ISPClientPeoplePickerEntity): Boolean = js.native
}

