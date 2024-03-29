package typings.redisClient.anon

import typings.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLUSTERFLUSHSLOTS extends StObject {
  
  def transformArguments(): js.Array[String]
  
  def transformReply(): OK
}
object TypeofCLUSTERFLUSHSLOTS {
  
  inline def apply(transformArguments: () => js.Array[String], transformReply: () => OK): TypeofCLUSTERFLUSHSLOTS = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction0(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofCLUSTERFLUSHSLOTS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCLUSTERFLUSHSLOTS] (val x: Self) extends AnyVal {
    
    inline def setTransformArguments(value: () => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction0(value))
    
    inline def setTransformReply(value: () => OK): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
