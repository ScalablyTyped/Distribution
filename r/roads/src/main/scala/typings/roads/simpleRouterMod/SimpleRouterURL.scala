package typings.roads.simpleRouterMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.querystringMod.ParsedUrlQuery
import typings.node.urlMod.UrlWithParsedQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleRouterURL extends UrlWithParsedQuery {
  var args: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object SimpleRouterURL {
  @scala.inline
  def apply(
    href: String,
    query: ParsedUrlQuery,
    args: StringDictionary[js.Any] = null,
    auth: String = null,
    hash: String = null,
    host: String = null,
    hostname: String = null,
    path: String = null,
    pathname: String = null,
    port: String = null,
    protocol: String = null,
    search: String = null,
    slashes: Boolean = null.asInstanceOf[Boolean]
  ): SimpleRouterURL = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], auth = auth.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], slashes = slashes.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleRouterURL]
  }
}

