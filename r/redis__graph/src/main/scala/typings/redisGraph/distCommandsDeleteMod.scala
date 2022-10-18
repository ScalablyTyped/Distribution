package typings.redisGraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsDeleteMod {
  
  @JSImport("@redis/graph/dist/commands/DELETE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/graph/dist/commands/DELETE", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[String]
}
