package typings.redisClient

import typings.redisClient.distLibCommandsGenericTransformersMod.EvalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsFcallMod {
  
  @JSImport("@redis/client/dist/lib/commands/FCALL", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/FCALL", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: js.Function1[/* options */ js.UndefOr[EvalOptions], js.UndefOr[String]] = js.native
  
  inline def transformArguments(fn: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def transformArguments(fn: String, options: EvalOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
