package typings.redisGraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsExplainMod {
  
  @JSImport("@redis/graph/dist/commands/EXPLAIN", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/graph/dist/commands/EXPLAIN", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/graph/dist/commands/EXPLAIN", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: String, query: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transfromReply(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transfromReply")().asInstanceOf[js.Array[String]]
}
