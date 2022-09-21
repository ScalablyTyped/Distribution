package typings.redisClient

import typings.redisClient.genericTransformersMod.EvalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fcallROMod {
  
  @JSImport("@redis/client/dist/lib/commands/FCALL_RO", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/FCALL_RO", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: js.Function1[/* options */ js.UndefOr[EvalOptions], js.UndefOr[String]] = js.native
  
  @JSImport("@redis/client/dist/lib/commands/FCALL_RO", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(fn: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def transformArguments(fn: String, options: EvalOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
