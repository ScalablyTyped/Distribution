package typings.socks.constantsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Socks5HostType extends js.Object

@JSImport("socks/typings/common/constants", "Socks5HostType")
@js.native
object Socks5HostType extends js.Object {
  @js.native
  sealed trait Hostname extends Socks5HostType
  
  @js.native
  sealed trait IPv4 extends Socks5HostType
  
  @js.native
  sealed trait IPv6 extends Socks5HostType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Socks5HostType with Double] = js.native
  /* 3 */ @js.native
  object Hostname extends TopLevel[Hostname with Double]
  
  /* 1 */ @js.native
  object IPv4 extends TopLevel[IPv4 with Double]
  
  /* 4 */ @js.native
  object IPv6 extends TopLevel[IPv6 with Double]
  
}

