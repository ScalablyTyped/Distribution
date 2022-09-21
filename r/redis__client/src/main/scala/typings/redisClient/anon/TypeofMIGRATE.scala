package typings.redisClient.anon

import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.migrateMod.MigrateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofMIGRATE extends StObject {
  
  def transformArguments(
    host: RedisCommandArgument,
    port: Double,
    key: js.Array[RedisCommandArgument],
    destinationDb: Double,
    timeout: Double
  ): RedisCommandArguments = js.native
  def transformArguments(
    host: RedisCommandArgument,
    port: Double,
    key: js.Array[RedisCommandArgument],
    destinationDb: Double,
    timeout: Double,
    options: MigrateOptions
  ): RedisCommandArguments = js.native
  def transformArguments(
    host: RedisCommandArgument,
    port: Double,
    key: RedisCommandArgument,
    destinationDb: Double,
    timeout: Double
  ): RedisCommandArguments = js.native
  def transformArguments(
    host: RedisCommandArgument,
    port: Double,
    key: RedisCommandArgument,
    destinationDb: Double,
    timeout: Double,
    options: MigrateOptions
  ): RedisCommandArguments = js.native
  
  def transformReply(): String = js.native
}
