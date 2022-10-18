package typings.redisJson

import typings.redisJson.distCommandsMod.RedisJSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsArrindexMod {
  
  @JSImport("@redis/json/dist/commands/ARRINDEX", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/json/dist/commands/ARRINDEX", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/json/dist/commands/ARRINDEX", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: String, path: String, json: RedisJSON): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], path.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def transformArguments(key: String, path: String, json: RedisJSON, start: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], path.asInstanceOf[js.Any], json.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def transformArguments(key: String, path: String, json: RedisJSON, start: Double, stop: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], path.asInstanceOf[js.Any], json.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def transformArguments(key: String, path: String, json: RedisJSON, start: Unit, stop: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], path.asInstanceOf[js.Any], json.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): Double | js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Double | js.Array[Double]]
}
