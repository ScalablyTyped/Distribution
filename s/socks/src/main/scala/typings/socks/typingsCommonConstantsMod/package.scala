package typings.socks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typingsCommonConstantsMod {
  import typings.socks.Anon_Host
  import typings.socks.socksStrings.host
  import typings.socks.socksStrings.ipaddress
  import typings.socks.typingsCommonUtilMod.RequireOnlyOne

  type SocksClientBoundEvent = SocksClientEstablishedEvent
  /**
    * Represents a SocksProxy
    */
  type SocksProxy = RequireOnlyOne[Anon_Host, host | ipaddress]
}
