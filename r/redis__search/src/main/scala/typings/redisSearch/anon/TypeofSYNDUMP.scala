package typings.redisSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSYNDUMP extends StObject {
  
  def transformArguments(index: String): js.Array[String]
  
  def transformReply(): js.Array[String]
}
object TypeofSYNDUMP {
  
  inline def apply(transformArguments: String => js.Array[String], transformReply: () => js.Array[String]): TypeofSYNDUMP = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofSYNDUMP]
  }
  
  extension [Self <: TypeofSYNDUMP](x: Self) {
    
    inline def setTransformArguments(value: String => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: () => js.Array[String]): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
