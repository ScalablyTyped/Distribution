package typings
package atStorybookRouterLib.distRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var hash: java.lang.String
  var host: java.lang.String
  var hostname: java.lang.String
  var href: java.lang.String
  var key: java.lang.String
  var origin: java.lang.String
  var pathname: java.lang.String
  var port: java.lang.String
  var protocol: atStorybookRouterLib.atStorybookRouterLibStrings.`http:` | atStorybookRouterLib.atStorybookRouterLibStrings.`https:`
  var search: java.lang.String
  var state: atStorybookRouterLib.Anon_Key
  def assign(url: java.lang.String): scala.Unit
  def reload(): scala.Unit
  def replace(url: java.lang.String): scala.Unit
}

object Location {
  @scala.inline
  def apply(
    assign: java.lang.String => scala.Unit,
    hash: java.lang.String,
    host: java.lang.String,
    hostname: java.lang.String,
    href: java.lang.String,
    key: java.lang.String,
    origin: java.lang.String,
    pathname: java.lang.String,
    port: java.lang.String,
    protocol: atStorybookRouterLib.atStorybookRouterLibStrings.`http:` | atStorybookRouterLib.atStorybookRouterLibStrings.`https:`,
    reload: () => scala.Unit,
    replace: java.lang.String => scala.Unit,
    search: java.lang.String,
    state: atStorybookRouterLib.Anon_Key,
    toString: () => java.lang.String
  ): Location = {
    val __obj = js.Dynamic.literal(assign = js.Any.fromFunction1(assign), hash = hash, host = host, hostname = hostname, href = href, key = key, origin = origin, pathname = pathname, port = port, protocol = protocol.asInstanceOf[js.Any], reload = js.Any.fromFunction0(reload), replace = js.Any.fromFunction1(replace), search = search, state = state, toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[Location]
  }
}

