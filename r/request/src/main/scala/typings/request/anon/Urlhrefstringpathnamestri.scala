package typings.request.anon

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
    slashes: Boolean = null.asInstanceOf[Boolean]
  ): Urlhrefstringpathnamestri = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], auth = auth.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], slashes = slashes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Urlhrefstringpathnamestri]
  }
}

