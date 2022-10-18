package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsObjectIDLETIMEMod {
  
  @JSImport("@redis/client/dist/lib/commands/OBJECT_IDLETIME", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/OBJECT_IDLETIME", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 2 */ Double = js.native
  
  @JSImport("@redis/client/dist/lib/commands/OBJECT_IDLETIME", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: RedisCommandArgument): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Double | Null]
}
