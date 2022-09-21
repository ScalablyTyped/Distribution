package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RobotsTxtOpts extends StObject {
  
  var baseUrl: String
  
  var dir: String
  
  var sitemapUrl: String
  
  var urls: js.Array[String]
}
object RobotsTxtOpts {
  
  inline def apply(baseUrl: String, dir: String, sitemapUrl: String, urls: js.Array[String]): RobotsTxtOpts = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], sitemapUrl = sitemapUrl.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[RobotsTxtOpts]
  }
  
  extension [Self <: RobotsTxtOpts](x: Self) {
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setSitemapUrl(value: String): Self = StObject.set(x, "sitemapUrl", value.asInstanceOf[js.Any])
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
  }
}
