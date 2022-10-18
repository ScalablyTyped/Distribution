package typings.redisClient.anon

import typings.redisClient.distLibCommandsMemoryUSAGEMod.MemoryUsageOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofMEMORYUSAGE extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: String): js.Array[String] = js.native
  def transformArguments(key: String, options: MemoryUsageOptions): js.Array[String] = js.native
  
  def transformReply(): Double | Null = js.native
}
