package typings.sharepoint

import typings.sharepoint.SPNs.Guid
import typings.sharepoint.SPNs.UrlZone
import typings.sharepoint.SPNs.UtilitiesNs.PrincipalSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait ISPClientPeoplePickerSchema extends js.Object {
  var AllUrlZones: js.UndefOr[Boolean] = js.undefined
  var AllowEmailAddresses: js.UndefOr[Boolean] = js.undefined
  var AllowMultipleValues: js.UndefOr[Boolean] = js.undefined
  var AutoFillElementId: js.UndefOr[String] = js.undefined
  var AutoFillEnabled: js.UndefOr[Boolean] = js.undefined
  var EditorElementId: js.UndefOr[String] = js.undefined
  var EnabledClaimProvider: js.UndefOr[String] = js.undefined
  var ErrorMessage: js.UndefOr[String] = js.undefined
  var ForceClaims: js.UndefOr[Boolean] = js.undefined
  var HiddenInputId: js.UndefOr[String] = js.undefined
  var InitialHelpText: js.UndefOr[String] = js.undefined
  var InitialHelpTextElementId: js.UndefOr[String] = js.undefined
  var InitialSuggestions: js.UndefOr[js.Array[ISPClientPeoplePickerEntity]] = js.undefined
  var MaximumEntitySuggestions: js.UndefOr[Double] = js.undefined
  var OnUserResolvedClientScript: js.UndefOr[
    js.Function2[
      /* pickerElementId */ String, 
      /* users */ js.Array[ISPClientPeoplePickerEntity], 
      Unit
    ]
  ] = js.undefined
  var OnValueChangedClientScript: js.UndefOr[
    js.Function2[
      /* pickerElementId */ String, 
      /* users */ js.Array[ISPClientPeoplePickerEntity], 
      Unit
    ]
  ] = js.undefined
  /** Specify User, DL, SecGroup or SPGroup*/
  var PrincipalAccountType: js.UndefOr[String] = js.undefined
  var Required: js.UndefOr[Boolean] = js.undefined
  var ResolvePrincipalSource: js.UndefOr[PrincipalSource] = js.undefined
  var ResolvedListElementId: js.UndefOr[String] = js.undefined
  var Rows: js.UndefOr[Double] = js.undefined
  var SearchPrincipalSource: js.UndefOr[PrincipalSource] = js.undefined
  var SharePointGroupID: js.UndefOr[Double] = js.undefined
  var TopLevelElementId: js.UndefOr[String] = js.undefined
  var UrlZone: js.UndefOr[typings.sharepoint.SPNs.UrlZone] = js.undefined
  var UseLocalSuggestionCache: js.UndefOr[Boolean] = js.undefined
  var UserNoQueryPermission: js.UndefOr[Boolean] = js.undefined
  var VisibleSuggestions: js.UndefOr[Double] = js.undefined
  var WaitImageId: js.UndefOr[String] = js.undefined
  var WebApplicationID: js.UndefOr[Guid] = js.undefined
  /** Number or '100%'*/
  var Width: js.UndefOr[js.Any] = js.undefined
}

object ISPClientPeoplePickerSchema {
  @scala.inline
  def apply(
    AllUrlZones: js.UndefOr[Boolean] = js.undefined,
    AllowEmailAddresses: js.UndefOr[Boolean] = js.undefined,
    AllowMultipleValues: js.UndefOr[Boolean] = js.undefined,
    AutoFillElementId: String = null,
    AutoFillEnabled: js.UndefOr[Boolean] = js.undefined,
    EditorElementId: String = null,
    EnabledClaimProvider: String = null,
    ErrorMessage: String = null,
    ForceClaims: js.UndefOr[Boolean] = js.undefined,
    HiddenInputId: String = null,
    InitialHelpText: String = null,
    InitialHelpTextElementId: String = null,
    InitialSuggestions: js.Array[ISPClientPeoplePickerEntity] = null,
    MaximumEntitySuggestions: Int | Double = null,
    OnUserResolvedClientScript: (/* pickerElementId */ String, /* users */ js.Array[ISPClientPeoplePickerEntity]) => Unit = null,
    OnValueChangedClientScript: (/* pickerElementId */ String, /* users */ js.Array[ISPClientPeoplePickerEntity]) => Unit = null,
    PrincipalAccountType: String = null,
    Required: js.UndefOr[Boolean] = js.undefined,
    ResolvePrincipalSource: PrincipalSource = null,
    ResolvedListElementId: String = null,
    Rows: Int | Double = null,
    SearchPrincipalSource: PrincipalSource = null,
    SharePointGroupID: Int | Double = null,
    TopLevelElementId: String = null,
    UrlZone: UrlZone = null,
    UseLocalSuggestionCache: js.UndefOr[Boolean] = js.undefined,
    UserNoQueryPermission: js.UndefOr[Boolean] = js.undefined,
    VisibleSuggestions: Int | Double = null,
    WaitImageId: String = null,
    WebApplicationID: Guid = null,
    Width: js.Any = null
  ): ISPClientPeoplePickerSchema = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllUrlZones)) __obj.updateDynamic("AllUrlZones")(AllUrlZones)
    if (!js.isUndefined(AllowEmailAddresses)) __obj.updateDynamic("AllowEmailAddresses")(AllowEmailAddresses)
    if (!js.isUndefined(AllowMultipleValues)) __obj.updateDynamic("AllowMultipleValues")(AllowMultipleValues)
    if (AutoFillElementId != null) __obj.updateDynamic("AutoFillElementId")(AutoFillElementId)
    if (!js.isUndefined(AutoFillEnabled)) __obj.updateDynamic("AutoFillEnabled")(AutoFillEnabled)
    if (EditorElementId != null) __obj.updateDynamic("EditorElementId")(EditorElementId)
    if (EnabledClaimProvider != null) __obj.updateDynamic("EnabledClaimProvider")(EnabledClaimProvider)
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (!js.isUndefined(ForceClaims)) __obj.updateDynamic("ForceClaims")(ForceClaims)
    if (HiddenInputId != null) __obj.updateDynamic("HiddenInputId")(HiddenInputId)
    if (InitialHelpText != null) __obj.updateDynamic("InitialHelpText")(InitialHelpText)
    if (InitialHelpTextElementId != null) __obj.updateDynamic("InitialHelpTextElementId")(InitialHelpTextElementId)
    if (InitialSuggestions != null) __obj.updateDynamic("InitialSuggestions")(InitialSuggestions)
    if (MaximumEntitySuggestions != null) __obj.updateDynamic("MaximumEntitySuggestions")(MaximumEntitySuggestions.asInstanceOf[js.Any])
    if (OnUserResolvedClientScript != null) __obj.updateDynamic("OnUserResolvedClientScript")(js.Any.fromFunction2(OnUserResolvedClientScript))
    if (OnValueChangedClientScript != null) __obj.updateDynamic("OnValueChangedClientScript")(js.Any.fromFunction2(OnValueChangedClientScript))
    if (PrincipalAccountType != null) __obj.updateDynamic("PrincipalAccountType")(PrincipalAccountType)
    if (!js.isUndefined(Required)) __obj.updateDynamic("Required")(Required)
    if (ResolvePrincipalSource != null) __obj.updateDynamic("ResolvePrincipalSource")(ResolvePrincipalSource)
    if (ResolvedListElementId != null) __obj.updateDynamic("ResolvedListElementId")(ResolvedListElementId)
    if (Rows != null) __obj.updateDynamic("Rows")(Rows.asInstanceOf[js.Any])
    if (SearchPrincipalSource != null) __obj.updateDynamic("SearchPrincipalSource")(SearchPrincipalSource)
    if (SharePointGroupID != null) __obj.updateDynamic("SharePointGroupID")(SharePointGroupID.asInstanceOf[js.Any])
    if (TopLevelElementId != null) __obj.updateDynamic("TopLevelElementId")(TopLevelElementId)
    if (UrlZone != null) __obj.updateDynamic("UrlZone")(UrlZone)
    if (!js.isUndefined(UseLocalSuggestionCache)) __obj.updateDynamic("UseLocalSuggestionCache")(UseLocalSuggestionCache)
    if (!js.isUndefined(UserNoQueryPermission)) __obj.updateDynamic("UserNoQueryPermission")(UserNoQueryPermission)
    if (VisibleSuggestions != null) __obj.updateDynamic("VisibleSuggestions")(VisibleSuggestions.asInstanceOf[js.Any])
    if (WaitImageId != null) __obj.updateDynamic("WaitImageId")(WaitImageId)
    if (WebApplicationID != null) __obj.updateDynamic("WebApplicationID")(WebApplicationID)
    if (Width != null) __obj.updateDynamic("Width")(Width)
    __obj.asInstanceOf[ISPClientPeoplePickerSchema]
  }
}

