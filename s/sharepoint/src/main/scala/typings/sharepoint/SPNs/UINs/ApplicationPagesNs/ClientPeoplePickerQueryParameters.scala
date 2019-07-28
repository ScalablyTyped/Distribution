package typings.sharepoint.SPNs.UINs.ApplicationPagesNs

import typings.sharepoint.SPNs.ClientValueObject
import typings.sharepoint.SPNs.Guid
import typings.sharepoint.SPNs.UrlZone
import typings.sharepoint.SPNs.UtilitiesNs.PrincipalSource
import typings.sharepoint.SPNs.UtilitiesNs.PrincipalType
import typings.sharepoint.SPNs.Web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.ApplicationPages.ClientPeoplePickerQueryParameters")
@js.native
class ClientPeoplePickerQueryParameters () extends ClientValueObject {
  def get_allUrlZones(): Boolean = js.native
  def get_allowEmailAddresses(): Boolean = js.native
  def get_allowMultipleEntities(): Boolean = js.native
  def get_enabledClaimProviders(): String = js.native
  def get_forceClaims(): Boolean = js.native
  def get_maximumEntitySuggestions(): Double = js.native
  def get_principalSource(): PrincipalSource = js.native
  def get_principalType(): PrincipalType = js.native
  def get_queryString(): String = js.native
  def get_required(): Boolean = js.native
  def get_sharePointGroupID(): Double = js.native
  def get_urlZone(): UrlZone = js.native
  def get_urlZoneSpecified(): Boolean = js.native
  def get_web(): Web = js.native
  def get_webApplicationID(): Guid = js.native
  def set_allUrlZones(value: Boolean): Unit = js.native
  def set_allowEmailAddresses(value: Boolean): Unit = js.native
  def set_allowMultipleEntities(value: Boolean): Unit = js.native
  def set_enabledClaimProviders(value: String): Unit = js.native
  def set_forceClaims(value: Boolean): Unit = js.native
  def set_maximumEntitySuggestions(value: Double): Unit = js.native
  def set_principalSource(value: PrincipalSource): Unit = js.native
  def set_principalType(value: PrincipalType): Unit = js.native
  def set_queryString(value: String): Unit = js.native
  def set_required(value: Boolean): Unit = js.native
  def set_sharePointGroupID(value: Double): Unit = js.native
  def set_urlZone(value: UrlZone): Unit = js.native
  def set_urlZoneSpecified(value: Boolean): Unit = js.native
  def set_web(value: Web): Unit = js.native
  def set_webApplicationID(value: Guid): Unit = js.native
}

