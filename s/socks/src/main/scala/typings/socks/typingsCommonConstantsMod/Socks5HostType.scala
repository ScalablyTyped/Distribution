package typings.socks.typingsCommonConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Socks5HostType extends StObject
@JSImport("socks/typings/common/constants", "Socks5HostType")
@js.native
object Socks5HostType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Socks5HostType & Double] = js.native
  
  @js.native
  sealed trait Hostname
    extends StObject
       with Socks5HostType
  /* 3 */ val Hostname: typings.socks.typingsCommonConstantsMod.Socks5HostType.Hostname & Double = js.native
  
  @js.native
  sealed trait IPv4
    extends StObject
       with Socks5HostType
  /* 1 */ val IPv4: typings.socks.typingsCommonConstantsMod.Socks5HostType.IPv4 & Double = js.native
  
  @js.native
  sealed trait IPv6
    extends StObject
       with Socks5HostType
  /* 4 */ val IPv6: typings.socks.typingsCommonConstantsMod.Socks5HostType.IPv6 & Double = js.native
}
