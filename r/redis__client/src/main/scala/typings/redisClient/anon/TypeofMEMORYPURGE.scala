package typings.redisClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMEMORYPURGE extends StObject {
  
  def transformArguments(): js.Array[String]
  
  def transformReply(): String
}
object TypeofMEMORYPURGE {
  
  inline def apply(transformArguments: () => js.Array[String], transformReply: () => String): TypeofMEMORYPURGE = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction0(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofMEMORYPURGE]
  }
  
  extension [Self <: TypeofMEMORYPURGE](x: Self) {
    
    inline def setTransformArguments(value: () => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction0(value))
    
    inline def setTransformReply(value: () => String): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
