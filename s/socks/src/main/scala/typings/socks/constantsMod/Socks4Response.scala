package typings.socks.constantsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Socks4Response extends js.Object

@JSImport("socks/typings/common/constants", "Socks4Response")
@js.native
object Socks4Response extends js.Object {
  @js.native
  sealed trait Failed extends Socks4Response
  
  @js.native
  sealed trait Granted extends Socks4Response
  
  @js.native
  sealed trait Rejected extends Socks4Response
  
  @js.native
  sealed trait RejectedIdent extends Socks4Response
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Socks4Response with Double] = js.native
  /* 91 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  /* 90 */ @js.native
  object Granted extends TopLevel[Granted with Double]
  
  /* 92 */ @js.native
  object Rejected extends TopLevel[Rejected with Double]
  
  /* 93 */ @js.native
  object RejectedIdent extends TopLevel[RejectedIdent with Double]
  
}

