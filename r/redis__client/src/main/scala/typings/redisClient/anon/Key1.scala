package typings.redisClient.anon

import typings.redisClient.distLibCommandsGenericTransformersMod.RangeReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key1 extends StObject {
  
  var key1: RangeReply
  
  var key2: RangeReply
}
object Key1 {
  
  inline def apply(key1: RangeReply, key2: RangeReply): Key1 = {
    val __obj = js.Dynamic.literal(key1 = key1.asInstanceOf[js.Any], key2 = key2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key1]
  }
  
  extension [Self <: Key1](x: Self) {
    
    inline def setKey1(value: RangeReply): Self = StObject.set(x, "key1", value.asInstanceOf[js.Any])
    
    inline def setKey2(value: RangeReply): Self = StObject.set(x, "key2", value.asInstanceOf[js.Any])
  }
}
