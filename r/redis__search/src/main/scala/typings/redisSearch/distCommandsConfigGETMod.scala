package typings.redisSearch

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsConfigGETMod {
  
  @JSImport("@redis/search/dist/commands/CONFIG_GET", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(option: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(option.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def transformReply(rawReply: js.Array[js.Tuple2[String, String | Null]]): ConfigGetReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(rawReply.asInstanceOf[js.Any]).asInstanceOf[ConfigGetReply]
  
  type ConfigGetReply = StringDictionary[String | Null]
}
