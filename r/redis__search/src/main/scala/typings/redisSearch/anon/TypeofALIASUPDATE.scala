package typings.redisSearch.anon

import typings.redisSearch.redisSearchStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofALIASUPDATE extends StObject {
  
  def transformArguments(name: String, index: String): js.Array[String]
  
  def transformReply(): OK
}
object TypeofALIASUPDATE {
  
  inline def apply(transformArguments: (String, String) => js.Array[String], transformReply: () => OK): TypeofALIASUPDATE = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction2(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofALIASUPDATE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofALIASUPDATE] (val x: Self) extends AnyVal {
    
    inline def setTransformArguments(value: (String, String) => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
    
    inline def setTransformReply(value: () => OK): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
