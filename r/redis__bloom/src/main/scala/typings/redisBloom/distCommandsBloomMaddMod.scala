package typings.redisBloom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsBloomMaddMod {
  
  @JSImport("@redis/bloom/dist/commands/bloom/MADD", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/bloom/dist/commands/bloom/MADD", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: String, items: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(reply: js.Array[Double]): js.Array[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[js.Array[Boolean]]
}
