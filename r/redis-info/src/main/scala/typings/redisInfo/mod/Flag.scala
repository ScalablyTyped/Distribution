package typings.redisInfo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Flag extends StObject
@JSImport("redis-info", "Flag")
@js.native
object Flag extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Flag & String] = js.native
  
  @js.native
  sealed trait OFF
    extends StObject
       with Flag
  /* "0" */ val OFF: typings.redisInfo.mod.Flag.OFF & String = js.native
  
  @js.native
  sealed trait ON
    extends StObject
       with Flag
  /* "1" */ val ON: typings.redisInfo.mod.Flag.ON & String = js.native
}
