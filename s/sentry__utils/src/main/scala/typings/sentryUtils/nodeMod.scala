package typings.sentryUtils

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.miscMod.ExtractedNodeRequestData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod {
  
  @JSImport("@sentry/utils/dist/node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dynamicRequire(mod: js.Any, request: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dynamicRequire")(mod.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def extractNodeRequestData(req: StringDictionary[js.Any]): ExtractedNodeRequestData = ^.asInstanceOf[js.Dynamic].applyDynamic("extractNodeRequestData")(req.asInstanceOf[js.Any]).asInstanceOf[ExtractedNodeRequestData]
  inline def extractNodeRequestData(req: StringDictionary[js.Any], keys: js.Array[String]): ExtractedNodeRequestData = (^.asInstanceOf[js.Dynamic].applyDynamic("extractNodeRequestData")(req.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[ExtractedNodeRequestData]
  
  inline def isNodeEnv(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodeEnv")().asInstanceOf[Boolean]
}
