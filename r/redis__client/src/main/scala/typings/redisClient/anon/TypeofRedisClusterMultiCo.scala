package typings.redisClient.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.redisClient.clusterMultiCommandMod.InstantiableRedisClusterMultiCommandType
import typings.redisClient.clusterMultiCommandMod.RedisClusterMultiCommand
import typings.redisClient.clusterMultiCommandMod.RedisClusterMultiExecutor
import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisExtensions
import typings.redisClient.libCommandsMod.RedisFunctions
import typings.redisClient.libCommandsMod.RedisModules
import typings.redisClient.libCommandsMod.RedisScripts
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
