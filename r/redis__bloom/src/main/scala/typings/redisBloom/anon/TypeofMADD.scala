package typings.redisBloom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMADD extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double
  
  def transformArguments(key: String, items: js.Array[String]): js.Array[String]
  
  def transformReply(reply: js.Array[Double]): js.Array[Boolean]
}
object TypeofMADD {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    transformArguments: (String, js.Array[String]) => js.Array[String],
    transformReply: js.Array[Double] => js.Array[Boolean]
  ): TypeofMADD = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction2(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofMADD]
  }
  
  extension [Self <: TypeofMADD](x: Self) {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: (String, js.Array[String]) => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
    
    inline def setTransformReply(value: js.Array[Double] => js.Array[Boolean]): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
