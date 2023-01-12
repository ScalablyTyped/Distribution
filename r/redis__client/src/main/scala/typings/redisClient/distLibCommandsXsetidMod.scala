package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsXsetidMod {
  
  @JSImport("@redis/client/dist/lib/commands/XSETID", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/XSETID", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: RedisCommandArgument, lastId: RedisCommandArgument): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], lastId.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(key: RedisCommandArgument, lastId: RedisCommandArgument, options: XSetIdOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], lastId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): OK = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK]
  
  trait XSetIdOptions extends StObject {
    
    var ENTRIESADDED: js.UndefOr[Double] = js.undefined
    
    var MAXDELETEDID: js.UndefOr[RedisCommandArgument] = js.undefined
  }
  object XSetIdOptions {
    
    inline def apply(): XSetIdOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XSetIdOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XSetIdOptions] (val x: Self) extends AnyVal {
      
      inline def setENTRIESADDED(value: Double): Self = StObject.set(x, "ENTRIESADDED", value.asInstanceOf[js.Any])
      
      inline def setENTRIESADDEDUndefined: Self = StObject.set(x, "ENTRIESADDED", js.undefined)
      
      inline def setMAXDELETEDID(value: RedisCommandArgument): Self = StObject.set(x, "MAXDELETEDID", value.asInstanceOf[js.Any])
      
      inline def setMAXDELETEDIDUndefined: Self = StObject.set(x, "MAXDELETEDID", js.undefined)
    }
  }
}
