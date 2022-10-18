package typings.redisBloom.anon

import typings.redisBloom.distCommandsCountMinSketchIncrbyMod.IncrByItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformArgumentsTransformReply extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: String, items: js.Array[IncrByItem | typings.redisBloom.distCommandsTopKIncrbyMod.IncrByItem]): js.Array[String] = js.native
  def transformArguments(key: String, items: IncrByItem): js.Array[String] = js.native
  def transformArguments(key: String, items: typings.redisBloom.distCommandsTopKIncrbyMod.IncrByItem): js.Array[String] = js.native
  
  def transformReply(): js.Array[String | Null] = js.native
}
