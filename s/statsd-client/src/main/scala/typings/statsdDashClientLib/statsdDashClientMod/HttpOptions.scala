package typings
package statsdDashClientLib.statsdDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpOptions extends CommonOptions {
  /**
    * Additional headers to send (default {}).
    */
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * Where to send the stats (default localhost).
    */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
    * What HTTP method to use (default "PUT").
    */
  var method: js.UndefOr[java.lang.String] = js.undefined
}

object HttpOptions {
  @scala.inline
  def apply(
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    host: java.lang.String = null,
    method: java.lang.String = null,
    prefix: java.lang.String = null,
    socketTimeout: scala.Int | scala.Double = null,
    tags: Tags = null,
    tcp: js.UndefOr[scala.Boolean] = js.undefined
  ): HttpOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (host != null) __obj.updateDynamic("host")(host)
    if (method != null) __obj.updateDynamic("method")(method)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (socketTimeout != null) __obj.updateDynamic("socketTimeout")(socketTimeout.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (!js.isUndefined(tcp)) __obj.updateDynamic("tcp")(tcp)
    __obj.asInstanceOf[HttpOptions]
  }
}

