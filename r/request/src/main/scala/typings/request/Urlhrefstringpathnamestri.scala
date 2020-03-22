package typings.request

import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined node.url.Url & {  href  :string,   pathname  :string} */
trait Urlhrefstringpathnamestri extends js.Object {
  var auth: String | Null
  var hash: String | Null
  var host: String | Null
  var hostname: String | Null
  var href: String
  var path: String | Null
  var pathname: (String | Null) with String
  var port: String | Null
  var protocol: String | Null
  var query: String | Null | ParsedUrlQuery
  var search: String | Null
  var slashes: Boolean | Null
}

object Urlhrefstringpathnamestri {
  @scala.inline
  def apply(
    href: String,
    pathname: (String | Null) with String,
    auth: String = null,
    hash: String = null,
    host: String = null,
    hostname: String = null,
    path: String = null,
    port: String = null,
    protocol: String = null,
    query: String | ParsedUrlQuery = null,
    search: String = null,
    slashes: js.UndefOr[Boolean] = js.undefined
  ): Urlhrefstringpathnamestri = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (!js.isUndefined(slashes)) __obj.updateDynamic("slashes")(slashes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Urlhrefstringpathnamestri]
  }
}

