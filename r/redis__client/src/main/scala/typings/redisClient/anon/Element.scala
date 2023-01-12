package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  var element: RedisCommandArgument
  
  var key: RedisCommandArgument
}
object Element {
  
  inline def apply(element: RedisCommandArgument, key: RedisCommandArgument): Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
    
    inline def setElement(value: RedisCommandArgument): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setKey(value: RedisCommandArgument): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
