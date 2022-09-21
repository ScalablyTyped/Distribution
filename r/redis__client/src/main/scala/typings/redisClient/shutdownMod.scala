package typings.redisClient

import typings.redisClient.redisClientStrings.NOSAVE
import typings.redisClient.redisClientStrings.SAVE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shutdownMod {
  
  @JSImport("@redis/client/dist/lib/commands/SHUTDOWN", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[js.Array[String]]
  inline def transformArguments(mode: NOSAVE | SAVE): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(mode.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Unit]
}
