package typings.redisClient.anon

import typings.redisClient.libCommandsMod.RedisCommandArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofLOLWUT extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(version: Double, optionalArguments: Double*): js.Array[String] = js.native
  def transformArguments(version: Unit, optionalArguments: Double*): js.Array[String] = js.native
  
  def transformReply(): RedisCommandArgument = js.native
}
