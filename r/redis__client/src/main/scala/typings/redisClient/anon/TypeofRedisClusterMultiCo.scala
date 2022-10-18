package typings.redisClient.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.redisClient.distLibClusterMultiCommandMod.InstantiableRedisClusterMultiCommandType
import typings.redisClient.distLibClusterMultiCommandMod.RedisClusterMultiCommand
import typings.redisClient.distLibClusterMultiCommandMod.RedisClusterMultiExecutor
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisExtensions
import typings.redisClient.distLibCommandsMod.RedisFunctions
import typings.redisClient.distLibCommandsMod.RedisModules
import typings.redisClient.distLibCommandsMod.RedisScripts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRedisClusterMultiCo
  extends StObject
     with Instantiable1[/* executor */ RedisClusterMultiExecutor, RedisClusterMultiCommand]
     with Instantiable2[
      /* executor */ RedisClusterMultiExecutor, 
      /* firstKey */ RedisCommandArgument, 
      RedisClusterMultiCommand
    ] {
  
  def extend[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](): InstantiableRedisClusterMultiCommandType[M, F, S] = js.native
  def extend[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](extensions: RedisExtensions[M, F, S]): InstantiableRedisClusterMultiCommandType[M, F, S] = js.native
}
