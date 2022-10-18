package typings.redisSearch.anon

import typings.redisSearch.distCommandsCreateMod.CreateOptions
import typings.redisSearch.distCommandsMod.RediSearchSchema
import typings.redisSearch.redisSearchStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCREATE extends StObject {
  
  def transformArguments(index: String, schema: RediSearchSchema): js.Array[String] = js.native
  def transformArguments(index: String, schema: RediSearchSchema, options: CreateOptions): js.Array[String] = js.native
  
  def transformReply(): OK = js.native
}
