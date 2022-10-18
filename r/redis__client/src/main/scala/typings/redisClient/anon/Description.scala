package typings.redisClient.anon

import typings.redisClient.distLibCommandsGenericTransformersMod.RedisFunctionFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  var description: String | Null
  
  var flags: js.Array[RedisFunctionFlags]
  
  var name: String
}
object Description {
  
  inline def apply(flags: js.Array[RedisFunctionFlags], name: String): Description = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], description = null)
    __obj.asInstanceOf[Description]
  }
  
  extension [Self <: Description](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setFlags(value: js.Array[RedisFunctionFlags]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsVarargs(value: RedisFunctionFlags*): Self = StObject.set(x, "flags", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
