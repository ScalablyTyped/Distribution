package typings.statsdDashClient.statsdDashClientMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpOptions extends CommonOptions {
  /**
    * Additional headers to send (default {}).
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Where to send the stats (default localhost).
    */
  var host: js.UndefOr[String] = js.undefined
  /**
    * What HTTP method to use (default "PUT").
    */
  var method: js.UndefOr[String] = js.undefined
}

object HttpOptions {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    headers: StringDictionary[String] = null,
    host: String = null,
    method: String = null,
    prefix: String = null,
    socketTimeout: Int | Double = null,
    tags: Tags = null,
    tcp: js.UndefOr[Boolean] = js.undefined
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

