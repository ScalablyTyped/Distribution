package typings.redisClient.anon

import typings.node.bufferMod.global.Buffer
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLIENTCACHING extends StObject {
  
  def transformArguments(value: Boolean): RedisCommandArguments
  
  def transformReply(): OK | Buffer
}
object TypeofCLIENTCACHING {
  
  inline def apply(transformArguments: Boolean => RedisCommandArguments, transformReply: () => OK | Buffer): TypeofCLIENTCACHING = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments), transformReply = js.Any.fromFunction0(transformReply))
    __obj.asInstanceOf[TypeofCLIENTCACHING]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCLIENTCACHING] (val x: Self) extends AnyVal {
    
    inline def setTransformArguments(value: Boolean => RedisCommandArguments): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: () => OK | Buffer): Self = StObject.set(x, "transformReply", js.Any.fromFunction0(value))
  }
}
