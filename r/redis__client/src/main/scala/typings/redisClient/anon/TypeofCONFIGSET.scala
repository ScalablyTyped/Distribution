package typings.redisClient.anon

import typings.redisClient.configSETMod.MultipleParameters
import typings.redisClient.configSETMod.SingleParameter
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCONFIGSET extends StObject {
  
  def transformArguments(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasParameterOrConfigValue because its type SingleParameter | MultipleParameters is not an array type */ hasParameterOrConfigValue: MultipleParameters
  ): RedisCommandArguments = js.native
  def transformArguments(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasParameterOrConfigValue because its type SingleParameter | MultipleParameters is not an array type */ hasParameterOrConfigValue: SingleParameter
  ): RedisCommandArguments = js.native
  
  def transformReply(): String = js.native
}
