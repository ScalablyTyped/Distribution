package typings.redisSearch

import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsDictaddMod {
  
  @JSImport("@redis/search/dist/commands/DICTADD", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(dictionary: String, term: String): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(dictionary.asInstanceOf[js.Any], term.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(dictionary: String, term: js.Array[String]): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(dictionary.asInstanceOf[js.Any], term.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Double]
}
