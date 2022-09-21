package typings.redisClient.anon

import typings.redisClient.genericTransformersMod.RangeReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key2 extends StObject {
  
  var key1: RangeReply
  
  var key2: RangeReply
  
  var length: Double
}
object Key2 {
  
  inline def apply(key1: RangeReply, key2: RangeReply, length: Double): Key2 = {
    val __obj = js.Dynamic.literal(key1 = key1.asInstanceOf[js.Any], key2 = key2.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key2]
  }
  
  extension [Self <: Key2](x: Self) {
    
    inline def setKey1(value: RangeReply): Self = StObject.set(x, "key1", value.asInstanceOf[js.Any])
    
    inline def setKey2(value: RangeReply): Self = StObject.set(x, "key2", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
