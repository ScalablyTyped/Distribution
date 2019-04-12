package typings
package socksLib.typingsCommonConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocksCommand extends js.Object

@JSImport("socks/typings/common/constants", "SocksCommand")
@js.native
object SocksCommand extends js.Object {
  @js.native
  sealed trait associate
    extends socksLib.typingsCommonConstantsMod.SocksCommand
  
  @js.native
  sealed trait bind
    extends socksLib.typingsCommonConstantsMod.SocksCommand
  
  @js.native
  sealed trait connect
    extends socksLib.typingsCommonConstantsMod.SocksCommand
  
  /* 3 */ val associate: associate with scala.Double = js.native
  /* 2 */ val bind: bind with scala.Double = js.native
  /* 1 */ val connect: connect with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[socksLib.typingsCommonConstantsMod.SocksCommand with scala.Double] = js.native
}

