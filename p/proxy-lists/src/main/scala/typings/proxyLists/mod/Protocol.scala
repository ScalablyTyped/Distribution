package typings.proxyLists.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.proxyLists.proxyListsStrings.http
  - typings.proxyLists.proxyListsStrings.https
  - typings.proxyLists.proxyListsStrings.socks5
  - typings.proxyLists.proxyListsStrings.socks4
*/
trait Protocol extends js.Object

object Protocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def http: typings.proxyLists.proxyListsStrings.http = this.cast("http")
  @scala.inline
  def https: typings.proxyLists.proxyListsStrings.https = this.cast("https")
  @scala.inline
  def socks4: typings.proxyLists.proxyListsStrings.socks4 = this.cast("socks4")
  @scala.inline
  def socks5: typings.proxyLists.proxyListsStrings.socks5 = this.cast("socks5")
}

