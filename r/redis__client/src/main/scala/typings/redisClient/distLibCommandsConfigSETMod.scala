package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsConfigSETMod {
  
  @JSImport("@redis/client/dist/lib/commands/CONFIG_SET", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasParameterOrConfigValue because its type SingleParameter | MultipleParameters is not an array type */ hasParameterOrConfigValue: MultipleParameters
  ): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(hasParameterOrConfigValue.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasParameterOrConfigValue because its type SingleParameter | MultipleParameters is not an array type */ hasParameterOrConfigValue: SingleParameter
  ): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(hasParameterOrConfigValue.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[String]
  
  type MultipleParameters = js.Array[/* config */ Record[String, RedisCommandArgument]]
  
  type SingleParameter = js.Tuple2[/* parameter */ RedisCommandArgument, /* value */ RedisCommandArgument]
}
