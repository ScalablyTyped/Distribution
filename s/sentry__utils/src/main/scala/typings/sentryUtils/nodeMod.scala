package typings.sentryUtils

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.miscMod.ExtractedNodeRequestData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/utils/dist/node", JSImport.Namespace)
@js.native
object nodeMod extends js.Object {
  
  def dynamicRequire(mod: js.Any, request: String): js.Any = js.native
  
  def extractNodeRequestData(req: StringDictionary[js.Any]): ExtractedNodeRequestData = js.native
  def extractNodeRequestData(req: StringDictionary[js.Any], keys: js.Array[String]): ExtractedNodeRequestData = js.native
  
  def isNodeEnv(): Boolean = js.native
}
