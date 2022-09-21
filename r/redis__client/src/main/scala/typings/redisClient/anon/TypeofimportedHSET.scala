package typings.redisClient.anon

import typings.redisClient.hsetMod.MultipleFieldsArguments
import typings.redisClient.hsetMod.SingleFieldArguments
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedHSET extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasKeyValueFieldValue because its type SingleFieldArguments | MultipleFieldsArguments is not an array type */ hasKeyValueFieldValue: MultipleFieldsArguments | SingleFieldArguments
  ): RedisCommandArguments = js.native
  
  def transformReply(): Double = js.native
}
