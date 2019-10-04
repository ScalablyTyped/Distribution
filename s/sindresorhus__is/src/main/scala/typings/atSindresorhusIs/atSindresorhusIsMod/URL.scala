package typings.atSindresorhusIs.atSindresorhusIsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URL extends js.Object {
  var hash: String
  var host: String
  var hostname: String
  var href: String
  val origin: String
  var password: String
  var pathname: String
  var port: String
  var protocol: String
  var search: String
  val searchParams: URLSearchParams
  var username: String
  def toJSON(): String
}

object URL {
  @scala.inline
  def apply(
    hash: String,
    host: String,
    hostname: String,
    href: String,
    origin: String,
    password: String,
    pathname: String,
    port: String,
    protocol: String,
    search: String,
    searchParams: URLSearchParams,
    toJSON: () => String,
    username: String
  ): URL = {
    val __obj = js.Dynamic.literal(hash = hash, host = host, hostname = hostname, href = href, origin = origin, password = password, pathname = pathname, port = port, protocol = protocol, search = search, searchParams = searchParams, toJSON = js.Any.fromFunction0(toJSON), username = username)
  
    __obj.asInstanceOf[URL]
  }
}

