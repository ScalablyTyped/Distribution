package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "Location")
@js.native
class Location () extends js.Object {
  /**
    * The location's physical address.
    */
  var address: js.UndefOr[Address] = js.native
  /**
    * The hours of operation for a business location. Default: none; only exists if explicitly set.
    */
  var business_hours: js.UndefOr[BusinessHours] = js.native
  /**
    * The location's business_name which is shown to its customers.
    * For example, this is the name printed on its customer's receipts.
    */
  var business_name: js.UndefOr[java.lang.String] = js.native
  /**
    * Indicates which Square features are enabled for the location.
    * See [LocationCapability](#type-locationcapability) for possible values.
    */
  var capabilities: js.UndefOr[js.Array[squareDashConnectLib.squareDashConnectMod.LocationNs.CapabilitiesEnum]] = js.native
  /**
    * The location's country, in ISO 3166-1-alpha-2 format. See [Country](#type-country) for possible values.
    */
  var country: js.UndefOr[squareDashConnectLib.squareDashConnectMod.LocationNs.CountryEnum] = js.native
  /**
    * The time when the location was created, in RFC 3339 format.
    */
  var created_at: js.UndefOr[java.lang.String] = js.native
  /**
    * The currency used for all transactions at this location, specified in __ISO 4217 format__.
    * For example, the currency for a location processing transactions in the United States is 'USD'.
    * See [Currency](#type-currency) for possible values.
    */
  var currency: js.UndefOr[squareDashConnectLib.squareDashConnectMod.LocationNs.CurrencyEnum] = js.native
  /**
    * The location's unique ID.
    */
  var id: js.UndefOr[java.lang.String] = js.native
  /**
    * The language associated with the location in [BCP 47 format](https://tools.ietf.org/html/bcp47#appendix-A).
    */
  var language_code: js.UndefOr[java.lang.String] = js.native
  /**
    * The identifier of the merchant that owns the location.
    */
  var merchant_id: js.UndefOr[java.lang.String] = js.native
  /**
    * The location's name. Location names are set by the account owner and displayed in the dashboard as the location's nickname.
    */
  var name: js.UndefOr[java.lang.String] = js.native
  /**
    * The location's phone_number.
    */
  var phone_number: js.UndefOr[java.lang.String] = js.native
  /**
    * The location's status. See [LocationStatus](#type-locationstatus) for possible values.
    */
  var status: js.UndefOr[squareDashConnectLib.squareDashConnectMod.LocationNs.StatusEnum] = js.native
  /**
    * The [IANA Timezone Database](https://www.iana.org/time-zones) identifier for the location's timezone.
    */
  var timezone: js.UndefOr[java.lang.String] = js.native
  /**
    * The location's type, as set by the account owner in the Square dashboard.
    * Typically used to indicate whether or not the location object represents a physical space like a building or mall space.
    * See [LocationType](#type-locationtype) for possible values.
    */
  var `type`: js.UndefOr[squareDashConnectLib.squareDashConnectMod.LocationNs.TypeEnum] = js.native
  /**
    * The location's website, as set by the account owner in the Square dashboard.
    * Default: none; only exists if explicitly set.
    */
  var website_url: js.UndefOr[java.lang.String] = js.native
}

