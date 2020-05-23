package typings.restify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectOptions extends js.Object {
  /**
    * redirect location's hostname
    */
  var hostname: js.UndefOr[String] = js.undefined
  /**
    * if true, `options.query`
    * stomps over any existing query
    * parameters on current URL.
    * by default, will merge the two.
    */
  var overrideQuery: js.UndefOr[Boolean] = js.undefined
  /**
    * redirect location's pathname
    */
  var pathname: js.UndefOr[String] = js.undefined
  /**
    * if true, sets 301. defaults to 302.
    */
  var permanent: js.UndefOr[Boolean] = js.undefined
  /**
    * redirect location's port number
    */
  var port: js.UndefOr[String] = js.undefined
  /**
    * redirect location's query string parameters
    */
  var query: js.UndefOr[String | js.Object] = js.undefined
  /**
    * whether to redirect to http or https
    */
  var secure: js.UndefOr[Boolean] = js.undefined
}

object RedirectOptions {
  @scala.inline
  def apply(
    hostname: String = null,
    overrideQuery: js.UndefOr[Boolean] = js.undefined,
    pathname: String = null,
    permanent: js.UndefOr[Boolean] = js.undefined,
    port: String = null,
    query: String | js.Object = null,
    secure: js.UndefOr[Boolean] = js.undefined
  ): RedirectOptions = {
    val __obj = js.Dynamic.literal()
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideQuery)) __obj.updateDynamic("overrideQuery")(overrideQuery.get.asInstanceOf[js.Any])
    if (pathname != null) __obj.updateDynamic("pathname")(pathname.asInstanceOf[js.Any])
    if (!js.isUndefined(permanent)) __obj.updateDynamic("permanent")(permanent.get.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectOptions]
  }
}

