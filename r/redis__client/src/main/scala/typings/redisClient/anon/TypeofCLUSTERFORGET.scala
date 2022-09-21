package typings.redisClient.anon

import typings.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLUSTERFORGET extends StObject {
  
  def transformArguments(nodeId: String): js.Array[String]
  
  def transformReply(): OK
}
object TypeofCLUSTERFORGET {
  
  inline def apply(transformArguments: String => js.Array[String], transformReply: () => OK): TypeofCLUSTERFORGET = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofCLUSTERFORGET]
  }
  
  extension [Self <: TypeofCLUSTERFORGET](x: Self) {
    
    inline def setTransformArguments(value: String => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: () => OK): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
