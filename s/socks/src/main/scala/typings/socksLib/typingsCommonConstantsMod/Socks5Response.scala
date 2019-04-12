package typings
package socksLib.typingsCommonConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Socks5Response extends js.Object

@JSImport("socks/typings/common/constants", "Socks5Response")
@js.native
object Socks5Response extends js.Object {
  @js.native
  sealed trait AddressNotSupported
    extends socksLib.typingsCommonConstantsMod.Socks5Response
  
  @js.native
  sealed trait CommandNotSupported
    extends socksLib.typingsCommonConstantsMod.Socks5Response
  
  @js.native
  sealed trait ConnectionRefused
    extends socksLib.typingsCommonConstantsMod.Socks5Response
  
  @js.native
  sealed trait Failure
    extends socksLib.typingsCommonConstantsMod.Socks5Response
  
  @js.native
  sealed trait Granted
    extends socksLib.typingsCommonConstantsMod.Socks5Response
  
  @js.native
  sealed trait HostUnreachable
    extends socksLib.typingsCommonConstantsMod.Socks5Response
  
  @js.native
  sealed trait NetworkUnreachable
    extends socksLib.typingsCommonConstantsMod.Socks5Response
  
  @js.native
  sealed trait NotAllowed
    extends socksLib.typingsCommonConstantsMod.Socks5Response
  
  @js.native
  sealed trait TTLExpired
    extends socksLib.typingsCommonConstantsMod.Socks5Response
  
  /* 8 */ val AddressNotSupported: AddressNotSupported with scala.Double = js.native
  /* 7 */ val CommandNotSupported: CommandNotSupported with scala.Double = js.native
  /* 5 */ val ConnectionRefused: ConnectionRefused with scala.Double = js.native
  /* 1 */ val Failure: Failure with scala.Double = js.native
  /* 0 */ val Granted: Granted with scala.Double = js.native
  /* 4 */ val HostUnreachable: HostUnreachable with scala.Double = js.native
  /* 3 */ val NetworkUnreachable: NetworkUnreachable with scala.Double = js.native
  /* 2 */ val NotAllowed: NotAllowed with scala.Double = js.native
  /* 6 */ val TTLExpired: TTLExpired with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[socksLib.typingsCommonConstantsMod.Socks5Response with scala.Double] = js.native
}

