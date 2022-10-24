package typings.redisClient.anon

import typings.redisClient.distLibCommandsConfigSETMod.MultipleParameters
import typings.redisClient.distLibCommandsConfigSETMod.SingleParameter
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCONFIGSET extends StObject {
  
  def transformArguments(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param <destructured> because its type SingleParameter | MultipleParameters is not an array type */ param0: MultipleParameters
  ): RedisCommandArguments = js.native
  def transformArguments(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param <destructured> because its type SingleParameter | MultipleParameters is not an array type */ param0: SingleParameter
  ): RedisCommandArguments = js.native
  
  def transformReply(): String = js.native
}
