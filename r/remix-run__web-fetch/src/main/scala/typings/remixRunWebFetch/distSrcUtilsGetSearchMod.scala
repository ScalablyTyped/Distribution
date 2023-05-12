package typings.remixRunWebFetch

import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsGetSearchMod {
  
  @JSImport("@remix-run/web-fetch/dist/src/utils/get-search", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSearch(parsedURL: URL): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSearch")(parsedURL.asInstanceOf[js.Any]).asInstanceOf[String]
}
