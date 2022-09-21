package typings.redisClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLUSTERGETKEYSINSL extends StObject {
  
  def transformArguments(slot: Double, count: Double): js.Array[String]
  
  def transformReply(): js.Array[String]
}
object TypeofCLUSTERGETKEYSINSL {
  
  inline def apply(transformArguments: (Double, Double) => js.Array[String], transformReply: () => js.Array[String]): TypeofCLUSTERGETKEYSINSL = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction2(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofCLUSTERGETKEYSINSL]
  }
  
  extension [Self <: TypeofCLUSTERGETKEYSINSL](x: Self) {
    
    inline def setTransformArguments(value: (Double, Double) => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
    
    inline def setTransformReply(value: () => js.Array[String]): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
