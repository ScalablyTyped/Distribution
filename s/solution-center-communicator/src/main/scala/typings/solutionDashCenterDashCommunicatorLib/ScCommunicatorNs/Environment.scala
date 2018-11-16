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

