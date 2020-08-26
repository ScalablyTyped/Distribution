package typings.shopifyPrime.shopMod

import typings.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shop extends ShopifyObject {
  /**
    * The shop's street address.
    */
  var address1: js.UndefOr[String] = js.native
  /**
    * The second line of the shop's street address.
    */
  var address2: js.UndefOr[String] = js.native
  /**
    * The city in which the shop is located.
    */
  var city: js.UndefOr[String] = js.native
  /**
    * The shop's country (by default equal to the two-letter country code).
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The two-letter country code corresponding to the shop's country.
    */
  var country_code: js.UndefOr[String] = js.native
  /**
    * The shop's normalized country name.
    */
  var country_name: js.UndefOr[String] = js.native
  /**
    * The setting for whether the shop is applying taxes on a per-county basis or not (US-only). Valid values are: "true" or "null."
    */
  var county_taxes: js.UndefOr[Boolean] = js.native
  /**
    * The date and time when the shop was created.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * The three-letter code for the currency that the shop accepts.
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * The customer's email.
    */
  var customer_email: js.UndefOr[String] = js.native
  /**
    * The shop's description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The display name of the Shopify plan the shop is on.
    */
  var display_plan_name: js.UndefOr[String] = js.native
  /**
    * The shop's domain.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * The contact email address for the shop.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Indicates whether the shop forces requests made to its resources to be made over SSL, using the HTTPS protocol. If true, HTTP requests will be redirected to HTTPS.
    */
  var force_ssl: js.UndefOr[Boolean] = js.native
  /**
    * Present when a shop has a google app domain. It will be returned as a URL, else null.
    */
  var google_apps_domain: js.UndefOr[String] = js.native
  /**
    * Present if a shop has google apps enabled. Those shops with this feature will be able to login to the google apps login.
    */
  var google_apps_login_enabled: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the shop supports the Discounts api
    */
  var has_discounts: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the shop supports the Gift Cards api
    */
  var has_gift_cards: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the shop has web-based storefront or not.
    */
  var has_storefront: js.UndefOr[Boolean] = js.native
  /**
    * The named timezone assigned by the IANA.
    */
  var iana_timezone: js.UndefOr[String] = js.native
  /**
    * Geographic coordinate specifying the north/south location of a shop.
    */
  var latitude: js.UndefOr[String] = js.native
  /**
    * Geographic coordinate specifying the east/west location of a shop.
    */
  var longitude: js.UndefOr[String] = js.native
  /**
    * A string representing the way currency is formatted when the currency isn't specified.
    */
  var money_format: js.UndefOr[String] = js.native
  /**
    * A string representing the way currency is formatted when the currency is specified.
    */
  var money_with_currency_format: js.UndefOr[String] = js.native
  /**
    * The shop's 'myshopify.com' domain.
    */
  var myshopify_domain: js.UndefOr[String] = js.native
  /**
    * The name of the shop.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Indicates whether the Storefront password protection is enabled.
    */
  var password_enabled: js.UndefOr[Boolean] = js.native
  /**
    * The contact phone number for the shop.
    */
  var phone: js.UndefOr[String] = js.native
  /**
    * The name of the Shopify plan the shop is on.
    */
  var plan_name: js.UndefOr[String] = js.native
  /**
    * The shop's primary locale.
    */
  var primary_locale: js.UndefOr[String] = js.native
  /**
    * The shop's normalized province or state name.
    */
  var province: js.UndefOr[String] = js.native
  /**
    * The two-letter code for the shop's province or state.
    */
  var province_code: js.UndefOr[String] = js.native
  /**
    * Indicates whether the shop has any outstanding setup steps or not.
    */
  var setup_required: js.UndefOr[Boolean] = js.native
  /**
    * A list of countries the shop ships products to, separated by a comma.
    */
  var ships_to_countries: js.UndefOr[String] = js.native
  /**
    * The username of the shop owner.
    */
  var shop_owner: js.UndefOr[String] = js.native
  /**
    * Unkown. Shopify documentation does not currently indicate what this property actually is.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * Specifies whether or not taxes were charged for shipping. Although the Shopify docs don't indicate this, it's possible for the value to be null.
    */
  var tax_shipping: js.UndefOr[Boolean] = js.native
  /**
    * The setting for whether applicable taxes are included in product prices.
    */
  var taxes_included: js.UndefOr[Boolean] = js.native
  /**
    * The name of the timezone the shop is in.
    */
  var timezone: js.UndefOr[String] = js.native
  /**
    * The zip or postal code of the shop's address.
    */
  var zip: js.UndefOr[String] = js.native
}

object Shop {
  @scala.inline
  def apply(): Shop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shop]
  }
  @scala.inline
  implicit class ShopOps[Self <: Shop] (val x: Self) extends AnyVal {
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
    def setAddress1(value: String): Self = this.set("address1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress1: Self = this.set("address1", js.undefined)
    @scala.inline
    def setAddress2(value: String): Self = this.set("address2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress2: Self = this.set("address2", js.undefined)
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setCountry_code(value: String): Self = this.set("country_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry_code: Self = this.set("country_code", js.undefined)
    @scala.inline
    def setCountry_name(value: String): Self = this.set("country_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry_name: Self = this.set("country_name", js.undefined)
    @scala.inline
    def setCounty_taxes(value: Boolean): Self = this.set("county_taxes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCounty_taxes: Self = this.set("county_taxes", js.undefined)
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setCustomer_email(value: String): Self = this.set("customer_email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomer_email: Self = this.set("customer_email", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisplay_plan_name(value: String): Self = this.set("display_plan_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay_plan_name: Self = this.set("display_plan_name", js.undefined)
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setForce_ssl(value: Boolean): Self = this.set("force_ssl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce_ssl: Self = this.set("force_ssl", js.undefined)
    @scala.inline
    def setGoogle_apps_domain(value: String): Self = this.set("google_apps_domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoogle_apps_domain: Self = this.set("google_apps_domain", js.undefined)
    @scala.inline
    def setGoogle_apps_login_enabled(value: Boolean): Self = this.set("google_apps_login_enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoogle_apps_login_enabled: Self = this.set("google_apps_login_enabled", js.undefined)
    @scala.inline
    def setHas_discounts(value: Boolean): Self = this.set("has_discounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHas_discounts: Self = this.set("has_discounts", js.undefined)
    @scala.inline
    def setHas_gift_cards(value: Boolean): Self = this.set("has_gift_cards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHas_gift_cards: Self = this.set("has_gift_cards", js.undefined)
    @scala.inline
    def setHas_storefront(value: Boolean): Self = this.set("has_storefront", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHas_storefront: Self = this.set("has_storefront", js.undefined)
    @scala.inline
    def setIana_timezone(value: String): Self = this.set("iana_timezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIana_timezone: Self = this.set("iana_timezone", js.undefined)
    @scala.inline
    def setLatitude(value: String): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    @scala.inline
    def setLongitude(value: String): Self = this.set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
    @scala.inline
    def setMoney_format(value: String): Self = this.set("money_format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoney_format: Self = this.set("money_format", js.undefined)
    @scala.inline
    def setMoney_with_currency_format(value: String): Self = this.set("money_with_currency_format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoney_with_currency_format: Self = this.set("money_with_currency_format", js.undefined)
    @scala.inline
    def setMyshopify_domain(value: String): Self = this.set("myshopify_domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMyshopify_domain: Self = this.set("myshopify_domain", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPassword_enabled(value: Boolean): Self = this.set("password_enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword_enabled: Self = this.set("password_enabled", js.undefined)
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    @scala.inline
    def setPlan_name(value: String): Self = this.set("plan_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlan_name: Self = this.set("plan_name", js.undefined)
    @scala.inline
    def setPrimary_locale(value: String): Self = this.set("primary_locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary_locale: Self = this.set("primary_locale", js.undefined)
    @scala.inline
    def setProvince(value: String): Self = this.set("province", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvince: Self = this.set("province", js.undefined)
    @scala.inline
    def setProvince_code(value: String): Self = this.set("province_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvince_code: Self = this.set("province_code", js.undefined)
    @scala.inline
    def setSetup_required(value: Boolean): Self = this.set("setup_required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetup_required: Self = this.set("setup_required", js.undefined)
    @scala.inline
    def setShips_to_countries(value: String): Self = this.set("ships_to_countries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShips_to_countries: Self = this.set("ships_to_countries", js.undefined)
    @scala.inline
    def setShop_owner(value: String): Self = this.set("shop_owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShop_owner: Self = this.set("shop_owner", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setTax_shipping(value: Boolean): Self = this.set("tax_shipping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTax_shipping: Self = this.set("tax_shipping", js.undefined)
    @scala.inline
    def setTaxes_included(value: Boolean): Self = this.set("taxes_included", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaxes_included: Self = this.set("taxes_included", js.undefined)
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
    @scala.inline
    def setZip(value: String): Self = this.set("zip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZip: Self = this.set("zip", js.undefined)
  }
  
}

