package typings.redisJson

import typings.redisJson.commandsMod.RedisJSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrinsertMod {
  
  @JSImport("@redis/json/dist/commands/ARRINSERT", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/json/dist/commands/ARRINSERT", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: String, path: String, index: Double, jsons: RedisJSON*): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")((List(key.asInstanceOf[js.Any], path.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).`++`(jsons.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): Double | js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Double | js.Array[Double]]
}
