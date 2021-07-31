package typings.redisInfo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LinkStatus extends StObject
@JSImport("redis-info", "LinkStatus")
@js.native
object LinkStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LinkStatus & String] = js.native
  
  @js.native
  sealed trait DOWN
    extends StObject
       with LinkStatus
  /* "down" */ val DOWN: typings.redisInfo.mod.LinkStatus.DOWN & String = js.native
  
  @js.native
  sealed trait UP
    extends StObject
       with LinkStatus
  /* "up" */ val UP: typings.redisInfo.mod.LinkStatus.UP & String = js.native
}
