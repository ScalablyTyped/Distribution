package typings.socks.constantsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocksCommand extends js.Object
@JSImport("socks/typings/common/constants", "SocksCommand")
@js.native
object SocksCommand extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocksCommand with Double] = js.native
  
  @js.native
  sealed trait associate extends SocksCommand
  /* 3 */ @js.native
  object associate extends TopLevel[associate with Double]
  
  @js.native
  sealed trait bind extends SocksCommand
  /* 2 */ @js.native
  object bind extends TopLevel[bind with Double]
  
  @js.native
  sealed trait connect extends SocksCommand
  /* 1 */ @js.native
  object connect extends TopLevel[connect with Double]
}
