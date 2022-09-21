package typings.redisClient.anon

import typings.redisClient.genericTransformersMod.SlotRange
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCLUSTERADDSLOTSRAN extends StObject {
  
  def transformArguments(ranges: js.Array[SlotRange]): RedisCommandArguments = js.native
  def transformArguments(ranges: SlotRange): RedisCommandArguments = js.native
  
  def transformReply(): OK = js.native
}
