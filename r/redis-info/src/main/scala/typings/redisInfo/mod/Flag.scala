package typings.redisInfo.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Flag extends js.Object
@JSImport("redis-info", "Flag")
@js.native
object Flag extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Flag with String] = js.native
  
  @js.native
  sealed trait OFF extends Flag
  /* "0" */ @js.native
  object OFF extends TopLevel[OFF with String]
  
  @js.native
  sealed trait ON extends Flag
  /* "1" */ @js.native
  object ON extends TopLevel[ON with String]
}
