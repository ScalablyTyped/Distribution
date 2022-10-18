package typings.redisJson

import typings.redisJson.distCommandsMod.RedisJSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsArrpopMod {
  
  @JSImport("@redis/json/dist/commands/ARRPOP", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/json/dist/commands/ARRPOP", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def transformArguments(key: String, path: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def transformArguments(key: String, path: String, index: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], path.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def transformArguments(key: String, path: Unit, index: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], path.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): Null | RedisJSON | js.Array[RedisJSON] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Null | RedisJSON | js.Array[RedisJSON]]
  inline def transformReply(reply: String): Null | RedisJSON | js.Array[RedisJSON] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[Null | RedisJSON | js.Array[RedisJSON]]
  inline def transformReply(reply: js.Array[Null | String]): Null | RedisJSON | js.Array[RedisJSON] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[Null | RedisJSON | js.Array[RedisJSON]]
}
