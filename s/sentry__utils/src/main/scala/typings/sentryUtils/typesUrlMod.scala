package typings.sentryUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUrlMod {
  
  @JSImport("@sentry/utils/types/url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNumberOfUrlSegments(url: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberOfUrlSegments")(url.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getSanitizedUrlString(url: PartialURL): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSanitizedUrlString")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseUrl(url: String): PartialURL = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUrl")(url.asInstanceOf[js.Any]).asInstanceOf[PartialURL]
  
  inline def stripUrlQueryAndFragment(urlPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripUrlQueryAndFragment")(urlPath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait PartialURL extends StObject {
    
    var hash: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var relative: js.UndefOr[String] = js.undefined
    
    var search: js.UndefOr[String] = js.undefined
  }
  object PartialURL {
    
    inline def apply(): PartialURL = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialURL]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialURL] (val x: Self) extends AnyVal {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setRelative(value: String): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    }
  }
}
