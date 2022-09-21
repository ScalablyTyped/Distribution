package typings.redisClient.anon

import typings.redisClient.redisClientStrings.NO
import typings.redisClient.redisClientStrings.SYNC
import typings.redisClient.redisClientStrings.YES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSCRIPTDEBUG extends StObject {
  
  def transformArguments(mode: YES | SYNC | NO): js.Array[String]
  
  def transformReply(): String
}
object TypeofSCRIPTDEBUG {
  
  inline def apply(transformArguments: YES | SYNC | NO => js.Array[String], transformReply: () => String): TypeofSCRIPTDEBUG = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofSCRIPTDEBUG]
  }
  
  extension [Self <: TypeofSCRIPTDEBUG](x: Self) {
    
    inline def setTransformArguments(value: YES | SYNC | NO => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: () => String): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
