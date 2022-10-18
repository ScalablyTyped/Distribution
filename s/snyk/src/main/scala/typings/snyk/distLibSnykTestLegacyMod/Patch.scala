package typings.snyk.distLibSnykTestLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Patch extends StObject {
  
  var id: String
  
  var modificationTime: String
  
  var urls: js.Array[String]
  
  var version: String
}
object Patch {
  
  inline def apply(id: String, modificationTime: String, urls: js.Array[String], version: String): Patch = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Patch]
  }
  
  extension [Self <: Patch](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setModificationTime(value: String): Self = StObject.set(x, "modificationTime", value.asInstanceOf[js.Any])
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
