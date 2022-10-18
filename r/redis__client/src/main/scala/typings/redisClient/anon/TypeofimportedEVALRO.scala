package typings.redisClient.anon

import typings.redisClient.distLibCommandsGenericTransformersMod.EvalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedEVALRO extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(script: String): js.Array[String] = js.native
  def transformArguments(script: String, options: EvalOptions): js.Array[String] = js.native
}
