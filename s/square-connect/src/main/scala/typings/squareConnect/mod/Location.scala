package typings.squareConnect.mod

import typings.squareConnect.squareConnectStrings.CREDIT_CARD_PROCESSING
import typings.squareConnect.squareConnectStrings.MOBILE
import typings.squareConnect.squareConnectStrings.PHYSICAL
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
    * The email of the location.
    */
  var business_email: js.UndefOr[String] = js.native
  /**
    * The hours of operation for a business location. Default: none; only exists if explicitly set.
    */
  var business_hours: js.UndefOr[BusinessHours] = js.native
  /**
    * The location's business_name which is shown to its customers.
    * For example, this is the name printed on its customer's receipts.
    */
  var business_name: js.UndefOr[String] = js.native
  /**
    * Indicates which Square features are enabled for the location.
    * See [LocationCapability](#type-locationcapability) for possible values.
    */
  var capabilities: js.UndefOr[js.Array[CREDIT_CARD_PROCESSING]] = js.native
  /**
    * The physical coordinates (latitude and longitude) of the location.
    */
  var coordinates: js.UndefOr[Coordinates] = js.native
  /**
    * The location's country, in ISO 3166-1-alpha-2 format. See [Country](#type-country) for possible values.
    */
  var country: js.UndefOr[CountryType] = js.native
  /**
    * The time when the location was created, in RFC 3339 format.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * The currency used for all transactions at this location, specified in __ISO 4217 format__.
    * For example, the currency for a location processing transactions in the United States is 'USD'.
    * See [Currency](#type-currency) for possible values.
    */
  var currency: js.UndefOr[CurrencyType] = js.native
  /**
    * The business description of the location.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The Facebook profile URL of the location. The URL should begin with 'facebook.com/'.
    */
  var facebook_url: js.UndefOr[String] = js.native
  /**
    * The location's unique ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The Instagram username of the location without the '
    */
  var instagram_username: js.UndefOr[String] = js.native
  /**
    * The language associated with the location in [BCP 47 format](https://tools.ietf.org/html/bcp47#appendix-A).
    */
  var language_code: js.UndefOr[String] = js.native
  /**
    * The logo image URL of the location.
    */
  var logo_url: js.UndefOr[String] = js.native
  /**
    * The identifier of the merchant that owns the location.
    */
  var merchant_id: js.UndefOr[String] = js.native
  /**
    * The location's name. Location names are set by the account owner and displayed in the dashboard as the location's nickname.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The location's phone_number.
    */
  var phone_number: js.UndefOr[String] = js.native
  /**
    * The Point of Sale background image URL of the location.
    */
  var pos_background_url: js.UndefOr[String] = js.native
  /**
    * The location's status. See [LocationStatus](#type-locationstatus) for possible values.
    */
  var status: js.UndefOr[ActivityStatusType] = js.native
  /**
    * The [IANA Timezone Database](https://www.iana.org/time-zones) identifier for the location's timezone.
    */
  var timezone: js.UndefOr[String] = js.native
  /**
    * The Twitter username of the location without the '
    */
  var twitter_username: js.UndefOr[String] = js.native
  /**
    * The location's type, as set by the account owner in the Square dashboard.
    * Typically used to indicate whether or not the location object represents a physical space like a building or mall space.
    * See [LocationType](#type-locationtype) for possible values.
    */
  var `type`: js.UndefOr[PHYSICAL | MOBILE] = js.native
  /**
    * The location's website, as set by the account owner in the Square dashboard.
    * Default: none; only exists if explicitly set.
    */
  var website_url: js.UndefOr[String] = js.native
}

