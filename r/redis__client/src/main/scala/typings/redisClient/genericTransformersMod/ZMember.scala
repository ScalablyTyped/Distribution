package typings.redisClient.genericTransformersMod

import typings.redisClient.libCommandsMod.RedisCommandArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZMember extends StObject {
  
  var score: Double
  
  var value: RedisCommandArgument
}
object ZMember {
  
  inline def apply(score: Double, value: RedisCommandArgument): ZMember = {
    val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZMember]
  }
  
  extension [Self <: ZMember](x: Self) {
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setValue(value: RedisCommandArgument): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
