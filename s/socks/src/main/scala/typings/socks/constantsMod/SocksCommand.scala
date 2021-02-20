package typings.socks.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocksCommand extends StObject
@JSImport("socks/typings/common/constants", "SocksCommand")
@js.native
object SocksCommand extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocksCommand with Double] = js.native
  
  @js.native
  sealed trait associate extends SocksCommand
  /* 3 */ val associate: typings.socks.constantsMod.SocksCommand.associate with Double = js.native
  
  @js.native
  sealed trait bind extends SocksCommand
  /* 2 */ val bind: typings.socks.constantsMod.SocksCommand.bind with Double = js.native
  
  @js.native
  sealed trait connect extends SocksCommand
  /* 1 */ val connect: typings.socks.constantsMod.SocksCommand.connect with Double = js.native
}
