package typings.redisClient.anon

import typings.redisClient.distLibCommandsGenericTransformersMod.BitValue
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.BIT
import typings.redisClient.redisClientStrings.BYTE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBITPOS extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: RedisCommandArgument, bit: BitValue): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, bit: BitValue, start: Double): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, bit: BitValue, start: Double, end: Double): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, bit: BitValue, start: Double, end: Double, mode: BYTE | BIT): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, bit: BitValue, start: Double, end: Unit, mode: BYTE | BIT): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, bit: BitValue, start: Unit, end: Double): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, bit: BitValue, start: Unit, end: Double, mode: BYTE | BIT): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, bit: BitValue, start: Unit, end: Unit, mode: BYTE | BIT): RedisCommandArguments = js.native
  
  def transformReply(): Double = js.native
}
