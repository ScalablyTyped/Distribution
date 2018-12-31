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

