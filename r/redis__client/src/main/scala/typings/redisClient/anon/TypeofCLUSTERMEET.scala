package typings.redisClient.anon

import typings.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLUSTERMEET extends StObject {
  
  def transformArguments(ip: String, port: Double): js.Array[String]
  
  def transformReply(): OK
}
object TypeofCLUSTERMEET {
  
  inline def apply(transformArguments: (String, Double) => js.Array[String], transformReply: () => OK): TypeofCLUSTERMEET = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction2(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofCLUSTERMEET]
  }
  
  extension [Self <: TypeofCLUSTERMEET](x: Self) {
    
    inline def setTransformArguments(value: (String, Double) => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
    
    inline def setTransformReply(value: () => OK): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
