package typings.redisSearch.anon

import typings.redisSearch.redisSearchStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofALIASDEL extends StObject {
  
  def transformArguments(name: String, index: String): js.Array[String]
  
  def transformReply(): OK
}
object TypeofALIASDEL {
  
  inline def apply(transformArguments: (String, String) => js.Array[String], transformReply: () => OK): TypeofALIASDEL = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction2(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofALIASDEL]
  }
  
  extension [Self <: TypeofALIASDEL](x: Self) {
    
    inline def setTransformArguments(value: (String, String) => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
    
    inline def setTransformReply(value: () => OK): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
