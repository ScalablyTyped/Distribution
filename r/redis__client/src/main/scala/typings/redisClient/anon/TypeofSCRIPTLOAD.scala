package typings.redisClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSCRIPTLOAD extends StObject {
  
  def transformArguments(script: String): js.Array[String]
  
  def transformReply(): String
}
object TypeofSCRIPTLOAD {
  
  inline def apply(transformArguments: String => js.Array[String], transformReply: () => String): TypeofSCRIPTLOAD = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofSCRIPTLOAD]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSCRIPTLOAD] (val x: Self) extends AnyVal {
    
    inline def setTransformArguments(value: String => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: () => String): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
