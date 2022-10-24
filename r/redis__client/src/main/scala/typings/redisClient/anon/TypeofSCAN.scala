package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.distLibCommandsScanMod.ScanCommandOptions
import typings.redisClient.distLibCommandsScanMod.ScanRawReply
import typings.redisClient.distLibCommandsScanMod.ScanReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSCAN extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(cursor: Double): RedisCommandArguments = js.native
  def transformArguments(cursor: Double, options: ScanCommandOptions): RedisCommandArguments = js.native
  
  def transformReply(param0: ScanRawReply): ScanReply = js.native
}
