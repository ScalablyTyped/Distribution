package typings.socks.typingsCommonConstantsMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocksCommand with Double] = js.native
  /* 3 */ @js.native
  object associate extends TopLevel[associate with Double]
  
  /* 2 */ @js.native
  object bind extends TopLevel[bind with Double]
  
  /* 1 */ @js.native
  object connect extends TopLevel[connect with Double]
  
}

