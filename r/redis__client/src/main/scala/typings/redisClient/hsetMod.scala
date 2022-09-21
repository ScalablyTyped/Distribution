package typings.redisClient

import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hsetMod {
  
  @JSImport("@redis/client/dist/lib/commands/HSET", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/HSET", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasKeyValueFieldValue because its type SingleFieldArguments | MultipleFieldsArguments is not an array type */ hasKeyValueFieldValue: MultipleFieldsArguments | SingleFieldArguments
  ): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(hasKeyValueFieldValue.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Double]
  
  type GenericArguments = js.Array[/* key */ RedisCommandArgument]
  
  type HSETMap = Map[Types, Types]
  
  type HSETObject = Record[String | Double, Types]
  
  type HSETTuples = js.Array[(js.Tuple2[Types, Types]) | Types]
  
  type MultipleFieldsArguments = /* import warning: importer.ImportType#apply c repeated non-array type: [key: @redis/client.@redis/client/dist/lib/commands.RedisCommandArgument] */ /* generic */ js.Array[js.Array[/* key */ RedisCommandArgument]]
  
  type SingleFieldArguments = /* import warning: importer.ImportType#apply c repeated non-array type: [key: @redis/client.@redis/client/dist/lib/commands.RedisCommandArgument] */ /* generic */ js.Array[js.Array[/* key */ RedisCommandArgument]]
  
  type Types = RedisCommandArgument | Double
}
