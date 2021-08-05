package typings.sharepoint

import typings.sharepoint.SP.Guid
import typings.sharepoint.SP.UrlZone
import typings.sharepoint.SP.Utilities.PrincipalSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISPClientPeoplePickerSchema extends StObject {
  
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
  
  inline def apply(): ISPClientPeoplePickerSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISPClientPeoplePickerSchema]
  }
  
  extension [Self <: ISPClientPeoplePickerSchema](x: Self) {
    
    inline def setAllUrlZones(value: Boolean): Self = StObject.set(x, "AllUrlZones", value.asInstanceOf[js.Any])
    
    inline def setAllUrlZonesUndefined: Self = StObject.set(x, "AllUrlZones", js.undefined)
    
    inline def setAllowEmailAddresses(value: Boolean): Self = StObject.set(x, "AllowEmailAddresses", value.asInstanceOf[js.Any])
    
    inline def setAllowEmailAddressesUndefined: Self = StObject.set(x, "AllowEmailAddresses", js.undefined)
    
    inline def setAllowMultipleValues(value: Boolean): Self = StObject.set(x, "AllowMultipleValues", value.asInstanceOf[js.Any])
    
    inline def setAllowMultipleValuesUndefined: Self = StObject.set(x, "AllowMultipleValues", js.undefined)
    
    inline def setAutoFillElementId(value: String): Self = StObject.set(x, "AutoFillElementId", value.asInstanceOf[js.Any])
    
    inline def setAutoFillElementIdUndefined: Self = StObject.set(x, "AutoFillElementId", js.undefined)
    
    inline def setAutoFillEnabled(value: Boolean): Self = StObject.set(x, "AutoFillEnabled", value.asInstanceOf[js.Any])
    
    inline def setAutoFillEnabledUndefined: Self = StObject.set(x, "AutoFillEnabled", js.undefined)
    
    inline def setEditorElementId(value: String): Self = StObject.set(x, "EditorElementId", value.asInstanceOf[js.Any])
    
    inline def setEditorElementIdUndefined: Self = StObject.set(x, "EditorElementId", js.undefined)
    
    inline def setEnabledClaimProvider(value: String): Self = StObject.set(x, "EnabledClaimProvider", value.asInstanceOf[js.Any])
    
    inline def setEnabledClaimProviderUndefined: Self = StObject.set(x, "EnabledClaimProvider", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setForceClaims(value: Boolean): Self = StObject.set(x, "ForceClaims", value.asInstanceOf[js.Any])
    
    inline def setForceClaimsUndefined: Self = StObject.set(x, "ForceClaims", js.undefined)
    
    inline def setHiddenInputId(value: String): Self = StObject.set(x, "HiddenInputId", value.asInstanceOf[js.Any])
    
    inline def setHiddenInputIdUndefined: Self = StObject.set(x, "HiddenInputId", js.undefined)
    
    inline def setInitialHelpText(value: String): Self = StObject.set(x, "InitialHelpText", value.asInstanceOf[js.Any])
    
    inline def setInitialHelpTextElementId(value: String): Self = StObject.set(x, "InitialHelpTextElementId", value.asInstanceOf[js.Any])
    
    inline def setInitialHelpTextElementIdUndefined: Self = StObject.set(x, "InitialHelpTextElementId", js.undefined)
    
    inline def setInitialHelpTextUndefined: Self = StObject.set(x, "InitialHelpText", js.undefined)
    
    inline def setInitialSuggestions(value: js.Array[ISPClientPeoplePickerEntity]): Self = StObject.set(x, "InitialSuggestions", value.asInstanceOf[js.Any])
    
    inline def setInitialSuggestionsUndefined: Self = StObject.set(x, "InitialSuggestions", js.undefined)
    
    inline def setInitialSuggestionsVarargs(value: ISPClientPeoplePickerEntity*): Self = StObject.set(x, "InitialSuggestions", js.Array(value :_*))
    
    inline def setMaximumEntitySuggestions(value: Double): Self = StObject.set(x, "MaximumEntitySuggestions", value.asInstanceOf[js.Any])
    
    inline def setMaximumEntitySuggestionsUndefined: Self = StObject.set(x, "MaximumEntitySuggestions", js.undefined)
    
    inline def setOnUserResolvedClientScript(value: (/* pickerElementId */ String, /* users */ js.Array[ISPClientPeoplePickerEntity]) => Unit): Self = StObject.set(x, "OnUserResolvedClientScript", js.Any.fromFunction2(value))
    
    inline def setOnUserResolvedClientScriptUndefined: Self = StObject.set(x, "OnUserResolvedClientScript", js.undefined)
    
    inline def setOnValueChangedClientScript(value: (/* pickerElementId */ String, /* users */ js.Array[ISPClientPeoplePickerEntity]) => Unit): Self = StObject.set(x, "OnValueChangedClientScript", js.Any.fromFunction2(value))
    
    inline def setOnValueChangedClientScriptUndefined: Self = StObject.set(x, "OnValueChangedClientScript", js.undefined)
    
    inline def setPrincipalAccountType(value: String): Self = StObject.set(x, "PrincipalAccountType", value.asInstanceOf[js.Any])
    
    inline def setPrincipalAccountTypeUndefined: Self = StObject.set(x, "PrincipalAccountType", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "Required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "Required", js.undefined)
    
    inline def setResolvePrincipalSource(value: PrincipalSource): Self = StObject.set(x, "ResolvePrincipalSource", value.asInstanceOf[js.Any])
    
    inline def setResolvePrincipalSourceUndefined: Self = StObject.set(x, "ResolvePrincipalSource", js.undefined)
    
    inline def setResolvedListElementId(value: String): Self = StObject.set(x, "ResolvedListElementId", value.asInstanceOf[js.Any])
    
    inline def setResolvedListElementIdUndefined: Self = StObject.set(x, "ResolvedListElementId", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "Rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "Rows", js.undefined)
    
    inline def setSearchPrincipalSource(value: PrincipalSource): Self = StObject.set(x, "SearchPrincipalSource", value.asInstanceOf[js.Any])
    
    inline def setSearchPrincipalSourceUndefined: Self = StObject.set(x, "SearchPrincipalSource", js.undefined)
    
    inline def setSharePointGroupID(value: Double): Self = StObject.set(x, "SharePointGroupID", value.asInstanceOf[js.Any])
    
    inline def setSharePointGroupIDUndefined: Self = StObject.set(x, "SharePointGroupID", js.undefined)
    
    inline def setTopLevelElementId(value: String): Self = StObject.set(x, "TopLevelElementId", value.asInstanceOf[js.Any])
    
    inline def setTopLevelElementIdUndefined: Self = StObject.set(x, "TopLevelElementId", js.undefined)
    
    inline def setUrlZone(value: UrlZone): Self = StObject.set(x, "UrlZone", value.asInstanceOf[js.Any])
    
    inline def setUrlZoneUndefined: Self = StObject.set(x, "UrlZone", js.undefined)
    
    inline def setUseLocalSuggestionCache(value: Boolean): Self = StObject.set(x, "UseLocalSuggestionCache", value.asInstanceOf[js.Any])
    
    inline def setUseLocalSuggestionCacheUndefined: Self = StObject.set(x, "UseLocalSuggestionCache", js.undefined)
    
    inline def setUserNoQueryPermission(value: Boolean): Self = StObject.set(x, "UserNoQueryPermission", value.asInstanceOf[js.Any])
    
    inline def setUserNoQueryPermissionUndefined: Self = StObject.set(x, "UserNoQueryPermission", js.undefined)
    
    inline def setVisibleSuggestions(value: Double): Self = StObject.set(x, "VisibleSuggestions", value.asInstanceOf[js.Any])
    
    inline def setVisibleSuggestionsUndefined: Self = StObject.set(x, "VisibleSuggestions", js.undefined)
    
    inline def setWaitImageId(value: String): Self = StObject.set(x, "WaitImageId", value.asInstanceOf[js.Any])
    
    inline def setWaitImageIdUndefined: Self = StObject.set(x, "WaitImageId", js.undefined)
    
    inline def setWebApplicationID(value: Guid): Self = StObject.set(x, "WebApplicationID", value.asInstanceOf[js.Any])
    
    inline def setWebApplicationIDUndefined: Self = StObject.set(x, "WebApplicationID", js.undefined)
    
    inline def setWidth(value: js.Any): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "Width", js.undefined)
  }
}
