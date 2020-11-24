package typings.socks.constantsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Socks5Response extends js.Object
@JSImport("socks/typings/common/constants", "Socks5Response")
@js.native
object Socks5Response extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Socks5Response with Double] = js.native
  
  @js.native
  sealed trait AddressNotSupported extends Socks5Response
  /* 8 */ @js.native
  object AddressNotSupported extends TopLevel[AddressNotSupported with Double]
  
  @js.native
  sealed trait CommandNotSupported extends Socks5Response
  /* 7 */ @js.native
  object CommandNotSupported extends TopLevel[CommandNotSupported with Double]
  
  @js.native
  sealed trait ConnectionRefused extends Socks5Response
  /* 5 */ @js.native
  object ConnectionRefused extends TopLevel[ConnectionRefused with Double]
  
  @js.native
  sealed trait Failure extends Socks5Response
  /* 1 */ @js.native
  object Failure extends TopLevel[Failure with Double]
  
  @js.native
  sealed trait Granted extends Socks5Response
  /* 0 */ @js.native
  object Granted extends TopLevel[Granted with Double]
  
  @js.native
  sealed trait HostUnreachable extends Socks5Response
  /* 4 */ @js.native
  object HostUnreachable extends TopLevel[HostUnreachable with Double]
  
  @js.native
  sealed trait NetworkUnreachable extends Socks5Response
  /* 3 */ @js.native
  object NetworkUnreachable extends TopLevel[NetworkUnreachable with Double]
  
  @js.native
  sealed trait NotAllowed extends Socks5Response
  /* 2 */ @js.native
  object NotAllowed extends TopLevel[NotAllowed with Double]
  
  @js.native
  sealed trait TTLExpired extends Socks5Response
  /* 6 */ @js.native
  object TTLExpired extends TopLevel[TTLExpired with Double]
}
