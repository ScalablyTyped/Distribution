package typings.proxyDashLists.proxyDashListsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.proxyDashLists.proxyDashListsStrings.http
  - typings.proxyDashLists.proxyDashListsStrings.https
  - typings.proxyDashLists.proxyDashListsStrings.socks5
  - typings.proxyDashLists.proxyDashListsStrings.socks4
*/
trait Protocol extends js.Object

object Protocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def http: typings.proxyDashLists.proxyDashListsStrings.http = this.cast("http")
  @scala.inline
  def https: typings.proxyDashLists.proxyDashListsStrings.https = this.cast("https")
  @scala.inline
  def socks4: typings.proxyDashLists.proxyDashListsStrings.socks4 = this.cast("socks4")
  @scala.inline
  def socks5: typings.proxyDashLists.proxyDashListsStrings.socks5 = this.cast("socks5")
}

