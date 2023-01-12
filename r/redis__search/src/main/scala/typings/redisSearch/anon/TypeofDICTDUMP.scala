package typings.redisSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDICTDUMP extends StObject {
  
  def transformArguments(dictionary: String): js.Array[String]
  
  def transformReply(): js.Array[String]
}
object TypeofDICTDUMP {
  
  inline def apply(transformArguments: String => js.Array[String], transformReply: () => js.Array[String]): TypeofDICTDUMP = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofDICTDUMP]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofDICTDUMP] (val x: Self) extends AnyVal {
    
    inline def setTransformArguments(value: String => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: () => js.Array[String]): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
