package typings.socks.typingsCommonConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocksCommand extends StObject
@JSImport("socks/typings/common/constants", "SocksCommand")
@js.native
object SocksCommand extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocksCommand & Double] = js.native
  
  @js.native
  sealed trait associate
    extends StObject
       with SocksCommand
  /* 3 */ val associate: typings.socks.typingsCommonConstantsMod.SocksCommand.associate & Double = js.native
  
  @js.native
  sealed trait bind
    extends StObject
       with SocksCommand
  /* 2 */ val bind: typings.socks.typingsCommonConstantsMod.SocksCommand.bind & Double = js.native
  
  @js.native
  sealed trait connect
    extends StObject
       with SocksCommand
  /* 1 */ val connect: typings.socks.typingsCommonConstantsMod.SocksCommand.connect & Double = js.native
}
