package typings.redisBloom.anon

import typings.redisBloom.insertMod.InsertOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofINSERT extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: String, items: String): js.Array[String] = js.native
  def transformArguments(key: String, items: String, options: InsertOptions): js.Array[String] = js.native
  def transformArguments(key: String, items: js.Array[String]): js.Array[String] = js.native
  def transformArguments(key: String, items: js.Array[String], options: InsertOptions): js.Array[String] = js.native
  
  def transformReply(reply: js.Array[Double]): js.Array[Boolean] = js.native
}
