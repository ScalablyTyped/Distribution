package typings.redisInfo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Flag extends StObject
@JSImport("redis-info", "Flag")
@js.native
object Flag extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Flag with String] = js.native
  
  @js.native
  sealed trait OFF extends Flag
  /* "0" */ val OFF: typings.redisInfo.mod.Flag.OFF with String = js.native
  
  @js.native
  sealed trait ON extends Flag
  /* "1" */ val ON: typings.redisInfo.mod.Flag.ON with String = js.native
}
