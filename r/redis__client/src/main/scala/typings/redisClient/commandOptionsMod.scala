package typings.redisClient

import typings.redisClient.anon.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandOptionsMod {
  
  @JSImport("@redis/client/dist/lib/command-options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def commandOptions[T](options: T): CommandOptions_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("commandOptions")(options.asInstanceOf[js.Any]).asInstanceOf[CommandOptions_[T]]
  
  inline def isCommandOptions[T](options: Any): /* is @redis/client.@redis/client/dist/lib/command-options.CommandOptions<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommandOptions")(options.asInstanceOf[js.Any]).asInstanceOf[/* is @redis/client.@redis/client/dist/lib/command-options.CommandOptions<T> */ Boolean]
  
  type CommandOptions_[T] = T & Symbol
}
