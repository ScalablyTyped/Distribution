package typings.redisClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLUSTERCOUNTKEYSIN extends StObject {
  
  def transformArguments(slot: Double): js.Array[String]
  
  def transformReply(): Double
}
object TypeofCLUSTERCOUNTKEYSIN {
  
  inline def apply(transformArguments: Double => js.Array[String], transformReply: () => Double): TypeofCLUSTERCOUNTKEYSIN = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofCLUSTERCOUNTKEYSIN]
  }
  
  extension [Self <: TypeofCLUSTERCOUNTKEYSIN](x: Self) {
    
    inline def setTransformArguments(value: Double => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: () => Double): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
