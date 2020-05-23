package typings.socks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object constantsMod {
  type SocksClientBoundEvent = typings.socks.constantsMod.SocksClientEstablishedEvent
  /**
    * Represents a SocksProxy
    */
  type SocksProxy = typings.socks.utilMod.RequireOnlyOne[
    typings.socks.anon.Host, 
    typings.socks.socksStrings.host | typings.socks.socksStrings.ipaddress
  ]
}
