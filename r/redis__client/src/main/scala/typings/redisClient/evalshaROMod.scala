package typings.redisClient

import typings.redisClient.genericTransformersMod.EvalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object evalshaROMod {
  
  @JSImport("@redis/client/dist/lib/commands/EVALSHA_RO", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/EVALSHA_RO", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: js.Function1[/* options */ js.UndefOr[EvalOptions], js.UndefOr[String]] = js.native
  
  @JSImport("@redis/client/dist/lib/commands/EVALSHA_RO", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(sha1: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(sha1.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def transformArguments(sha1: String, options: EvalOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(sha1.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
