package typings.socks.typingsCommonConstantsMod

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
  
  /* 91 */ val Failed: typings.socks.typingsCommonConstantsMod.Socks4Response.Failed with Double = js.native
  /* 90 */ val Granted: typings.socks.typingsCommonConstantsMod.Socks4Response.Granted with Double = js.native
  /* 92 */ val Rejected: typings.socks.typingsCommonConstantsMod.Socks4Response.Rejected with Double = js.native
  /* 93 */ val RejectedIdent: typings.socks.typingsCommonConstantsMod.Socks4Response.RejectedIdent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Socks4Response with Double] = js.native
}

