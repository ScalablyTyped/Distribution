package typings.redisJson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objkeysMod {
  
  @JSImport("@redis/json/dist/commands/OBJKEYS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/json/dist/commands/OBJKEYS", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def transformArguments(key: String, path: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): (js.Array[js.Array[String] | Null | String]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[(js.Array[js.Array[String] | Null | String]) | Null]
}
