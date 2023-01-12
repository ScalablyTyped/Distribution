package typings.redisClient.anon

import typings.redisClient.redisClientStrings.BUMPED
import typings.redisClient.redisClientStrings.STILL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLUSTERBUMPEPOCH extends StObject {
  
  def transformArguments(): js.Array[String]
  
  def transformReply(): BUMPED | STILL
}
object TypeofCLUSTERBUMPEPOCH {
  
  inline def apply(transformArguments: () => js.Array[String], transformReply: () => BUMPED | STILL): TypeofCLUSTERBUMPEPOCH = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction0(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofCLUSTERBUMPEPOCH]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCLUSTERBUMPEPOCH] (val x: Self) extends AnyVal {
    
    inline def setTransformArguments(value: () => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction0(value))
    
    inline def setTransformReply(value: () => BUMPED | STILL): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
