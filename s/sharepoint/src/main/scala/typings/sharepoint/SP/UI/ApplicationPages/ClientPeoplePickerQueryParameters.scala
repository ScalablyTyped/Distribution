package typings.sharepoint.SP.UI.ApplicationPages

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.Guid
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.UrlZone
import typings.sharepoint.SP.Utilities.PrincipalSource
import typings.sharepoint.SP.Utilities.PrincipalType
import typings.sharepoint.SP.Web
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientPeoplePickerQueryParameters extends ClientValueObject {
  def get_allUrlZones(): Boolean
  def get_allowEmailAddresses(): Boolean
  def get_allowMultipleEntities(): Boolean
  def get_enabledClaimProviders(): String
  def get_forceClaims(): Boolean
  def get_maximumEntitySuggestions(): Double
  def get_principalSource(): PrincipalSource
  def get_principalType(): PrincipalType
  def get_queryString(): String
  def get_required(): Boolean
  def get_sharePointGroupID(): Double
  def get_urlZone(): UrlZone
  def get_urlZoneSpecified(): Boolean
  def get_web(): Web
  def get_webApplicationID(): Guid
  def set_allUrlZones(value: Boolean): Unit
  def set_allowEmailAddresses(value: Boolean): Unit
  def set_allowMultipleEntities(value: Boolean): Unit
  def set_enabledClaimProviders(value: String): Unit
  def set_forceClaims(value: Boolean): Unit
  def set_maximumEntitySuggestions(value: Double): Unit
  def set_principalSource(value: PrincipalSource): Unit
  def set_principalType(value: PrincipalType): Unit
  def set_queryString(value: String): Unit
  def set_required(value: Boolean): Unit
  def set_sharePointGroupID(value: Double): Unit
  def set_urlZone(value: UrlZone): Unit
  def set_urlZoneSpecified(value: Boolean): Unit
  def set_web(value: Web): Unit
  def set_webApplicationID(value: Guid): Unit
}

object ClientPeoplePickerQueryParameters {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_allUrlZones: () => Boolean,
    get_allowEmailAddresses: () => Boolean,
    get_allowMultipleEntities: () => Boolean,
    get_enabledClaimProviders: () => String,
    get_forceClaims: () => Boolean,
    get_maximumEntitySuggestions: () => Double,
    get_principalSource: () => PrincipalSource,
    get_principalType: () => PrincipalType,
    get_queryString: () => String,
    get_required: () => Boolean,
    get_sharePointGroupID: () => Double,
    get_typeId: () => String,
    get_urlZone: () => UrlZone,
    get_urlZoneSpecified: () => Boolean,
    get_web: () => Web,
    get_webApplicationID: () => Guid,
    set_allUrlZones: Boolean => Unit,
    set_allowEmailAddresses: Boolean => Unit,
    set_allowMultipleEntities: Boolean => Unit,
    set_enabledClaimProviders: String => Unit,
    set_forceClaims: Boolean => Unit,
    set_maximumEntitySuggestions: Double => Unit,
    set_principalSource: PrincipalSource => Unit,
    set_principalType: PrincipalType => Unit,
    set_queryString: String => Unit,
    set_required: Boolean => Unit,
    set_sharePointGroupID: Double => Unit,
    set_urlZone: UrlZone => Unit,
    set_urlZoneSpecified: Boolean => Unit,
    set_web: Web => Unit,
    set_webApplicationID: Guid => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ClientPeoplePickerQueryParameters = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_allUrlZones = js.Any.fromFunction0(get_allUrlZones), get_allowEmailAddresses = js.Any.fromFunction0(get_allowEmailAddresses), get_allowMultipleEntities = js.Any.fromFunction0(get_allowMultipleEntities), get_enabledClaimProviders = js.Any.fromFunction0(get_enabledClaimProviders), get_forceClaims = js.Any.fromFunction0(get_forceClaims), get_maximumEntitySuggestions = js.Any.fromFunction0(get_maximumEntitySuggestions), get_principalSource = js.Any.fromFunction0(get_principalSource), get_principalType = js.Any.fromFunction0(get_principalType), get_queryString = js.Any.fromFunction0(get_queryString), get_required = js.Any.fromFunction0(get_required), get_sharePointGroupID = js.Any.fromFunction0(get_sharePointGroupID), get_typeId = js.Any.fromFunction0(get_typeId), get_urlZone = js.Any.fromFunction0(get_urlZone), get_urlZoneSpecified = js.Any.fromFunction0(get_urlZoneSpecified), get_web = js.Any.fromFunction0(get_web), get_webApplicationID = js.Any.fromFunction0(get_webApplicationID), set_allUrlZones = js.Any.fromFunction1(set_allUrlZones), set_allowEmailAddresses = js.Any.fromFunction1(set_allowEmailAddresses), set_allowMultipleEntities = js.Any.fromFunction1(set_allowMultipleEntities), set_enabledClaimProviders = js.Any.fromFunction1(set_enabledClaimProviders), set_forceClaims = js.Any.fromFunction1(set_forceClaims), set_maximumEntitySuggestions = js.Any.fromFunction1(set_maximumEntitySuggestions), set_principalSource = js.Any.fromFunction1(set_principalSource), set_principalType = js.Any.fromFunction1(set_principalType), set_queryString = js.Any.fromFunction1(set_queryString), set_required = js.Any.fromFunction1(set_required), set_sharePointGroupID = js.Any.fromFunction1(set_sharePointGroupID), set_urlZone = js.Any.fromFunction1(set_urlZone), set_urlZoneSpecified = js.Any.fromFunction1(set_urlZoneSpecified), set_web = js.Any.fromFunction1(set_web), set_webApplicationID = js.Any.fromFunction1(set_webApplicationID), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ClientPeoplePickerQueryParameters]
  }
}

