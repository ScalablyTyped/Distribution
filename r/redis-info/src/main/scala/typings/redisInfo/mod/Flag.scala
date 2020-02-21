package typings.redisInfo.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Flag extends js.Object

@JSImport("redis-info", "Flag")
@js.native
object Flag extends js.Object {
  @js.native
  sealed trait OFF extends Flag
  
  @js.native
  sealed trait ON extends Flag
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Flag with String] = js.native
  /* "0" */ @js.native
  object OFF extends TopLevel[OFF with String]
  
  /* "1" */ @js.native
  object ON extends TopLevel[ON with String]
  
}

