package typings.sentryUtils

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.miscMod.ExtractedNodeRequestData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod {
  
  @JSImport("@sentry/utils/dist/node", "dynamicRequire")
  @js.native
  def dynamicRequire(mod: js.Any, request: String): js.Any = js.native
  
  @JSImport("@sentry/utils/dist/node", "extractNodeRequestData")
  @js.native
  def extractNodeRequestData(req: StringDictionary[js.Any]): ExtractedNodeRequestData = js.native
  @JSImport("@sentry/utils/dist/node", "extractNodeRequestData")
  @js.native
  def extractNodeRequestData(req: StringDictionary[js.Any], keys: js.Array[String]): ExtractedNodeRequestData = js.native
  
  @JSImport("@sentry/utils/dist/node", "isNodeEnv")
  @js.native
  def isNodeEnv(): Boolean = js.native
}
