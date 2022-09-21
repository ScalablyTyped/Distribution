package typings.redisSearch.anon

import typings.redisSearch.configGETMod.ConfigGetReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCONFIGGET extends StObject {
  
  def transformArguments(option: String): js.Array[String]
  
  def transformReply(rawReply: js.Array[js.Tuple2[String, String | Null]]): ConfigGetReply
}
object TypeofCONFIGGET {
  
  inline def apply(
    transformArguments: String => js.Array[String],
    transformReply: js.Array[js.Tuple2[String, String | Null]] => ConfigGetReply
  ): TypeofCONFIGGET = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction1(transformReply))
    __obj.asInstanceOf[TypeofCONFIGGET]
  }
  
  extension [Self <: TypeofCONFIGGET](x: Self) {
    
    inline def setTransformArguments(value: String => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: js.Array[js.Tuple2[String, String | Null]] => ConfigGetReply): Self = StObject.set(x, "transformReply", js.Any.fromFunction1(value))
  }
}
