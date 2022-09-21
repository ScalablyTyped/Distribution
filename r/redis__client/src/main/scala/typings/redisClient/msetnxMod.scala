package typings.redisClient

import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.msetMod.MSetArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object msetnxMod {
  
  @JSImport("@redis/client/dist/lib/commands/MSETNX", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/MSETNX", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(toSet: MSetArguments): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(toSet.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
