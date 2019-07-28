package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLHyperlinkElementUtils extends js.Object {
  var hash: java.lang.String
  var host: java.lang.String
  var hostname: java.lang.String
  var href: java.lang.String
  val origin: java.lang.String
  var password: java.lang.String
  var pathname: java.lang.String
  var port: java.lang.String
  var protocol: java.lang.String
  var search: java.lang.String
  var username: java.lang.String
}

object HTMLHyperlinkElementUtils {
  @scala.inline
  def apply(
    hash: java.lang.String,
    host: java.lang.String,
    hostname: java.lang.String,
    href: java.lang.String,
    origin: java.lang.String,
    password: java.lang.String,
    pathname: java.lang.String,
    port: java.lang.String,
    protocol: java.lang.String,
    search: java.lang.String,
    username: java.lang.String
  ): HTMLHyperlinkElementUtils = {
    val __obj = js.Dynamic.literal(hash = hash, host = host, hostname = hostname, href = href, origin = origin, password = password, pathname = pathname, port = port, protocol = protocol, search = search, username = username)
  
    __obj.asInstanceOf[HTMLHyperlinkElementUtils]
  }
}

