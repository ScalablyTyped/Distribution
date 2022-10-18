package typings.socks.typingsCommonConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocksCommand extends StObject
@JSImport("socks/typings/common/constants", "SocksCommand")
@js.native
object SocksCommand extends StObject {
  
  @js.native
  sealed trait associate
    extends StObject
       with SocksCommand
  
  @js.native
  sealed trait bind
    extends StObject
       with SocksCommand
  
  @js.native
  sealed trait connect
    extends StObject
       with SocksCommand
}
