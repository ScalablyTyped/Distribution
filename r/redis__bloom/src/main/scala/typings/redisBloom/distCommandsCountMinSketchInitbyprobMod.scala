package typings.redisBloom

import typings.redisBloom.redisBloomStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsCountMinSketchInitbyprobMod {
  
  @JSImport("@redis/bloom/dist/commands/count-min-sketch/INITBYPROB", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/bloom/dist/commands/count-min-sketch/INITBYPROB", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: String, error: Double, probability: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], error.asInstanceOf[js.Any], probability.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): OK = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK]
}
