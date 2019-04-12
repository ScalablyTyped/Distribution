package typings
package socksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HostNameLength extends js.Object {
  var Socks4Response: scala.Double
  var Socks5InitialHandshakeResponse: scala.Double
  var Socks5ResponseHeader: scala.Double
  var Socks5ResponseIPv4: scala.Double
  var Socks5ResponseIPv6: scala.Double
  var Socks5UserPassAuthenticationResponse: scala.Double
  def Socks5ResponseHostname(hostNameLength: scala.Double): scala.Double
}

object Anon_HostNameLength {
  @scala.inline
  def apply(
    Socks4Response: scala.Double,
    Socks5InitialHandshakeResponse: scala.Double,
    Socks5ResponseHeader: scala.Double,
    Socks5ResponseHostname: scala.Double => scala.Double,
    Socks5ResponseIPv4: scala.Double,
    Socks5ResponseIPv6: scala.Double,
    Socks5UserPassAuthenticationResponse: scala.Double
  ): Anon_HostNameLength = {
    val __obj = js.Dynamic.literal(Socks4Response = Socks4Response, Socks5InitialHandshakeResponse = Socks5InitialHandshakeResponse, Socks5ResponseHeader = Socks5ResponseHeader, Socks5ResponseHostname = js.Any.fromFunction1(Socks5ResponseHostname), Socks5ResponseIPv4 = Socks5ResponseIPv4, Socks5ResponseIPv6 = Socks5ResponseIPv6, Socks5UserPassAuthenticationResponse = Socks5UserPassAuthenticationResponse)
  
    __obj.asInstanceOf[Anon_HostNameLength]
  }
}

