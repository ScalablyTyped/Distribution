package typings.sharepoint

import typings.sharepoint.SP.Guid
import typings.sharepoint.SP.UrlZone
import typings.sharepoint.SP.Utilities.PrincipalSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISPClientPeoplePickerSchema extends js.Object {
  
  var AllUrlZones: js.UndefOr[Boolean] = js.native
  
  var AllowEmailAddresses: js.UndefOr[Boolean] = js.native
  
  var AllowMultipleValues: js.UndefOr[Boolean] = js.native
  
  var AutoFillElementId: js.UndefOr[String] = js.native
  
  var AutoFillEnabled: js.UndefOr[Boolean] = js.native
  
  var EditorElementId: js.UndefOr[String] = js.native
  
  var EnabledClaimProvider: js.UndefOr[String] = js.native
  
  var ErrorMessage: js.UndefOr[String] = js.native
  
  var ForceClaims: js.UndefOr[Boolean] = js.native
  
  var HiddenInputId: js.UndefOr[String] = js.native
  
  var InitialHelpText: js.UndefOr[String] = js.native
  
  var InitialHelpTextElementId: js.UndefOr[String] = js.native
  
  var InitialSuggestions: js.UndefOr[js.Array[ISPClientPeoplePickerEntity]] = js.native
  
  var MaximumEntitySuggestions: js.UndefOr[Double] = js.native
  
  var OnUserResolvedClientScript: js.UndefOr[
    js.Function2[
      /* pickerElementId */ String, 
      /* users */ js.Array[ISPClientPeoplePickerEntity], 
      Unit
    ]
  ] = js.native
  
  var OnValueChangedClientScript: js.UndefOr[
    js.Function2[
      /* pickerElementId */ String, 
      /* users */ js.Array[ISPClientPeoplePickerEntity], 
      Unit
    ]
  ] = js.native
  
  /** Specify User, DL, SecGroup or SPGroup*/
  var PrincipalAccountType: js.UndefOr[String] = js.native
  
  var Required: js.UndefOr[Boolean] = js.native
  
  var ResolvePrincipalSource: js.UndefOr[PrincipalSource] = js.native
  
  var ResolvedListElementId: js.UndefOr[String] = js.native
  
  var Rows: js.UndefOr[Double] = js.native
  
  var SearchPrincipalSource: js.UndefOr[PrincipalSource] = js.native
  
  var SharePointGroupID: js.UndefOr[Double] = js.native
  
  var TopLevelElementId: js.UndefOr[String] = js.native
  
  var UrlZone: js.UndefOr[typings.sharepoint.SP.UrlZone] = js.native
  
  var UseLocalSuggestionCache: js.UndefOr[Boolean] = js.native
  
  var UserNoQueryPermission: js.UndefOr[Boolean] = js.native
  
  var VisibleSuggestions: js.UndefOr[Double] = js.native
  
  var WaitImageId: js.UndefOr[String] = js.native
  
  var WebApplicationID: js.UndefOr[Guid] = js.native
  
  /** Number or '100%'*/
  var Width: js.UndefOr[js.Any] = js.native
}
object ISPClientPeoplePickerSchema {
  
  @scala.inline
  def apply(): ISPClientPeoplePickerSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISPClientPeoplePickerSchema]
  }
  
  @scala.inline
  implicit class ISPClientPeoplePickerSchemaOps[Self <: ISPClientPeoplePickerSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllUrlZones(value: Boolean): Self = this.set("AllUrlZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllUrlZones: Self = this.set("AllUrlZones", js.undefined)
    
    @scala.inline
    def setAllowEmailAddresses(value: Boolean): Self = this.set("AllowEmailAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEmailAddresses: Self = this.set("AllowEmailAddresses", js.undefined)
    
    @scala.inline
    def setAllowMultipleValues(value: Boolean): Self = this.set("AllowMultipleValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMultipleValues: Self = this.set("AllowMultipleValues", js.undefined)
    
    @scala.inline
    def setAutoFillElementId(value: String): Self = this.set("AutoFillElementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFillElementId: Self = this.set("AutoFillElementId", js.undefined)
    
    @scala.inline
    def setAutoFillEnabled(value: Boolean): Self = this.set("AutoFillEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFillEnabled: Self = this.set("AutoFillEnabled", js.undefined)
    
    @scala.inline
    def setEditorElementId(value: String): Self = this.set("EditorElementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorElementId: Self = this.set("EditorElementId", js.undefined)
    
    @scala.inline
    def setEnabledClaimProvider(value: String): Self = this.set("EnabledClaimProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledClaimProvider: Self = this.set("EnabledClaimProvider", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    
    @scala.inline
    def setForceClaims(value: Boolean): Self = this.set("ForceClaims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceClaims: Self = this.set("ForceClaims", js.undefined)
    
    @scala.inline
    def setHiddenInputId(value: String): Self = this.set("HiddenInputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenInputId: Self = this.set("HiddenInputId", js.undefined)
    
    @scala.inline
    def setInitialHelpText(value: String): Self = this.set("InitialHelpText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialHelpText: Self = this.set("InitialHelpText", js.undefined)
    
    @scala.inline
    def setInitialHelpTextElementId(value: String): Self = this.set("InitialHelpTextElementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialHelpTextElementId: Self = this.set("InitialHelpTextElementId", js.undefined)
    
    @scala.inline
    def setInitialSuggestionsVarargs(value: ISPClientPeoplePickerEntity*): Self = this.set("InitialSuggestions", js.Array(value :_*))
    
    @scala.inline
    def setInitialSuggestions(value: js.Array[ISPClientPeoplePickerEntity]): Self = this.set("InitialSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialSuggestions: Self = this.set("InitialSuggestions", js.undefined)
    
    @scala.inline
    def setMaximumEntitySuggestions(value: Double): Self = this.set("MaximumEntitySuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumEntitySuggestions: Self = this.set("MaximumEntitySuggestions", js.undefined)
    
    @scala.inline
    def setOnUserResolvedClientScript(value: (/* pickerElementId */ String, /* users */ js.Array[ISPClientPeoplePickerEntity]) => Unit): Self = this.set("OnUserResolvedClientScript", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnUserResolvedClientScript: Self = this.set("OnUserResolvedClientScript", js.undefined)
    
    @scala.inline
    def setOnValueChangedClientScript(value: (/* pickerElementId */ String, /* users */ js.Array[ISPClientPeoplePickerEntity]) => Unit): Self = this.set("OnValueChangedClientScript", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnValueChangedClientScript: Self = this.set("OnValueChangedClientScript", js.undefined)
    
    @scala.inline
    def setPrincipalAccountType(value: String): Self = this.set("PrincipalAccountType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipalAccountType: Self = this.set("PrincipalAccountType", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("Required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("Required", js.undefined)
    
    @scala.inline
    def setResolvePrincipalSource(value: PrincipalSource): Self = this.set("ResolvePrincipalSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolvePrincipalSource: Self = this.set("ResolvePrincipalSource", js.undefined)
    
    @scala.inline
    def setResolvedListElementId(value: String): Self = this.set("ResolvedListElementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolvedListElementId: Self = this.set("ResolvedListElementId", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = this.set("Rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("Rows", js.undefined)
    
    @scala.inline
    def setSearchPrincipalSource(value: PrincipalSource): Self = this.set("SearchPrincipalSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchPrincipalSource: Self = this.set("SearchPrincipalSource", js.undefined)
    
    @scala.inline
    def setSharePointGroupID(value: Double): Self = this.set("SharePointGroupID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharePointGroupID: Self = this.set("SharePointGroupID", js.undefined)
    
    @scala.inline
    def setTopLevelElementId(value: String): Self = this.set("TopLevelElementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopLevelElementId: Self = this.set("TopLevelElementId", js.undefined)
    
    @scala.inline
    def setUrlZone(value: UrlZone): Self = this.set("UrlZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlZone: Self = this.set("UrlZone", js.undefined)
    
    @scala.inline
    def setUseLocalSuggestionCache(value: Boolean): Self = this.set("UseLocalSuggestionCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseLocalSuggestionCache: Self = this.set("UseLocalSuggestionCache", js.undefined)
    
    @scala.inline
    def setUserNoQueryPermission(value: Boolean): Self = this.set("UserNoQueryPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserNoQueryPermission: Self = this.set("UserNoQueryPermission", js.undefined)
    
    @scala.inline
    def setVisibleSuggestions(value: Double): Self = this.set("VisibleSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleSuggestions: Self = this.set("VisibleSuggestions", js.undefined)
    
    @scala.inline
    def setWaitImageId(value: String): Self = this.set("WaitImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitImageId: Self = this.set("WaitImageId", js.undefined)
    
    @scala.inline
    def setWebApplicationID(value: Guid): Self = this.set("WebApplicationID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebApplicationID: Self = this.set("WebApplicationID", js.undefined)
    
    @scala.inline
    def setWidth(value: js.Any): Self = this.set("Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("Width", js.undefined)
  }
}
