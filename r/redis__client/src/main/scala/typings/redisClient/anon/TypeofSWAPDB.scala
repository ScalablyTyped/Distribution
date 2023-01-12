package typings.redisClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSWAPDB extends StObject {
  
  def transformArguments(index1: Double, index2: Double): js.Array[String]
  
  def transformReply(): String
}
object TypeofSWAPDB {
  
  inline def apply(transformArguments: (Double, Double) => js.Array[String], transformReply: () => String): TypeofSWAPDB = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction2(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofSWAPDB]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSWAPDB] (val x: Self) extends AnyVal {
    
    inline def setTransformArguments(value: (Double, Double) => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
    
    inline def setTransformReply(value: () => String): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
