package typings.redisSearch.anon

import typings.redisSearch.distCommandsMod.RediSearchSchema
import typings.redisSearch.redisSearchStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofALTER extends StObject {
  
  def transformArguments(index: String, schema: RediSearchSchema): js.Array[String]
  
  def transformReply(): OK
}
object TypeofALTER {
  
  inline def apply(transformArguments: (String, RediSearchSchema) => js.Array[String], transformReply: () => OK): TypeofALTER = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction2(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofALTER]
  }
  
  extension [Self <: TypeofALTER](x: Self) {
    
    inline def setTransformArguments(value: (String, RediSearchSchema) => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
    
    inline def setTransformReply(value: () => OK): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
