package typings.redisGraph.anon

import typings.redisGraph.redisGraphStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCONFIGSET extends StObject {
  
  def transformArguments(configKey: String, value: Double): js.Array[String]
  
  def transformReply(): OK
}
object TypeofCONFIGSET {
  
  inline def apply(transformArguments: (String, Double) => js.Array[String], transformReply: () => OK): TypeofCONFIGSET = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction2(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofCONFIGSET]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCONFIGSET] (val x: Self) extends AnyVal {
    
    inline def setTransformArguments(value: (String, Double) => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
    
    inline def setTransformReply(value: () => OK): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
