package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait ISPClientPeoplePickerSchema extends js.Object {
  var AllUrlZones: js.UndefOr[scala.Boolean] = js.undefined
  var AllowEmailAddresses: js.UndefOr[scala.Boolean] = js.undefined
  var AllowMultipleValues: js.UndefOr[scala.Boolean] = js.undefined
  var AutoFillElementId: js.UndefOr[java.lang.String] = js.undefined
  var AutoFillEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var EditorElementId: js.UndefOr[java.lang.String] = js.undefined
  var EnabledClaimProvider: js.UndefOr[java.lang.String] = js.undefined
  var ErrorMessage: js.UndefOr[java.lang.String] = js.undefined
  var ForceClaims: js.UndefOr[scala.Boolean] = js.undefined
  var HiddenInputId: js.UndefOr[java.lang.String] = js.undefined
  var InitialHelpText: js.UndefOr[java.lang.String] = js.undefined
  var InitialHelpTextElementId: js.UndefOr[java.lang.String] = js.undefined
  var InitialSuggestions: js.UndefOr[js.Array[ISPClientPeoplePickerEntity]] = js.undefined
  var MaximumEntitySuggestions: js.UndefOr[scala.Double] = js.undefined
  var OnUserResolvedClientScript: js.UndefOr[
    js.Function2[
      /* pickerElementId */ java.lang.String, 
      /* users */ js.Array[ISPClientPeoplePickerEntity], 
      scala.Unit
    ]
  ] = js.undefined
  var OnValueChangedClientScript: js.UndefOr[
    js.Function2[
      /* pickerElementId */ java.lang.String, 
      /* users */ js.Array[ISPClientPeoplePickerEntity], 
      scala.Unit
    ]
  ] = js.undefined
  /** Specify User, DL, SecGroup or SPGroup*/
  var PrincipalAccountType: js.UndefOr[java.lang.String] = js.undefined
  var Required: js.UndefOr[scala.Boolean] = js.undefined
  var ResolvePrincipalSource: js.UndefOr[sharepointLib.SPNs.UtilitiesNs.PrincipalSource] = js.undefined
  var ResolvedListElementId: js.UndefOr[java.lang.String] = js.undefined
  var Rows: js.UndefOr[scala.Double] = js.undefined
  var SearchPrincipalSource: js.UndefOr[sharepointLib.SPNs.UtilitiesNs.PrincipalSource] = js.undefined
  var SharePointGroupID: js.UndefOr[scala.Double] = js.undefined
  var TopLevelElementId: js.UndefOr[java.lang.String] = js.undefined
  var UrlZone: js.UndefOr[sharepointLib.SPNs.UrlZone] = js.undefined
  var UseLocalSuggestionCache: js.UndefOr[scala.Boolean] = js.undefined
  var UserNoQueryPermission: js.UndefOr[scala.Boolean] = js.undefined
  var VisibleSuggestions: js.UndefOr[scala.Double] = js.undefined
  var WaitImageId: js.UndefOr[java.lang.String] = js.undefined
  var WebApplicationID: js.UndefOr[sharepointLib.SPNs.Guid] = js.undefined
  /** Number or '100%'*/
  var Width: js.UndefOr[js.Any] = js.undefined
}

object ISPClientPeoplePickerSchema {
  @scala.inline
  def apply(
    AllUrlZones: js.UndefOr[scala.Boolean] = js.undefined,
    AllowEmailAddresses: js.UndefOr[scala.Boolean] = js.undefined,
    AllowMultipleValues: js.UndefOr[scala.Boolean] = js.undefined,
    AutoFillElementId: java.lang.String = null,
    AutoFillEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    EditorElementId: java.lang.String = null,
    EnabledClaimProvider: java.lang.String = null,
    ErrorMessage: java.lang.String = null,
    ForceClaims: js.UndefOr[scala.Boolean] = js.undefined,
    HiddenInputId: java.lang.String = null,
    InitialHelpText: java.lang.String = null,
    InitialHelpTextElementId: java.lang.String = null,
    InitialSuggestions: js.Array[ISPClientPeoplePickerEntity] = null,
    MaximumEntitySuggestions: scala.Int | scala.Double = null,
    OnUserResolvedClientScript: (/* pickerElementId */ java.lang.String, /* users */ js.Array[ISPClientPeoplePickerEntity]) => scala.Unit = null,
    OnValueChangedClientScript: (/* pickerElementId */ java.lang.String, /* users */ js.Array[ISPClientPeoplePickerEntity]) => scala.Unit = null,
    PrincipalAccountType: java.lang.String = null,
    Required: js.UndefOr[scala.Boolean] = js.undefined,
    ResolvePrincipalSource: sharepointLib.SPNs.UtilitiesNs.PrincipalSource = null,
    ResolvedListElementId: java.lang.String = null,
    Rows: scala.Int | scala.Double = null,
    SearchPrincipalSource: sharepointLib.SPNs.UtilitiesNs.PrincipalSource = null,
    SharePointGroupID: scala.Int | scala.Double = null,
    TopLevelElementId: java.lang.String = null,
    UrlZone: sharepointLib.SPNs.UrlZone = null,
    UseLocalSuggestionCache: js.UndefOr[scala.Boolean] = js.undefined,
    UserNoQueryPermission: js.UndefOr[scala.Boolean] = js.undefined,
    VisibleSuggestions: scala.Int | scala.Double = null,
    WaitImageId: java.lang.String = null,
    WebApplicationID: sharepointLib.SPNs.Guid = null,
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

