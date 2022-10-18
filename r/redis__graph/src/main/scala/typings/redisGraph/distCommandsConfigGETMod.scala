package typings.redisGraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsConfigGETMod {
  
  @JSImport("@redis/graph/dist/commands/CONFIG_GET", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/graph/dist/commands/CONFIG_GET", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(configKey: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(configKey.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): ConfigItem | js.Array[ConfigItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[ConfigItem | js.Array[ConfigItem]]
  
  type ConfigItem = js.Tuple2[/* configKey */ String, /* value */ Double]
}
