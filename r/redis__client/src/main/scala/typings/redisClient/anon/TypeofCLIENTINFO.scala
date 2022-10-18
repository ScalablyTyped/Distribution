package typings.redisClient.anon

import typings.redisClient.distLibCommandsClientINFOMod.ClientInfoReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLIENTINFO extends StObject {
  
  def transformArguments(): js.Array[String]
  
  def transformReply(reply: String): ClientInfoReply
}
object TypeofCLIENTINFO {
  
  inline def apply(transformArguments: () => js.Array[String], transformReply: String => ClientInfoReply): TypeofCLIENTINFO = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction0(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofCLIENTINFO]
  }
  
  extension [Self <: TypeofCLIENTINFO](x: Self) {
    
    inline def setTransformArguments(value: () => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction0(value))
    
    inline def setTransformReply(value: String => ClientInfoReply): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
