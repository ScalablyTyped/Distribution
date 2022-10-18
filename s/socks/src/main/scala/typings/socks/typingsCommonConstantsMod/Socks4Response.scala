package typings.socks.typingsCommonConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Socks4Response extends StObject
@JSImport("socks/typings/common/constants", "Socks4Response")
@js.native
object Socks4Response extends StObject {
  
  @js.native
  sealed trait Failed
    extends StObject
       with Socks4Response
  
  @js.native
  sealed trait Granted
    extends StObject
       with Socks4Response
  
  @js.native
  sealed trait Rejected
    extends StObject
       with Socks4Response
  
  @js.native
  sealed trait RejectedIdent
    extends StObject
       with Socks4Response
}
