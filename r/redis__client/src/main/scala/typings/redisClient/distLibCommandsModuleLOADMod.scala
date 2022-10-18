package typings.redisClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsModuleLOADMod {
  
  @JSImport("@redis/client/dist/lib/commands/MODULE_LOAD", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(path: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def transformArguments(path: String, moduleArgs: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(path.asInstanceOf[js.Any], moduleArgs.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[String]
}
