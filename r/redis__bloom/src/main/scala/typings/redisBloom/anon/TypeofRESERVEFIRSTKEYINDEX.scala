package typings.redisBloom.anon

import typings.redisBloom.cuckooReserveMod.ReserveOptions
import typings.redisBloom.redisBloomStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRESERVEFIRSTKEYINDEX extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: String, capacity: Double): js.Array[String] = js.native
  def transformArguments(key: String, capacity: Double, options: ReserveOptions): js.Array[String] = js.native
  
  def transformReply(): OK = js.native
}
