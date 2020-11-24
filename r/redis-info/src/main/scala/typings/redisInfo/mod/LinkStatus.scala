package typings.redisInfo.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LinkStatus extends js.Object
@JSImport("redis-info", "LinkStatus")
@js.native
object LinkStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LinkStatus with String] = js.native
  
  @js.native
  sealed trait DOWN extends LinkStatus
  /* "down" */ @js.native
  object DOWN extends TopLevel[DOWN with String]
  
  @js.native
  sealed trait UP extends LinkStatus
  /* "up" */ @js.native
  object UP extends TopLevel[UP with String]
}
