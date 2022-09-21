package typings.redisClient.anon

import typings.redisClient.timeMod.TimeReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTIME extends StObject {
  
  def transformArguments(): js.Array[String]
  
  def transformReply(reply: js.Tuple2[String, String]): TimeReply
}
object TypeofTIME {
  
  inline def apply(transformArguments: () => js.Array[String], transformReply: js.Tuple2[String, String] => TimeReply): TypeofTIME = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction0(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofTIME]
  }
  
  extension [Self <: TypeofTIME](x: Self) {
    
    inline def setTransformArguments(value: () => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction0(value))
    
    inline def setTransformReply(value: js.Tuple2[String, String] => TimeReply): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
