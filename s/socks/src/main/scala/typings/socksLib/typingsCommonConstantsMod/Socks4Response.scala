package typings
package socksLib.typingsCommonConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Socks4Response extends js.Object

@JSImport("socks/typings/common/constants", "Socks4Response")
@js.native
object Socks4Response extends js.Object {
  @js.native
  sealed trait Failed
    extends socksLib.typingsCommonConstantsMod.Socks4Response
  
  @js.native
  sealed trait Granted
    extends socksLib.typingsCommonConstantsMod.Socks4Response
  
  @js.native
  sealed trait Rejected
    extends socksLib.typingsCommonConstantsMod.Socks4Response
  
  @js.native
  sealed trait RejectedIdent
    extends socksLib.typingsCommonConstantsMod.Socks4Response
  
  /* 91 */ val Failed: Failed with scala.Double = js.native
  /* 90 */ val Granted: Granted with scala.Double = js.native
  /* 92 */ val Rejected: Rejected with scala.Double = js.native
  /* 93 */ val RejectedIdent: RejectedIdent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[socksLib.typingsCommonConstantsMod.Socks4Response with scala.Double] = js.native
}

