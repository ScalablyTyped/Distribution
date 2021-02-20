package typings.socks.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Socks4Response extends StObject
@JSImport("socks/typings/common/constants", "Socks4Response")
@js.native
object Socks4Response extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Socks4Response with Double] = js.native
  
  @js.native
  sealed trait Failed extends Socks4Response
  /* 91 */ val Failed: typings.socks.constantsMod.Socks4Response.Failed with Double = js.native
  
  @js.native
  sealed trait Granted extends Socks4Response
  /* 90 */ val Granted: typings.socks.constantsMod.Socks4Response.Granted with Double = js.native
  
  @js.native
  sealed trait Rejected extends Socks4Response
  /* 92 */ val Rejected: typings.socks.constantsMod.Socks4Response.Rejected with Double = js.native
  
  @js.native
  sealed trait RejectedIdent extends Socks4Response
  /* 93 */ val RejectedIdent: typings.socks.constantsMod.Socks4Response.RejectedIdent with Double = js.native
}
