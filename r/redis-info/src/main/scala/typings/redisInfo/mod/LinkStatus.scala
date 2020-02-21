package typings.redisInfo.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LinkStatus extends js.Object

@JSImport("redis-info", "LinkStatus")
@js.native
object LinkStatus extends js.Object {
  @js.native
  sealed trait DOWN extends LinkStatus
  
  @js.native
  sealed trait UP extends LinkStatus
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LinkStatus with String] = js.native
  /* "down" */ @js.native
  object DOWN extends TopLevel[DOWN with String]
  
  /* "up" */ @js.native
  object UP extends TopLevel[UP with String]
  
}

