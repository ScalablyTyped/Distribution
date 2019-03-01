package typings
package shopifyDashPrimeLib.distModelsClientUnderscoreDetailsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientDetails
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
    * Shopify does not offer documentation for this field.
    */
  var accept_language: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  The browser screen height in pixels, if available.
    */
  var browser_height: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  The browser IP address.
    */
  var browser_ip: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  The browser screen width in pixels, if available.
    */
  var browser_width: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  A hash of the session.
    */
  var session_height: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  The browser's user agent string.
    */
  var user_agent: js.UndefOr[java.lang.String] = js.undefined
}

object ClientDetails {
  @scala.inline
  def apply(
    accept_language: java.lang.String = null,
    admin_graphql_api_id: java.lang.String = null,
    browser_height: java.lang.String = null,
    browser_ip: java.lang.String = null,
    browser_width: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    session_height: java.lang.String = null,
    user_agent: java.lang.String = null
  ): ClientDetails = {
    val __obj = js.Dynamic.literal()
    if (accept_language != null) __obj.updateDynamic("accept_language")(accept_language)
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (browser_height != null) __obj.updateDynamic("browser_height")(browser_height)
    if (browser_ip != null) __obj.updateDynamic("browser_ip")(browser_ip)
    if (browser_width != null) __obj.updateDynamic("browser_width")(browser_width)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (session_height != null) __obj.updateDynamic("session_height")(session_height)
    if (user_agent != null) __obj.updateDynamic("user_agent")(user_agent)
    __obj.asInstanceOf[ClientDetails]
  }
}

