package typings.redisClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRESTOREASKING extends StObject {
  
  def transformArguments(): js.Array[String]
  
  def transformReply(): String
}
object TypeofRESTOREASKING {
  
  inline def apply(transformArguments: () => js.Array[String], transformReply: () => String): TypeofRESTOREASKING = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction0(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofRESTOREASKING]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofRESTOREASKING] (val x: Self) extends AnyVal {
    
    inline def setTransformArguments(value: () => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction0(value))
    
    inline def setTransformReply(value: () => String): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
