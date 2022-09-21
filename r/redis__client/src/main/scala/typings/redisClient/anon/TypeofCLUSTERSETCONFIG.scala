package typings.redisClient.anon

import typings.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLUSTERSETCONFIG extends StObject {
  
  def transformArguments(configEpoch: Double): js.Array[String]
  
  def transformReply(): OK
}
object TypeofCLUSTERSETCONFIG {
  
  inline def apply(transformArguments: Double => js.Array[String], transformReply: () => OK): TypeofCLUSTERSETCONFIG = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofCLUSTERSETCONFIG]
  }
  
  extension [Self <: TypeofCLUSTERSETCONFIG](x: Self) {
    
    inline def setTransformArguments(value: Double => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: () => OK): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
