package typings.sharepoint

import typings.sharepoint.SP.Guid
import typings.sharepoint.SP.UrlZone
import typings.sharepoint.SP.Utilities.PrincipalSource
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
  var UrlZone: js.UndefOr[typings.sharepoint.SP.UrlZone] = js.undefined
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
    if (!js.isUndefined(AllUrlZones)) __obj.updateDynamic("AllUrlZones")(AllUrlZones.asInstanceOf[js.Any])
    if (!js.isUndefined(AllowEmailAddresses)) __obj.updateDynamic("AllowEmailAddresses")(AllowEmailAddresses.asInstanceOf[js.Any])
    if (!js.isUndefined(AllowMultipleValues)) __obj.updateDynamic("AllowMultipleValues")(AllowMultipleValues.asInstanceOf[js.Any])
    if (AutoFillElementId != null) __obj.updateDynamic("AutoFillElementId")(AutoFillElementId.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoFillEnabled)) __obj.updateDynamic("AutoFillEnabled")(AutoFillEnabled.asInstanceOf[js.Any])
    if (EditorElementId != null) __obj.updateDynamic("EditorElementId")(EditorElementId.asInstanceOf[js.Any])
    if (EnabledClaimProvider != null) __obj.updateDynamic("EnabledClaimProvider")(EnabledClaimProvider.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(ForceClaims)) __obj.updateDynamic("ForceClaims")(ForceClaims.asInstanceOf[js.Any])
    if (HiddenInputId != null) __obj.updateDynamic("HiddenInputId")(HiddenInputId.asInstanceOf[js.Any])
    if (InitialHelpText != null) __obj.updateDynamic("InitialHelpText")(InitialHelpText.asInstanceOf[js.Any])
    if (InitialHelpTextElementId != null) __obj.updateDynamic("InitialHelpTextElementId")(InitialHelpTextElementId.asInstanceOf[js.Any])
    if (InitialSuggestions != null) __obj.updateDynamic("InitialSuggestions")(InitialSuggestions.asInstanceOf[js.Any])
    if (MaximumEntitySuggestions != null) __obj.updateDynamic("MaximumEntitySuggestions")(MaximumEntitySuggestions.asInstanceOf[js.Any])
    if (OnUserResolvedClientScript != null) __obj.updateDynamic("OnUserResolvedClientScript")(js.Any.fromFunction2(OnUserResolvedClientScript))
    if (OnValueChangedClientScript != null) __obj.updateDynamic("OnValueChangedClientScript")(js.Any.fromFunction2(OnValueChangedClientScript))
    if (PrincipalAccountType != null) __obj.updateDynamic("PrincipalAccountType")(PrincipalAccountType.asInstanceOf[js.Any])
    if (!js.isUndefined(Required)) __obj.updateDynamic("Required")(Required.asInstanceOf[js.Any])
    if (ResolvePrincipalSource != null) __obj.updateDynamic("ResolvePrincipalSource")(ResolvePrincipalSource.asInstanceOf[js.Any])
    if (ResolvedListElementId != null) __obj.updateDynamic("ResolvedListElementId")(ResolvedListElementId.asInstanceOf[js.Any])
    if (Rows != null) __obj.updateDynamic("Rows")(Rows.asInstanceOf[js.Any])
    if (SearchPrincipalSource != null) __obj.updateDynamic("SearchPrincipalSource")(SearchPrincipalSource.asInstanceOf[js.Any])
    if (SharePointGroupID != null) __obj.updateDynamic("SharePointGroupID")(SharePointGroupID.asInstanceOf[js.Any])
    if (TopLevelElementId != null) __obj.updateDynamic("TopLevelElementId")(TopLevelElementId.asInstanceOf[js.Any])
    if (UrlZone != null) __obj.updateDynamic("UrlZone")(UrlZone.asInstanceOf[js.Any])
    if (!js.isUndefined(UseLocalSuggestionCache)) __obj.updateDynamic("UseLocalSuggestionCache")(UseLocalSuggestionCache.asInstanceOf[js.Any])
    if (!js.isUndefined(UserNoQueryPermission)) __obj.updateDynamic("UserNoQueryPermission")(UserNoQueryPermission.asInstanceOf[js.Any])
    if (VisibleSuggestions != null) __obj.updateDynamic("VisibleSuggestions")(VisibleSuggestions.asInstanceOf[js.Any])
    if (WaitImageId != null) __obj.updateDynamic("WaitImageId")(WaitImageId.asInstanceOf[js.Any])
    if (WebApplicationID != null) __obj.updateDynamic("WebApplicationID")(WebApplicationID.asInstanceOf[js.Any])
    if (Width != null) __obj.updateDynamic("Width")(Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISPClientPeoplePickerSchema]
  }
}

