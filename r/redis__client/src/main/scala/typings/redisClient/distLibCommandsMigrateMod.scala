package typings.redisClient

import typings.redisClient.distLibCommandsAuthMod.AuthOptions
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsMigrateMod {
  
  @JSImport("@redis/client/dist/lib/commands/MIGRATE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(
    host: RedisCommandArgument,
    port: Double,
    key: js.Array[RedisCommandArgument],
    destinationDb: Double,
    timeout: Double
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], key.asInstanceOf[js.Any], destinationDb.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    host: RedisCommandArgument,
    port: Double,
    key: js.Array[RedisCommandArgument],
    destinationDb: Double,
    timeout: Double,
    options: MigrateOptions
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], key.asInstanceOf[js.Any], destinationDb.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    host: RedisCommandArgument,
    port: Double,
    key: RedisCommandArgument,
    destinationDb: Double,
    timeout: Double
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], key.asInstanceOf[js.Any], destinationDb.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    host: RedisCommandArgument,
    port: Double,
    key: RedisCommandArgument,
    destinationDb: Double,
    timeout: Double,
    options: MigrateOptions
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], key.asInstanceOf[js.Any], destinationDb.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[String]
  
  trait MigrateOptions extends StObject {
    
    var AUTH: js.UndefOr[AuthOptions] = js.undefined
    
    var COPY: js.UndefOr[`true`] = js.undefined
    
    var REPLACE: js.UndefOr[`true`] = js.undefined
  }
  object MigrateOptions {
    
    inline def apply(): MigrateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MigrateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MigrateOptions] (val x: Self) extends AnyVal {
      
      inline def setAUTH(value: AuthOptions): Self = StObject.set(x, "AUTH", value.asInstanceOf[js.Any])
      
      inline def setAUTHUndefined: Self = StObject.set(x, "AUTH", js.undefined)
      
      inline def setCOPY(value: `true`): Self = StObject.set(x, "COPY", value.asInstanceOf[js.Any])
      
      inline def setCOPYUndefined: Self = StObject.set(x, "COPY", js.undefined)
      
      inline def setREPLACE(value: `true`): Self = StObject.set(x, "REPLACE", value.asInstanceOf[js.Any])
      
      inline def setREPLACEUndefined: Self = StObject.set(x, "REPLACE", js.undefined)
    }
  }
}
