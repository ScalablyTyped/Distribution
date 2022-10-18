package typings.redisClient

import typings.redisClient.redisClientStrings.ASYNC
import typings.redisClient.redisClientStrings.SYNC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsScriptFLUSHMod {
  
  @JSImport("@redis/client/dist/lib/commands/SCRIPT_FLUSH", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[js.Array[String]]
  inline def transformArguments(mode: ASYNC | SYNC): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(mode.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[String]
}
