package typings.socks.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Socks5Response extends StObject
@JSImport("socks/typings/common/constants", "Socks5Response")
@js.native
object Socks5Response extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Socks5Response & Double] = js.native
  
  @js.native
  sealed trait AddressNotSupported
    extends StObject
       with Socks5Response
  /* 8 */ val AddressNotSupported: typings.socks.constantsMod.Socks5Response.AddressNotSupported & Double = js.native
  
  @js.native
  sealed trait CommandNotSupported
    extends StObject
       with Socks5Response
  /* 7 */ val CommandNotSupported: typings.socks.constantsMod.Socks5Response.CommandNotSupported & Double = js.native
  
  @js.native
  sealed trait ConnectionRefused
    extends StObject
       with Socks5Response
  /* 5 */ val ConnectionRefused: typings.socks.constantsMod.Socks5Response.ConnectionRefused & Double = js.native
  
  @js.native
  sealed trait Failure
    extends StObject
       with Socks5Response
  /* 1 */ val Failure: typings.socks.constantsMod.Socks5Response.Failure & Double = js.native
  
  @js.native
  sealed trait Granted
    extends StObject
       with Socks5Response
  /* 0 */ val Granted: typings.socks.constantsMod.Socks5Response.Granted & Double = js.native
  
  @js.native
  sealed trait HostUnreachable
    extends StObject
       with Socks5Response
  /* 4 */ val HostUnreachable: typings.socks.constantsMod.Socks5Response.HostUnreachable & Double = js.native
  
  @js.native
  sealed trait NetworkUnreachable
    extends StObject
       with Socks5Response
  /* 3 */ val NetworkUnreachable: typings.socks.constantsMod.Socks5Response.NetworkUnreachable & Double = js.native
  
  @js.native
  sealed trait NotAllowed
    extends StObject
       with Socks5Response
  /* 2 */ val NotAllowed: typings.socks.constantsMod.Socks5Response.NotAllowed & Double = js.native
  
  @js.native
  sealed trait TTLExpired
    extends StObject
       with Socks5Response
  /* 6 */ val TTLExpired: typings.socks.constantsMod.Socks5Response.TTLExpired & Double = js.native
}
