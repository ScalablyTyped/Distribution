package typings.socks.typingsCommonConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Socks5HostType extends StObject
@JSImport("socks/typings/common/constants", "Socks5HostType")
@js.native
object Socks5HostType extends StObject {
  
  @js.native
  sealed trait Hostname
    extends StObject
       with Socks5HostType
  
  @js.native
  sealed trait IPv4
    extends StObject
       with Socks5HostType
  
  @js.native
  sealed trait IPv6
    extends StObject
       with Socks5HostType
}
