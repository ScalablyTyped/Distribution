package typings
package restifyDashCorsDashMiddlewareLib.restifyDashCorsDashMiddlewareMod.corsMiddlewareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /** user defined headers to allow */
  var allowHeaders: js.Array[java.lang.String]
  /** if true, uses creds */
  var credentials: js.UndefOr[scala.Boolean] = js.undefined
  /** user defined headers to expose */
  var exposeHeaders: js.Array[java.lang.String]
  /**
       * an array of whitelisted origins
       * can be both strings and regular expressions
       */
  var origins: js.Array[java.lang.String | stdLib.RegExp]
  /** ms to cache preflight requests */
  var preflightMaxAge: js.UndefOr[scala.Double] = js.undefined
  /** customize preflight request handling */
  var preflightStrategy: js.UndefOr[js.Any] = js.undefined
}

