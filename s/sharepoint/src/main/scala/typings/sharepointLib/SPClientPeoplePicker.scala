package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPClientPeoplePicker")
@js.native
class SPClientPeoplePicker () extends js.Object {
   // null,
  var AllUrlZones: scala.Boolean = js.native
   // 0,
  var AllowEmailAddresses: scala.Boolean = js.native
   // '',
  var AllowEmpty: scala.Boolean = js.native
   // true,
  var AllowMultipleUsers: scala.Boolean = js.native
   // false,
  var AutoFillControl: SPClientAutoFill = js.native
   // '',
  var AutoFillElementId: java.lang.String = js.native
   // false,
  var AutoFillEnabled: scala.Boolean = js.native
  var CurrentLocalSuggestions: js.Array[ISPClientPeoplePickerEntity] = js.native
  var CurrentLocalSuggestionsDict: ISPClientPeoplePickerEntity = js.native
   // true,
  var CurrentQueryStr: java.lang.String = js.native
   // '',
  var EditorElementId: java.lang.String = js.native
   // 30,
  var EditorWidthSet: scala.Boolean = js.native
  var EnabledClaimProviders: java.lang.String = js.native
   // true,
  var ForceClaims: scala.Boolean = js.native
  var HasInputError: scala.Boolean = js.native
   // false,
  var HasServerError: scala.Boolean = js.native
   // '',
  var HiddenInputId: java.lang.String = js.native
   // '',
  var InitialHelpTextElementId: java.lang.String = js.native
   // '',
  var InitialSuggestions: js.Array[ISPClientPeoplePickerEntity] = js.native
   // '',
  var LatestSearchQueryStr: java.lang.String = js.native
   // null,
  var MaximumEntitySuggestions: scala.Double = js.native
   // false,
  var PPMRU: SPClientPeoplePickerMRU = js.native
   // 5,
  var PrincipalAccountType: java.lang.String = js.native
   // '',
  var PrincipalAccountTypeEnum: sharepointLib.SPNs.UtilitiesNs.PrincipalType = js.native
  var ProcessedUserList: ScalablyTyped.runtime.StringDictionary[SPClientPeoplePickerProcessedUser] = js.native
   // false,
  var QueryScriptInit: scala.Boolean = js.native
   // null,
  var ResolvePrincipalSource: sharepointLib.SPNs.UtilitiesNs.PrincipalSource = js.native
   // '',
  var ResolvedListElementId: java.lang.String = js.native
   // '',
  var SearchPrincipalSource: sharepointLib.SPNs.UtilitiesNs.PrincipalSource = js.native
   // false,
  var SharePointGroupID: scala.Double = js.native
   // false,
  var ShowUserPresence: scala.Boolean = js.native
   // true,
  var TerminatingCharacter: java.lang.String = js.native
  var TopLevelElementId: java.lang.String = js.native
   // null,
  var TotalUserCount: scala.Double = js.native
   // 0,
  var UnresolvedUserCount: scala.Double = js.native
   // ';',
  var UnresolvedUserElmIdToReplace: java.lang.String = js.native
  var UrlZone: sharepointLib.SPNs.UrlZone = js.native
  var UseLocalSuggestionCache: scala.Boolean = js.native
   // 0,
  var UserQueryDict: ScalablyTyped.runtime.StringDictionary[sharepointLib.SPNs.StringResult] = js.native
  var VisibleSuggestions: scala.Double = js.native
   // '',
  var WaitImageId: java.lang.String = js.native
   // '',
  var WebApplicationID: sharepointLib.SPNs.Guid = js.native
  def AddLoadingSuggestionMenuOption(): scala.Unit = js.native
  def AddPickerResolveQuery(queryStr: java.lang.String): java.lang.String = js.native
  def AddPickerSearchQuery(queryStr: java.lang.String): java.lang.String = js.native
  def AddProcessedUser(userObject: ISPClientPeoplePickerEntity): java.lang.String = js.native
  def AddProcessedUser(userObject: ISPClientPeoplePickerEntity, fResolved: scala.Boolean): java.lang.String = js.native
  def AddResolvedUserToLocalCache(resolvedEntity: ISPClientPeoplePickerEntity, resolveText: java.lang.String): scala.Unit = js.native
  def AddUnresolvedUser(unresolvedUserObj: ISPClientPeoplePickerEntity): scala.Unit = js.native
  def AddUnresolvedUser(unresolvedUserObj: ISPClientPeoplePickerEntity, bRunQuery: scala.Boolean): scala.Unit = js.native
  def AddUnresolvedUserFromEditor(): scala.Unit = js.native
  def AddUnresolvedUserFromEditor(bRunQuery: scala.Boolean): scala.Unit = js.native
  def AddUserKeys(userKeys: java.lang.String, bSearch: scala.Boolean): scala.Unit = js.native
  def BatchAddUserKeysOperation(allKeys: js.Array[java.lang.String], numProcessed: scala.Double): scala.Unit = js.native
  def BlurAutoFill(): scala.Unit = js.native
  def ClearServerError(): scala.Unit = js.native
  def CompileLocalSuggestions(input: java.lang.String): scala.Unit = js.native
  def DeleteProcessedUser(elmToRemove: stdLib.HTMLElement): scala.Unit = js.native
  def DisplayLocalSuggestions(): scala.Unit = js.native
  def EnsureAutoFillControl(): scala.Unit = js.native
  def EnsureEditorWidth(): scala.Unit = js.native
  def ExecutePickerQuery(
    queryIds: java.lang.String,
    onSuccess: js.Function2[
      /* queryId */ java.lang.String, 
      /* result */ sharepointLib.SPNs.StringResult, 
      scala.Unit
    ],
    onFailure: js.Function2[
      /* queryId */ java.lang.String, 
      /* result */ sharepointLib.SPNs.StringResult, 
      scala.Unit
    ],
    fnContinuation: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def FocusAutoFill(): scala.Unit = js.native
   // '{00000000-0000-0000-0000-000000000000}',
  def GetAllUserInfo(): js.Array[ISPClientPeoplePickerEntity] = js.native
  def GetAllUserKeys(): java.lang.String = js.native
  def GetControlValueAsJSObject(): js.Array[ISPClientPeoplePickerEntity] = js.native
  def GetControlValueAsText(): java.lang.String = js.native
  def GetCurrentEditorValue(): java.lang.String = js.native
  def GetPeoplePickerQueryParameters(): sharepointLib.SPNs.UINs.ApplicationPagesNs.ClientPeoplePickerQueryParameters = js.native
  def GetUnresolvedEntityErrorMessage(): java.lang.String = js.native
  def HasResolvedUsers(): scala.Boolean = js.native
  def IsAutoFillOpen(): scala.Boolean = js.native
  def IsEmpty(): scala.Boolean = js.native
  def IterateEachProcessedUser(
    fnCallback: js.Function2[/* index */ scala.Double, /* user */ SPClientPeoplePickerProcessedUser, scala.Unit]
  ): scala.Unit = js.native
  def OnControlResolvedUserChanged(): scala.Unit = js.native
  def OnControlValidate(): scala.Unit = js.native
  def OnControlValidateClientScript(pickerElementId: java.lang.String, users: js.Array[ISPClientPeoplePickerEntity]): scala.Unit = js.native
  def OnControlValueChanged(): scala.Unit = js.native
  def OnUserResolvedClientScript(pickerElementId: java.lang.String, users: js.Array[ISPClientPeoplePickerEntity]): scala.Unit = js.native
   // false,
  def OnValueChangedClientScript(pickerElementId: java.lang.String, users: js.Array[ISPClientPeoplePickerEntity]): scala.Unit = js.native
  def PlanningGlobalSearch(): scala.Boolean = js.native
  def ResolveAllUsers(fnContinuation: js.Function0[scala.Unit]): scala.Unit = js.native
  def SaveAllUserKeysToHiddenInput(): scala.Unit = js.native
  def SetEnabledState(bEnabled: scala.Boolean): scala.Unit = js.native
  def SetFocusOnEditorEnd(): scala.Unit = js.native
  def SetInitialValue(entities: js.Array[ISPClientPeoplePickerEntity]): scala.Unit = js.native
  def SetInitialValue(entities: js.Array[ISPClientPeoplePickerEntity], initialErrorMsg: java.lang.String): scala.Unit = js.native
  def SetServerError(): scala.Unit = js.native
  def ShouldUsePPMRU(): scala.Boolean = js.native
  def ShowAutoFill(resultsTable: js.Array[ISPClientAutoFillData]): scala.Unit = js.native
  def ShowErrorMessage(msg: java.lang.String): scala.Unit = js.native
  def ShowingLocalSuggestions(): scala.Boolean = js.native
  def ToggleWaitImageDisplay(): scala.Unit = js.native
  def ToggleWaitImageDisplay(bShowImage: scala.Boolean): scala.Unit = js.native
  def UpdateUnresolvedUser(results: sharepointLib.SPNs.StringResult, user: ISPClientPeoplePickerEntity): scala.Unit = js.native
  def Validate(): scala.Unit = js.native
  def ValidateCurrentState(): scala.Unit = js.native
}

@JSGlobal("SPClientPeoplePicker")
@js.native
object SPClientPeoplePicker extends js.Object {
   // = 'Title';
  var DescriptionName: java.lang.String = js.native
   // = 'Key';
  var DisplayTextName: java.lang.String = js.native
   // = 'AutoFillKey';
  var DisplayTextProperty: java.lang.String = js.native
   // = 'AutoFillTitleText';
  var DomainProperty: java.lang.String = js.native
   // = "UNVALIDATED_EMAIL_ADDRESS";
  var KeyProperty: java.lang.String = js.native
   // = 'Description';
  var SIPAddressName: java.lang.String = js.native
   // = 'DomainText';
  var SPClientPeoplePickerDict: ScalablyTyped.runtime.StringDictionary[sharepointLib.SPClientPeoplePicker] = js.native
   // = 'DisplayText';
  var SubDisplayTextName: java.lang.String = js.native
   // = 'AutoFillDisplayText';
  var SubDisplayTextProperty: java.lang.String = js.native
   // = 'SIPAddress';
  var SuggestionsName: java.lang.String = js.native
   // = 'AutoFillSubDisplayText';
  var TitleTextProperty: java.lang.String = js.native
   // = 'MultipleMatches';
  var UnvalidatedEmailAddressKey: java.lang.String = js.native
  var ValueName: java.lang.String = js.native
  def AddAutoFillMetaData(
    pickerObj: sharepointLib.SPClientPeoplePicker,
    options: js.Array[sharepointLib.ISPClientPeoplePickerEntity],
    numOpts: scala.Double
  ): js.Array[sharepointLib.ISPClientPeoplePickerEntity] = js.native
  def AugmentEntity(entity: sharepointLib.ISPClientPeoplePickerEntity): sharepointLib.ISPClientPeoplePickerEntity = js.native
  def AugmentEntitySuggestions(
    pickerObj: sharepointLib.SPClientPeoplePicker,
    allEntities: js.Array[sharepointLib.ISPClientPeoplePickerEntity]
  ): js.Array[sharepointLib.ISPClientPeoplePickerEntity] = js.native
  def AugmentEntitySuggestions(
    pickerObj: sharepointLib.SPClientPeoplePicker,
    allEntities: js.Array[sharepointLib.ISPClientPeoplePickerEntity],
    mergeLocal: scala.Boolean
  ): js.Array[sharepointLib.ISPClientPeoplePickerEntity] = js.native
  def BuildAutoFillMenuItems(
    pickerObj: sharepointLib.SPClientPeoplePicker,
    options: js.Array[sharepointLib.ISPClientPeoplePickerEntity]
  ): js.Array[sharepointLib.ISPClientPeoplePickerEntity] = js.native
  def BuildUnresolvedEntity(key: java.lang.String, dispText: java.lang.String): sharepointLib.ISPClientPeoplePickerEntity = js.native
  def CreateSPPrincipalType(acctStr: java.lang.String): scala.Double = js.native
  def GetTopLevelControl(elmChild: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  def InitializeStandalonePeoplePicker(
    clientId: java.lang.String,
    value: js.Array[sharepointLib.ISPClientPeoplePickerEntity],
    schema: sharepointLib.ISPClientPeoplePickerSchema
  ): scala.Unit = js.native
  def IsUserEntity(entity: sharepointLib.ISPClientPeoplePickerEntity): scala.Boolean = js.native
  def ParseUserKeyPaste(userKey: java.lang.String): java.lang.String = js.native
  def PickerObjectFromSubElement(elmSubElement: stdLib.HTMLElement): sharepointLib.SPClientPeoplePicker = js.native
  def TestLocalMatch(strSearchLower: java.lang.String, dataEntity: sharepointLib.ISPClientPeoplePickerEntity): scala.Boolean = js.native
}

