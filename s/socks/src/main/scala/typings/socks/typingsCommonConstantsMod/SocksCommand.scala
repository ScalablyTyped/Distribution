package typings.socks.typingsCommonConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocksCommand extends js.Object

@JSImport("socks/typings/common/constants", "SocksCommand")
@js.native
object SocksCommand extends js.Object {
  @js.native
  sealed trait associate extends SocksCommand
  
  @js.native
  sealed trait bind extends SocksCommand
  
  @js.native
  sealed trait connect extends SocksCommand
  
  /* 3 */ val associate: typings.socks.typingsCommonConstantsMod.SocksCommand.associate with Double = js.native
  /* 2 */ val bind: typings.socks.typingsCommonConstantsMod.SocksCommand.bind with Double = js.native
  /* 1 */ val connect: typings.socks.typingsCommonConstantsMod.SocksCommand.connect with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocksCommand with Double] = js.native
}

