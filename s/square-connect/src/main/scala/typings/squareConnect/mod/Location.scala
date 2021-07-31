package typings.squareConnect.mod

import typings.squareConnect.squareConnectStrings.MOBILE
import typings.squareConnect.squareConnectStrings.PHYSICAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "Location")
@js.native
class Location () extends StObject {
  
  /**
    * The physical address of the location.
    */
  var address: js.UndefOr[Address] = js.native
  
  /**
    * The email of the location. This email is visible to the customers of the location. For example, the email appears on customer receipts.
    */
  var business_email: js.UndefOr[String] = js.native
  
  /**
    *  Represents the hours of operation for the location.
    */
  var business_hours: js.UndefOr[BusinessHours] = js.native
  
  /**
    * The business name of the location This is the name visible to the customers of the location.
    * For example, this name appears on customer receipts.
    */
  var business_name: js.UndefOr[String] = js.native
  
  /**
    * The Square features that are enabled for the location. See `LocationCapability` for possible values.
    * See [LocationCapability](#type-locationcapability) for possible values
    */
  var capabilities: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The physical coordinates (latitude and longitude) of the location.
    */
  var coordinates: js.UndefOr[Coordinates] = js.native
  
  /**
    * The country of the location, in ISO 3166-1-alpha-2 format. See `Country` for possible values.
    * See [Country](#type-country) for possible values
    */
  var country: js.UndefOr[CountryType] = js.native
  
  /**
    * The time when the location was created, in RFC 3339 format.
    */
  var created_at: js.UndefOr[String] = js.native
  
  /**
    * The currency used for all transactions at this location, in ISO 4217 format. See `Currency` for possible values.
    * See [Currency](#type-currency) for possible values.
    */
  var currency: js.UndefOr[CurrencyType] = js.native
  
  /**
    * The description of the location.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The Facebook profile URL of the location. The URL should begin with 'facebook.com/'.
    */
  var facebook_url: js.UndefOr[String] = js.native
  
  /**
    * The URL of a full-format logo image for the location.
    * The Seller must choose this logo in the Seller dashboard (Receipts section) for the logo to appear on
    * transactions (such as receipts, invoices) that Square generates on behalf of the Seller.
    * This image can have an aspect ratio of 2:1 or greater and is recommended to be at least 1280x648 pixels.
    */
  var full_format_logo_url: js.UndefOr[String] = js.native
  
  /**
    * The Square-issued ID of the location.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The Instagram username of the location without the '&#64;' symbol.
    */
  var instagram_username: js.UndefOr[String] = js.native
  
  /**
    * The language associated with the location, in [BCP 47 format](https://tools.ietf.org/html/bcp47#appendix-A).
    */
  var language_code: js.UndefOr[String] = js.native
  
  /**
    * The URL of the logo image for the location. The Seller must choose this logo in the Seller dashboard (Receipts section)
    * for the logo to appear on transactions (such as receipts, invoices) that Square generates on behalf of the Seller.
    * This image should have an aspect ratio close to 1:1 and is recommended to be at least 200x200 pixels.
    */
  var logo_url: js.UndefOr[String] = js.native
  
  /**
    * The merchant category code (MCC) of the location, as standardized by ISO 18245.
    * The MCC describes the kind of goods or services sold at the location.
    */
  var mcc: js.UndefOr[String] = js.native
  
  /**
    * The ID of the merchant that owns the location.
    */
  var merchant_id: js.UndefOr[String] = js.native
  
  /**
    * The name of the location. This information appears in the dashboard as the nickname.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The phone number of the location in human readable format.
    */
  var phone_number: js.UndefOr[String] = js.native
  
  /**
    * The URL of the Point of Sale background image for the location.
    */
  var pos_background_url: js.UndefOr[String] = js.native
  
  /**
    * The status of the location, either active or inactive. See [LocationStatus](#type-locationstatus) for possible values.
    */
  var status: js.UndefOr[ActivityStatusType] = js.native
  
  /**
    * The [IANA Timezone](https://www.iana.org/time-zones) identifier for the timezone of the location.
    */
  var timezone: js.UndefOr[String] = js.native
  
  /**
    * The Twitter username of the location without the '&#64;' symbol.
    */
  var twitter_username: js.UndefOr[String] = js.native
  
  /**
    * The type of the location, either physical or mobile. See [LocationType](#type-locationtype) for possible values
    */
  var `type`: js.UndefOr[PHYSICAL | MOBILE] = js.native
  
  /**
    * The website URL of the location.
    */
  var website_url: js.UndefOr[String] = js.native
}
