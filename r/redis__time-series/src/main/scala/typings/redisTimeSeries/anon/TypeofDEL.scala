package typings.redisTimeSeries.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisTimeSeries.distCommandsMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDEL extends StObject {
  
  val FIRTS_KEY_INDEX: /* 1 */ Double
  
  def transformArguments(key: String, fromTimestamp: Timestamp, toTimestamp: Timestamp): RedisCommandArguments
  
  def transformReply(): Double
}
object TypeofDEL {
  
  inline def apply(
    FIRTS_KEY_INDEX: /* 1 */ Double,
    transformArguments: (String, Timestamp, Timestamp) => RedisCommandArguments,
    transformReply: () => Double
  ): TypeofDEL = {
    val __obj = js.Dynamic.literal(FIRTS_KEY_INDEX = FIRTS_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction3(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofDEL]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofDEL] (val x: Self) extends AnyVal {
    
    inline def setFIRTS_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRTS_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: (String, Timestamp, Timestamp) => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction3(value))
    
    inline def setTransformReply(value: () => Double): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
