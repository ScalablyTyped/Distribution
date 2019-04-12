package typings
package socksLib.typingsCommonConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Socks5HostType extends js.Object

@JSImport("socks/typings/common/constants", "Socks5HostType")
@js.native
object Socks5HostType extends js.Object {
  @js.native
  sealed trait Hostname
    extends socksLib.typingsCommonConstantsMod.Socks5HostType
  
  @js.native
  sealed trait IPv4
    extends socksLib.typingsCommonConstantsMod.Socks5HostType
  
  @js.native
  sealed trait IPv6
    extends socksLib.typingsCommonConstantsMod.Socks5HostType
  
  /* 3 */ val Hostname: Hostname with scala.Double = js.native
  /* 1 */ val IPv4: IPv4 with scala.Double = js.native
  /* 4 */ val IPv6: IPv6 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[socksLib.typingsCommonConstantsMod.Socks5HostType with scala.Double] = js.native
}

