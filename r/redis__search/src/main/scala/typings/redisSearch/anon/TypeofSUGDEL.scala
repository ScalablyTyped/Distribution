package typings.redisSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSUGDEL extends StObject {
  
  def transformArguments(key: String, string: String): js.Array[String]
  
  def transformReply(reply: Double): Boolean
}
object TypeofSUGDEL {
  
  inline def apply(transformArguments: (String, String) => js.Array[String], transformReply: Double => Boolean): TypeofSUGDEL = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction2(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofSUGDEL]
  }
  
  extension [Self <: TypeofSUGDEL](x: Self) {
    
    inline def setTransformArguments(value: (String, String) => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
    
    inline def setTransformReply(value: Double => Boolean): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
