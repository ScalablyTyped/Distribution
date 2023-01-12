package typings.redisClient.anon

import typings.node.bufferMod.global.Buffer
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLIENTUNPAUSE extends StObject {
  
  def transformArguments(): RedisCommandArguments
  
  def transformReply(): OK | Buffer
}
object TypeofCLIENTUNPAUSE {
  
  inline def apply(transformArguments: () => RedisCommandArguments, transformReply: () => OK | Buffer): TypeofCLIENTUNPAUSE = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction0(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofCLIENTUNPAUSE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCLIENTUNPAUSE] (val x: Self) extends AnyVal {
    
    inline def setTransformArguments(value: () => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction0(value))
    
    inline def setTransformReply(value: () => OK | Buffer): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
