package typings.snyk.distLibEcosystemsUnmanagedTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchOpenApi extends StObject {
  
  var id: String
  
  var modification_time: String
  
  var urls: js.Array[String]
  
  var version: String
}
object PatchOpenApi {
  
  inline def apply(id: String, modification_time: String, urls: js.Array[String], version: String): PatchOpenApi = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], modification_time = modification_time.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchOpenApi]
  }
  
  extension [Self <: PatchOpenApi](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setModification_time(value: String): Self = StObject.set(x, "modification_time", value.asInstanceOf[js.Any])
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
