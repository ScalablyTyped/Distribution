package typings
package restifyLib.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectOptions extends js.Object {
  /**
    * redirect location's hostname
    */
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  /**
    * if true, `options.query`
    * stomps over any existing query
    * parameters on current URL.
    * by default, will merge the two.
    */
  var overrideQuery: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * redirect location's pathname
    */
  var pathname: js.UndefOr[java.lang.String] = js.undefined
  /**
    * if true, sets 301. defaults to 302.
    */
  var permanent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * redirect location's port number
    */
  var port: js.UndefOr[java.lang.String] = js.undefined
  /**
    * redirect location's query string parameters
    */
  var query: js.UndefOr[java.lang.String | js.Object] = js.undefined
  /**
    * whether to redirect to http or https
    */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
}

object RedirectOptions {
  @scala.inline
  def apply(
    hostname: java.lang.String = null,
    overrideQuery: js.UndefOr[scala.Boolean] = js.undefined,
    pathname: java.lang.String = null,
    permanent: js.UndefOr[scala.Boolean] = js.undefined,
    port: java.lang.String = null,
    query: java.lang.String | js.Object = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined
  ): RedirectOptions = {
    val __obj = js.Dynamic.literal()
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (!js.isUndefined(overrideQuery)) __obj.updateDynamic("overrideQuery")(overrideQuery)
    if (pathname != null) __obj.updateDynamic("pathname")(pathname)
    if (!js.isUndefined(permanent)) __obj.updateDynamic("permanent")(permanent)
    if (port != null) __obj.updateDynamic("port")(port)
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[RedirectOptions]
  }
}

