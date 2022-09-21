package typings.redisClient.anon

import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.scanMod.ScanCommandOptions
import typings.redisClient.scanMod.ScanRawReply
import typings.redisClient.scanMod.ScanReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSCAN extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(cursor: Double): RedisCommandArguments = js.native
  def transformArguments(cursor: Double, options: ScanCommandOptions): RedisCommandArguments = js.native
  
  def transformReply(hasCursorKeys: ScanRawReply): ScanReply = js.native
}
