package typings.socks.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Socks4Response extends StObject
@JSImport("socks/typings/common/constants", "Socks4Response")
@js.native
object Socks4Response extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Socks4Response & Double] = js.native
  
  @js.native
  sealed trait Failed
    extends StObject
       with Socks4Response
  /* 91 */ val Failed: typings.socks.constantsMod.Socks4Response.Failed & Double = js.native
  
  @js.native
  sealed trait Granted
    extends StObject
       with Socks4Response
  /* 90 */ val Granted: typings.socks.constantsMod.Socks4Response.Granted & Double = js.native
  
  @js.native
  sealed trait Rejected
    extends StObject
       with Socks4Response
  /* 92 */ val Rejected: typings.socks.constantsMod.Socks4Response.Rejected & Double = js.native
  
  @js.native
  sealed trait RejectedIdent
    extends StObject
       with Socks4Response
  /* 93 */ val RejectedIdent: typings.socks.constantsMod.Socks4Response.RejectedIdent & Double = js.native
}
