package typings.redisClient.anon

import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.zrangestoreMod.ZRangeStoreOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofZRANGESTORE extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(dst: RedisCommandArgument, src: RedisCommandArgument, min: Double, max: Double): RedisCommandArguments = js.native
  def transformArguments(
    dst: RedisCommandArgument,
    src: RedisCommandArgument,
    min: Double,
    max: Double,
    options: ZRangeStoreOptions
  ): RedisCommandArguments = js.native
  def transformArguments(dst: RedisCommandArgument, src: RedisCommandArgument, min: Double, max: RedisCommandArgument): RedisCommandArguments = js.native
  def transformArguments(
    dst: RedisCommandArgument,
    src: RedisCommandArgument,
    min: Double,
    max: RedisCommandArgument,
    options: ZRangeStoreOptions
  ): RedisCommandArguments = js.native
  def transformArguments(dst: RedisCommandArgument, src: RedisCommandArgument, min: RedisCommandArgument, max: Double): RedisCommandArguments = js.native
  def transformArguments(
    dst: RedisCommandArgument,
    src: RedisCommandArgument,
    min: RedisCommandArgument,
    max: Double,
    options: ZRangeStoreOptions
  ): RedisCommandArguments = js.native
  def transformArguments(
    dst: RedisCommandArgument,
    src: RedisCommandArgument,
    min: RedisCommandArgument,
    max: RedisCommandArgument
  ): RedisCommandArguments = js.native
  def transformArguments(
    dst: RedisCommandArgument,
    src: RedisCommandArgument,
    min: RedisCommandArgument,
    max: RedisCommandArgument,
    options: ZRangeStoreOptions
  ): RedisCommandArguments = js.native
  
  def transformReply(reply: Double): Double = js.native
}
