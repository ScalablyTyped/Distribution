package typings.redisTimeSeries.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisTimeSeries.distCommandsGetMod.GetOptions
import typings.redisTimeSeries.distCommandsMod.SampleRawReply
import typings.redisTimeSeries.distCommandsMod.SampleReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofGET extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: String): RedisCommandArguments = js.native
  def transformArguments(key: String, options: GetOptions): RedisCommandArguments = js.native
  
  def transformReply(reply: js.Array[Any]): Null | SampleReply = js.native
  def transformReply(reply: SampleRawReply): Null | SampleReply = js.native
}
