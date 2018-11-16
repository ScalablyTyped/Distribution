package typings
package shopifyDashPrimeLib.distModelsShopMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Shop
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
       * The shop's street address.
       */
  var address1: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The second line of the shop's street address.
       */
  var address2: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The city in which the shop is located.
       */
  var city: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The shop's country (by default equal to the two-letter country code).
       */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The two-letter country code corresponding to the shop's country.
       */
  var country_code: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The shop's normalized country name.
       */
  var country_name: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The setting for whether the shop is applying taxes on a per-county basis or not (US-only). Valid values are: "true" or "null."
       */
  var county_taxes: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The date and time when the shop was created.
       */
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The three-letter code for the currency that the shop accepts.
       */
  var currency: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The customer's email.
       */
  var customer_email: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The shop's description.
       */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The display name of the Shopify plan the shop is on.
       */
  var display_plan_name: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The shop's domain.
       */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The contact email address for the shop.
       */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Indicates whether the shop forces requests made to its resources to be made over SSL, using the HTTPS protocol. If true, HTTP requests will be redirected to HTTPS.
       */
  var force_ssl: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Present when a shop has a google app domain. It will be returned as a URL, else null.
       */
  var google_apps_domain: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Present if a shop has google apps enabled. Those shops with this feature will be able to login to the google apps login.
       */
  var google_apps_login_enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Indicates whether the shop supports the Discounts api
       */
  var has_discounts: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Indicates whether the shop supports the Gift Cards api
       */
  var has_gift_cards: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Indicates whether the shop has web-based storefront or not.
       */
  var has_storefront: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The named timezone assigned by the IANA.
       */
  var iana_timezone: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Geographic coordinate specifying the north/south location of a shop.
       */
  var latitude: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Geographic coordinate specifying the east/west location of a shop.
       */
  var longitude: js.UndefOr[java.lang.String] = js.undefined
  /**
       * A string representing the way currency is formatted when the currency isn't specified.
       */
  var money_format: js.UndefOr[java.lang.String] = js.undefined
  /**
       * A string representing the way currency is formatted when the currency is specified.
       */
  var money_with_currency_format: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The shop's 'myshopify.com' domain.
       */
  var myshopify_domain: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The name of the shop.
       */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Indicates whether the Storefront password protection is enabled.
       */
  var password_enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The contact phone number for the shop.
       */
  var phone: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The name of the Shopify plan the shop is on.
       */
  var plan_name: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The shop's primary locale.
       */
  var primary_locale: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The shop's normalized province or state name.
       */
  var province: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The two-letter code for the shop's province or state.
       */
  var province_code: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Indicates whether the shop has any outstanding setup steps or not.
       */
  var setup_required: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * A list of countries the shop ships products to, separated by a comma.
       */
  var ships_to_countries: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The username of the shop owner.
       */
  var shop_owner: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Unkown. Shopify documentation does not currently indicate what this property actually is.
       */
  var source: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Specifies whether or not taxes were charged for shipping. Although the Shopify docs don't indicate this, it's possible for the value to be null.
       */
  var tax_shipping: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The setting for whether applicable taxes are included in product prices.
       */
  var taxes_included: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The name of the timezone the shop is in.
       */
  var timezone: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The zip or postal code of the shop's address.
       */
  var zip: js.UndefOr[java.lang.String] = js.undefined
}

