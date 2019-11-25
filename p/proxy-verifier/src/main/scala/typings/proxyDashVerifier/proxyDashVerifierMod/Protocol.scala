package typings.proxyDashVerifier.proxyDashVerifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.proxyDashVerifier.proxyDashVerifierStrings.http
  - typings.proxyDashVerifier.proxyDashVerifierStrings.https
  - typings.proxyDashVerifier.proxyDashVerifierStrings.socks5
  - typings.proxyDashVerifier.proxyDashVerifierStrings.socks4
*/
trait Protocol extends js.Object

object Protocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def http: typings.proxyDashVerifier.proxyDashVerifierStrings.http = this.cast("http")
  @scala.inline
  def https: typings.proxyDashVerifier.proxyDashVerifierStrings.https = this.cast("https")
  @scala.inline
  def socks4: typings.proxyDashVerifier.proxyDashVerifierStrings.socks4 = this.cast("socks4")
  @scala.inline
  def socks5: typings.proxyDashVerifier.proxyDashVerifierStrings.socks5 = this.cast("socks5")
}

