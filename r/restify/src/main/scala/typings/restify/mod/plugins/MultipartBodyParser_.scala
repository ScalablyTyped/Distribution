package typings.restify.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultipartBodyParser_ extends StObject {
  
  var hash: js.UndefOr[String] = js.undefined
  
  var keepExtensions: js.UndefOr[Boolean] = js.undefined
  
  var mapFiles: js.UndefOr[Boolean] = js.undefined
  
  var mapParams: js.UndefOr[Boolean] = js.undefined
  
  var maxFieldsSize: js.UndefOr[Double] = js.undefined
  
  var maxFileSize: js.UndefOr[Double] = js.undefined
  
  var multipartFileHandler: js.UndefOr[Any] = js.undefined
  
  var multipartHandler: js.UndefOr[Any] = js.undefined
  
  var multiples: js.UndefOr[Boolean] = js.undefined
  
  var overrideParams: js.UndefOr[Boolean] = js.undefined
  
  var uploadDir: js.UndefOr[String] = js.undefined
}
object MultipartBodyParser_ {
  
  inline def apply(): MultipartBodyParser_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultipartBodyParser_]
  }
  
  extension [Self <: MultipartBodyParser_](x: Self) {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setKeepExtensions(value: Boolean): Self = StObject.set(x, "keepExtensions", value.asInstanceOf[js.Any])
    
    inline def setKeepExtensionsUndefined: Self = StObject.set(x, "keepExtensions", js.undefined)
    
    inline def setMapFiles(value: Boolean): Self = StObject.set(x, "mapFiles", value.asInstanceOf[js.Any])
    
    inline def setMapFilesUndefined: Self = StObject.set(x, "mapFiles", js.undefined)
    
    inline def setMapParams(value: Boolean): Self = StObject.set(x, "mapParams", value.asInstanceOf[js.Any])
    
    inline def setMapParamsUndefined: Self = StObject.set(x, "mapParams", js.undefined)
    
    inline def setMaxFieldsSize(value: Double): Self = StObject.set(x, "maxFieldsSize", value.asInstanceOf[js.Any])
    
    inline def setMaxFieldsSizeUndefined: Self = StObject.set(x, "maxFieldsSize", js.undefined)
    
    inline def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
    
    inline def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
    
    inline def setMultipartFileHandler(value: Any): Self = StObject.set(x, "multipartFileHandler", value.asInstanceOf[js.Any])
    
    inline def setMultipartFileHandlerUndefined: Self = StObject.set(x, "multipartFileHandler", js.undefined)
    
    inline def setMultipartHandler(value: Any): Self = StObject.set(x, "multipartHandler", value.asInstanceOf[js.Any])
    
    inline def setMultipartHandlerUndefined: Self = StObject.set(x, "multipartHandler", js.undefined)
    
    inline def setMultiples(value: Boolean): Self = StObject.set(x, "multiples", value.asInstanceOf[js.Any])
    
    inline def setMultiplesUndefined: Self = StObject.set(x, "multiples", js.undefined)
    
    inline def setOverrideParams(value: Boolean): Self = StObject.set(x, "overrideParams", value.asInstanceOf[js.Any])
    
    inline def setOverrideParamsUndefined: Self = StObject.set(x, "overrideParams", js.undefined)
    
    inline def setUploadDir(value: String): Self = StObject.set(x, "uploadDir", value.asInstanceOf[js.Any])
    
    inline def setUploadDirUndefined: Self = StObject.set(x, "uploadDir", js.undefined)
  }
}
