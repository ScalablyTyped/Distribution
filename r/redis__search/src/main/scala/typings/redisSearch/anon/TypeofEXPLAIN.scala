package typings.redisSearch.anon

import typings.redisSearch.explainMod.ExplainOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofEXPLAIN extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(index: String, query: String): js.Array[String] = js.native
  def transformArguments(index: String, query: String, options: ExplainOptions): js.Array[String] = js.native
  
  def transformReply(): String = js.native
}
