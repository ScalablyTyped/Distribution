package typings
package solutionDashCenterDashCommunicatorLib.ScCommunicatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends js.Object {
  /**
    * Domain where to set a cookie in case it's needed for that environment
    */
  var DOMAIN: java.lang.String
  /**
    * URL where to reach the GoodData service API
    */
  var GOODDATA_SERVICE: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL where to reach the merchant management service API
    */
  var MERCHANT_SERVICE: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL where to reach the module service API
    */
  var MODULE_SERVICE: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of the environment
    */
  var NAME: java.lang.String
  /**
    * In case that the domain is localhost, a port can be also specified
    */
  var PORT: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL where to reach the token management service API
    */
  var TOKEN_SERVICE: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL where to reach the frontend of the environment
    */
  var URL: java.lang.String
  /**
    * URL where to reach the user management service API
    */
  var USER_SERVICE: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL where to reach the new user service API
    */
  var USER_SERVICE_NEW: js.UndefOr[java.lang.String] = js.undefined
}

object Environment {
  @scala.inline
  def apply(
    DOMAIN: java.lang.String,
    NAME: java.lang.String,
    URL: java.lang.String,
    GOODDATA_SERVICE: java.lang.String = null,
    MERCHANT_SERVICE: java.lang.String = null,
    MODULE_SERVICE: java.lang.String = null,
    PORT: java.lang.String = null,
    TOKEN_SERVICE: java.lang.String = null,
    USER_SERVICE: java.lang.String = null,
    USER_SERVICE_NEW: java.lang.String = null
  ): Environment = {
    val __obj = js.Dynamic.literal(DOMAIN = DOMAIN, NAME = NAME, URL = URL)
    if (GOODDATA_SERVICE != null) __obj.updateDynamic("GOODDATA_SERVICE")(GOODDATA_SERVICE)
    if (MERCHANT_SERVICE != null) __obj.updateDynamic("MERCHANT_SERVICE")(MERCHANT_SERVICE)
    if (MODULE_SERVICE != null) __obj.updateDynamic("MODULE_SERVICE")(MODULE_SERVICE)
    if (PORT != null) __obj.updateDynamic("PORT")(PORT)
    if (TOKEN_SERVICE != null) __obj.updateDynamic("TOKEN_SERVICE")(TOKEN_SERVICE)
    if (USER_SERVICE != null) __obj.updateDynamic("USER_SERVICE")(USER_SERVICE)
    if (USER_SERVICE_NEW != null) __obj.updateDynamic("USER_SERVICE_NEW")(USER_SERVICE_NEW)
    __obj.asInstanceOf[Environment]
  }
}

