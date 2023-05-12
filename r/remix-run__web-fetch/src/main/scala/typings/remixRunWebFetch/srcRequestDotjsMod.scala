package typings.remixRunWebFetch

import typings.remixRunWebFetch.anon.Agent
import typings.remixRunWebFetch.distSrcRequestMod.Request
import typings.remixRunWebFetch.distSrcRequestMod.RequestState
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object srcRequestDotjsMod {
  
  @JSImport("@remix-run/web-fetch/src/request.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNodeRequestOptions(request: Request & (Record[js.Symbol, RequestState])): Agent = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeRequestOptions")(request.asInstanceOf[js.Any]).asInstanceOf[Agent]
}
