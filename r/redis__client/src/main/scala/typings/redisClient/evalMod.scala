package typings.redisClient

import typings.redisClient.genericTransformersMod.EvalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object evalMod {
  
  @JSImport("@redis/client/dist/lib/commands/EVAL", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/EVAL", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: js.Function1[/* options */ js.UndefOr[EvalOptions], js.UndefOr[String]] = js.native
  
  inline def transformArguments(script: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(script.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def transformArguments(script: String, options: EvalOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(script.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
