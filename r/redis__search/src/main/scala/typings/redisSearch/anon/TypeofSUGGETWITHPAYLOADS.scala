package typings.redisSearch.anon

import typings.redisSearch.distCommandsSuggetMod.SugGetOptions
import typings.redisSearch.distCommandsSuggetWITHPAYLOADSMod.SuggestionWithPayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSUGGETWITHPAYLOADS extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: String, prefix: String): js.Array[String] = js.native
  def transformArguments(key: String, prefix: String, options: SugGetOptions): js.Array[String] = js.native
  
  def transformReply(): js.Array[SuggestionWithPayload] | Null = js.native
  def transformReply(rawReply: js.Array[String | Null]): js.Array[SuggestionWithPayload] | Null = js.native
}
