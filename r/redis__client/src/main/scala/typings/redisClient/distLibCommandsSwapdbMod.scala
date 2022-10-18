package typings.redisClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsSwapdbMod {
  
  @JSImport("@redis/client/dist/lib/commands/SWAPDB", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(index1: Double, index2: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index1.asInstanceOf[js.Any], index2.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[String]
}
