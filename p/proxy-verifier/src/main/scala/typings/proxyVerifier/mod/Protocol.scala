package typings.proxyVerifier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.proxyVerifier.proxyVerifierStrings.http
  - typings.proxyVerifier.proxyVerifierStrings.https
  - typings.proxyVerifier.proxyVerifierStrings.socks5
  - typings.proxyVerifier.proxyVerifierStrings.socks4
*/
trait Protocol extends js.Object

object Protocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def http: typings.proxyVerifier.proxyVerifierStrings.http = this.cast("http")
  @scala.inline
  def https: typings.proxyVerifier.proxyVerifierStrings.https = this.cast("https")
  @scala.inline
  def socks4: typings.proxyVerifier.proxyVerifierStrings.socks4 = this.cast("socks4")
  @scala.inline
  def socks5: typings.proxyVerifier.proxyVerifierStrings.socks5 = this.cast("socks5")
}

