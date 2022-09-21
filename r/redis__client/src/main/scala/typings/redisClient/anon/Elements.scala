package typings.redisClient.anon

import typings.redisClient.genericTransformersMod.ZMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Elements extends StObject {
  
  var elements: js.Array[ZMember]
  
  var key: String
}
object Elements {
  
  inline def apply(elements: js.Array[ZMember], key: String): Elements = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Elements]
  }
  
  extension [Self <: Elements](x: Self) {
    
    inline def setElements(value: js.Array[ZMember]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: ZMember*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
