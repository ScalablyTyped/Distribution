package typings.sentryUtils

import typings.sentryUtils.anon.Host
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlMod {
  
  @JSImport("@sentry/utils/types/url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNumberOfUrlSegments(url: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberOfUrlSegments")(url.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def parseUrl(url: String): Host = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Host]
  
  inline def stripUrlQueryAndFragment(urlPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripUrlQueryAndFragment")(urlPath.asInstanceOf[js.Any]).asInstanceOf[String]
}
