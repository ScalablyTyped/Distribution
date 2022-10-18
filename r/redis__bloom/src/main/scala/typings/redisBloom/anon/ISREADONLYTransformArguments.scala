package typings.redisBloom.anon

import typings.redisBloom.distCommandsCuckooScandumpMod.ScanDumpRawReply
import typings.redisBloom.distCommandsCuckooScandumpMod.ScanDumpReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISREADONLYTransformArguments extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: String, iterator: Double): js.Array[String] = js.native
  
  def transformReply(hasIteratorChunk: ScanDumpRawReply): ScanDumpReply = js.native
  @JSName("transformReply")
  def transformReply_ScanDumpReply(hasIteratorChunk: typings.redisBloom.distCommandsBloomScandumpMod.ScanDumpRawReply): typings.redisBloom.distCommandsBloomScandumpMod.ScanDumpReply = js.native
}
