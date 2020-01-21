package typings.solutionCenterCommunicator.ScCommunicator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends js.Object {
  /**
    * Domain where to set a cookie in case it's needed for that environment
    */
  var DOMAIN: String
  /**
    * URL where to reach the GoodData service API
    */
  var GOODDATA_SERVICE: js.UndefOr[String] = js.undefined
  /**
    * URL where to reach the merchant management service API
    */
  var MERCHANT_SERVICE: js.UndefOr[String] = js.undefined
  /**
    * URL where to reach the module service API
    */
  var MODULE_SERVICE: js.UndefOr[String] = js.undefined
  /**
    * Name of the environment
    */
  var NAME: String
  /**
    * In case that the domain is localhost, a port can be also specified
    */
  var PORT: js.UndefOr[String] = js.undefined
  /**
    * URL where to reach the token management service API
    */
  var TOKEN_SERVICE: js.UndefOr[String] = js.undefined
  /**
    * URL where to reach the frontend of the environment
    */
  var URL: String
  /**
    * URL where to reach the user management service API
    */
  var USER_SERVICE: js.UndefOr[String] = js.undefined
  /**
    * URL where to reach the new user service API
    */
  var USER_SERVICE_NEW: js.UndefOr[String] = js.undefined
}

object Environment {
  @scala.inline
  def apply(
    DOMAIN: String,
    NAME: String,
    URL: String,
    GOODDATA_SERVICE: String = null,
    MERCHANT_SERVICE: String = null,
    MODULE_SERVICE: String = null,
    PORT: String = null,
    TOKEN_SERVICE: String = null,
    USER_SERVICE: String = null,
    USER_SERVICE_NEW: String = null
  ): Environment = {
    val __obj = js.Dynamic.literal(DOMAIN = DOMAIN.asInstanceOf[js.Any], NAME = NAME.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
    if (GOODDATA_SERVICE != null) __obj.updateDynamic("GOODDATA_SERVICE")(GOODDATA_SERVICE.asInstanceOf[js.Any])
    if (MERCHANT_SERVICE != null) __obj.updateDynamic("MERCHANT_SERVICE")(MERCHANT_SERVICE.asInstanceOf[js.Any])
    if (MODULE_SERVICE != null) __obj.updateDynamic("MODULE_SERVICE")(MODULE_SERVICE.asInstanceOf[js.Any])
    if (PORT != null) __obj.updateDynamic("PORT")(PORT.asInstanceOf[js.Any])
    if (TOKEN_SERVICE != null) __obj.updateDynamic("TOKEN_SERVICE")(TOKEN_SERVICE.asInstanceOf[js.Any])
    if (USER_SERVICE != null) __obj.updateDynamic("USER_SERVICE")(USER_SERVICE.asInstanceOf[js.Any])
    if (USER_SERVICE_NEW != null) __obj.updateDynamic("USER_SERVICE_NEW")(USER_SERVICE_NEW.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environment]
  }
}

