package typings.redisClient

import typings.redisClient.libCommandsMod.RedisCommandArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lolwutMod {
  
  @JSImport("@redis/client/dist/lib/commands/LOLWUT", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/LOLWUT", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(version: Double, optionalArguments: Double*): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(scala.List(version.asInstanceOf[js.Any]).`++`(optionalArguments.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Array[String]]
  inline def transformArguments(version: Unit, optionalArguments: Double*): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(scala.List(version.asInstanceOf[js.Any]).`++`(optionalArguments.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): RedisCommandArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[RedisCommandArgument]
}
