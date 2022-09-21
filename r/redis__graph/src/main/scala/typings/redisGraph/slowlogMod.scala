package typings.redisGraph

import typings.redisGraph.anon.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slowlogMod {
  
  @JSImport("@redis/graph/dist/commands/SLOWLOG", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/graph/dist/commands/SLOWLOG", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/graph/dist/commands/SLOWLOG", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def transformReply(logs: SlowLogRawReply): SlowLogReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(logs.asInstanceOf[js.Any]).asInstanceOf[SlowLogReply]
  
  type SlowLogRawReply = js.Array[
    js.Tuple4[/* timestamp */ String, /* command */ String, /* query */ String, /* took */ String]
  ]
  
  type SlowLogReply = js.Array[Command]
}
