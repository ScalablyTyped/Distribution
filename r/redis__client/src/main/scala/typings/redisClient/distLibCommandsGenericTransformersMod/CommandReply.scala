package typings.redisClient.distLibCommandsGenericTransformersMod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandReply extends StObject {
  
  var arity: Double
  
  var categories: Set[CommandCategories]
  
  var firstKeyIndex: Double
  
  var flags: Set[CommandFlags]
  
  var lastKeyIndex: Double
  
  var name: String
  
  var step: Double
}
object CommandReply {
  
  inline def apply(
    arity: Double,
    categories: Set[CommandCategories],
    firstKeyIndex: Double,
    flags: Set[CommandFlags],
    lastKeyIndex: Double,
    name: String,
    step: Double
  ): CommandReply = {
    val __obj = js.Dynamic.literal(arity = arity.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], firstKeyIndex = firstKeyIndex.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], lastKeyIndex = lastKeyIndex.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandReply]
  }
  
  extension [Self <: CommandReply](x: Self) {
    
    inline def setArity(value: Double): Self = StObject.set(x, "arity", value.asInstanceOf[js.Any])
    
    inline def setCategories(value: Set[CommandCategories]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setFirstKeyIndex(value: Double): Self = StObject.set(x, "firstKeyIndex", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: Set[CommandFlags]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setLastKeyIndex(value: Double): Self = StObject.set(x, "lastKeyIndex", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
