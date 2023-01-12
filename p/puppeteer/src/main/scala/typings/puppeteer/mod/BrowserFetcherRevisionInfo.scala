package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserFetcherRevisionInfo extends StObject {
  
  var executablePath: String
  
  var folderPath: String
  
  var local: Boolean
  
  var product: String
  
  var revision: String
  
  var url: String
}
object BrowserFetcherRevisionInfo {
  
  inline def apply(
    executablePath: String,
    folderPath: String,
    local: Boolean,
    product: String,
    revision: String,
    url: String
  ): BrowserFetcherRevisionInfo = {
    val __obj = js.Dynamic.literal(executablePath = executablePath.asInstanceOf[js.Any], folderPath = folderPath.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserFetcherRevisionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrowserFetcherRevisionInfo] (val x: Self) extends AnyVal {
    
    inline def setExecutablePath(value: String): Self = StObject.set(x, "executablePath", value.asInstanceOf[js.Any])
    
    inline def setFolderPath(value: String): Self = StObject.set(x, "folderPath", value.asInstanceOf[js.Any])
    
    inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
