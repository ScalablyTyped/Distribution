package typings.redisBloom.anon

import typings.redisBloom.distCommandsTopKIncrbyMod.IncrByItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofINCRBYFIRSTKEYINDEX extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: String, items: js.Array[IncrByItem]): js.Array[String] = js.native
  def transformArguments(key: String, items: IncrByItem): js.Array[String] = js.native
  
  def transformReply(): js.Array[String | Null] = js.native
}
