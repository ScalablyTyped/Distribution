package typings.redisBloom.anon

import typings.redisBloom.countMinSketchInfoMod.InfoRawReply
import typings.redisBloom.countMinSketchInfoMod.InfoReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformArguments extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: String): js.Array[String] = js.native
  
  def transformReply(reply: InfoRawReply): InfoReply = js.native
  def transformReply(reply: typings.redisBloom.cuckooInfoMod.InfoRawReply): typings.redisBloom.cuckooInfoMod.InfoReply = js.native
  def transformReply(reply: typings.redisBloom.infoMod.InfoRawReply): typings.redisBloom.infoMod.InfoReply = js.native
  def transformReply(reply: typings.redisBloom.topKInfoMod.InfoRawReply): typings.redisBloom.topKInfoMod.InfoReply = js.native
}
