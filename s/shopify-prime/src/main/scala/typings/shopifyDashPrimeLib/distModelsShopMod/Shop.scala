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

object Shop {
  @scala.inline
  def apply(
    address1: java.lang.String = null,
    address2: java.lang.String = null,
    admin_graphql_api_id: java.lang.String = null,
    city: java.lang.String = null,
    country: java.lang.String = null,
    country_code: java.lang.String = null,
    country_name: java.lang.String = null,
    county_taxes: js.UndefOr[scala.Boolean] = js.undefined,
    created_at: java.lang.String = null,
    currency: java.lang.String = null,
    customer_email: java.lang.String = null,
    description: java.lang.String = null,
    display_plan_name: java.lang.String = null,
    domain: java.lang.String = null,
    email: java.lang.String = null,
    force_ssl: js.UndefOr[scala.Boolean] = js.undefined,
    google_apps_domain: java.lang.String = null,
    google_apps_login_enabled: js.UndefOr[scala.Boolean] = js.undefined,
    has_discounts: js.UndefOr[scala.Boolean] = js.undefined,
    has_gift_cards: js.UndefOr[scala.Boolean] = js.undefined,
    has_storefront: js.UndefOr[scala.Boolean] = js.undefined,
    iana_timezone: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    latitude: java.lang.String = null,
    longitude: java.lang.String = null,
    money_format: java.lang.String = null,
    money_with_currency_format: java.lang.String = null,
    myshopify_domain: java.lang.String = null,
    name: java.lang.String = null,
    password_enabled: js.UndefOr[scala.Boolean] = js.undefined,
    phone: java.lang.String = null,
    plan_name: java.lang.String = null,
    primary_locale: java.lang.String = null,
    province: java.lang.String = null,
    province_code: java.lang.String = null,
    setup_required: js.UndefOr[scala.Boolean] = js.undefined,
    ships_to_countries: java.lang.String = null,
    shop_owner: java.lang.String = null,
    source: java.lang.String = null,
    tax_shipping: js.UndefOr[scala.Boolean] = js.undefined,
    taxes_included: js.UndefOr[scala.Boolean] = js.undefined,
    timezone: java.lang.String = null,
    zip: java.lang.String = null
  ): Shop = {
    val __obj = js.Dynamic.literal()
    if (address1 != null) __obj.updateDynamic("address1")(address1)
    if (address2 != null) __obj.updateDynamic("address2")(address2)
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (city != null) __obj.updateDynamic("city")(city)
    if (country != null) __obj.updateDynamic("country")(country)
    if (country_code != null) __obj.updateDynamic("country_code")(country_code)
    if (country_name != null) __obj.updateDynamic("country_name")(country_name)
    if (!js.isUndefined(county_taxes)) __obj.updateDynamic("county_taxes")(county_taxes)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (customer_email != null) __obj.updateDynamic("customer_email")(customer_email)
    if (description != null) __obj.updateDynamic("description")(description)
    if (display_plan_name != null) __obj.updateDynamic("display_plan_name")(display_plan_name)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(force_ssl)) __obj.updateDynamic("force_ssl")(force_ssl)
    if (google_apps_domain != null) __obj.updateDynamic("google_apps_domain")(google_apps_domain)
    if (!js.isUndefined(google_apps_login_enabled)) __obj.updateDynamic("google_apps_login_enabled")(google_apps_login_enabled)
    if (!js.isUndefined(has_discounts)) __obj.updateDynamic("has_discounts")(has_discounts)
    if (!js.isUndefined(has_gift_cards)) __obj.updateDynamic("has_gift_cards")(has_gift_cards)
    if (!js.isUndefined(has_storefront)) __obj.updateDynamic("has_storefront")(has_storefront)
    if (iana_timezone != null) __obj.updateDynamic("iana_timezone")(iana_timezone)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude)
    if (longitude != null) __obj.updateDynamic("longitude")(longitude)
    if (money_format != null) __obj.updateDynamic("money_format")(money_format)
    if (money_with_currency_format != null) __obj.updateDynamic("money_with_currency_format")(money_with_currency_format)
    if (myshopify_domain != null) __obj.updateDynamic("myshopify_domain")(myshopify_domain)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(password_enabled)) __obj.updateDynamic("password_enabled")(password_enabled)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (plan_name != null) __obj.updateDynamic("plan_name")(plan_name)
    if (primary_locale != null) __obj.updateDynamic("primary_locale")(primary_locale)
    if (province != null) __obj.updateDynamic("province")(province)
    if (province_code != null) __obj.updateDynamic("province_code")(province_code)
    if (!js.isUndefined(setup_required)) __obj.updateDynamic("setup_required")(setup_required)
    if (ships_to_countries != null) __obj.updateDynamic("ships_to_countries")(ships_to_countries)
    if (shop_owner != null) __obj.updateDynamic("shop_owner")(shop_owner)
    if (source != null) __obj.updateDynamic("source")(source)
    if (!js.isUndefined(tax_shipping)) __obj.updateDynamic("tax_shipping")(tax_shipping)
    if (!js.isUndefined(taxes_included)) __obj.updateDynamic("taxes_included")(taxes_included)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    if (zip != null) __obj.updateDynamic("zip")(zip)
    __obj.asInstanceOf[Shop]
  }
}

