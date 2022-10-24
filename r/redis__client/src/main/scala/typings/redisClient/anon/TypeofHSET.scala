package typings.redisClient.anon

import typings.redisClient.distLibCommandsHsetMod.MultipleFieldsArguments
import typings.redisClient.distLibCommandsHsetMod.SingleFieldArguments
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofHSET extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param <destructured> because its type SingleFieldArguments | MultipleFieldsArguments is not an array type */ param0: MultipleFieldsArguments | SingleFieldArguments
  ): RedisCommandArguments = js.native
  
  def transformReply(): Double = js.native
}
