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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientPeoplePickerQueryParameters extends ClientValueObject {
  
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
  
  @scala.inline
  implicit class ClientPeoplePickerQueryParametersOps[Self <: ClientPeoplePickerQueryParameters] (val x: Self) extends AnyVal {
    
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
    def setGet_allUrlZones(value: () => Boolean): Self = this.set("get_allUrlZones", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_allowEmailAddresses(value: () => Boolean): Self = this.set("get_allowEmailAddresses", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_allowMultipleEntities(value: () => Boolean): Self = this.set("get_allowMultipleEntities", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_enabledClaimProviders(value: () => String): Self = this.set("get_enabledClaimProviders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_forceClaims(value: () => Boolean): Self = this.set("get_forceClaims", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_maximumEntitySuggestions(value: () => Double): Self = this.set("get_maximumEntitySuggestions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_principalSource(value: () => PrincipalSource): Self = this.set("get_principalSource", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_principalType(value: () => PrincipalType): Self = this.set("get_principalType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_queryString(value: () => String): Self = this.set("get_queryString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_required(value: () => Boolean): Self = this.set("get_required", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_sharePointGroupID(value: () => Double): Self = this.set("get_sharePointGroupID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_urlZone(value: () => UrlZone): Self = this.set("get_urlZone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_urlZoneSpecified(value: () => Boolean): Self = this.set("get_urlZoneSpecified", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_web(value: () => Web): Self = this.set("get_web", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_webApplicationID(value: () => Guid): Self = this.set("get_webApplicationID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_allUrlZones(value: Boolean => Unit): Self = this.set("set_allUrlZones", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_allowEmailAddresses(value: Boolean => Unit): Self = this.set("set_allowEmailAddresses", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_allowMultipleEntities(value: Boolean => Unit): Self = this.set("set_allowMultipleEntities", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_enabledClaimProviders(value: String => Unit): Self = this.set("set_enabledClaimProviders", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_forceClaims(value: Boolean => Unit): Self = this.set("set_forceClaims", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_maximumEntitySuggestions(value: Double => Unit): Self = this.set("set_maximumEntitySuggestions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_principalSource(value: PrincipalSource => Unit): Self = this.set("set_principalSource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_principalType(value: PrincipalType => Unit): Self = this.set("set_principalType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_queryString(value: String => Unit): Self = this.set("set_queryString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_required(value: Boolean => Unit): Self = this.set("set_required", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_sharePointGroupID(value: Double => Unit): Self = this.set("set_sharePointGroupID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_urlZone(value: UrlZone => Unit): Self = this.set("set_urlZone", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_urlZoneSpecified(value: Boolean => Unit): Self = this.set("set_urlZoneSpecified", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_web(value: Web => Unit): Self = this.set("set_web", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_webApplicationID(value: Guid => Unit): Self = this.set("set_webApplicationID", js.Any.fromFunction1(value))
  }
}
