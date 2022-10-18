package typings.redisClient

import typings.redisClient.distLibCommandsGenericTransformersMod.EvalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsEvalshaMod {
  
  @JSImport("@redis/client/dist/lib/commands/EVALSHA", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/EVALSHA", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: js.Function1[/* options */ js.UndefOr[EvalOptions], js.UndefOr[String]] = js.native
  
  inline def transformArguments(sha1: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(sha1.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def transformArguments(sha1: String, options: EvalOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(sha1.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
