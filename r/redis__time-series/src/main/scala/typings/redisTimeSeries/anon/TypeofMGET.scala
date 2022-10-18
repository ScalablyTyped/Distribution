package typings.redisTimeSeries.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisTimeSeries.distCommandsMgetMod.MGetRawReply
import typings.redisTimeSeries.distCommandsMgetMod.MGetReply
import typings.redisTimeSeries.distCommandsMod.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMGET extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean
  
  def transformArguments(filter: Filter): RedisCommandArguments
  
  def transformReply(reply: MGetRawReply): js.Array[MGetReply]
}
object TypeofMGET {
  
  inline def apply(
    IS_READ_ONLY: /* true */ Boolean,
    transformArguments: Filter => RedisCommandArguments,
    transformReply: MGetRawReply => js.Array[MGetReply]
  ): TypeofMGET = {
    val __obj = js.Dynamic.literal(IS_READ_ONLY = IS_READ_ONLY.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofMGET]
  }
  
  extension [Self <: TypeofMGET](x: Self) {
    
    inline def setIS_READ_ONLY(value: /* true */ Boolean): Self = StObject.set(x, "IS_READ_ONLY", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: Filter => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: MGetRawReply => js.Array[MGetReply]): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
