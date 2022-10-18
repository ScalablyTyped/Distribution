package typings.redisClient.anon

import typings.redisClient.distLibCommandsMemorySTATSMod.MemoryStatsReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMEMORYSTATS extends StObject {
  
  def transformArguments(): js.Array[String]
  
  def transformReply(rawReply: js.Array[String | Double | (js.Array[String | Double])]): MemoryStatsReply
}
object TypeofMEMORYSTATS {
  
  inline def apply(
    transformArguments: () => js.Array[String],
    transformReply: js.Array[String | Double | (js.Array[String | Double])] => MemoryStatsReply
  ): TypeofMEMORYSTATS = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction0(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofMEMORYSTATS]
  }
  
  extension [Self <: TypeofMEMORYSTATS](x: Self) {
    
    inline def setTransformArguments(value: () => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction0(value))
    
    inline def setTransformReply(value: js.Array[String | Double | (js.Array[String | Double])] => MemoryStatsReply): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
