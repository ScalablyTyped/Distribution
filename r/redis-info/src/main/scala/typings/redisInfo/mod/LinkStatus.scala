package typings.redisInfo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LinkStatus extends StObject
@JSImport("redis-info", "LinkStatus")
@js.native
object LinkStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LinkStatus with String] = js.native
  
  @js.native
  sealed trait DOWN extends LinkStatus
  /* "down" */ val DOWN: typings.redisInfo.mod.LinkStatus.DOWN with String = js.native
  
  @js.native
  sealed trait UP extends LinkStatus
  /* "up" */ val UP: typings.redisInfo.mod.LinkStatus.UP with String = js.native
}
