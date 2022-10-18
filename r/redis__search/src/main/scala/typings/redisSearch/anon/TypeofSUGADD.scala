package typings.redisSearch.anon

import typings.redisSearch.distCommandsSugaddMod.SugAddOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSUGADD extends StObject {
  
  def transformArguments(key: String, string: String, score: Double): js.Array[String] = js.native
  def transformArguments(key: String, string: String, score: Double, options: SugAddOptions): js.Array[String] = js.native
  
  def transformReply(): Double = js.native
}
