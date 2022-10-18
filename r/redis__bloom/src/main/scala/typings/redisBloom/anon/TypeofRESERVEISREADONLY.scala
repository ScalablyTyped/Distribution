package typings.redisBloom.anon

import typings.redisBloom.distCommandsTopKReserveMod.ReserveOptions
import typings.redisBloom.redisBloomStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRESERVEISREADONLY extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: String, topK: Double): js.Array[String] = js.native
  def transformArguments(key: String, topK: Double, options: ReserveOptions): js.Array[String] = js.native
  
  def transformReply(): OK = js.native
}
