package typings.redisClient.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.redisClient.distLibClientMultiCommandMod.InstantiableRedisMultiCommand
import typings.redisClient.distLibClientMultiCommandMod.RedisClientMultiCommand
import typings.redisClient.distLibClientMultiCommandMod.RedisClientMultiExecutor
import typings.redisClient.distLibCommandsMod.RedisExtensions
import typings.redisClient.distLibCommandsMod.RedisFunctions
import typings.redisClient.distLibCommandsMod.RedisModules
import typings.redisClient.distLibCommandsMod.RedisScripts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRedisClientMultiCom
  extends StObject
     with Instantiable1[/* executor */ RedisClientMultiExecutor, RedisClientMultiCommand]
     with Instantiable2[
      /* executor */ RedisClientMultiExecutor, 
      /* legacyMode */ Boolean, 
      RedisClientMultiCommand
    ] {
  
  def extend[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](): InstantiableRedisMultiCommand[M, F, S] = js.native
  def extend[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](extensions: RedisExtensions[M, F, S]): InstantiableRedisMultiCommand[M, F, S] = js.native
}
