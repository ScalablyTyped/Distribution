package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLIENTGETNAME extends StObject {
  
  def transformArguments(): RedisCommandArguments
  
  def transformReply(): String | Null
}
object TypeofCLIENTGETNAME {
  
  inline def apply(transformArguments: () => RedisCommandArguments, transformReply: () => String | Null): TypeofCLIENTGETNAME = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction0(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofCLIENTGETNAME]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCLIENTGETNAME] (val x: Self) extends AnyVal {
    
    inline def setTransformArguments(value: () => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction0(value))
    
    inline def setTransformReply(value: () => String | Null): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
