package typings.redisSearch.anon

import typings.redisSearch.distCommandsSuggetMod.SugGetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSUGGET extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: String, prefix: String): js.Array[String] = js.native
  def transformArguments(key: String, prefix: String, options: SugGetOptions): js.Array[String] = js.native
  
  def transformReply(): Null | js.Array[String] = js.native
}
