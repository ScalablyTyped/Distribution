package typings.shopifyDashPrime.distModelsShopMod

import typings.shopifyDashPrime.distModelsBaseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shop extends ShopifyObject {
  /**
    * The shop's street address.
    */
  var address1: js.UndefOr[String] = js.undefined
  /**
    * The second line of the shop's street address.
    */
  var address2: js.UndefOr[String] = js.undefined
  /**
    * The city in which the shop is located.
    */
  var city: js.UndefOr[String] = js.undefined
  /**
    * The shop's country (by default equal to the two-letter country code).
    */
  var country: js.UndefOr[String] = js.undefined
  /**
    * The two-letter country code corresponding to the shop's country.
    */
  var country_code: js.UndefOr[String] = js.undefined
  /**
    * The shop's normalized country name.
    */
  var country_name: js.UndefOr[String] = js.undefined
  /**
    * The setting for whether the shop is applying taxes on a per-county basis or not (US-only). Valid values are: "true" or "null."
    */
  var county_taxes: js.UndefOr[Boolean] = js.undefined
  /**
    * The date and time when the shop was created.
    */
  var created_at: js.UndefOr[String] = js.undefined
  /**
    * The three-letter code for the currency that the shop accepts.
    */
  var currency: js.UndefOr[String] = js.undefined
  /**
    * The customer's email.
    */
  var customer_email: js.UndefOr[String] = js.undefined
  /**
    * The shop's description.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The display name of the Shopify plan the shop is on.
    */
  var display_plan_name: js.UndefOr[String] = js.undefined
  /**
    * The shop's domain.
    */
  var domain: js.UndefOr[String] = js.undefined
  /**
    * The contact email address for the shop.
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the shop forces requests made to its resources to be made over SSL, using the HTTPS protocol. If true, HTTP requests will be redirected to HTTPS.
    */
  var force_ssl: js.UndefOr[Boolean] = js.undefined
  /**
    * Present when a shop has a google app domain. It will be returned as a URL, else null.
    */
  var google_apps_domain: js.UndefOr[String] = js.undefined
  /**
    * Present if a shop has google apps enabled. Those shops with this feature will be able to login to the google apps login.
    */
  var google_apps_login_enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the shop supports the Discounts api
    */
  var has_discounts: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the shop supports the Gift Cards api
    */
  var has_gift_cards: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the shop has web-based storefront or not.
    */
  var has_storefront: js.UndefOr[Boolean] = js.undefined
  /**
    * The named timezone assigned by the IANA.
    */
  var iana_timezone: js.UndefOr[String] = js.undefined
  /**
    * Geographic coordinate specifying the north/south location of a shop.
    */
  var latitude: js.UndefOr[String] = js.undefined
  /**
    * Geographic coordinate specifying the east/west location of a shop.
    */
  var longitude: js.UndefOr[String] = js.undefined
  /**
    * A string representing the way currency is formatted when the currency isn't specified.
    */
  var money_format: js.UndefOr[String] = js.undefined
  /**
    * A string representing the way currency is formatted when the currency is specified.
    */
  var money_with_currency_format: js.UndefOr[String] = js.undefined
  /**
    * The shop's 'myshopify.com' domain.
    */
  var myshopify_domain: js.UndefOr[String] = js.undefined
  /**
    * The name of the shop.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the Storefront password protection is enabled.
    */
  var password_enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The contact phone number for the shop.
    */
  var phone: js.UndefOr[String] = js.undefined
  /**
    * The name of the Shopify plan the shop is on.
    */
  var plan_name: js.UndefOr[String] = js.undefined
  /**
    * The shop's primary locale.
    */
  var primary_locale: js.UndefOr[String] = js.undefined
  /**
    * The shop's normalized province or state name.
    */
  var province: js.UndefOr[String] = js.undefined
  /**
    * The two-letter code for the shop's province or state.
    */
  var province_code: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the shop has any outstanding setup steps or not.
    */
  var setup_required: js.UndefOr[Boolean] = js.undefined
  /**
    * A list of countries the shop ships products to, separated by a comma.
    */
  var ships_to_countries: js.UndefOr[String] = js.undefined
  /**
    * The username of the shop owner.
    */
  var shop_owner: js.UndefOr[String] = js.undefined
  /**
    * Unkown. Shopify documentation does not currently indicate what this property actually is.
    */
  var source: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether or not taxes were charged for shipping. Although the Shopify docs don't indicate this, it's possible for the value to be null.
    */
  var tax_shipping: js.UndefOr[Boolean] = js.undefined
  /**
    * The setting for whether applicable taxes are included in product prices.
    */
  var taxes_included: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the timezone the shop is in.
    */
  var timezone: js.UndefOr[String] = js.undefined
  /**
    * The zip or postal code of the shop's address.
    */
  var zip: js.UndefOr[String] = js.undefined
}

object Shop {
  @scala.inline
  def apply(
    address1: String = null,
    address2: String = null,
    admin_graphql_api_id: String = null,
    city: String = null,
    country: String = null,
    country_code: String = null,
    country_name: String = null,
    county_taxes: js.UndefOr[Boolean] = js.undefined,
    created_at: String = null,
    currency: String = null,
    customer_email: String = null,
    description: String = null,
    display_plan_name: String = null,
    domain: String = null,
    email: String = null,
    force_ssl: js.UndefOr[Boolean] = js.undefined,
    google_apps_domain: String = null,
    google_apps_login_enabled: js.UndefOr[Boolean] = js.undefined,
    has_discounts: js.UndefOr[Boolean] = js.undefined,
    has_gift_cards: js.UndefOr[Boolean] = js.undefined,
    has_storefront: js.UndefOr[Boolean] = js.undefined,
    iana_timezone: String = null,
    id: Int | Double = null,
    latitude: String = null,
    longitude: String = null,
    money_format: String = null,
    money_with_currency_format: String = null,
    myshopify_domain: String = null,
    name: String = null,
    password_enabled: js.UndefOr[Boolean] = js.undefined,
    phone: String = null,
    plan_name: String = null,
    primary_locale: String = null,
    province: String = null,
    province_code: String = null,
    setup_required: js.UndefOr[Boolean] = js.undefined,
    ships_to_countries: String = null,
    shop_owner: String = null,
    source: String = null,
    tax_shipping: js.UndefOr[Boolean] = js.undefined,
    taxes_included: js.UndefOr[Boolean] = js.undefined,
    timezone: String = null,
    zip: String = null
  ): Shop = {
    val __obj = js.Dynamic.literal()
    if (address1 != null) __obj.updateDynamic("address1")(address1.asInstanceOf[js.Any])
    if (address2 != null) __obj.updateDynamic("address2")(address2.asInstanceOf[js.Any])
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (country_code != null) __obj.updateDynamic("country_code")(country_code.asInstanceOf[js.Any])
    if (country_name != null) __obj.updateDynamic("country_name")(country_name.asInstanceOf[js.Any])
    if (!js.isUndefined(county_taxes)) __obj.updateDynamic("county_taxes")(county_taxes.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (customer_email != null) __obj.updateDynamic("customer_email")(customer_email.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (display_plan_name != null) __obj.updateDynamic("display_plan_name")(display_plan_name.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(force_ssl)) __obj.updateDynamic("force_ssl")(force_ssl.asInstanceOf[js.Any])
    if (google_apps_domain != null) __obj.updateDynamic("google_apps_domain")(google_apps_domain.asInstanceOf[js.Any])
    if (!js.isUndefined(google_apps_login_enabled)) __obj.updateDynamic("google_apps_login_enabled")(google_apps_login_enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(has_discounts)) __obj.updateDynamic("has_discounts")(has_discounts.asInstanceOf[js.Any])
    if (!js.isUndefined(has_gift_cards)) __obj.updateDynamic("has_gift_cards")(has_gift_cards.asInstanceOf[js.Any])
    if (!js.isUndefined(has_storefront)) __obj.updateDynamic("has_storefront")(has_storefront.asInstanceOf[js.Any])
    if (iana_timezone != null) __obj.updateDynamic("iana_timezone")(iana_timezone.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (money_format != null) __obj.updateDynamic("money_format")(money_format.asInstanceOf[js.Any])
    if (money_with_currency_format != null) __obj.updateDynamic("money_with_currency_format")(money_with_currency_format.asInstanceOf[js.Any])
    if (myshopify_domain != null) __obj.updateDynamic("myshopify_domain")(myshopify_domain.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(password_enabled)) __obj.updateDynamic("password_enabled")(password_enabled.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (plan_name != null) __obj.updateDynamic("plan_name")(plan_name.asInstanceOf[js.Any])
    if (primary_locale != null) __obj.updateDynamic("primary_locale")(primary_locale.asInstanceOf[js.Any])
    if (province != null) __obj.updateDynamic("province")(province.asInstanceOf[js.Any])
    if (province_code != null) __obj.updateDynamic("province_code")(province_code.asInstanceOf[js.Any])
    if (!js.isUndefined(setup_required)) __obj.updateDynamic("setup_required")(setup_required.asInstanceOf[js.Any])
    if (ships_to_countries != null) __obj.updateDynamic("ships_to_countries")(ships_to_countries.asInstanceOf[js.Any])
    if (shop_owner != null) __obj.updateDynamic("shop_owner")(shop_owner.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(tax_shipping)) __obj.updateDynamic("tax_shipping")(tax_shipping.asInstanceOf[js.Any])
    if (!js.isUndefined(taxes_included)) __obj.updateDynamic("taxes_included")(taxes_included.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (zip != null) __obj.updateDynamic("zip")(zip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shop]
  }
}

