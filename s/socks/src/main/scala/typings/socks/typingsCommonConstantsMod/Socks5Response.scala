package typings.socks.typingsCommonConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Socks5Response extends StObject
@JSImport("socks/typings/common/constants", "Socks5Response")
@js.native
object Socks5Response extends StObject {
  
  @js.native
  sealed trait AddressNotSupported
    extends StObject
       with Socks5Response
  
  @js.native
  sealed trait CommandNotSupported
    extends StObject
       with Socks5Response
  
  @js.native
  sealed trait ConnectionRefused
    extends StObject
       with Socks5Response
  
  @js.native
  sealed trait Failure
    extends StObject
       with Socks5Response
  
  @js.native
  sealed trait Granted
    extends StObject
       with Socks5Response
  
  @js.native
  sealed trait HostUnreachable
    extends StObject
       with Socks5Response
  
  @js.native
  sealed trait NetworkUnreachable
    extends StObject
       with Socks5Response
  
  @js.native
  sealed trait NotAllowed
    extends StObject
       with Socks5Response
  
  @js.native
  sealed trait TTLExpired
    extends StObject
       with Socks5Response
}
